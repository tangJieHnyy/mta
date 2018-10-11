package com.mta.sqlMapper;

public interface UserSqlMapper {

	/**
	 * 用户登录
	 */
	public static final String USER_ACCOUNT_LOGIN = "userMapper.userLogin";

	/**
	 * 条件查询用户信息
	 */
	public static final String USER_INFO_QUERY = "userMapper.userInfoQuery";

	/**
	 * 查询用户信息详情
	 */
	public static final String USER_INFO_ITEM_QUERY = "userMapper.userInfoItemQuery";

	/**
	 * 添加用户信息
	 */
	public static final String ADD_USER_INFO = "userMapper.addUserInfo";

	/**
	 * 修改用户信息
	 */
	public static final String UPDATE_USER_INFO = "userMapper.updateUserInfo";

	/**
	 * 删除用户信息
	 */
	public static final String DELETE_USER_INFO = "userMapper.deleteUserInfo";

}
