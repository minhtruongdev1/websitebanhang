package poly.edu.Dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import poly.edu.entity.Product;



@Repository
public interface ProductDao  extends JpaRepository<Product,Integer>{


}
