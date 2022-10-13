package org.iesfm.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.iesfm.components.*;
import org.iesfm.entity.HighSchool;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class HighSchoolConfiguration {

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }

    @Bean
    public StudentReader studentReader(Scanner scanner) {
        return new StudentReader(scanner);
    }

    @Bean
    public GroupReader groupReader(Scanner scanner, StudentReader studentReader) {
        return new GroupReader(scanner, studentReader);
    }

    @Bean
    public HighSchoolReader highSchoolReader(Scanner scanner, GroupReader groupReader) {
        return new HighSchoolReader(scanner, groupReader);
    }

    @Bean
    public HighSchoolWriter highSchoolWriter(ObjectMapper objectMapper){
        return new HighSchoolWriter(objectMapper);
    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    @Bean
    public HighSchoolProgram highSchoolProgram(
            HighSchoolReader highSchoolReader,
            HighSchoolWriter highSchoolWriter) {
        return new HighSchoolProgram(highSchoolWriter, highSchoolReader);
    }
}
