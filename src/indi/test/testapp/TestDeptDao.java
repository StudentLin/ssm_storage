package indi.test.testapp;

import indi.test.dao.DeptDao;
import indi.test.entity.Dept;

import javax.annotation.Resource;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeptDao {
	@Resource
	private static DeptDao deptDao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		deptDao = (DeptDao) ac.getBean("deptDao");
	}
	
	@Test
	public void testSelect() {
		System.out.println(deptDao);
		System.out.println(deptDao.select(1).getDeptName());
	}
	
	@Test
	public void testInsert(){
		Dept dept = new Dept();
		dept.setDeptName("≤‚ ‘4≤ø√≈");
		dept.setDeptAddress("·È÷›");
		deptDao.insert(dept);
	}

}
