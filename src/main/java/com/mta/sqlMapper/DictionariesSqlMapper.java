package com.mta.sqlMapper;

public interface DictionariesSqlMapper {

	/**
	 * 查询字典信息
	 */
	public static final String DICTIONARIES_QUERY = "dictionariesMapper.dictionariesQuery";

	/**
	 * 添加字典信息
	 */
	public static final String ADD_DICTIONARIES = "dictionariesMapper.addDictionaries";

	/**
	 * 删除字典信息
	 */
	public static final String DELETE_DICTIONARIES = "dictionariesMapper.deleteDictionaries";

	/**
	 * 添加字典图片
	 */
	public static final String ADD_DICTIONARIES_IMAGE = "dictionariesMapper.addDictionariesImage";
}
