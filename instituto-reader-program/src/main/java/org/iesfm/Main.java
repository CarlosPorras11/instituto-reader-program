package org.iesfm;

import org.iesfm.components.HighSchoolProgram;
import org.iesfm.configuration.HighSchoolConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HighSchoolConfiguration.class);

        HighSchoolProgram program = context.getBean(HighSchoolProgram.class);
        program.execute();
    }
}
