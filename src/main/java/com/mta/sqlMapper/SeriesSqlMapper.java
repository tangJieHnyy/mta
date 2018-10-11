package com.mta.sqlMapper;

public interface SeriesSqlMapper {

	/**
	 * 条件查询系列信息
	 */
	public static final String SERIES_INFO_QUERY = "seriesMapper.seriesInfoQuery";

	/**
	 * 查询系列信息详情
	 */
	public static final String SERIES_INFO_QUERY_ITEM = "seriesMapper.seriesInfoQueryItem";

	/**
	 * 添加系列信息
	 */
	public static final String ADD_SERIES = "seriesMapper.addSeries";

	/**
	 * 修改系列信息
	 */
	public static final String UPDATE_SERIES_INFO = "seriesMapper.updateSeriesInfo";

	/**
	 * 删除系列信息
	 */
	public static final String DELETE_SERIES_INFO = "seriesMapper.deleteSeriesInfo";

	/**
	 * 删除图片
	 */
	public static final String DELETE_IMG_INFO = "seriesMapper.deleteImgInfo";

}
