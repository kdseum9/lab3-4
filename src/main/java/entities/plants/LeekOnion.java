package entities.plants;

import enums.PlantType;
import enums.VegetableType;
import enums.WeatherType;
import exceptions.WeatherException;

public class LeekOnion extends GardenPlant {
    public LeekOnion(String name, int height) {
        super(name, PlantType.ONION, VegetableType.LEEK_ONION, height);
    }

    @Override
    public void plant() {
        System.out.println("Лук-порей посажен в саду!");
    }

    @Override
    public void grow(WeatherType weather) throws WeatherException {
        if (weather == WeatherType.RAIN || weather == WeatherType.SNOW || weather == WeatherType.COLD) {
            throw new WeatherException("Растение не может расти в " + weather.toString().toLowerCase() + "!");
        }
        this.height += 2;
        System.out.println(name + " потихоньку растет. Высота на данный момент: " + height + " см.");
    }

    public void leekOnion() {
        if (height > 20) {
            System.out.println("Лук-порей вырос! Можно его собрать.");
        } else {
            System.out.println("Лук-порей еще не вырос! Подожди еще чуть-чуть.");
        }
    }
}
