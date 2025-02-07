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

	int has_quick(int quick_id);

	void delete_over_quick(int size);

	void create_quick(Quick quick);

}
