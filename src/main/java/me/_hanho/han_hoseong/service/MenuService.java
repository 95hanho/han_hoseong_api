package me._hanho.han_hoseong.service;

import java.util.List;

import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;

public interface MenuService {

	List<Parent_menu> getMenus();

	void setMenus(Menu menu);

}
