package entities.plants;
import entities.PhysicalObject;
import enums.PlantType;
import enums.VegetableType;
import java.util.Objects;
import interfaces.Plant;

import enums.WeatherType;
import exceptions.WeatherException;

public abstract class GardenPlant extends PhysicalObject implements Plant {
    protected PlantType plantType;
    protected VegetableType vegetableType;
    protected int height;
    protected WeatherType currentWeather;

    public GardenPlant(String name, PlantType plantType, VegetableType vegetableType, int height) {
        super(name);
        if (height < 0) {
            throw new IllegalArgumentException("Высота не может быть отрицательной: " + height);
        }
        this.height = height;
        this.plantType = plantType;
        this.vegetableType = vegetableType;

    }

    public void plant(String name, int height) {
        this.name = name;
        this.height = height;
        System.out.println("Ура! Посажено новое растение - " + name + ". Текущая высота: " + height + "см.");
    }

    public void grow(WeatherType weather) throws WeatherException {
        if (weather == WeatherType.RAIN || weather == WeatherType.SNOW) {
            throw new WeatherException("Растение не может расти в " + weather.toString().toLowerCase() + "!");
        }
        this.height += 1;
        System.out.println(name + " потихоньку растет. Высота на данный момент: " + height + " см.");
    }

    public void vegetableCheck() {
        System.out.println("Данное растение относится к " + vegetableType + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // Проверка равенства через super
        GardenPlant that = (GardenPlant) o;
        return height == that.height && // Сравнение по полю height
                plantType == that.plantType && // Сравнение по полю plantType
                vegetableType == that.vegetableType; // Сравнение по полю vegetableType
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plantType, vegetableType, height); // Хэш-код на основе всех полей
    }

    @Override
    public String toString() {
        return "entities.plants.GardenPlant{name='" + name + "', plantType=" + plantType +
                ", vegetableType=" + vegetableType + ", height=" + height + "}";
    }
}


