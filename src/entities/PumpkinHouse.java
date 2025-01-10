package entities;

import interfaces.House;

import java.util.Random;

public abstract class PumpkinHouse extends PhysicalObject implements House {
    protected String size;
    protected String condition;

    public PumpkinHouse(String name, String size, String condition) {
        super(name);
        this.size = size;
        this.condition = condition;
    }

    public void collapse() {
        Random random = new Random();
        boolean willCollapse = random.nextBoolean();

        if (willCollapse) {
            condition = "разрушен";
            System.out.println("О нет! Земля под домом зашевелилась, и дом начал медленно опускаться. Кум Тыква стоял рядом и смотрел, как его мечта, его маленький домик, проваливается сквозь землю.");
            System.out.println("Нынешнее состояние домика: " + condition);
        } else {
            System.out.println("Мысли Кума Тыквы оказались обычной тревожностью! Дом устоял. Кум Тыква вздохнул с облегчением.");
        }

    }

    public void house(){
        System.out.println("Информация о: " + name);
        System.out.println("Домик: " + name);
        System.out.println("Размер: " + size);
        System.out.println("Состояние: " + condition);
    }
}