package cc.biibi.db;

import java.sql.Connection;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {

	
	/*
	 *�ͷ�Connection ���� 
	 * */
	public static void releaseConnection(Connection connection){
		try{
			if(connection !=null){
				connection.close();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//C3P0��
	private static DataSource dataSource =null;
	//��Ϊ����Դֻ�ܱ�����һ�Σ�����ֻ�ܷ��ھ�̬���������
	static{
		dataSource = new ComboPooledDataSource("pageSql");
	}
	
	
	/*
	 * �������ݵ� һ��Connection����
	 * */
	public static Connection getConnection() throws Exception{
		return dataSource.getConnection();
	}
	
	
	
}