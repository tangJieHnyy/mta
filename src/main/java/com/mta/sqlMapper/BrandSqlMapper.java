package com.mta.sqlMapper;

public interface BrandSqlMapper {

	/**
	 * 条件查询品牌信息
	 */
	public static final String BRAND_INFO_QUERY = "brandMapper.brandInfoQuery";

	/**
	 * 查询品牌信息详情
	 */
	public static final String BRAND_INFO_ITEM_QUERY = "brandMapper.brandInfoItemQuery";

	/**
	 * 添加品牌信息
	 */
	public static final String ADD_BRAND_INFO = "brandMapper.addBrandInfo";

	/**
	 * 修改品牌信息
	 */
	public static final String UPDATE_BRAND_INFO = "brandMapper.updateBrandInfo";

	/**
	 * 删除品牌信息
	 */
	public static final String DELETE_BRAND_INFO = "brandMapper.deleteBrandInfo";

}
