package com.phamed;

import com.phamed.service.PlexService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class PlexApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(PlexApiApplication.class, args);


    PlexService plexService = new PlexService();

  }

}
