package org.lesson30;

import java.util.Scanner;

public class AdditionalIngredients extends HotDog implements Ingredients {

    public static Scanner scanner = new Scanner(System.in);
    private StringBuilder addIngredients = new StringBuilder();

    public StringBuilder getAddIngredients() {
        return addIngredients;
    }

    public void setAddIngredients(StringBuilder addIngredients) {
        this.addIngredients = addIngredients;
    }

    public void processAdd() {
        System.out.println("Хотите добавить дополнительные ингредиенты?\n(1-да, 2-нет)");
        setChoice(scanner.nextInt());
        switch (getChoice()) {
            case 1:
                createAddIngredients();
                holdOnChoice();
                break;
            case 2:
                break;
            default:
                System.out.println("Только 'да(1)' или 'нет(2)'!");
        }
    }

    public void createAddIngredients() {
        System.out.println("Выберите дополнительные ингредиенты:\n1 - Майонез\n2 - Кетчуп\n3 - Горчица\n4 - Бекон\n5 - Лук\n" +
                "6 - Огурец\n7 - Томат\n8 - Сельдерей\n9 - Перец\n10 - Соль\n11 - Кукуруза\n12 - Морковь\n13 - Салат\nИ так:");
        setChoice(scanner.nextInt());
        switch (getChoice()) {
            case 1:
                addIngredients.append(" " + MAYONNAISE);
                break;
            case 2:
                addIngredients.append(" " + KETCHUP);
                break;
            case 3:
                addIngredients.append(" " + MUSTARD);
                break;
            case 4:
                addIngredients.append(" " + BACON);
                break;
            case 5:
                addIngredients.append(" " + ONION);
                break;
            case 6:
                addIngredients.append(" " + CUCUMBER);
                break;
            case 7:
                addIngredients.append(" " + TOMATO);
                break;
            case 8:
                addIngredients.append(" " + CELERY);
                break;
            case 9:
                addIngredients.append(" " + PEPPER);
                break;
            case 10:
                addIngredients.append(" " + SALT);
                break;
            case 11:
                addIngredients.append(" " + CORN);
                break;
            case 12:
                addIngredients.append(" " + CARROT);
                break;
            case 13:
                addIngredients.append(" " + SALAD);
                break;
            default:
                System.out.println("Внимательно читайте меню!");
        }
    }

    public void holdOnChoice() {
        System.out.println("Добавить ещё?\n1 - да\n2 - нет");
        setChoice(scanner.nextInt());
        switch (getChoice()) {
            case 1:
                createAddIngredients();
                holdOnChoice();
            case 2:
                break;
            default:
                System.out.println("Только 'да(1)' или 'нет(2)'!");
        }
    }
}
