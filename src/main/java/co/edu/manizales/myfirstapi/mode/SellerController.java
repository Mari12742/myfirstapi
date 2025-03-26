package co.edu.manizales.myfirstapi.mode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping(path = "/seller")

   public class SellerController {
        @GetMapping
        public String getSeller() {
            return null;

            Seller Margarita = new Seller("12675989", "Margarita", "Perez", "Manizales", 43, "F");
            Seller Eduardo = new Seller("14368796", "Eduardo", "Castaño", "Manizales", 18, "M");
            Seller Camila = new Seller("14598078", "Camila", "Valencia", "Manizales", 26, "F");
            Seller Sandra = new Seller("12465434", "Sandra", "Marulanda", "Manizales", 38, "F");
            Seller Sebastian = new Seller("15698766", "Sebastian", "Corrales", "Manizales", 16, "M");