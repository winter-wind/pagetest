package cc.biibi.impl;

import java.util.List;

import cc.biibi.dao.CustomerDAO;
import cc.biibi.dao.DAO;
import cc.biibi.setget.Customer;

public class PageImpl extends DAO<Customer> implements CustomerDAO {

	@Override
	public Long getsqlcount() {
		String sql = "select count(*) from test1";
		return getcount(sql);
	}

	@Override
	public List<Customer> getAll() {
		String sql = "select * from test1";
		return getForList(sql);
	}

}
