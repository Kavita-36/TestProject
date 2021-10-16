package com.reg.login.app.regloginapplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserRegDetails,Integer> {
	@Query(value="select COUNT(*) from user_reg_details U where U.username=:username",nativeQuery=true)
	public Integer existsUserDetailsByUsername(String username);
	@Query(value="select * from user_reg_details U where U.username=:username",nativeQuery=true)
	public UserRegDetails findByUsername(String username);
	@Query(value="select * from user_reg_details U where U.username=:username AND u.password=:password",nativeQuery=true)
	public UserRegDetails findByPassword(String password,String username);

}
