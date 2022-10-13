package org.iesfm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Group {
    private String letter;
    private String grade;
    private List<Student> students;

}