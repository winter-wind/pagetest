package cc.biibi.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cc.biibi.db.JdbcUtils;

public class DAO<T> {

	private QueryRunner queryRunner = new QueryRunner();
	private Class<T> clazz;
	
	public DAO() {
		
		//�������͵Ĺ����߼��ӿ�(Type)
		Type superClass = getClass().getGenericSuperclass();//��ô��з��͵ĸ���
						  //����ʱ��       
		
		if(superClass instanceof ParameterizedType){//instanceof:ǰһ���Ǻ�һ����ʵ��
			
			//��ó���ķ��Ͳ�����ʵ������
			ParameterizedType parameterizedType = (ParameterizedType)superClass;
				
			Type [] typeArgs = parameterizedType.getActualTypeArguments();
												 //���ر�ʾ������ʵ�����Ͳ����� Type ���������
			
			if(typeArgs != null && typeArgs.length > 0){
				if(typeArgs[0] instanceof Class){
					clazz = (Class<T>) typeArgs[0];
						
				}
			}
		}
	}
	
	//����T��Ӧ��List
	public List<T> getForList(String sql,Object ...args){
			
		Connection connection = null;
		try{
			connection  = JdbcUtils.getConnection();
			return queryRunner.query(connection, sql, new BeanListHandler<T>(clazz), args);
															
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.releaseConnection(connection);
		}
			
		return null;
	}
	
	//�������ݿ�����
	public Long getcount(String sql,Object ...args){
		
		Connection connection = null;
		try{
			connection  = JdbcUtils.getConnection();
			return queryRunner.query(connection, sql,new ScalarHandler<>(),args); 
															
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JdbcUtils.releaseConnection(connection);
		}
		return null;
	}
}
