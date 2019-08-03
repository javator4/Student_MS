package pl.sda.studentmodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String name;
    private String lastName;
    private int index;

    @Override
    public String toString() {
        return "\' Student nr: " + index  +
                "\' Imię: " + name +
                "\' Nazwisko: " + lastName;
    }
}
