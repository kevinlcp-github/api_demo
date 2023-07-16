package com.kevinli.apidemo.apidemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;
import com.kevinli.apidemo.apidemo.model.An_Object;

@RestController
public class API_Controller {

    @PostMapping("/users")
    public ResponseEntity<Map<String, String>> createUser(@RequestBody An_Object user) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "User created: " +user.getName() +" (" +user.getEmail() +")");
        return ResponseEntity.ok(response);
    }

}
