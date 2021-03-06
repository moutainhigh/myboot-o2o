package com.ihomefnt.o2o.intf.proxy.htp;

import com.ihomefnt.o2o.intf.domain.htp.vo.request.GetExtByHouseIdRequestVo;
import com.ihomefnt.o2o.intf.domain.htp.vo.response.GetExtByHouseIdResponseVo;

public interface HtpProxy {

    /**
     * 根据户型id查询户型扩展信息
     *
     * @param request
     * @return
     */
    GetExtByHouseIdResponseVo getExtByHouseId(GetExtByHouseIdRequestVo request);
}
