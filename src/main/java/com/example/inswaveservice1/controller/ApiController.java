package com.example.inswaveservice1.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/service1")
public class ApiController {

    @GetMapping("/contents")
    public ResponseEntity contents() {

        List list = new ArrayList();
        Map map = new HashMap();
        map.put("id","1");
        map.put("title","1번글입니다.");
        map.put("service","service1");
        list.add(map);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/contents/1")
    public ResponseEntity content() {

        Map map = new HashMap();
        map.put("id","1");
        map.put("title","1번글입니다.");
        map.put("service","service1");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
