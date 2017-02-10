package indi.scm.action;

import indi.scm.entity.Supplier;
import indi.scm.service.SupplierService;
import indi.test.entity.Dept;
import indi.test.service.DeptService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/supplier")
public class SupplierAction {
	
	@Resource
	private SupplierService supplierServiceImpl;
	
	@RequestMapping(value="/insert")
	public String insert(Supplier supplier){
		supplierServiceImpl.insertSupplier(supplier);
		return "forward:/jsp/main.jsp";
		
	}
	
	
}
