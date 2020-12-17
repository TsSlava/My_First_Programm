package org.lesson30;

import java.util.Scanner;

public class CreateYourRecipe extends HotDog implements  Ingredients, CookHotDog{

    public static Scanner scanner = new Scanner(System.in);
    private StringBuilder yourRecipe = new StringBuilder(getMainIngredient() + " " + getMainIngredient2());

    public StringBuilder getYourRecipe() {
        return yourRecipe;
    }

    public void setYourRecipe(StringBuilder yourRecipe) {
        this.yourRecipe = yourRecipe;
    }

    @Override
    public void add() {

    }

    public void createHotDog(){
        System.out.println("Выберите свои ингредиенты:\n1 - Майонез\n2 - Кетчуп\n3 - Горчица\n4 - Бекон\n5 - Лук\n" +
                "6 - Огурец\n7 - Томат\n8 - Сельдерей\n9 - Перец\n10 - Соль\n11 - Кукуруза\n12 - Морковь\n13 - Салат\nИ так:");
        setChoice(scanner.nextInt());
        switch (getChoice()){
            case 1:
                yourRecipe.append(" " + MAYONNAISE);
                break;
            case 2:
                yourRecipe.append(" " + KETCHUP);
                break;
            case 3:
                yourRecipe.append(" " + MUSTARD);
                break;
            case 4:
                yourRecipe.append(" " + BACON);
                break;
            case 5:
                yourRecipe.append(" " + ONION);
                break;
            case 6:
                yourRecipe.append(" " + CUCUMBER);
                break;
            case 7:
                yourRecipe.append(" " + TOMATO);
                break;
            case 8:
                yourRecipe.append(" " + CELERY);
                break;
            case 9:
                yourRecipe.append(" " + PEPPER);
                break;
            case 10:
                yourRecipe.append(" " + SALT);
                break;
            case 11:
                yourRecipe.append(" " + CORN);
                break;
            case 12:
                yourRecipe.append(" " + CARROT);
                break;
            case 13:
                yourRecipe.append(" " + SALAD);
                break;
            default:
                System.out.println("Внимательно читайте меню!");
        }
    }

    public void holdOnChoice(){
        System.out.println("Добавить ещё?\n1 - да\n2 - нет");
        setChoice(scanner.nextInt());
        switch (getChoice()) {
            case 1:
                createHotDog();
                holdOnChoice();
            case 2:
                break;
            default:
                System.out.println("Только 'да(1)' или 'нет(2)'!");
        }
    }

}
