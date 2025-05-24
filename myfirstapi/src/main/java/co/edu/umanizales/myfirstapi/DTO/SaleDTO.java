package co.edu.umanizales.myfirstapi.DTO;

import co.edu.umanizales.myfirstapi.model.ProductSale;

import java.time.LocalDate;
import java.util.List;

public class SaleDTO {
    private String seller;
    private String store;
    private List<ProductSale> products;
    private LocalDate saleDate;

}
