package co.edu.umanizales.myfirstapi.model;

import co.edu.umanizales.myfirstapi.model.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.util.Strings;

@Getter
@Setter
@AllArgsConstructor

public class Store {
    private String code;
    private String name;
    private String address;
    private Location city;

    public Store(Location locationByCode, String name, String address, String s) {
    }
}
