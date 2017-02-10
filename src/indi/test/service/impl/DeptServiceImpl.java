package indi.test.service.impl;

import indi.test.dao.DeptDao;
import indi.test.entity.Dept;
import indi.test.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("deptServiceImpl")
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDao deptDao;
	
	public Dept selectDept(Integer id){
		Dept dept = deptDao.select(id);
		return dept;
	}
	
	public int insertDept(Dept dept){
		return deptDao.insert(dept);
		
	}
	
}
