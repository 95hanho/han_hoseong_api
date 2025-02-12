package me._hanho.han_hoseong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import me._hanho.han_hoseong.model.Icon;
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

	List<Icon> get_icons();
	
	List<Icon> get_folders();
	
	List<Icon> get_child_icons(int icon_id);
	
	Icon select_latest_icon();

	void create_folder(Icon icon);
	
	void create_icon(Icon icon);
	
	void update_icon(Icon icon);
	
	void set_icon(Icon icon);

	void delete_icon(int icon_id);






}
