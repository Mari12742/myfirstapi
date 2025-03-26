package co.edu.manizales.myfirstapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = " /sale")
public class SaleController {
    @GetMapping String getSales() {
        return "venta";
    }
}
