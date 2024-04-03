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
    public City getMostPopulated() {
        City mostPopulated = cities.get(0);
        for (City city : cities) {
            if (city.getPopulation() > mostPopulated.getPopulation())
                mostPopulated = city;
        }
        return mostPopulated;
    }
    public int indexOf(City city) {
        return cities.indexOf(city);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (City city : cities) {
            sb.append(city).append("\n");
        }
        return sb.toString();
    }
}
