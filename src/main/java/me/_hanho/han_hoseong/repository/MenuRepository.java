package me._hanho.han_hoseong.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me._hanho.han_hoseong.mapper.MenuMapper;
import me._hanho.han_hoseong.model.Icon;
import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;
import me._hanho.han_hoseong.model.Quick;

@Repository
public class MenuRepository {
	
	@Autowired
	private MenuMapper menuMapper;

	public List<Parent_menu> get_parent_menus() {
		return menuMapper.get_parent_menus();
	}

	public List<Menu> getMenus(int parent_menu_id) {
		return menuMapper.getMenus(parent_menu_id);
	}

	public void setMenus(Menu menu) {
		menuMapper.setMenus(menu);
	}
	
	public List<Quick> get_quicks() {
		List<Quick> quickList = menuMapper.get_quicks();
		for(Quick quick : quickList) {
			List<Menu> menus = menuMapper.get_quick_menus(quick);
			quick.setMenus(menus);
		}
		return quickList; 
	}

	public void delete_all_quick() {
		menuMapper.delete_all_quick();
	}

	public void create_quick(Quick quick) {
		menuMapper.create_quick(quick);
	}

	public void reset_menu_quick() {
		menuMapper.reset_menu_quick();
	}

	public void set_menu_order(Menu menu) {
		menuMapper.set_menu_order(menu);
	}

	public void create_folder(Icon icon) {
		System.out.println("123212");
		menuMapper.create_folder(icon);
		System.out.println("3333");
	}
	
	public void set_icon(Icon icon) {
		menuMapper.set_icon(icon);
	}




}
