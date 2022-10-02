package poly.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.edu.Dao.RoleDAO;
import poly.edu.entity.Role;
import poly.edu.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleDAO dao;
	@Override
	public List<Role> findAll() {
		
		return dao.findAll();
	}

}
