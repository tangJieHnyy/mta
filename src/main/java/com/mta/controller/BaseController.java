package com.mta.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseController {

	protected static final Logger logger = LoggerFactory.getLogger(BaseController.class);

	/***
	 * 获取页面参数
	 * 
	 * @param request
	 * @return
	 */
	public Map<String, Object> getParams(HttpServletRequest request) {
		Map<String, String[]> requestParams = request.getParameterMap();
		Map<String, Object> params = new HashMap<String, Object>();
		for (String key : requestParams.keySet()) { // 从request.getParameter
													// 拿值
			String[] values = requestParams.get(key);
			String _val = "";
			for (String string : values) {
				_val += string;
			}
			if (!"".equals(_val))
				params.put(key, _val);
		}
		return params;
	}
}
