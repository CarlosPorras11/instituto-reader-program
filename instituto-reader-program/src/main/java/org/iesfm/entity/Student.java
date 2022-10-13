package org.iesfm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String nif;
    private String name;
    private String surnames;
}
