package api;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        String fileName = "src/test/java/api/test.json";
        ObjectMapper mapper = new ObjectMapper();

        List<Person> myPeople = mapper.readValue(new File(fileName), new TypeReference<>(){});
        for(Person myPerson : myPeople) {
            System.out.println(myPerson.contacts);
        }

    }

    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    static class Person {
        String name;
        int age;
        Map<String, String> contacts;

        public Person(){}

        public Person(String name, int age, Map<String, String> contacts) {
            this.name = name;
            this.age = age;
            this.contacts = contacts;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", contacts=" + contacts +
                    '}';
        }
    }
}