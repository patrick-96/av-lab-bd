package persistence;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	public static void main(String[]args) throws SQLException{
		 Connection conexao=new GenericDao().getConnection();
		 System.out.println("OLA Marilene");
		 conexao.close();
		
		
	}

}
