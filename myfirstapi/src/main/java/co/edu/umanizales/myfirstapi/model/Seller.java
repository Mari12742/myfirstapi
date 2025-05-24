package co.edu.umanizales.myfirstapi.model;
import co.edu.umanizales.myfirstapi.model.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Seller {
    private String name;
    private String lastName;
    private byte age;
    private String identification;
    private Location city;
    private char gender;
}