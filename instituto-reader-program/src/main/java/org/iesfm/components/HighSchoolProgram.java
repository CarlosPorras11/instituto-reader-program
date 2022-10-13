package org.iesfm.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.iesfm.entity.HighSchool;


@AllArgsConstructor
public class HighSchoolProgram {
    private HighSchoolWriter highSchoolWriter;
    private HighSchoolReader highSchoolReader;

    public void execute(){
        HighSchool highSchool = highSchoolReader.readHighSchool();
        highSchoolWriter.writeHighSchool(highSchool);
        System.out.println(highSchool);
    }
}
