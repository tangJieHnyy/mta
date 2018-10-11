package com.mta.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mta.cmd.ConstantCMD;
import com.mta.dto.RequestJson;
import com.mta.dto.ResponseJson;
import com.mta.service.BandService;

/**
 * 波段管理模块
 * 
 * @author tangj
 *
 */
@Controller
public class BandController extends BaseController {

	@Autowired
	private BandService bandService;

	@RequestMapping("/band")
	@ResponseBody
	public ResponseJson houseMag(@RequestBody RequestJson requestJson, HttpServletRequest request) throws Exception {
		ResponseJson responseJson = null;

		int cmd = requestJson.getHead().getCmd();
		Map<String, Object> conMap = requestJson.getCon();

		switch (cmd) {
		case ConstantCMD.CMD_20001:
			responseJson = bandService.bandInfoQuery(conMap, cmd);
			break;
		default:
			break;
		}

		return responseJson;
	}

}
