package G_5;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class DB_test {
	 Connection conn ;
     Statement st;
     ResultSet rs;
     PreparedStatement pstmt;
     
     public DB_test(){
   	  try {
   		  Class.forName("com.mysql.cj.jdbc.Driver");
   		  conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/tutorial?serverTimezone=UTC","root","root");
   		System.out.println("드라이버 연결 굿");
   	  }catch(Exception e) {
   		  System.out.println("드라이버 로딩 실패");
	            System.out.println(e);
   	  }
     }
     public boolean isAdmin(String adminId,String adminPassword) {
		try {
			String SQL= "INSERT INTO admin VALUES('test', 'test') ";
			pstmt = conn.prepareStatement(SQL);
			pstmt.executeUpdate();
			String Sql = "select * from admin where adminID = '"+adminId+"'and adminPassWord='"+adminPassword+"'";
			rs = pstmt.executeQuery(Sql);
			
			
			if(rs.next()) {
				return true;
			}
		}catch(Exception e) {
			 System.out.println("드라이버 로딩 실패");
	            System.out.println(e);
		}
    	 return false;
     }
     
	public static void main(String[] args) {
		DB_test connection = new DB_test();
		System.out.println("관리자 여부:"+connection.isAdmin("test","test"));
	}
//	    public static void main(String[] args) {
//	        // Connection 객체를 자동완성으로 import할 때는 com.mysql.connection이 아닌
//	        // java 표준인 java.sql.Connection 클래스를 import해야 한다.
//	      
//	        
//	        
//
//	        try{
//	        	 // 1. 드라이버 로딩
//	            // 드라이버 인터페이스를 구현한 클래스를 로딩
//	            // mysql, oracle 등 각 벤더사 마다 클래스 이름이 다르다.
//	            // mysql은 "com.mysql.jdbc.Driver"이며, 이는 외우는 것이 아니라 구글링하면 된다.
//	            // 참고로 이전에 연동했던 jar 파일을 보면 com.mysql.jdbc 패키지에 Driver 라는 클래스가 있다.
//	       
//
//	            // 2. 연결하기
//	            // 드라이버 매니저에게 Connection 객체를 달라고 요청한다.
//	            // Connection을 얻기 위해 필요한 url 역시, 벤더사마다 다르다.
//	            // mysql은 "jdbc:mysql://localhost/사용할db이름" 이다.
//	            String url = "jdbc:mysql:// localhost:8080/dev";
//
//	            // @param  getConnection(url, userName, password);
//	            // @return Connection
//	            conn = DriverManager.getConnection(url, "dev", "dev");
//	            System.out.println("연결 성공");
//
//	        }
//	        catch(Exception e){
//	            System.out.println("드라이버 로딩 실패");
//	            System.out.println(e);
//	        }
//	    }
	
}
