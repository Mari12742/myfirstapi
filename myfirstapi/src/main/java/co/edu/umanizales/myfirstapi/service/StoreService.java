package co.edu.umanizales.myfirstapi.service;

import co.edu.umanizales.myfirstapi.model.Location;
import co.edu.umanizales.myfirstapi.model.Parameter;
import co.edu.umanizales.myfirstapi.model.Store;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Getter

public class StoreService {
    @Autowired
    private LocationService locationService;

    @Getter
    private List<Store> stores;

    @Value("${store_filename}")
    private String storeFileName;

    @PostConstruct
    public void readLocationsFromCSV() throws IOException {
        stores = new ArrayList<>();

        try (CSVReader csvReader = new CSVReader(new FileReader(
                new ClassPathResource(storeFileName).getFile()))) {

            String[] line;
            csvReader.skip(1); // Omitir cabecera si aplica

            while ((line = csvReader.readNext()) != null) {
                // line[0] = código, line[3] = nombre del municipio
                stores.add(new Store(locationService.getLocationByCode(line[0]), line[1],line[2],line[3]));
            }

        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException("Error leyendo el archivo CSV", e);
        }
    }

}