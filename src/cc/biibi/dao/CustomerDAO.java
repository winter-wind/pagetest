package cc.biibi.dao;

import java.util.List;

import cc.biibi.setget.Customer;

public interface CustomerDAO {

	public Long getsqlcount();//获取数据库总数
	
	public List<Customer> getAll();//获取一条数据
	
	
}
