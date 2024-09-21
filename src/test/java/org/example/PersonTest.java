package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.Map;

public class PersonTest {

    String json = "{\n" +
            "    \"firstName\": \"Json\",\n" +
            "    \"lastName\": \"Smith\",\n" +
            "    \"age\": 30,\n" +
            "    \"address\": {\n" +
            "        \"streetAddress\": \"666 1nd Street\",\n" +
            "        \"city\": \"New York\",\n" +
            "        \"state\": \"NY\",\n" +
            "        \"postalCode\": 10021\n" +
            "    },\n" +
            "    \"phoneNumbers\": [\n" +
            "        {\n" +
            "            \"type\": \"home\",\n" +
            "            \"number\": \"542 666-1234\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"type\": \"fax\",\n" +
            "            \"number\": \"653 666-4567\" \n" +
            "        }\n" +
            "    ],\n" +
            "    \"friends\": [\n" +
            "        {\n" +
            "            \"firstName\": \"Test\",\n" +
            "            \"lastName\": \"Snow\",\n" +
            "            \"age\": 20,\n" +
            "            \"phoneNumbers\": [\n" +
            "                {\n" +
            "                    \"type\": \"home\",\n" +
            "                    \"number\": \"141 111-1234\"\n" +
            "                }\n" +
            "            ],\n" +
            "            \"friends\": [\n" +
            "                {\n" +
            "                    \"firstName\": \"UnknownFirstName\",\n" +
            "                    \"lastName\": \"UnknownLastName\",\n" +
            "                    \"age\": 999,\n" +
            "                    \"phoneNumbers\": [\n" +
            "                        {\n" +
            "                            \"type\": \"home\",\n" +
            "                            \"number\": \"000 000-0000\"\n" +
            "                        }\n" +
            "                    ]\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\": \"Flash\",\n" +
            "            \"lastName\": \"Tompson\",\n" +
            "            \"age\": 23,\n" +
            "            \"phoneNumbers\": [\n" +
            "                {\n" +
            "                    \"type\": \"home\",\n" +
            "                    \"number\": \"999 111-1234\"\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    ]\n" +
            "}";

    @Test
    public void dfkjgjkfd() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);

        for (Person friend : person.friends) {
            System.out.println(friend.lastName);
            for (Phones phone : friend.phoneNumbers) {
                System.out.println(phone.type);
                System.out.println(phone.number);
            }
        }
    }
    }
