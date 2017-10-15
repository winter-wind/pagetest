package cc.biibi.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import cc.biibi.dao.CustomerDAO;
import cc.biibi.impl.PageImpl;
import cc.biibi.setget.Customer;

public class PageImpltest {

	CustomerDAO cd = new PageImpl();
	@Test
	public void testGetsqlcount() {
		long count =  cd.getsqlcount();
		System.out.println(count);
	}

	@Test
	public void testGetAll() {
		List<Customer> list = cd.getAll();
		System.out.println(list.get(6)+"===");
	}
}
