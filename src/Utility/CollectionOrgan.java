package Utility;

import CityData.*;

import java.time.Instant;
import java.util.Date;
import java.util.HashMap;

public class CollectionOrgan {
    public static HashMap<Integer, City> cityHashMap = new HashMap<Integer, City>();
    City city1 = new City(1, "Omsk", new Coordinates(10.5, 4), Date.from(Instant.ofEpochSecond(10)), 1000L, 1000000, 19.5, 44, Climate.DESERT, new Human(900L, 1500.5), Government.IDEOCRACY);
    City city2 = new City(2, "Moscow", new Coordinates(10.5, 4), Date.from(Instant.ofEpochSecond(10)), 1000L, 1000000, 19.5, 44, Climate.DESERT, new Human(900L, 1500.5), Government.IDEOCRACY);
    City city3 = new City(3, "Sochi", new Coordinates(10.5, 4), Date.from(Instant.ofEpochSecond(10)), 1000L, 1000000, 19.5, 44, Climate.DESERT, new Human(900L, 1500.5), Government.IDEOCRACY);
    City city4 = new City(4, "Novosibirsk", new Coordinates(10.5, 4), Date.from(Instant.ofEpochSecond(10)), 1000L, 1000000, 19.5, 44, Climate.DESERT, new Human(900L, 1500.5), Government.IDEOCRACY);
    City city5 = new City(5, "Berlin", new Coordinates(10.5, 4), Date.from(Instant.ofEpochSecond(10)), 1000L, 1000000, 19.5, 44, Climate.DESERT, new Human(900L, 1500.5), Government.IDEOCRACY);
    public void collectionPutting() {
        cityHashMap.put(1, city1);
        cityHashMap.put(2, city2);
        cityHashMap.put(3, city3);
        cityHashMap.put(4, city4);
        cityHashMap.put(5, city5);
    }
    public static void collectionClear(){
        cityHashMap.clear();
    }
    public static void remove_by_key(int key){
        cityHashMap.remove(key);
    }
    public static void remove_greater_key(int key){
        for(int i = key + 1; i <= CollectionOrgan.cityHashMap.size(); ++i){
            cityHashMap.remove(i);
        }
    }

}
