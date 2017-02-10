package indi.scm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.scm.dao.SupplierMapper;
import indi.scm.entity.Supplier;
import indi.scm.service.SupplierService;

@Service("supplierServiceImpl")
public class SupplierServiceImpl implements SupplierService {
	
	@Autowired
	private SupplierMapper supplierMapper;
	
	@Override
	public int insertSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
		return supplierMapper.insert(supplier);
	}

}
