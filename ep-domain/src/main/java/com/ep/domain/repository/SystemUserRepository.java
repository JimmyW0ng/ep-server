package com.ep.domain.repository;

import com.ep.domain.pojo.po.EpSystemUserPo;
import com.ep.domain.repository.domain.tables.records.EpSystemUserRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.ep.domain.repository.domain.Tables.EP_SYSTEM_USER;


@Repository
public class SystemUserRepository extends AbstractCRUDRepository<EpSystemUserRecord, Long, EpSystemUserPo> {

    @Autowired
    public SystemUserRepository(DSLContext dslContext) {
        super(dslContext, EP_SYSTEM_USER, EP_SYSTEM_USER.ID, EpSystemUserPo.class);
    }

    /**
     * 根据手机号获取用户
     *
     * @param mobile
     * @return
     */
    public EpSystemUserPo getByMobile(Long mobile) {
        return dslContext.selectFrom(EP_SYSTEM_USER)
                .where(EP_SYSTEM_USER.MOBILE.equal(mobile)).fetchOneInto(EpSystemUserPo.class);
    }
}

