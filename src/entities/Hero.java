package entities;

import enums.EmotionType;
import enums.ProfessionType;
import interfaces.Character;
import java.util.Objects;
import java.util.ArrayList;

public abstract class Hero extends PhysicalObject implements Character {

    protected String sex;
    protected ProfessionType profession;
    protected String clothes;
    private EmotionType emotion;

    public Hero(String name,String sex, ProfessionType profession, String clothes) {
        super(name);
        this.sex = sex;
        this.profession = profession;
        this.clothes = clothes;
        this.emotion = EmotionType.CALM;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public ProfessionType getProfession() {
        return profession;
    }

    public void setProfession(ProfessionType profession) {
        this.profession = profession;
    }

    public void lookAt(PhysicalObject target){
        System.out.println(name + " смотрит на " + target.getName());
    }

    public void feel(EmotionType emotion){
        this.emotion = emotion;
        switch (emotion) {
            case SAD:
                System.out.println(name + " чувствовал себя подавлено");
                break;
            case HAPPY:
                System.out.println(name + " был вне себя от счастья");
                break;
            case MAD:
                System.out.println(name + " чувствовал как кровь медленно закипала");
                break;
            case CALM:
                System.out.println(name + " чувствовал себя непринужденно и спокойно");
                break;
            case FEAR:
                System.out.println(name + " испытывал сильнейший страх");
                break;
            case ANGRY:
                System.out.println(name + " испытывал злость");
                break;
            case SHAME:
                System.out.println(name + " был рад в эту минуту провалиться сквозь землю вместе со своим крошечным домиком");
                break;

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Hero hero = (Hero) o;
        return Objects.equals(sex, hero.sex) &&
                profession == hero.profession &&
                Objects.equals(clothes, hero.clothes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sex, profession, clothes);
    }

    @Override
    public String toString() {
        return "Hero{name='" + name + "', sex='" + sex +
                "', profession=" + profession + ", clothes='" + clothes + "'}";
    }


    public class World {
        private ArrayList<Hero> characters;

        public World() {
            this.characters = new ArrayList<>();
        }

        public void addCharacter(Hero character) {
            characters.add(character);
        }

        public void removeCharacter(Hero character) {
            characters.remove(character);
        }

        public void listCharacters() {
            for (Hero character : characters) {
                System.out.println(character.getName() + " (Профессия: " + character.getProfession() + ")");
            }
        }
    }

}
