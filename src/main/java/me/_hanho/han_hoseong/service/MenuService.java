package me._hanho.han_hoseong.service;

import java.util.ArrayList;
import java.util.List;

import me._hanho.han_hoseong.model.Icon;
import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;
import me._hanho.han_hoseong.model.Quick;

public interface MenuService {

	List<Parent_menu> getMenus();

	void setMenus(Menu menu);
	
	List<Quick> get_quicks();

	void set_quicks(ArrayList<Quick> quickList);
	
	void delete_all_quick();

	List<Icon> get_icons();
	
	Icon select_latest_icon();

	void create_folder(Icon icon);
	
	void create_icon(Icon icon);
	
	void update_icon(Icon icon);
	
	void set_icon(Icon icon);
	
	void delete_icon(int icon_id);







	

}
