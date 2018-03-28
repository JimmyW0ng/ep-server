package com.ep.domain.pojo.bo;

import com.ep.domain.pojo.po.EpOrganClassSchedulePo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 16:13 2018/3/28/028
 */
@ToString(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganClassScheduleBo extends EpOrganClassSchedulePo {
    private String nickName;
    private String childTrueName;
    private String courseName;
    private String className;
    private String classCatalogTitle;
    private Long replyId;
    private String contentReply;
}
