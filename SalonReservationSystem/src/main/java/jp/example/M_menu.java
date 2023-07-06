package jp.example;

public class M_menu {
	private int menuid;
	private String menuname;

	M_menu(){

	}
	M_menu(int menuid,String menuname){
		setMenuid(menuid);
		setMenuname(menuname);
	}

	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
}
