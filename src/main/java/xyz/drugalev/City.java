package xyz.drugalev;

public class City {
    private final String name;
    private final String region;
    private final String district;
    private final int population;
    private final String foundation;

    public City(String name, String region, String district, int population, String foundation) {
        this.name = name;
        this.region = region;
        this.district = district;
        this.population = population;
        this.foundation = foundation;
    }

    public int getPopulation() {
        return population;
    }
    public String getName() {
        return name;
    }
    public String getNameWithDistrict() {
        return district + ", " + name;
    }

    public String toString() {
        return String.format("City{name='%s', region='%s', district='%s', population=%d, foundation='%s'}"
                , name, region, district, population, foundation);
    }
}
