package de.srs.bulletinboard.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Role
 */
@Validated
@Entity
@Table(name="role")
@Data
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-12-13T15:21:57.525Z[GMT]")
public class Role  implements Serializable  {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  @Id
  @GeneratedValue
  @JsonIgnore
  private Integer id = null;

  @JsonProperty("name")
  @Column(name="name")
  private String name = null;
  
  @OneToMany(mappedBy="role", cascade={CascadeType.ALL})
  private List<User> users;

  public Role id(Integer id) {
    this.id = id;
    return this;
  }

  public Role name(String name) {
    this.name = name;
    return this;
  }

}
