package entities.plants;

import enums.PlantType;
import enums.VegetableType;
import enums.WeatherType;
import exceptions.WeatherException;

public class RosaraPotato extends GardenPlant {
    public RosaraPotato(String name, int height) {
        super(name, PlantType.POTATO, VegetableType.ROSARO_POTATO, height);
    }

    @Override
    public void plant() {
        System.out.println("сорт картофеля Розара посажен в саду!");
    }

    @Override
    public void grow(WeatherType weather) throws WeatherException {
        if (weather == WeatherType.RAIN || weather == WeatherType.SNOW || weather == WeatherType.COLD) {
            throw new WeatherException("Растение не может расти в " + weather.toString().toLowerCase() + "!");
        }
        this.height += 5;
        System.out.println(name + " потихоньку растет. Высота на данный момент: " + height + " см.");
    }

    public void rosaraPotato() {
        if (height > 30) {
            System.out.println("Можно вскапывать картошку! Скорее бери лопату!.");
        } else {
            System.out.println("Картофель еще не вырос! Подожди еще чуть-чуть.");
        }
    }
}
