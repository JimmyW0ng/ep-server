/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.repository.domain.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;

import javax.annotation.Generated;


/**
 * 目标：前台，商户后台，系统后台
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public enum EpSystemRoleTarget implements EnumType {

    api("api"),

    backend("backend"),

    admin("admin");

    private final String literal;

    private EpSystemRoleTarget(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "ep_system_role_target";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
