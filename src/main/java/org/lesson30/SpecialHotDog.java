package org.lesson30;

public class SpecialHotDog extends HotDog implements Ingredients, CookHotDog {

    private StringBuilder cookSpecial = new StringBuilder(getMainIngredient() + " " + getMainIngredient2());

    public SpecialHotDog() {
        this.add();
    }

    public StringBuilder getCookSpecial() {
        return cookSpecial;
    }

    public void setCookSpecial(StringBuilder cookSpecial) {
        this.cookSpecial = cookSpecial;
    }

    @Override
    public void add() {
        cookSpecial.append(" " + MAYONNAISE);
        cookSpecial.append(" " + MUSTARD);
        cookSpecial.append(" " + KETCHUP);
        cookSpecial.append(" " + MUSTARD);
        cookSpecial.append(" " + BACON);
        cookSpecial.append(" " + SALT);
        cookSpecial.append(" " + CORN);
        cookSpecial.append(" " + CARROT);
        cookSpecial.append(" " + SALAD);
    }

}
