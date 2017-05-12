package de.hska.muon.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import javax.validation.constraints.*;
/**
 * NewUser
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-04T12:49:09.193Z")

public class NewUser   {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("role")
  private Integer role = null;

  public NewUser userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Id of the user.
   * @return userId
  **/
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public NewUser firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * First name of the user.
   * @return firstname
  **/
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public NewUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Last name of the user.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of the user.
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public NewUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password of the user.
   * @return password
  **/
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public NewUser role(Integer role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the user.
   * @return role
  **/
  public Integer getRole() {
    return role;
  }

  public void setRole(Integer role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewUser newUser = (NewUser) o;
    return Objects.equals(this.userId, newUser.userId) &&
        Objects.equals(this.firstname, newUser.firstname) &&
        Objects.equals(this.name, newUser.name) &&
        Objects.equals(this.username, newUser.username) &&
        Objects.equals(this.password, newUser.password) &&
        Objects.equals(this.role, newUser.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstname, name, username, password, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUser {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

