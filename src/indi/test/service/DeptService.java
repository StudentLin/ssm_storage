package indi.test.service;

import indi.test.entity.Dept;

public interface DeptService {
	public Dept selectDept(Integer id);
	
	public int insertDept(Dept dept);
}
