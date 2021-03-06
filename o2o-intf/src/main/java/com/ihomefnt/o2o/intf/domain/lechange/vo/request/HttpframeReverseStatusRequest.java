/*
 * Copyright (C) 2006-2016 AiJia All rights reserved
 * Author: zhang
 * Date: 2017年9月12日
 * Description:HttpframeReverseStatusRequest.java 
 */
package com.ihomefnt.o2o.intf.domain.lechange.vo.request;

import com.ihomefnt.o2o.intf.domain.common.http.HttpBaseRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhang
 */
@Data
@ApiModel("获取设备翻转状态请求参数")
public class HttpframeReverseStatusRequest extends HttpBaseRequest {

	@ApiModelProperty("授权Token")
	private String token;

	@ApiModelProperty("设备序列号")
	private String deviceId;

	@ApiModelProperty("通道号")
	private String channelId;

}
