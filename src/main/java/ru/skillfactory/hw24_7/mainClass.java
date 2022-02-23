package ru.skillfactory.hw24_7;

import ru.skillfactory.hw24_7.enums.StudyProfile;
import ru.skillfactory.hw24_7.model.Student;
import ru.skillfactory.hw24_7.model.Univer;

public class mainClass {
    public static void main(String[] args) {
        Univer univer = new Univer("1","Moscow University","MGU",1981, StudyProfile.MATHEMATIC);
        Student student = new Student("1","Pupkin Vasiliy",12,14.5f);

        System.out.println(univer);
        System.out.println(student);


    }

}
