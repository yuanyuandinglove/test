package com.test.dao;

import com.test.jpaenity.National;
import com.test.jpaenity.User;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

import java.util.List;

    @Component
    public interface  NationalDao  extends PagingAndSortingRepository<National, Long>, JpaSpecificationExecutor<User> {
        List<National> findAll();

        @Query("select t from  National t where t.id = ?1")
        National findByMyId(Long id);

//    @Query("select t from  User t where t.passWord = ?1")
//     User findByAddress(String addres);

        National findByName(String name);
    }

