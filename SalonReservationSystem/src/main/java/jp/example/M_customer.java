package jp.example;

public class M_customer {
	private int kokyakuid;
	private String kokyakuname;
	private String tel;
	private String email;




	M_customer(){

	}
	M_customer(int kokyakuid,String kokyakuname,String tel,String email){
		setKokyakuid(kokyakuid);
		setKokyakuname(kokyakuname);
		setTel(tel);
		setEmail(email);
		
	}

	public int getKokyakuid() {
		return kokyakuid;
	}
	public void setKokyakuid(int kokyakuid) {
		this.kokyakuid = kokyakuid;
	}
	public String getKokyakuname() {
		return kokyakuname;
	}
	public void setKokyakuname(String kokyakuname) {
		this.kokyakuname = kokyakuname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
