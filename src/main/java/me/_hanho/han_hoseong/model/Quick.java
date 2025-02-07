package me._hanho.han_hoseong.model;

import java.util.List;

public class Quick {
	
	private int quick_id;
	private String name;
	private List<Menu> menus;
	
	public Quick() {
		// TODO Auto-generated constructor stub
	}
	
	public Quick(int quick_id, String name, List<Menu> menus) {
		super();
		this.quick_id = quick_id;
		this.name = name;
		this.menus = menus;
	}

	public int getQuick_id() {
		return quick_id;
	}

	public void setQuick_id(int quick_id) {
		this.quick_id = quick_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "Quick [quick_id=" + quick_id + ", name=" + name + ", menus=" + menus + "]";
	}

}
