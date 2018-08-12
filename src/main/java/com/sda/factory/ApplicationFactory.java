package com.sda.factory;

import com.sda.factory.model.BaseUnit;
import com.sda.factory.model.BaseUnitFactory;

import java.util.Scanner;

public class ApplicationFactory {
    public static void main(String[] args) {
        System.out.println("Select unit");
        System.out.println("0. Only range units");
        System.out.println("1. Knight");
        System.out.println("2. Archer");
        System.out.println("3. Spearman");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        BaseUnitFactory baseUnitFactory = new BaseUnitFactory();

        if("0".equals(name)){
            String generation = scanner.nextLine();
            baseUnitFactory.createNewBaseUnit(name);
        }
        else{
            BaseUnit unit = baseUnitFactory.createNewBaseUnit(name);
        }


        BaseUnit unit = baseUnitFactory.createNewBaseUnit(name);
        System.out.println(unit);


    }
}
