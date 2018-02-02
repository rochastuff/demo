package com.juan.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@RestController
@RequestMapping("api/test")
public class TestControl {

    private TestService service;

    public TestControl(){
        System.out.println("Vacio");
    }

    @Autowired
    public TestControl(TestService service){
        System.out.println("Starting Test Service");
        this.service = service;
    }

    @RequestMapping("{text}")
    public Object testMethod(@PathVariable String text){
        return service.testMethod(text);
    }

    @RequestMapping("objects")
    public JsonNode json(){
        return service.json();
    }


}
