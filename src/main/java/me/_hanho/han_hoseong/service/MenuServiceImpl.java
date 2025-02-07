package me._hanho.han_hoseong.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public void set_quicks(ArrayList<Quick> quickList) {
		delete_over_quick(quickList.size()); // 퀵리스트보다 큰 리스트는 없애줌
		for(int i = 0; i < quickList.size(); i++) {
			Quick quick = quickList.get(i);
			int has_quick = menuDAO.has_quick(quick.getQuick_id()); 
			if(has_quick > 0) {
				menuDAO.create_quick(quick);
			}
			List<Menu> menus = quick.getMenus();
			for(int i2 = 0; i2 < menus.size(); i2++) {
				Menu menu = menus.get(i2);
				
			}
		}
	}

	@Override
	public void delete_over_quick(int size) {
		menuDAO.delete_over_quick(size);
	}


}
