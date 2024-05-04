package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getuser")
    public String getuser(){
        return "userone";
    }
    @PostMapping("/saveuser")
    public String saveUser(){
        return "user saved";
    }
    @PutMapping("/updateuser")
    public String putUser(){
        return "user updated";
    }
    @DeleteMapping("/deleteuser")
    public String deleteUser(){
        return "user deleted";
    }
}
