package com.mta.cmd;

public class ErrorCMD {
	// 数据库status状态
	public static final int DB_SUCCESS = 0;// 成功
	public static final int DB_NOT_DATA = -1;// 没有数据
	public static final int DB_ERROR = -2;// 失败

	// 程序返回状态
	public static final int SUCCESS = 0;// 正确
	public static final int ERROR = -3;// 错误
	public static final int NOT_PURVIEW = -4;// 没有权限
	public static final int NOT_DATA = -1000;// 没有数据
	public static final int TYPE_ERROR = -200;// 参数类型错误
	public static final int TYPE_ERROR_LOGIN = -201;// 参数类型错误
	public static final int TYPE_ERROR_PASSWORD = -201;// 旧密码错误
	public static final int ERROR_ORDER = -21;// 生成订单失败
	public static final int ERROR_CODE = -5;// 短信验证吗错误
	public static final int HTTP_SUCCESS = 200;// 正确
	public static final int HTTP_ERROR = 500;// 正确
	// result message
	public static final String SUCCESS_MESSAGE = "成功";
	public static final String CODE_OVERDUE = "验证码已过期";
	public static final String NULL_PHONE_ERROR = "该账号尚未绑定手机号";
	public static final String CODE_ERROR = "验证码错误";
	public static final String ERROR_MESSAGE = "失败";
	public static final String ERROR_BIDDING = "不可重复竞价";
	public static final String NOT_DATA_MESSAGE = "没有数据";
	public static final String ERROR_CMD = "命令错误！";
	public static final String ERROR_JSON_DATA = "数据包错误！";
	public static final String NOT_PURVIEW_MSG = "权限验证失败！";
	public static final String ERROR_PARAM = "参数异常！";
	public static final String ERROR_SQL = "数据库执行异常！";
	public static final String ERROR_PROCESS = "程序异常！";
	public static final String ERROR_NO_USER = "没有此用户";
	public static final String ERROR_NO_RECORD = "没有此记录";
	public static final String ERROR_LOGIN = "用户名或密码错误";
	public static final String ERROR_PASSWORDE = "旧密码错误";
	public static final String BANKCARD_BOUND = "该银行卡已绑定";
	public static final String COED_ERROR = "验证码类短信1小时内同一手机号发送次数不能超过3次";
	public static final String ERROR_TANG = "该课程没有课时";
	public static final String NULL_COMPANY = "该公司不存在";
	public static final String ERROR_PHONE = "手机号码已注册";
	public static final String PHONE_NO_ACCTION = "该手机不是平台账号";
	public static final String REGISTER_SUCCESS = "注册成功";
	public static final String ADD_SUCCESS = "添加成功";
	public static final String ADD_FAIL = "添加失败";
	public static final String NOT_CAR_INFO = "没有车辆数据！";
}
