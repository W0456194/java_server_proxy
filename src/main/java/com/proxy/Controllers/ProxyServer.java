package com.proxy.Controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProxyServer {
    @GetMapping("/{resource}")
    public String proxy(@PathVariable String resource){
        System.out.println(resource);
        return "Done";
    }
}
