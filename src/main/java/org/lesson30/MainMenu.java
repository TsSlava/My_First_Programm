package org.lesson30;

import java.util.Scanner;

public class MainMenu extends HotDog implements Cost{

    private static String MAINTITLE = "ДОБРО ПОЖАЛОВАТЬ В НЯМ-НЯМ!!!";
    public static Scanner scanner = new Scanner(System.in);
    int k = 0;
    double sum = 0;

    public void agree(){
        System.out.println("Может ещё хот-дог?(1-да, 2-нет, 3-отменить заказ)");
        setChoice(scanner.nextInt());
        switch (getChoice()){
            case 1:
                k++;
                displayMainMenu();
                break;
            case 2:
                System.out.println("Заказ сформирован");
                k++;
                break;
            case 3:
                System.out.println("Ждём вас в следующий раз!");
                break;
            default:
                System.out.println("Варианты ответа только 1, 2 или 3!");
        }
    }
    public void displayMainMenu(){
        AdditionalIngredients additionalIngredients = new AdditionalIngredients();
        WriteRecipe writeInTheFile = new WriteRecipe();
        System.out.println("Выберите свой ХОТ-ДОГ!!!\n1 - классический\n2 - вегетарианский\n3 - специальный\n4 - " +
                "свой рецепт!!!\nВаш выбор:");
        setChoice(scanner.nextInt());
        switch (getChoice()){
            case 1:
                ClassicalHotDog classicalHotDog = new ClassicalHotDog();
                System.out.println("Классический хот-дог!\nСостав: " + classicalHotDog.getCookClassical());
                additionalIngredients.processAdd();
                System.out.println("Ваш заказ КЛАССИЧЕСКИЙ ХОТ-ДОГ со следующим составом:\n" + classicalHotDog.getCookClassical()
                + additionalIngredients.getAddIngredients());
                System.out.println("Стоимость классического хот-дога: " + CLASSICAL + " рубля");
                sum += CLASSICAL;
                agree();
                writeInTheFile.setWriteRecipe(classicalHotDog.getCookClassical().append(additionalIngredients.getAddIngredients()));
                writeInTheFile.CreateWriter();
                break;
            case 2:
                VegetableHotDog vegetableHotDog = new VegetableHotDog();
                System.out.println("Вегетарианский хот-дог!\nСостав: " + vegetableHotDog.getCookVegetable());
                additionalIngredients.processAdd();
                System.out.println("Ваш заказ ВЕГЕТАРИАНСКИЙ ХОТ-ДОГ со следующим составом:\n" + vegetableHotDog.getCookVegetable()
                        + additionalIngredients.getAddIngredients());
                System.out.println("Стоимость вегетарианского хот-дога: " + VEGETABLE + " рубля");
                sum += VEGETABLE;
                agree();
                writeInTheFile.setWriteRecipe(vegetableHotDog.getCookVegetable().append(additionalIngredients.getAddIngredients()));
                writeInTheFile.CreateWriter();
                break;
            case 3:
                SpecialHotDog specialHotDog = new SpecialHotDog();
                System.out.println("Специальный хот-дог!\nСостав: " + specialHotDog.getCookSpecial());
                additionalIngredients.processAdd();
                System.out.println("Ваш заказ СПЕЦИАЛЬНЫЙ ХОТ-ДОГ со следующим составом:\n" + specialHotDog.getCookSpecial()
                        + additionalIngredients.getAddIngredients());
                System.out.println("Стоимость специального хот-дога: " + SPECIAL + " рубля");
                sum += SPECIAL;
                agree();
                writeInTheFile.setWriteRecipe(specialHotDog.getCookSpecial().append(additionalIngredients.getAddIngredients()));
                writeInTheFile.CreateWriter();
                break;
            case 4:
                CreateYourRecipe createYourRecipe = new CreateYourRecipe();
                createYourRecipe.createHotDog();
                createYourRecipe.holdOnChoice();
                System.out.println("Ваш рецепт!\nСостав: " + createYourRecipe.getYourRecipe());
                System.out.println("Стоимость за ваш рецепт: " + YOURS + " рубля");
                sum += YOURS;
                agree();
                writeInTheFile.setWriteRecipe(createYourRecipe.getYourRecipe());
                writeInTheFile.CreateWriter();
                break;
            default:
                System.out.println("Внимательно читайте меню!");
        }
    }

    public static void main(String[] args) {
        System.out.println(MAINTITLE);
        MainMenu mainMenu = new MainMenu();
        Discount discount = new Discount();
        mainMenu.displayMainMenu();
        discount.setCount(mainMenu.k);
        discount.setCost(mainMenu.sum);
        mainMenu.cashOrCard();
        discount.calcDiscount();
    }

    public void cashOrCard () {
        System.out.println("Расчёт наличными или картой?(1-наличные, 2-карта)");
        setChoice(scanner.nextInt());
        switch (getChoice()){
            case 1:
                System.out.println("Наличный расчёт");
                break;
            case 2:
                System.out.println("Расчёт по карте");
                break;
            default:
                System.out.println("Вариант только 1 или 2!");
        }
    }
}
