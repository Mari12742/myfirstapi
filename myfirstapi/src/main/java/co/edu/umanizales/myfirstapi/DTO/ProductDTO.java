package co.edu.umanizales.myfirstapi.DTO;

import lombok.Data;

@Data
public class ProductDTO {
    private String code;
    private String description;
    private double price;
    private int stock;
    private String codeTypeProduct;
}