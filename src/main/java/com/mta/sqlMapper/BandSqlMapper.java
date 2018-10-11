package com.mta.sqlMapper;

public interface BandSqlMapper {

	/**
	 * 条件查询波段信息
	 */
	public static final String BAND_INFO_QUERY = "bandMapper.bandInfoQuery";

	/**
	 * 查询波段信息详情
	 */
	public static final String BAND_INFO_ITEM_QUERY = "bandMapper.bandInfoItemQuery";

	/**
	 * 添加波段信息
	 */
	public static final String ADD_BAND_INFO = "bandMapper.addBandInfo";

	/**
	 * 修改波段信息
	 */
	public static final String UPDATE_BAND_INFO = "bandMapper.updateBandInfo";

	/**
	 * 删除波段信息
	 */
	public static final String DELETE_BAND_INFO = "bandMapper.deleteBandInfo";

}
