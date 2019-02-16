package com.phamed.service;


import com.phamed.Repositories.UsersRepository;
import com.phamed.models.Users;
import com.phamed.security.CustomSecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ClientDetailsService implements UserDetailsService {

  private UsersRepository usersRepository;

  public ClientDetailsService(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Users user = usersRepository.findByUsername(username);

    if (user == null) {
      throw new UsernameNotFoundException("Invalid username and password");
    }

    return new CustomSecurityUser(user);
  }
}
