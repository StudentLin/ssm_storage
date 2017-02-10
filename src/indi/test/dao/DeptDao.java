package indi.test.dao;

import indi.test.entity.Dept;

public interface DeptDao {
	public Dept select(Integer id);
	
	public int insert(Dept dept);
}
