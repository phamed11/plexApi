package com.phamed.security;

import com.phamed.models.Users;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;

@NoArgsConstructor
public class CustomSecurityUser extends Users implements UserDetails {

  public CustomSecurityUser(Users user) {
    this.setAuthorities(user.getAuthorities());
    this.setUsername(user.getUsername());
    this.setPassword(user.getPassword());
    this.setId(user.getId());

  }

  @Override
  public Set<Authority> getAuthorities() {
    return super.getAuthorities();
  }

  @Override
  public String getPassword() {
    return super.getPassword();
  }

  @Override
  public String getUsername() {
    return super.getUsername();
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
