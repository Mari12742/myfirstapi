package co.edu.manizales.myfirstapi.mode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
    @RequestMapping(path = "/seller")

   public class SellerController {
    @GetMapping
    public Seller getSeller() {
        Location Manizales = new Location("17001", "Manizales");

        Seller Margarita = new Seller("12675989", "Margarita", "Perez", "Manizales", (byte) 56, 'F');
        Seller Eduardo = new Seller("14368796", "Eduardo", "Castaño", "Manizales", (byte) 12, 'M');
        Seller Camila = new Seller("14598078", "Camila", "Valencia", "Manizales", (byte) 34, 'F');
        Seller Sandra = new Seller("12465434", "Sandra", "Marulanda", "Manizales", (byte) 67, 'F');
        Seller Sebastian = new Seller("15698766", "Sebastian", "Corrales", "Manizales", (byte) 19, 'M');

        return Margarita;
    }
}
