package com.mta.sqlMapper;

public interface CollocationSqlMapper {

	/**
	 * 条件查询搭配信息
	 */
	public static final String COLLOCATION_QUERY = "collocationMapper.collocationQuery";

	/**
	 * 查询搭配信息详情
	 */
	public static final String COLLOCATION_ITEM_QUERY = "collocationMapper.collocationItemQuery";

	/**
	 * 添加搭配信息
	 */
	public static final String ADD_COLLOCATION = "collocationMapper.addCollocation";

	/**
	 * 修改搭配信息
	 */
	public static final String UPDATE_COLLOCATION = "collocationMapper.updateCollocation";

	/**
	 * 删除搭配信息
	 */
	public static final String DELETE_COLLOCATION = "collocationMapper.deleteCollocation";

	/**
	 * 删除搭配引用图片
	 */
	public static final String DELETE_COLL_STYLE = "collocationMapper.deleteCollStyle";

}
