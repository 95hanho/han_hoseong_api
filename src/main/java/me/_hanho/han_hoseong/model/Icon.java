package me._hanho.han_hoseong.model;

public class Icon extends Menu {

	private int icon_id;
	private int row;
	private int col;
	private String name;
	private boolean folder;
	
	private int folder_icon_id;
	private int menu_id;
	
	public Icon() {
		// TODO Auto-generated constructor stub
	}

	public Icon(int icon_id, int row, int col, String name, boolean folder, int folder_icon_id,
			int menu_id) {
		super();
		this.icon_id = icon_id;
		this.row = row;
		this.col = col;
		this.name = name;
		this.folder = folder;
		this.folder_icon_id = folder_icon_id;
		this.menu_id = menu_id;
	}

	public int getIcon_id() {
		return icon_id;
	}

	public void setIcon_id(int icon_id) {
		this.icon_id = icon_id;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFolder() {
		return folder;
	}

	public void setFolder(boolean folder) {
		this.folder = folder;
	}

	public int getFolder_icon_id() {
		return folder_icon_id;
	}

	public void setFolder_icon_id(int folder_icon_id) {
		this.folder_icon_id = folder_icon_id;
	}

	public int getMenu_id() {
		return menu_id;
	}

	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}

	@Override
	public String toString() {
		return "Icon [icon_id=" + icon_id + ", row=" + row + ", col=" + col + ", name=" + name + ", folder=" + folder
				+ ", folder_icon_id=" + folder_icon_id + ", menu_id=" + menu_id + "]";
	}
	
}
