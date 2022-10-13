package org.iesfm.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.entity.Group;
import org.iesfm.entity.HighSchool;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
public class HighSchoolReader {
    private Scanner scanner;
    private GroupReader groupReader;


    public HighSchool readHighSchool() {
        System.out.println("Escribe el nombre de un instituto");
        String name = scanner.nextLine();
        System.out.println("¿Cuántos grupos hay?");
        int num = scanner.nextInt();
        scanner.nextLine();
        List<Group> groups = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            groups.add(groupReader.readGroup());
        }
        return new HighSchool(name, groups);
    }
}
