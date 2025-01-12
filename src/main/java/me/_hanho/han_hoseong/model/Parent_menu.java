package me._hanho.han_hoseong.model;

import java.util.List;

public class Parent_menu {
	
	private int parent_menu_id;
	private String parent_name;
	
	private List<Menu> menu_list;
	
	public Parent_menu() {
		// TODO Auto-generated constructor stub
	}

	public Parent_menu(int parent_menu_id, String parent_name) {
		super();
		this.parent_menu_id = parent_menu_id;
		this.parent_name = parent_name;
	}
	
	public Parent_menu(int parent_menu_id, String parent_name, List<Menu> menu_list) {
		super();
		this.parent_menu_id = parent_menu_id;
		this.parent_name = parent_name;
		this.menu_list = menu_list;
	}
	
	public List<Menu> getMenu_list() {
		return menu_list;
	}

	public void setMenu_list(List<Menu> menu_list) {
		this.menu_list = menu_list;
	}

	public int getParent_menu_id() {
		return parent_menu_id;
	}

	public void setParent_menu_id(int parent_menu_id) {
		this.parent_menu_id = parent_menu_id;
	}

	public String getParent_name() {
		return parent_name;
	}

	public void setParent_name(String parent_name) {
		this.parent_name = parent_name;
	}

	@Override
	public String toString() {
		return "Parent_menu [parent_menu_id=" + parent_menu_id + ", parent_name=" + parent_name + "]";
	}
	

}
