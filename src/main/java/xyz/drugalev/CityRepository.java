package xyz.drugalev;

import java.util.*;


public class CityRepository {
    private final List<City> cities;

    public CityRepository() {
        cities = new ArrayList<>();
    }
    public void addCity(City city) {
        cities.add(city);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (City city : cities) {
            sb.append(city).append("\n");
        }
        return sb.toString();
    }
}
