package com.app.sociallogin.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/myapp")
public class SocialController {
    @GetMapping
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<>("<center><h2>Welcome Durjoy</h2><center>", HttpStatus.OK);
    }
}
