package poly.edu.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import poly.edu.entity.Account;
import poly.edu.entity.Authority;



//@Repository
public interface AuthorityDAO  extends JpaRepository<Authority, Integer>{
	 @Query("SELECT DISTINCT a FROM Authority a WHERE a.account IN ?1")
	List<Authority> authoritiesOf(List<Account> accounts);

}
