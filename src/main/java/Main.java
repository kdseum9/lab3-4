import entities.plants.JapaneseEggplant;
import entities.plants.LeekOnion;
import entities.plants.PlantInfo;
import entities.heroes.PumpkinGodfather;
import entities.PumpkinHouse;
import entities.plants.RosaraPotato;
import entities.heroes.SeniorPomidor;
import enums.EmotionType;
import enums.ProfessionType;
import enums.WeatherType;
import exceptions.WeatherException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public Main() {
    }

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
        new PlantInfo("Лук-порей", 10);
        new PlantInfo("Японский баклажан", 15);
        new PlantInfo("Картофель Розара", 20);
        WeatherType[] weatherTypes = WeatherType.values();
        Random random = new Random();

        for (int day = 1; day <= 5; ++day) {
            logger.info("День: {}", day);
            WeatherType weather = weatherTypes[random.nextInt(weatherTypes.length)];
            logger.info("Погода сегодня: {}", weather);
            logger.info("Рост растений:");

            WeatherException e;
            try {
                leekOnion.grow(weather);
            } catch (WeatherException var17) {
                e = var17;
                logger.error(e.getMessage());
            }

            try {
                japaneseEggplant.grow(weather);
            } catch (WeatherException var16) {
                e = var16;
                logger.error(e.getMessage());
            }

            try {
                rosaraPotato.grow(weather);
            } catch (WeatherException var15) {
                e = var15;
                logger.error(e.getMessage());
            }

            logger.info("Проверка высоты растений:");
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