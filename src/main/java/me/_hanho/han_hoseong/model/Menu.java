package me._hanho.han_hoseong.model;

public class Menu {

	private int menu_id;
	private String name;
	private String url;
	private String icon;
	private String color;
	private String custom_color;
	// 부모메뉴 관련
	private int parent_menu_id;
	private String parent; // 부모메뉴 이름
	private boolean frame_on; // iframe 지원하는지
	// 퀵메뉴 관련
	private int quick_id;
	private int quick_menu_order; // 퀵메뉴 안 메뉴리스트의 순서
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(int menu_id, String name, String url, String icon, String color, String custom_color,
			int parent_menu_id, String parent, boolean frame_on, int quick_id, int quick_menu_order) {
		super();
		this.menu_id = menu_id;
		this.name = name;
		this.url = url;
		this.icon = icon;
		this.color = color;
		this.custom_color = custom_color;
		this.parent_menu_id = parent_menu_id;
		this.parent = parent;
		this.frame_on = frame_on;
		this.quick_id = quick_id;
		this.quick_menu_order = quick_menu_order;
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
	
	public String getCustom_color() {
		return custom_color;
	}

	public void setCustom_color(String custom_color) {
		this.custom_color = custom_color;
	}

	public int getQuick_id() {
		return quick_id;
	}

	public void setQuick_id(int quick_id) {
		this.quick_id = quick_id;
	}

	public int getQuick_menu_order() {
		return quick_menu_order;
	}

	public void setQuick_menu_order(int quick_menu_order) {
		this.quick_menu_order = quick_menu_order;
	}
	
	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
	
	public boolean isFrame_on() {
		return frame_on;
	}

	public void setFrame_on(boolean frame_on) {
		this.frame_on = frame_on;
	}

	@Override
	public String toString() {
		return "Menu [menu_id=" + menu_id + ", name=" + name + ", url=" + url + ", icon=" + icon + ", color=" + color
				+ ", custom_color=" + custom_color + ", parent_menu_id=" + parent_menu_id + ", parent=" + parent
				+ ", frame_on=" + frame_on + ", quick_id=" + quick_id + ", quick_menu_order=" + quick_menu_order + "]";
	}
	
}
