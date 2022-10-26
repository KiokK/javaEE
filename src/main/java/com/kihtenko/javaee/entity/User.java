package com.kihtenko.javaee.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * Класс хранит данные о пользователе. Поддерживает Serializable.
 */
public class User implements Serializable, Cloneable{
  private static final long serialVersionUID = 1L;

  private Long id;

  private Role role;
  private String password;
  private String login;

  private String name;
  private String surname;
  private String patronymic;
  private Date dateOfBarth;
  private Date dateOfIncoming;
  private String phone;

  public User() {
  }

  public User(Long id, Role role, String password, String nikeName, String name, String surname, String patronymic) {
    this.id = id;
    this.role = role;
    this.password = password;
    this.login = nikeName;
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
  }

  public User(String password, String login) {
    this.password = password;
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public Date getDateOfBarth() {
    return dateOfBarth;
  }

  public void setDateOfBarth(Date dateOfBarth) {
    this.dateOfBarth = dateOfBarth;
  }

  public Date getDateOfIncoming() {
    return dateOfIncoming;
  }

  public void setDateOfIncoming(Date dateOfIncoming) {
    this.dateOfIncoming = dateOfIncoming;
  }

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


}
