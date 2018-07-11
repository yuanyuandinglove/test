package com.test.jpaenity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
public class User extends BasicEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "name")
    public String name;
    @Column(name = "address")
    public String address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "national_id",referencedColumnName = "national_id")
    public  National national;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public National getNational() {
        return national;
    }

    public void setNational( National national) {
        this.national = national;
    }
}
