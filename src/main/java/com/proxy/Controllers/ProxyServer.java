package com.proxy.Controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

@RestController
@CrossOrigin
public class ProxyServer {
    @GetMapping("/{resource}")
    public String proxy(@PathVariable String resource) throws IOException {
        String HTTP_ENDPOINT = "localhost:8080";
        URL weburl = new URL(HTTP_ENDPOINT);
        HttpURLConnection directConnection
                = (HttpURLConnection) weburl.openConnection(Proxy.NO_PROXY);
        directConnectio
        return "Done";
    }
}
