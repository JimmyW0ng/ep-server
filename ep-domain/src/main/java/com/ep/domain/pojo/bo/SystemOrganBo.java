package com.ep.domain.pojo.bo;

import com.ep.domain.pojo.po.EpOrganPo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: CC.F
 * @Date: 15:28 2018/2/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemOrganBo extends EpOrganPo {
    private String organCreateDateStr;

}