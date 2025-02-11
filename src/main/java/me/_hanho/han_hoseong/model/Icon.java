package me._hanho.han_hoseong.model;

import java.util.ArrayList;
import java.util.List;

public class Icon extends Menu {

	private int icon_id;
	private int row;
	private int col;
	private String folder_name = "";
	private boolean folder;
	
	private int folder_icon_id;
	private int menu_id;
	
	private List<Icon> children = new ArrayList<>();
	
	public Icon() {
		// TODO Auto-generated constructor stub
	}

	public Icon(int icon_id, int row, int col, String folder_name, boolean folder, int folder_icon_id,
			int menu_id) {
		super();
		this.icon_id = icon_id;
		this.row = row;
		this.col = col;
		this.folder_name = folder_name;
		this.folder = folder;
		this.folder_icon_id = folder_icon_id;
		this.menu_id = menu_id;
	}
	
	public Icon(int icon_id, int row, int col, String folder_name, boolean folder, int folder_icon_id, int menu_id,
			List<Icon> children) {
		super();
		this.icon_id = icon_id;
		this.row = row;
		this.col = col;
		this.folder_name = folder_name;
		this.folder = folder;
		this.folder_icon_id = folder_icon_id;
		this.menu_id = menu_id;
		this.children = children;
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

	public String getFolder_name() {
		return folder_name;
	}

	public void setFolder_name(String name) {
		this.folder_name = name;
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
	
	public List<Icon> getChildren() {
		return children;
	}

	public void setChildren(List<Icon> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Icon [icon_id=" + icon_id + ", row=" + row + ", col=" + col + ", folder_name=" + folder_name + ", folder=" + folder
				+ ", folder_icon_id=" + folder_icon_id + ", menu_id=" + menu_id + "]";
	}
	
}
