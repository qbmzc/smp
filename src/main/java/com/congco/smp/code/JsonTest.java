package com.congco.smp.code;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * JsonTest
 */
public class JsonTest {

    public static void main(String[] args) throws IOException {

        // testList();
        Map<Object, Object> hashMap = new HashMap<>();
        hashMap.put("name", "cc");
        hashMap.put("age", 15);
        hashMap.put("high", "165");
        hashMap.put("cup", "c");
        hashMap.put("gender", "女");

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(hashMap);
        System.out.println(jsonString);
        HashMap<String,Object> readValue = mapper.readValue(jsonString, new TypeReference<Map<String,Object>>() {
        });
        readValue.forEach((a,b)->{System.out.println(a+":"+b);});
    }

    private static void testList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("e");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String writeValueAsString = objectMapper.writeValueAsString(arrayList);
            System.out.println(writeValueAsString);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}