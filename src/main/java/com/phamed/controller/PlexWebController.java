package com.phamed.controller;


import com.phamed.service.PlexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlexWebController {

  private PlexService plexService;

  public PlexWebController(PlexService plexService) {
    this.plexService = plexService;
  }

  @GetMapping("/home")
  public String allVideos(Model model) {
    model.addAttribute("videos", plexService.allVideos());
    return "home";
  }

  @GetMapping(value = {"/", "/login"})
  public String login(Model model) {
    return "login";
  }

}
