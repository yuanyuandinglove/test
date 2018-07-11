package com.test.jpaenity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "national")
public class National  extends  BasicEntity  implements Serializable {

    public Long national_id;
    public String name;
//
//    //如果不需要根据nationl级联查询User，可以注释掉
//    @OneToOne(mappedBy = "national", cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
//    private User User;


    public Long getNational_id() {
        return national_id;
    }

    public void setNational_id(Long national_id) {
        this.national_id = national_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

//    public User getUser() {
//        return User;
//    }
//
//    public void setUser(User user) {
//        User = user;
//    }
}
