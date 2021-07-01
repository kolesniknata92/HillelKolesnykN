package Lesson9HomeWork;

import java.util.HashMap;
import java.util.Set;

public class GradeBook {
    public static void main(String[] args) {

        Set<String> namesOfStudents = TestResult.listOfStudentsNames();
        HashMap<String, Integer> firstTest = TestResult.getOriginalGrades();
        HashMap<String, Integer> secondTest = TestResult.getMakeUpGrades();
        HashMap<String, Integer> gradeBookMap = new HashMap<>();

        for (String names : namesOfStudents) {
            int a = firstTest.get(names);
            int b = secondTest.get(names);
            if (a > b) {
                gradeBookMap.put(names, a);
            } else {
                gradeBookMap.put(names, b);
            }

        }
        gradeBookMap.forEach((key,value) -> System.out.println(key + " " + value));
    }
}

