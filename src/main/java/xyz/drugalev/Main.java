package xyz.drugalev;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> modes = Arrays.asList("read","sortname", "sortdistrict");

        if (args.length < 2 || !modes.contains(args[1].toLowerCase())) {
            System.out.println("Usage: java <filename> read|sortName|sortDistrict");
            return;
        }

        File file = new File(args[0]);
        CityRepository cities = new CityRepository();

        try (Scanner scanner = new Scanner(file)){

            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(";");
                cities.addCity(new City(line[1],line[2],line[3], Integer.parseInt(line[4]), line.length > 5 ? line[5] : ""));
            }

            switch (args[1].toLowerCase()) {
                case "read": {
                    System.out.println(cities);
                    break;
                }
                case "sortname": {
                    cities.sortByName();
                    System.out.println(cities);
                    break;
                }
                case "sortdistrict": {
                    cities.sortByDistrict();
                    System.out.println(cities);
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
        }

    }
}