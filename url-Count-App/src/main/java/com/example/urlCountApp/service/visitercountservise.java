package com.example.urlCountApp.service;

import com.example.urlCountApp.model.viisitercount;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class visitercountservise {



    static HashMap<String,Integer>  map=new HashMap<>();

//     public static int inccount(){
//         count=count+1;
//         return count;
//     }

     public static viisitercount countbyname(String username){
         int count=map.getOrDefault(username,0)+1;
         map.put(username,count);
        // count=count+1;

         viisitercount visit=new viisitercount(count,username);

           return visit;
     }
static int count=0;
     public String  count(){

         count=count+1;
         return "Visitor"+" "+count;
     }


}
