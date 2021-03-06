package org.zyzz.entity;

import javax.persistence.*;

/**
 * Created by zyzz on 17-8-30.
 */
@Entity
@Table(name="deparment")
public class Deparment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    public Deparment(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
