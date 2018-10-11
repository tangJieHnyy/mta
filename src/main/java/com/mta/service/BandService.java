package com.mta.service;

import java.util.Map;

import com.mta.dto.ResponseJson;

/**
 * 
 * @author tangj
 *
 */
public interface BandService {

	/**
	 * 查询波段
	 * 
	 * @param conMap
	 * @param cmd
	 * @return
	 */
	ResponseJson bandInfoQuery(Map<String, Object> conMap, int cmd);

}
