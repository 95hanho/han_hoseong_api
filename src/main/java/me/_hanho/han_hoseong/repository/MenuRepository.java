package me._hanho.han_hoseong.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import me._hanho.han_hoseong.mapper.MenuMapper;
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

	public int has_quick(int quick_id) {
		return menuMapper.has_quick(quick_id);
	}

	public void delete_over_quick(int size) {
		menuMapper.delete_over_quick(size);
	}

	public void create_quick(Quick quick) {
		menuMapper.create_quick(quick);
	}

}
