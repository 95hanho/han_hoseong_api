package me._hanho.han_hoseong.service;

import java.util.ArrayList;
import java.util.List;

import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;
import me._hanho.han_hoseong.model.Quick;

public interface MenuService {

	List<Parent_menu> getMenus();

	void setMenus(Menu menu);

	void set_quicks(ArrayList<Quick> quickList);
	
	void delete_over_quick(int size);

}
