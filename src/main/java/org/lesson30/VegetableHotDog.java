package org.lesson30;

public class VegetableHotDog extends HotDog implements Ingredients, CookHotDog{

    private StringBuilder cookVegetable = new StringBuilder(getMainIngredient() + " " + getMainIngredient2());

    public VegetableHotDog() {
        this.add();
    }

    public StringBuilder getCookVegetable() {
        return cookVegetable;
    }

    public void setCookVegetable(StringBuilder cookVegetable) {
        this.cookVegetable = cookVegetable;
    }

    @Override
    public void add() {
        cookVegetable.append(" " + ONION);
        cookVegetable.append(" " + CUCUMBER);
        cookVegetable.append(" " + TOMATO);
        cookVegetable.append(" " + CELERY);
        cookVegetable.append(" " + MUSTARD);
        cookVegetable.append(" " + PEPPER);
    }

}
