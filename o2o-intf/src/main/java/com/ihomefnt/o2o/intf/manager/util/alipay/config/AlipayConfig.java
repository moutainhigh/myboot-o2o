package com.ihomefnt.o2o.intf.manager.util.alipay.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *版本：3.3
 *日期：2012-08-10
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
	
 *提示：如何获取安全校验码和合作身份者ID
 *1.用您的签约支付宝账号登录支付宝网站(www.alipay.com)
 *2.点击“商家服务”(https://b.alipay.com/order/myOrder.htm)
 *3.点击“查询合作者身份(PID)”、“查询安全校验码(Key)”

 *安全校验码查看时，输入支付密码后，页面呈灰色的现象，怎么办？
 *解决方法：
 *1、检查浏览器配置，不让浏览器做弹框屏蔽设置
 *2、更换浏览器或电脑，重新登录查询。
 */

public class AlipayConfig {
	// 合作身份者ID，以2088开头由16位纯数字组成的字符串
	public static String partner="2088911439392629" ;
	// 商户的私钥
	public static String private_key="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKp1u5Y3gA6B9r2arnXMsgTCYJmuP8v2WRAeOmo6Cpk4slCifu3wrXlCoev5utF3lkojXiDS3ZlY0R5XqTqOiKoL0WigasDHeNjrC5PsSddabiBL9HcqA3179vtJyeRma6oOlkc1pmIjKTT28Gy+Dh7gEHLUS5cZlmJWSz2vxgipAgMBAAECgYEAo98jQ7p/ZXMT3huCdMUgruqfK58UveRKovAsgErkPYEAC/zrwZuLafPg7pbaPt2Uohl2OF//oZh9EYp8qkq0ng/8+vjRtQghVeZDyE29e10yhAoc6A/sbSVpIELnG+tSmAtmR1VPmMOsTFK297xNjjVW/dhJoPhAzI1XUj1mpgECQQDvO31WB9H+MxuLGjrBwQtOFBZ/yq34SLWLqzIgDajSKCkxcqdz3lS5Vhqmqw/vsyf5wPC4LBerEZ6Dv5icZMWxAkEAtmhE0hiAx2TKdcN9A5GeMBWTbMEwfpqg2/ApRDrptAcopqqHUHAVRDotzgn/MS8nD8RWcO7Y/naz70PTJlwYeQJAA06lOu08v/Dg7plcOpV6nIe2j+mzYf1PVTD2rm7B6LXZa++T1Qw7y5wfHjK7M6scYF2EdmdVpG3H7TZW28Kg4QJAccK70TAY+MJChomiKRyjRKfgJv6hqQP0+NZiVjxLzsx8LN3DwIX2rXN/Z7XSYzFeMjYoFwzPZnxPohRx1sWvOQJARtn4MnzNBhzGo0LUIKMpT3Y2j+AH6PgK0QyzFeixCrFdqyaPMUZdrbqJ9AerZb14jVHQN0NQGQzkaJuep92ieg==";
	
	// 支付宝的公钥，无需修改该值
	//public static String ali_public_key  = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDOlgXYQe5WdzSCj0nxLxpTHLLaidH9nrT1IcS13U9xPlWw2BCsHWOqPoJ4TfljlqxLouc46HHjCjGfMCgEEDW71KOjxT1e2QSyr/2UinJ7ugfXVvw/L7UveXNpeEsulBY+FJ0uSqn17desDGFova2jgf6ZIknTroby7ZKV2Io9NwIDAQAB";
	public static String ali_public_key  = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCnxj/9qwVfgoUh/y2W89L6BkRAFljhNhgPdyPuBV64bfQNN1PjbCzkIM6qRdKBoLPXmKKMiFYnkd6rAoprih3/PrQEB/VsW8OoM8fxn67UDYuyBTqA23MML9q1+ilIZwBC2AQ2UBVOrFXfFl75p6/B5KsiNG9zpgmLCUYuLkxpLQIDAQAB";
	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "UTF-8";
	
	// 签名方式 不需修改
	public static String sign_type = "RSA";
	
	public static String SELLER = "finance@ihomefnt.com";
	
	//APP-ID
	public static String APP_ID="2016021301142825";

}