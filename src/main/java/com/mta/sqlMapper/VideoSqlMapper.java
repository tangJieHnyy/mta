package com.mta.sqlMapper;

public interface VideoSqlMapper {

	/**
	 * 条件查询视频信息
	 */
	public static final String VIDEO_INFO_QUERY = "videoMapper.videoInfoQuery";

	/**
	 * 查询视频信息详情
	 */
	public static final String VIDEO_INFO_ITEM_QUERY = "videoMapper.videoInfoItemQuery";

	/**
	 * 添加视频信息
	 */
	public static final String ADD_VIDEO_INFO = "videoMapper.addVideoInfo";

	/**
	 * 修改视频信息
	 */
	public static final String UPDATE_VIDEO_INFO = "videoMapper.updateVideoInfo";

	/**
	 * 删除视频信息
	 */
	public static final String DELETE_VIDEO_INFO = "videoMapper.deleteVideoInfo";

}
