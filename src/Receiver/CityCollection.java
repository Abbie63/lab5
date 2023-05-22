package Receiver;

import CityData.City;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Objects;

public class CityCollection {
    private static HashMap<Integer, City> cityHashMap = new HashMap<Integer, City>();
    private java.time.ZonedDateTime creationDate = ZonedDateTime.now();
    public void put(Integer key, City city) {
        cityHashMap.put(key, city);
    }
    public City getElementByKey(Integer key) {
        return cityHashMap.get(key);
    }
    public City getElementByID(Integer id) {
        for (City city : cityHashMap.values()) {
            if (Objects.equals(city.getId(), id))
                return city;
        }
        return null;
    }
    public void remove(Integer key) {
        cityHashMap.remove(key);
    }
    public void clear() {
        cityHashMap.clear();
    }
    public HashMap<Integer, City> getCityHashMap() {
        return cityHashMap;
    }
    public int length() {
        return cityHashMap.size();
    }
    public ZonedDateTime getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
