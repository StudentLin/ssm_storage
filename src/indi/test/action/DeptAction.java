package indi.test.action;

import indi.test.entity.Dept;
import indi.test.service.DeptService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept")
public class DeptAction {
	
	@Resource
	private DeptService deptServiceImpl;
	
	@RequestMapping(value="/insert")
	public String insert(Dept dept){
		System.out.println(dept.getDeptName()+"  "+dept.getDeptAddress());
		deptServiceImpl.insertDept(dept);
		return "forward:/jsp/main.jsp";
		
	}
	
	
}
