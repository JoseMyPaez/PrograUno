package Test;

import Models.Models;

public class Test {
    public static void main(String[] args) {
        Models models = new Models();
        System.out.println("Bienvenido");
        //System.out.println(models.compareSeconds(1,2,3,7,5,3));
        models.compareHours(1,2,3,7,5,3);
    }
}
