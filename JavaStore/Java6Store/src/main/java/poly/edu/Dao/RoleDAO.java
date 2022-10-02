package poly.edu.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poly.edu.entity.Role;



@Repository
public interface RoleDAO  extends JpaRepository<Role, String>{

}
