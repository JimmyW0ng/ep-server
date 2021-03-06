package com.ep.domain.repository;

import com.ep.domain.pojo.po.EpMemberPo;
import com.ep.domain.repository.domain.enums.EpMemberStatus;
import com.ep.domain.repository.domain.tables.records.EpMemberRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import static com.ep.domain.repository.domain.Tables.EP_MEMBER;

/**
 * @Description:会员表Repository
 * @Author: J.W
 * @Date: 上午10:35 2017/11/27
 */
@Repository
public class MemberRepository extends AbstractCRUDRepository<EpMemberRecord, Long, EpMemberPo> {

    @Autowired
    private MemberChildRepository memberChildRepository;

    @Autowired
    public MemberRepository(DSLContext dslContext) {
        super(dslContext, EP_MEMBER, EP_MEMBER.ID, EpMemberPo.class);
    }

    public Optional<EpMemberPo> findById(Long id) {
        EpMemberPo data = dslContext.selectFrom(EP_MEMBER)
                .where(EP_MEMBER.ID.eq(id))
                .and(EP_MEMBER.DEL_FLAG.eq(false))
                .fetchOneInto(EpMemberPo.class);
        return Optional.ofNullable(data);
    }

    /**
     * 根据手机号查询
     *
     * @param mobile
     * @return
     */
    public EpMemberPo getByMobile(Long mobile) {
        return dslContext.selectFrom(EP_MEMBER)
                .where(EP_MEMBER.MOBILE.eq(mobile))
                .and(EP_MEMBER.DEL_FLAG.eq(false))
                .fetchOneInto(EpMemberPo.class);
    }

    /**
     * 冻结
     *
     * @param id
     * @return
     */
    public int freezeById(Long id) {
        return dslContext.update(EP_MEMBER)
                .set(EP_MEMBER.STATUS, EpMemberStatus.freeze)
                .where(EP_MEMBER.ID.eq(id))
                .and(EP_MEMBER.STATUS.eq(EpMemberStatus.normal))
                .and(EP_MEMBER.DEL_FLAG.eq(false)).execute();
    }

    /**
     * 解冻
     *
     * @param id
     * @return
     */
    public int unfreezeById(Long id) {
        return dslContext.update(EP_MEMBER)
                .set(EP_MEMBER.STATUS, EpMemberStatus.normal)
                .where(EP_MEMBER.ID.eq(id))
                .and(EP_MEMBER.STATUS.eq(EpMemberStatus.freeze))
                .and(EP_MEMBER.DEL_FLAG.eq(false)).execute();
    }

    /**
     * 注销会员
     *
     * @param id
     * @return
     */
    public int cancelById(Long id) {
        return dslContext.update(EP_MEMBER)
                .set(EP_MEMBER.STATUS, EpMemberStatus.cancel)
                .where(EP_MEMBER.ID.eq(id))
                .and(EP_MEMBER.DEL_FLAG.eq(false)).execute();
    }

}

