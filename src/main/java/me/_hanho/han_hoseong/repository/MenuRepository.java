package me._hanho.han_hoseong.repository;

import java.util.ArrayList;
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
	
	public List<Icon> get_icons() {
		 List<Icon> icons = new ArrayList<>();
		 List<Icon> real_icons = menuMapper.get_icons();
		 List<Icon> folders = menuMapper.get_folders();
		 for(Icon folder : folders) {
			 List<Icon> child_icons = menuMapper.get_child_icons(folder.getIcon_id());
			 folder.getChildren().addAll(child_icons);
		 }
		 icons.addAll(real_icons);
		 icons.addAll(folders);
		return icons;
	}
	
	public Icon select_latest_icon() {
		return menuMapper.select_latest_icon();
	}
	
	public void create_folder(Icon icon) {
		menuMapper.create_folder(icon);
	}
	
	public void create_icon(Icon icon) {
		menuMapper.create_icon(icon);
	}

	public void update_icon(Icon icon) {
		menuMapper.update_icon(icon);
	}
	
	public void set_icon(Icon icon) {
		menuMapper.set_icon(icon);
	}

	public void delete_icon(int icon_id) {
		menuMapper.delete_icon(icon_id);
	}










}
