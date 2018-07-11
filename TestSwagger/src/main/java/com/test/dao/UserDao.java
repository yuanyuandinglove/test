package com.test.dao;
import com.test.jpaenity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User> {
     List<User> findAll();

     @Query("select t from  User t where t.id = ?1")
     User findByMyId(Long id);

//    @Query("select t from  User t where t.passWord = ?1")
//     User findByAddress(String addres);

     User findUserByAddress(String address);
}
