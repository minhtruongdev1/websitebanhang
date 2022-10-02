package poly.edu.service;

import java.util.List;

import poly.edu.entity.Account;

public interface AccountService {
	public Account findById(String username);

	public List<Account> findAll();

	public List<Account> getAdminisstrators();

}
