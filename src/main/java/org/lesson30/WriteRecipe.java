package org.lesson30;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteRecipe {

    private StringBuilder writeRecipe;

    public StringBuilder getWriteRecipe() {
        return writeRecipe;
    }

    public void setWriteRecipe(StringBuilder writeRecipe) {
        this.writeRecipe = writeRecipe;
    }

    public void CreateWriter(){
        try (FileOutputStream fos = new FileOutputStream("C://Users//Слава//SomeDir//SomeText.txt")) {
            fos.write(getWriteRecipe().toString().getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
