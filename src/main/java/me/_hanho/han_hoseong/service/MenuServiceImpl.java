package me._hanho.han_hoseong.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me._hanho.han_hoseong.model.Icon;
import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;
import me._hanho.han_hoseong.model.Quick;
import me._hanho.han_hoseong.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuRepository menuDAO;

	@Override
	@Transactional
	public List<Parent_menu> getMenus() {
		List<Parent_menu> parent_menus = menuDAO.get_parent_menus();
		for(Parent_menu parent_menu : parent_menus) {
			List<Menu> menus = menuDAO.getMenus(parent_menu.getParent_menu_id());
			parent_menu.setMenu_list(menus);
		}
		return parent_menus;
	}

	@Override
	public void setMenus(Menu menu) {
		menuDAO.setMenus(menu);
	}

	@Override
	public List<Quick> get_quicks() {
		return menuDAO.get_quicks();
	}
	
	@Override
	@Transactional
	public void set_quicks(ArrayList<Quick> quickList) {
		delete_all_quick(); // 퀵리스트 초기화
		menuDAO.reset_menu_quick(); // 메뉴의 quick관련 초기화
		for(int i = 0; i < quickList.size(); i++) {
			Quick quick = quickList.get(i);
			quick.setQuick_id(i + 1);
			menuDAO.create_quick(quick);
			//
			List<Menu> menus = quick.getMenus();
			for(int i2 = 0; i2 < menus.size(); i2++) {
				Menu menu = menus.get(i2);
				menu.setQuick_id(i + 1);
				menu.setQuick_menu_order(i2 + 1);
				menuDAO.set_menu_order(menu);
			}
		}
	}

	@Override
	public void delete_all_quick() {
		menuDAO.delete_all_quick();
	}

	@Override
	public List<Icon> get_icons() {
		return menuDAO.get_icons();
	}
	
	@Override
	public Icon select_latest_icon() {
		return menuDAO.select_latest_icon();
	}
	
	@Override
	public void create_folder(Icon icon) {
		menuDAO.create_folder(icon);
	}
	
	@Override
	public void create_icon(Icon icon) {
		menuDAO.create_icon(icon);
	}
	
	@Override
	public void update_icon(Icon icon) {
		menuDAO.update_icon(icon);
	}

	@Override
	public void set_icon(Icon icon) {
		menuDAO.set_icon(icon);
	}

	@Override
	public void delete_icon(int icon_id) {
		menuDAO.delete_icon(icon_id);
	}







}
