package org.iesfm.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.entity.Group;
import org.iesfm.entity.Student;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor

public class GroupReader {

    private Scanner scanner;
    private StudentReader studentReader;

    public Group readGroup() {
        System.out.println("Introduce la letra del grupo");
        String letter = scanner.nextLine();
        System.out.println("Introduce el curso del grupo");
        String grade = scanner.nextLine();
        System.out.println("¿Cuantos estudiantes quieres introducir?");
        int num = scanner.nextInt();
        scanner.nextLine();
        List<Student> students = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            students.add(studentReader.readStudent());
        }

        return new Group(letter, grade, students);

    }
}
