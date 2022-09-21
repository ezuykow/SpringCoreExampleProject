package ru.ezuykow;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ezuykow.springConfig.SpringConfig;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
