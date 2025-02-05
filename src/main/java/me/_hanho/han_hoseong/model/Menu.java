package me._hanho.han_hoseong.model;

public class Menu {

	private int menu_id;
	private String name;
	private String url;
	private String icon;
	private int parent_menu_id;
	private String color;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(int menu_id, String name, String url, String icon, int parent_menu_id) {
		super();
		this.menu_id = menu_id;
		this.name = name;
		this.url = url;
		this.icon = icon;
		this.parent_menu_id = parent_menu_id;
	}
	
	public Menu(int menu_id, String name, String url, String icon, int parent_menu_id, String color) {
		super();
		this.menu_id = menu_id;
		this.name = name;
		this.url = url;
		this.icon = icon;
		this.parent_menu_id = parent_menu_id;
		this.color = color;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getParent_menu_id() {
		return parent_menu_id;
	}

	public void setParent_menu_id(int parent_menu_id) {
		this.parent_menu_id = parent_menu_id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", name=" + name + ", url=" + url + ", icon=" + icon + ", parent_menu_id="
				+ parent_menu_id + ", color=" + color + "]";
	}

}
