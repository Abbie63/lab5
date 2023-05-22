package Utility;

import java.io.*;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;

import CityData.City;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.assertj.core.api.Assertions.assertThat;

public class JsonFileUtility {
    public JsonFileUtility() {

    }

    public void jsonFileReader(String filename) throws FileNotFoundException, IOException {


        ObjectMapper objectMapper = new ObjectMapper();
        /*BufferedReader*/ FileReader fileReader = /*new BufferedReader(*/new FileReader(filename)/*)*/;
//        ObjectMapper mapper = new ObjectMapper();
        objectMapper.readValue(fileReader, City.class);

    }
}
