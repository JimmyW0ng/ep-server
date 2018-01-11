package com.ep.domain.repository;

import com.ep.domain.pojo.po.EpSystemRoleAuthorityPo;
import com.ep.domain.repository.domain.tables.records.EpSystemRoleAuthorityRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ep.domain.repository.domain.Tables.EP_SYSTEM_ROLE_AUTHORITY;

/**
 * Created by fcc on 2018/1/11.
 */
@Repository
public class SysRoleAuthorityRepository extends AbstractCRUDRepository<EpSystemRoleAuthorityRecord, Long, EpSystemRoleAuthorityPo> {

    @Autowired
    public SysRoleAuthorityRepository(DSLContext dslContext) {
        super(dslContext, EP_SYSTEM_ROLE_AUTHORITY, EP_SYSTEM_ROLE_AUTHORITY.ID, EpSystemRoleAuthorityPo.class);
    }

    public List<String> getAuthoritesByRole(String role) {
        return dslContext.select(EP_SYSTEM_ROLE_AUTHORITY.AUTHORITY)
                .where(role, EP_SYSTEM_ROLE_AUTHORITY.ROLE).fetchInto(String.class);


    }
}
