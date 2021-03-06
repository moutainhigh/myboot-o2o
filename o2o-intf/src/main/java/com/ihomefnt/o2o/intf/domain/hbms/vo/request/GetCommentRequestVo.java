package com.ihomefnt.o2o.intf.domain.hbms.vo.request;

import com.ihomefnt.o2o.intf.domain.common.http.HttpBaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * @author wangjin
 *
 */
@Data
@ApiModel(description = "获取施工点评信息")
public class GetCommentRequestVo extends HttpBaseRequest{

	@ApiModelProperty(value = "订单id")
	private String orderId;

}
