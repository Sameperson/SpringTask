package com.sameperson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        NameProvider nameProvider = context.getBean(NameProvider.class);
        Scanner reader = new Scanner(System.in);
        while(true) {
            System.out.println("What name do you need? Type " +
                    "\"1\" to get all uppercase name, " +
                    "\"2\" to get only first letter uppercase, " +
                    "\"q\" to quit");
            String input = reader.nextLine();
            if(input.equals("1")) {
                System.out.println(nameProvider.getAllUppercase());
            } else if(input.equals("2")) {
                System.out.println(nameProvider.getFirstLetterUppercase());
            } else if(input.equals("q")) {
                break;
            } else {
                System.out.println("Wrong input, try again");
            }
        }
        System.out.println("Exiting...");
    }
}