package com.bezkoder.spring.hibernate.onetomany.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tutorial_generator")
  private long id;

  @Column(name = "name")
  private String name;


  public Tutorial() {

  }

  public Tutorial(String name) {
    this.name = name;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }



  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", name=" + name + "]";
  }

}
