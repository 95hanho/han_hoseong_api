package me._hanho.han_hoseong.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me._hanho.han_hoseong.model.Background;
import me._hanho.han_hoseong.model.Parent_menu;
import me._hanho.han_hoseong.service.UiService;

@RestController
@RequestMapping("/api/ui")
public class UiController {

	private static final Logger logger = LoggerFactory.getLogger(UiController.class);
	
	@Autowired
	private UiService uiService;
	
	// 메뉴가져오기
	@GetMapping("/background")
	public ResponseEntity<Map<String, Object>> get_bgInfo() {
		logger.info("get_bgInfo");
		Map<String, Object> result = new HashMap<String, Object>();
		
		Background background = uiService.get_bgInfo();
		
		result.put("background", background);
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	// 메뉴가져오기
	@PostMapping("/background")
	public ResponseEntity<Map<String, Object>> set_bgInfo(@ModelAttribute Background background) {
		logger.info("set_bgInfo");
		Map<String, Object> result = new HashMap<String, Object>();
		
		System.out.println(background);
		uiService.set_bgInfo(background);
		
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
}
