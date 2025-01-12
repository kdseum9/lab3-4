package entities.heroes;

import enums.ProfessionType;

public class PumpkinGodfather extends Hero {

    public PumpkinGodfather(String name, String sex, ProfessionType profession, String clothes) {
        super(name, sex, profession, clothes);
    }
    public void sweat() {
        System.out.println("Пот ручьями струился у него со лба и попадал в рот.");
    }

    public void notDareToWipeFace() {
        System.out.println(name + " не осмеливался даже поднять руку, чтобы вытереть лицо, и покорно глотал эти соленые и горькие капли.");
    }


    @Override
    public void character() {
        System.out.println("Информация о " + name);
        System.out.println("Имя: " + name);
        System.out.println("Пол: " + sex);
        System.out.println("Професия: " + profession);
        System.out.println("Одежда: " + clothes);

    }
}
