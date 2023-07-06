package jp.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AccessDB {
	private Connection conn;
	private String url;
	private String user;
	private String password;

	public AccessDB(){
		url = "jdbc:postgresql://localhost:5432/postgres" ;
		user = "postgres" ;
		password = "postgrestest" ;	
	}
	
//	insertM_ reservation（新しい予約を追加）
	public int inserttM_reservation(M_reservation m_reservation) {
		int count =0;
		String sql ="INSERT INTO M_customer VALUES (?,?,?,?,?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql); ) {
			pstmt.setInt(1, m_reservation.getId());
			pstmt.setDate(2, m_reservation.getHiduke());
			pstmt.setInt(3, m_reservation.getStarttime());
			pstmt.setInt(4, m_reservation.getStarttime());
			pstmt.setInt(5, m_reservation.getStaffid());
			pstmt.setInt(6, m_reservation.getKokyakuid());
			pstmt.setInt(3, m_reservation.getMenuid());

			count = pstmt.executeUpdate();	
			
		} catch ( SQLException e ) {
			e.printStackTrace() ;
		}
		return count;
	}
	
	
//	insertM_ customer（顧客を追加）
	public int insertM_customer(M_customer m_customer) {
		
		int count =0;
		String sql ="INSERT INTO M_customer VALUES (?,?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql); ) {
			pstmt.setInt(1, m_customer.getCustomerid());
			pstmt.setString(2, m_customer.getCustomername());
			pstmt.setString(3, m_customer.getTel());
			pstmt.setString(4, m_customer.getEmail());

			count = pstmt.executeUpdate();	
			
		} catch ( SQLException e ) {
			e.printStackTrace() ;
		}
		return count;
	}
	

//	insertM_ staff（従業員を追加）	
	public int insertM_staff(M_staff m_staff) {
		int count =0;
		String sql ="INSERT INTO M_customer VALUES (?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql); ) {
			pstmt.setInt(1, m_staff.getStaffid());
			pstmt.setString(2, m_staff.getStaffname());

			count = pstmt.executeUpdate();	
			
		} catch ( SQLException e ) {
			e.printStackTrace() ;
		}
		return count;
	}
	
	
//	insertM_ menu（メニューを追加）
	public int insertM_menu(M_menu m_menu) {
		int count =0;
		String sql ="INSERT INTO M_customer VALUES (?,?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql); ) {
			pstmt.setInt(1, m_menu.getMenuid());
			pstmt.setString(2, m_menu.getMenuname());
			pstmt.setInt(3, m_menu.getPrice());

			count = pstmt.executeUpdate();	
			
		} catch ( SQLException e ) {
			e.printStackTrace() ;
		}
		return count;
	}
	
	
}
