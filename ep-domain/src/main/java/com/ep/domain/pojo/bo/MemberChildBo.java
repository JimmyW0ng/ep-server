package com.ep.domain.pojo.bo;


import com.ep.common.tool.DateTools;
import com.ep.domain.pojo.po.EpMemberChildPo;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class MemberChildBo extends EpMemberChildPo {

    private String avatar;
    private String sign;
    private Integer scheduleCommentNum;
    private Boolean canDeleteFlag;

    public String getChildBirthdayFormat() {
        return DateTools.dateToString(super.getChildBirthday(), DateTools.DATE_FMT_3);
    }

}
