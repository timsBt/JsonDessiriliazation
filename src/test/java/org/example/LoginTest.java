package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.Map;

public class LoginTest {
    String gson = "{\n" +
            "  \"2\":{\n" +
            "    \"sessions\":[\n" +
            "      {\n" +
            "        \"time\":\"13:00\",\n" +
            "        \"price\":\"410\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"time\":\"06:40\",\n" +
            "        \"price\":\"340\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"time\":\"16:50\",\n" +
            "        \"price\":\"370\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\":\"Кинокис-L\",\n" +
            "    \"locate\":\"Москва, Садовая-Спасская ул., 21, 56\",\n" +
            "    \"metro\":\"Красные ворота\"\n" +
            "  },\n" +
            "  \"7\":{\n" +
            "    \"sessions\":[\n" +
            "      {\n" +
            "        \"time\":\"06:35\",\n" +
            "        \"price\":\"190\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"time\":\"00:05\",\n" +
            "        \"price\":\"410\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\":\"Кинокис-V\",\n" +
            "    \"locate\":\"Павелецкая пл., 2, строение 1\",\n" +
            "    \"metro\":\"Павелецкая\"\n" +
            "  },\n" +
            "  \"8\":{\n" +
            "    \"sessions\":[\n" +
            "      {\n" +
            "        \"time\":\"15:10\",\n" +
            "        \"price\":\"330\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\":\"Кинокис-J\",\n" +
            "    \"locate\":\"ул. Пречистенка, 40/2\",\n" +
            "    \"metro\":\"Кропоткинская\"\n" +
            "  },\n" +
            "  \"9\":{\n" +
            "    \"sessions\":[\n" +
            "      {\n" +
            "        \"time\":\"13:00\",\n" +
            "        \"price\":\"600\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"time\":\"08:30\",\n" +
            "        \"price\":\"300\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"time\":\"04:00\",\n" +
            "        \"price\":\"510\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"time\":\"13:15\",\n" +
            "        \"price\":\"340\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"name\":\"Кинокис-U\",\n" +
            "    \"locate\":\"Шарикоподшипниковская ул., 24\",\n" +
            "    \"metro\":\"Дубровка\"\n" +
            "  }\n" +
            "}";

    @Test
    public void dfkjgjkfd(){
        Gson g = new Gson();
        Type type = new TypeToken<Map<String, Sessions>>(){}.getType();
        Map<String, Sessions> myMap = g.fromJson(gson, type);






    }


}
