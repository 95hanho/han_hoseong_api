package me._hanho.han_hoseong.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me._hanho.han_hoseong.model.Icon;
import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;
import me._hanho.han_hoseong.model.Quick;
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
		logger.info("get_menus");
		Map<String, Object> result = new HashMap<String, Object>();
		
		List<Parent_menu> menus = menuService.getMenus();
		
		result.put("menus", menus);
		result.put("version", 1);
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	// 메뉴하나 변경하기
	@PostMapping
	public ResponseEntity<Map<String, Object>> set_menus(@ModelAttribute Menu menu) {
		logger.info("set_menus");
		Map<String, Object> result = new HashMap<String, Object>();
		
		menuService.setMenus(menu);
		
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	// 퀵메뉴 가져오기
	@GetMapping("/quick")
	public ResponseEntity<Map<String, Object>> get_quicks() {
		logger.info("get_quicks");
		Map<String, Object> result = new HashMap<String, Object>();
		
		List<Quick> quickList = menuService.get_quicks();
		
		result.put("quickList", quickList);
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	// 퀵메뉴리스트 설정하기
	@PostMapping("/quick")
	public ResponseEntity<Map<String, Object>> set_quicks(@RequestBody ArrayList<Quick> quickList) {
		logger.info("set_quicks");
		Map<String, Object> result = new HashMap<String, Object>();
		
		menuService.set_quicks(quickList);
		
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	// 아이콘 가져오기
	@GetMapping("/icon")
	public ResponseEntity<Map<String, Object>> get_icons() {
		logger.info("get_icons");
		Map<String, Object> result = new HashMap<String, Object>();
		
		List<Icon> icons = menuService.get_icons();
		
		result.put("icons", icons);
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	// 아이콘 설정하기
	@PostMapping("/icon")
	public ResponseEntity<Map<String, Object>> set_icon(@ModelAttribute Icon icon, @RequestParam("type") String type) {
		logger.info("set_icons");
		Map<String, Object> result = new HashMap<String, Object>();

		System.out.println(type);
		System.out.println(icon);
		
		// 폴더 생성
		if(type.equals("create_folder")) {
			menuService.create_folder(icon);
			Icon latest_folder = menuService.select_latest_icon();
			result.put("icon_id", latest_folder.getIcon_id());
		}
		// 아이콘 생성(윈도우메뉴에서 가져옴)
		if(type.equals("create_icon")) {
			menuService.create_icon(icon);
			Icon latest_folder = menuService.select_latest_icon();
			result.put("icon_id", latest_folder.getIcon_id());
		}
		// 
		if(type.equals("update_icon")) {
			menuService.update_icon(icon);
		}
		
//		menuService.set_icon(icon);
		
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	// 아이콘 삭제하기
	@DeleteMapping("/icon")
	public ResponseEntity<Map<String, Object>> delete_icon(@RequestParam("icon_id") int icon_id) {
		logger.info("delete_icon");
		Map<String, Object> result = new HashMap<String, Object>();
		
		menuService.delete_icon(icon_id);
		
		result.put("msg", "SUCCESS");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
	
}
