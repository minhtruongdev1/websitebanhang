package poly.edu.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import poly.edu.entity.Order;




//@Repository
public interface OrderDAO  extends JpaRepository<Order, Long>{

	@Query("SELECT o FROM Order o WHERE o.account.username=?1")
	List<Order> findByIdUsername(String username);

}
