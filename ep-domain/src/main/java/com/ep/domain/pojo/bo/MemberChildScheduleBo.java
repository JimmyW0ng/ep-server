package com.ep.domain.pojo.bo;

import com.ep.common.tool.DateTools;
import com.ep.domain.pojo.po.EpOrderPo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class MemberChildScheduleBo extends EpOrderPo {

    private String ognName;
    private String courseName;
    private String className;
    private Integer courseNum;
    private Integer catalogIndex;
    private String label;
    @JsonIgnore
    private Timestamp startTime;
    private String mainPicUrl;
    private String nickName;
    private String avatar;
    private String phone;
    private String address;
    private String addressLng;
    private String addressLat;

    /**
     * 开课时间格式化
     *
     * @return
     */
    public String getStartTimeFormat() {
        return DateTools.formatDatetoString(this.startTime, DateTools.DATE_FMT_13);
    }

}
