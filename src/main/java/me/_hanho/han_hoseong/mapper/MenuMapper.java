package me._hanho.han_hoseong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;
import me._hanho.han_hoseong.model.Quick;

@Mapper
public interface MenuMapper {

	List<Parent_menu> get_parent_menus();

	List<Menu> getMenus(int parent_menu_id);

	void setMenus(Menu menu);
	
	List<Quick> get_quicks();
	
	List<Menu> get_quick_menus(Quick quick);

	void delete_all_quick();

	void create_quick(Quick quick);

	void reset_menu_quick();

	void set_menu_order(Menu menu);





}
