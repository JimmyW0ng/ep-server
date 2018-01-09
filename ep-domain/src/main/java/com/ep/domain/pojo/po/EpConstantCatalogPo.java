/*
 * This file is generated by jOOQ.
*/
package com.ep.domain.pojo.po;


import com.ep.domain.pojo.AbstractBasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * 课程类目表
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EpConstantCatalogPo extends AbstractBasePojo {

    private static final long serialVersionUID = 526600222;

    private Long id;
    private Long parentId;
    private String label;
    private Timestamp createAt;
    private Timestamp updateAt;
    private String remark;
    private Boolean delFlag;
    private Long version;


}
