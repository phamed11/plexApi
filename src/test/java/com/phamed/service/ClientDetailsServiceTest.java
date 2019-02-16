package com.phamed.service;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class ClientDetailsServiceTest {


  @Test
  public void generateEncryptedPassword() {
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
    String password = "peter";
    String encodedPassword = bCryptPasswordEncoder.encode(password);
    Assert.assertThat(password, CoreMatchers.not(encodedPassword));
    System.out.println(encodedPassword);
  }
}