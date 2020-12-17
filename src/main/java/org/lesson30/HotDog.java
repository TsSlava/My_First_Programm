package org.lesson30;

import java.util.Objects;

public abstract class HotDog {

    private String mainIngredient = "Булочка";
    private String mainIngredient2 = "Сосиска";
    private int choice;

    public HotDog() {
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public HotDog(String mainIngredient, String mainIngredient2) {
        this.mainIngredient = mainIngredient;
        this.mainIngredient2 = mainIngredient2;
    }

    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public String getMainIngredient2() {
        return mainIngredient2;
    }

    public void setMainIngredient2(String mainIngredient2) {
        this.mainIngredient2 = mainIngredient2;
    }

    @Override
    public String toString() {
        return "HotDog{" +
                "mainIngredient='" + mainIngredient + '\'' +
                ", mainIngredient2='" + mainIngredient2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotDog hotDog = (HotDog) o;
        return Objects.equals(mainIngredient, hotDog.mainIngredient) &&
                Objects.equals(mainIngredient2, hotDog.mainIngredient2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainIngredient, mainIngredient2);
    }
}


