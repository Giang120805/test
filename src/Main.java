package com.hrms;

import com.hrms.service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        service.inputNewProduct();
    }
}
