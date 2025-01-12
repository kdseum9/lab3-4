package entities.plants;

import enums.PlantType;
import enums.VegetableType;
import enums.WeatherType;
import exceptions.WeatherException;

public class JapaneseEggplant extends GardenPlant {
    public JapaneseEggplant(String name, int height) {
        super(name, PlantType.EGGPLANT, VegetableType.JAPANESE_EGGPLANT, height);
    }

    @Override
    public void plant() {
        System.out.println("Японский баклажан посажен в саду!");
    }

    @Override
    public void grow(WeatherType weather) throws WeatherException {
        if (weather == WeatherType.RAIN || weather == WeatherType.SNOW || weather == WeatherType.COLD) {
            throw new WeatherException("Растение не может расти в " + weather.toString().toLowerCase() + "!");
        }
        this.height += 6;
        System.out.println(name + " потихоньку растет. Высота на данный момент: " + height + " см.");
    }

    public void japaneseEggplant() {
        if (height >30) {
            System.out.println("Японский баклажан вырос! Можно его собрать.");
        } else {
            System.out.println("Японский баклажан еще не вырос! Подожди еще чуть-чуть.");
        }
    }
}

