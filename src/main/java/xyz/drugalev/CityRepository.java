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
    public void sortByName() {
        cities.sort(Comparator.comparing(City::getName, String.CASE_INSENSITIVE_ORDER));
    }
    public void sortByDistrict() {
        cities.sort(Comparator.comparing(City::getNameWithDistrict));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (City city : cities) {
            sb.append(city).append("\n");
        }
        return sb.toString();
    }
}
