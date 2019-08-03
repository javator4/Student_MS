package pl.sda.savestudent;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.studentmodel.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student("Marcin", "Stanisławek", 1));
        studentList.add(new Student("Jan", "Kowalski", 2));
        studentList.add(new Student("Anna", "Nowak", 3));
        studentList.add(new Student("Stefan", "Batory", 4));
        studentList.add(new Student("Zofia", "Lewandowska", 5));

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("student.json"), studentList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
