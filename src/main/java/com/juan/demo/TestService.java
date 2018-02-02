package com.juan.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@org.springframework.stereotype.Service
public class TestService {

    public TestService(){
        System.out.println("Starting Test Service");
    }

    public Object testMethod(String text){
        ArrayList<String> result = new ArrayList();
        result.add("Juan");
        result.add("Jack");
        result.add("Julian");

        return text;
    }

    public JsonNode json(){
        ObjectNode node = JsonNodeFactory.instance.objectNode();
        node.put("f1", 1);
        node.put("f2", "Hola Mundo");

        return node;
    }

}
