package com.phamed.security;

import com.phamed.models.Users;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Authority implements GrantedAuthority {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String authority;
  @ManyToOne
  private Users user;


  @Override
  public String getAuthority() {
    return this.authority;
  }
}
