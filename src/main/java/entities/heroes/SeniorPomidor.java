package entities.heroes;

import enums.ProfessionType;

public class SeniorPomidor extends Hero {
    public SeniorPomidor(String name, String sex, ProfessionType profession, String clothes) {
        super(name, sex, ProfessionType.ESTATE_MANAGER, clothes);
    }

    @Override
    public void character() {
        System.out.println("Информация о " + name);
        System.out.println("Имя: " + name);
        System.out.println("Пол: " + sex);
        System.out.println("Професия: " + profession);
        System.out.println("Одежда: " + clothes);

    }

    public void shakeHead(){
        System.out.println(name + " покачивал головой");
    }

    public void keepSilence() {
        System.out.println(name + " не говорил ни слова");
    }
}
