package co.edu.umanizales.myfirstapi.controler;

import co.edu.umanizales.myfirstapi.model.Seller;
import co.edu.umanizales.myfirstapi.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/seller")

public class SellerController {

    @Autowired
    private SellerService sellerService;

    @GetMapping
    public List<Seller> getSellers() {
        return sellerService.getSellers();

    }

}