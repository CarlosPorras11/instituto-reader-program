package org.iesfm.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.entity.Student;

import java.util.Scanner;
@AllArgsConstructor

public class StudentReader {

    private Scanner scanner;

    public Student readStudent() {
        System.out.println("Introduce el nif");
        String nif = scanner.nextLine();

        System.out.println("Introduce el nombre");
        String name = scanner.nextLine();

        System.out.println("Introduce los apellidos");
        String surnames = scanner.nextLine();

        return new Student(nif, name, surnames);
    }
}
