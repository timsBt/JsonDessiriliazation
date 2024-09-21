package api;

import api.models.contr.RequestRelevanceCriterion;
import api.models.contr.RequestSimpleDocument;
import api.models.contr.Root;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyTest {

    public Map savedObjectFromJsonFile() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Root root = mapper.readValue(new File("src/test/java/api/my.json"), Root.class);
        Map<String, String> map = new HashMap<>();
        map.put("epkId", root.epkId);
        for (RequestSimpleDocument requestSimpleDocument : root.requestSimpleDocuments) {
            map.put("requestSimpleDocuments.id", requestSimpleDocument.id);
            map.put("requestSimpleDocument.simpleDocumentName", requestSimpleDocument.simpleDocumentName);
            for (RequestRelevanceCriterion requestRelevanceCriterion : requestSimpleDocument.requestRelevanceCriteria) {
                map.put("relevanceCriterion.id", requestRelevanceCriterion.relevanceCriterion.id);
                map.put("relevanceCriterion.name", requestRelevanceCriterion.relevanceCriterion.name);
                map.put("relevanceCriterion.key", requestRelevanceCriterion.relevanceCriterion.key);
                map.put("relevanceCriterion.isDate", String.valueOf(requestRelevanceCriterion.relevanceCriterion.isDate));
                map.put("requestRelevanceCriterion.value", requestRelevanceCriterion.value);
                map.put("comparisonOperation.id", requestRelevanceCriterion.comparisonOperation.id);
                map.put("comparisonOperation.operationCode", requestRelevanceCriterion.comparisonOperation.operationCode);
                map.put("comparisonOperation.description", requestRelevanceCriterion.comparisonOperation.description);
            }
        }
        return map;
    }

    @Test
    public void test5677() throws IOException {
        //dfkjgjkfd().forEach((k, v) -> System.out.println(k + " <- КЛЮЧ и ЗНАЧЕНИЕ -> " + v));
        System.out.println(savedObjectFromJsonFile().get("epkId"));
        System.out.println(savedObjectFromJsonFile().get("comparisonOperation.description"));
        System.out.println(savedObjectFromJsonFile().get("relevanceCriterion.key"));
        System.out.println(savedObjectFromJsonFile().get("relevanceCriterion.name"));
        Assert.assertEquals("НЕ РАВНО", "true", savedObjectFromJsonFile().get("relevanceCriterion.isDate"));
    }














    @Test
    public void dfrthfdjkdffd() throws IOException {
       // jsonToMap(json).forEach((k, v) -> System.out.println(k + " <- КЛЮЧ и ЗНАЧЕНИЕ -> " + v));
    }

    public static HashMap<String, Object> jsonToMap(String json) throws IOException {
        JsonFactory factory = new JsonFactory();
        ObjectMapper mapper = new ObjectMapper(factory);
        TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
        };
        return mapper.readValue(json, typeRef);
    }

    @Test
    public void fdfg() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType mapType = mapper.getTypeFactory().constructMapType(HashMap.class, String.class, Root.class);
        HashMap<String, Root> myMap = mapper.readValue(new File("src/test/java/api/my.json"), mapType);
        System.out.println(myMap);
    }



    @Test
    public void dfrthfdjkdffd222() throws IOException {
       // jsonToMap222(json).forEach((k, v) -> System.out.println(k + " <- КЛЮЧ и ЗНАЧЕНИЕ -> " + v));
    }


    @Test
    public void dfrthfFGfd222() throws IOException {

//        Gson gson = new Gson();
//        Type type = new TypeToken<HashMap<String, JsonElement>>(){}.getType();
//        HashMap<String, JsonElement> map = gson.fromJson(json, type);
//        map.forEach((k, v) -> System.out.println(k + " <- КЛЮЧ и ЗНАЧЕНИЕ -> " + v));

    }


}
