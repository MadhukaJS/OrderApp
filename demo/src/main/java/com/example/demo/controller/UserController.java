package com.example.demo.controller;

import com.example.demo.dto.CusDTO;
import com.example.demo.service.CusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private CusService cusService;
    @GetMapping("/getuser")
    public String getuser(){
        return "userone";
    }
    @PostMapping("/saveuser") 
    public CusDTO saveUser(@RequestBody CusDTO cusDTO){
        return cusService.saveUser(cusDTO);
//        return "user saved";

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
