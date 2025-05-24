package co.edu.umanizales.myfirstapi.model;

import co.edu.umanizales.myfirstapi.model.ProductSale;
import co.edu.umanizales.myfirstapi.model.Seller;
import co.edu.umanizales.myfirstapi.model.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Getter
@Setter
@AllArgsConstructor

public class Sale {
    private Seller seller;
    private Store store;
    private int quantity;
    private List<ProductSale> products;
    private LocalDate dateSale;
    private double totalsale;




}