package org.lesson30;

public class ClassicalHotDog extends HotDog implements CookHotDog, Ingredients {


    private StringBuilder cookClassical = new StringBuilder(getMainIngredient() + " " + getMainIngredient2());

    public ClassicalHotDog() {
        this.add();
    }

    public StringBuilder getCookClassical() {
        return cookClassical;
    }

    public void setCookClassical(StringBuilder cookClassical) {
        this.cookClassical = cookClassical;
    }

    @Override
    public void add() {
        cookClassical.append(" " + KETCHUP);
        cookClassical.append(" " + MUSTARD);
        cookClassical.append(" " + BACON);
    }


}
