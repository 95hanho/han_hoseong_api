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

import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;
import me._hanho.han_hoseong.service.MenuService;


@RestController
@RequestMapping("/api/menu")
public class MenuController {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	@Autowired
	private MenuService menuService;
	
	// 메뉴가져오기
	@GetMapping
	public ResponseEntity<Map<String, Object>> get_menus() {
		logger.info("getMenus");
		Map<String, Object> result = new HashMap<String, Object>();
		
		List<Parent_menu> menus = menuService.getMenus();
		
		System.out.println(menus);
		
		result.put("menus", menus);
		result.put("version", 1);
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	// 메뉴하나 변경하기
	@PostMapping
	public ResponseEntity<Map<String, Object>> set_menus(@ModelAttribute Menu menu) {
		logger.info("getMenus");
		System.out.println(menu);
		Map<String, Object> result = new HashMap<String, Object>();
		
		menuService.setMenus(menu);
		
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
	
}
