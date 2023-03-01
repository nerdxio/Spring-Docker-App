package io.nerd.springdockerapp.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/")
    public ResponseEntity<List<User>>getAllUser(){
        return ResponseEntity.ok(Arrays.asList(
                new User(1,"Hassan Refaat"),
                new User(1,"Abdo Ali"),
                new User(1,"Ahmed Sayed")));
    }
}
