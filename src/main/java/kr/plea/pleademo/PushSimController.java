package kr.plea.pleademo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import kr.plea.pleademo.domain.PushMsgVO;
import kr.plea.pleademo.domain.PushReportVO;
import kr.plea.pleademo.domain.PushResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.Charset;
import java.util.Map;

@Controller
public class PushSimController {
	Logger logger = LoggerFactory.getLogger(PushSimController.class);
	
	@RequestMapping(value = "/customif/push", method = RequestMethod.POST)
	@ResponseBody
	public PushResponseVO customifPush(@RequestParam PushMsgVO pushMsgVO) {
		PushResponseVO pushResponseVO = new PushResponseVO();
		logger.debug("Requset customifPush!");


		if(pushMsgVO.getNotiMsgTitle().equals("HTTP200OK")){
			pushResponseVO.setCode(200);
			pushResponseVO.setDesc("HTTP Requset 200 OK!");
		}else{
			pushResponseVO.setCode(400);
			pushResponseVO.setDesc("HTTP BadRequest 400 Fail!");
		}
		return pushResponseVO;
	}

	@RequestMapping(value = "/customif/report", method = RequestMethod.POST)
	@ResponseBody
	public PushReportVO customifReqReport(@RequestParam Map<String, Object> params) {
		PushReportVO pushReportVO = new PushReportVO();
		logger.info("Requset customifReport!");

		pushReportVO.setPushId((String) params.get("pushId"));
		pushReportVO.setMsgStatTpCd((String) params.get("msgStatTpCd"));
		pushReportVO.setRecvConfDtm((String) params.get("recvConfDtm"));
		pushReportVO.setRecvConfYn((String) params.get("recvConfYn"));
		pushReportVO.setRecvDtm((String) params.get("recvDtm"));
		pushReportVO.setRsltCd((String) params.get("rsltCd"));
		pushReportVO.setSenderMsgId((String) params.get("senderMsgId"));

		RestTemplate restTemplate = new RestTemplate();

		String body = "";
		HttpHeaders headers = null;
		HttpEntity entity = null;

		try {
			body = new ObjectMapper().writeValueAsString(pushReportVO);
			headers = new HttpHeaders();
			headers.setContentType(new MediaType("application","json", Charset.forName("UTF-8")));
			entity = new HttpEntity<>(body,headers);

			restTemplate.postForEntity("http://127.0.0.1:9005/customif/report",entity,PushReportVO.class,pushReportVO);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return pushReportVO;
	}
}
