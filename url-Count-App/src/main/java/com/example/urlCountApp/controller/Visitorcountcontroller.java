package com.example.urlCountApp.controller;

import com.example.urlCountApp.model.viisitercount;
import com.example.urlCountApp.service.visitercountservise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/visitor-count")
public class Visitorcountcontroller {



    @Autowired
    private    visitercountservise counterurl;



//    @GetMapping("count")
//    public static  int counterincrease(){
//        return visitercountservise.inccount();
//    }
@GetMapping("username/{username}/count")
    public  viisitercount sendcountbyname(@PathVariable String username){
        return    counterurl.countbyname(username);
    }

    @GetMapping("count")
    public String count(){
      return   counterurl.count();
    }


}
