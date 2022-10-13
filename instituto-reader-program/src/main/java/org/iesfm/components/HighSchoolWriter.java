package org.iesfm.components;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.entity.HighSchool;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@AllArgsConstructor

public class HighSchoolWriter {
    private ObjectMapper om;

    public void writeHighSchool(HighSchool highSchool){
        try {
            om.writeValue(new File(highSchool.getName()+ ".json"), highSchool);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
