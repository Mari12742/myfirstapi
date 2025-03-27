package co.edu.manizales.myfirstapi.mode;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.xml.stream.Location;


@Getter
@Setter
@AllArgsConstructor

public class Seller {
    private String identification;
    private String name;
    private String lastName;
    private String location;
    private byte age;
    private char gender;
}


