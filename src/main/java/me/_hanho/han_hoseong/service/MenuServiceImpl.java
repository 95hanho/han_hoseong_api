package me._hanho.han_hoseong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;
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

}
