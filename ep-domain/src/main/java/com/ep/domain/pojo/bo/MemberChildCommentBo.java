package com.ep.domain.pojo.bo;

import com.ep.common.tool.DateTools;
import com.ep.domain.pojo.po.EpMemberChildCommentPo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberChildCommentBo extends EpMemberChildCommentPo {

    private String nickName;
    private String ognName;
    private String avatar;
    private String childTrueName;
    private String courseName;
    private String className;
    private String classCatalogTitle;
    private Long replyId;
    private String contentReply;
    private Long orderId;
    private Long classChildId;

    public String getCommentTimeFormat() {
        return DateTools.formatDatetoString(super.getCreateAt(), DateTools.DATE_FMT_4);
    }

}
