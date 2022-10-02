package poly.edu.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly.edu.Dao.AccountDAO;
import poly.edu.entity.Account;
import poly.edu.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDAO adao;
	
	@Override
	public Account findById(String username) {
			return adao.findById(username).get();
		}


		@Override
		public List<Account> findAll() {
			
			return adao.findAll();
		}


		@Override
		public List<Account> getAdminisstrators() {
			
			return adao.getAdminisstrators();
		}

}
