import entities.*;
import enums.*;
import exceptions.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        LeekOnion leekOnion = new LeekOnion("Лук-порей", 10);
        JapaneseEggplant japaneseEggplant = new JapaneseEggplant("Японский баклажан", 15);
        RosaraPotato rosaraPotato = new RosaraPotato("Картофель Розара", 20);

        PumpkinGodfather pumpkinGodfather = new PumpkinGodfather("Кум Тыква", "мужчина", ProfessionType.BUILDER, "комбинезон и фартук");
        SeniorPomidor seniorPomidor = new SeniorPomidor("Сеньор Помидор", "мужчина", ProfessionType.ESTATE_MANAGER, "костюм");

        PumpkinHouse pumpkinHouse = new PumpkinHouse("Домик Кума Тыквы", "маленький", "хорошее") {
        };

        leekOnion.plant();
        japaneseEggplant.plant();
        rosaraPotato.plant();

        PlantInfo leekOnionInfo = new PlantInfo("Лук-порей", 10);
        PlantInfo japaneseEggplantInfo = new PlantInfo("Японский баклажан", 15);
        PlantInfo rosaraPotatoInfo = new PlantInfo("Картофель Розара", 20);


        WeatherType[] weatherTypes = WeatherType.values();
        Random random = new Random();

        for (int day = 1; day <= 5; day++) {
            System.out.println("День: " + day);

            WeatherType weather = weatherTypes[random.nextInt(weatherTypes.length)];
            System.out.println("Погода сегодня: " + weather);

            System.out.println("Рост растений:");
            try {
                leekOnion.grow(weather);
            } catch (WeatherException e) {
                System.out.println(e.getMessage());
            }

            try {
                japaneseEggplant.grow(weather);
            } catch (WeatherException e) {
                System.out.println(e.getMessage());
            }

            try {
                rosaraPotato.grow(weather);
            } catch (WeatherException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Проверка высоты растений:");
            leekOnion.leekOnion();
            japaneseEggplant.japaneseEggplant();
            rosaraPotato.rosaraPotato();

            if (day == 3) {
                seniorPomidor.character();
                pumpkinGodfather.character();

                seniorPomidor.lookAt(pumpkinGodfather);
                seniorPomidor.feel(EmotionType.ANGRY);
                seniorPomidor.shakeHead();
                seniorPomidor.keepSilence();

                pumpkinGodfather.feel(EmotionType.FEAR);
                pumpkinHouse.house();
                pumpkinHouse.collapse();
                pumpkinGodfather.sweat();
                pumpkinGodfather.notDareToWipeFace();
            }

        }
    }
}







