package com.mta.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mta.cmd.ErrorCMD;
import com.mta.dao.BaseDao;
import com.mta.dto.ResponseJson;
import com.mta.service.BandService;
import com.mta.sqlMapper.BandSqlMapper;

/**
 * 
 * @author tangj
 *
 */
@Service
@Transactional
@SuppressWarnings("unchecked")
public class BandServiceImpl implements BandService {

	@Autowired
	private BaseDao<Map<String, Object>> baseDao;

	private static final Logger logger = Logger.getLogger(BandServiceImpl.class);

	@Override
	public ResponseJson bandInfoQuery(Map<String, Object> conMap, int cmd) {

		ResponseJson responseJson = new ResponseJson();
		try {
			// 所属品牌
			Object oBrandId = conMap.get("brandId");
			// 波段名称
			Object oBandName = conMap.get("bandName");
			// 波段季节
			Object oBandSeason = conMap.get("bandSeason");
			// 波段开始时间
			Object oStartTime = conMap.get("startTime");
			// 波段结束时间
			Object oEndTime = conMap.get("endTime");
			// 波段标签
			Object oBandLabel = conMap.get("bandLabel");
			// 页码
			Object oPageNum = conMap.get("pageNum");
			// 页面大小
			Object oPageSize = conMap.get("pageSize");

			if (oBrandId == null || "".equals(oBrandId.toString().trim())) {
				return responseJson.getResponseJson(ErrorCMD.TYPE_ERROR, cmd, "brandId is empty", null);
			}

			if (oBandName == null) {
				return responseJson.getResponseJson(ErrorCMD.TYPE_ERROR, cmd, "bandName is empty", null);
			}

			if (oBandSeason == null) {
				return responseJson.getResponseJson(ErrorCMD.TYPE_ERROR, cmd, "bandSeason is empty", null);
			}

			if (oStartTime == null) {
				return responseJson.getResponseJson(ErrorCMD.TYPE_ERROR, cmd, "startTime is empty", null);
			}

			if (oEndTime == null) {
				return responseJson.getResponseJson(ErrorCMD.TYPE_ERROR, cmd, "endTime is empty", null);
			}

			if (oBandLabel == null) {
				return responseJson.getResponseJson(ErrorCMD.TYPE_ERROR, cmd, "bandLabel is empty", null);
			}

			if (oPageNum == null || "".equals(oPageNum.toString().trim())) {
				return responseJson.getResponseJson(ErrorCMD.TYPE_ERROR, cmd, "pageNum is empty", null);
			}

			if (oPageSize == null || "".equals(oPageSize.toString().trim())) {
				return responseJson.getResponseJson(ErrorCMD.TYPE_ERROR, cmd, "pageSize is empty", null);
			}

			Map<String, Object> proceParam = new HashMap<String, Object>();

			proceParam.put("BRAND_ID", oBrandId.toString());
			proceParam.put("BAND_NAME", oBandName);
			proceParam.put("BAND_SEASON", Integer.parseInt(oBandSeason.toString()));
			proceParam.put("BAND_START_TIME", oStartTime);
			proceParam.put("BAND_END_TIME", oEndTime);
			proceParam.put("BAND_LABEL", oBandLabel);
			proceParam.put("PAGE_NUM", Integer.parseInt(oPageNum.toString()));
			proceParam.put("PAGE_SIZE", Integer.parseInt(oPageSize.toString()));

			baseDao.getByCallable(BandSqlMapper.BAND_INFO_QUERY, proceParam);

			Map<String, Object> body = new HashMap<String, Object>();

			List<Map<String, Object>> bandInfoList = (List<Map<String, Object>>) proceParam.get("BANDCURSOR");
			Object count = ((List<Map<String, Object>>) proceParam.get("COUNT")).get(0).get("count");

			for (int i = 0; i < bandInfoList.size(); i++) {
				Map<String, Object> bandInfo = bandInfoList.get(i);
				if (bandInfo.get("startTime") == null) {
					bandInfo.put("startTime", "");
				}

				if (bandInfo.get("bandLabel") == null) {
					bandInfo.put("bandLabel", "");
				}

				bandInfoList.set(i, bandInfo);
			}

			body.put("bandInfoList", bandInfoList);
			body.put("count", count);

			responseJson.getResponseJson(ErrorCMD.SUCCESS, cmd, ErrorCMD.SUCCESS_MESSAGE, body);

		} catch (Exception e) {
			logger.error(e.getMessage());
			responseJson.getResponseJson(ErrorCMD.ERROR, cmd, ErrorCMD.ERROR_MESSAGE, null);
			e.printStackTrace();
		}
		return responseJson;
	}

}
