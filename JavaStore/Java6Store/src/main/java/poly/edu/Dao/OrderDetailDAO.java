package poly.edu.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.edu.entity.OrderDetail;


@Repository
public interface OrderDetailDAO  extends JpaRepository<OrderDetail, Long>{

}
