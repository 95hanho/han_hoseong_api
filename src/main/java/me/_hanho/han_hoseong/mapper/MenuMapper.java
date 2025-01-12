package me._hanho.han_hoseong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import me._hanho.han_hoseong.model.Menu;
import me._hanho.han_hoseong.model.Parent_menu;

@Mapper
public interface MenuMapper {

	List<Parent_menu> get_parent_menus();

	List<Menu> getMenus(int parent_menu_id);

}
