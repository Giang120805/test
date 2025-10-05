package com.hrms.service;

import com.hrms.model.Product;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProductService {

    private static final String FILE_PATH = "products.txt";

    public Product inputNewProduct() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sản phẩm: ");
        String productId = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();

        System.out.print("Nhập loại sản phẩm: ");
        String category = sc.nextLine();

        System.out.print("Nhập thương hiệu: ");
        String brand = sc.nextLine();

        System.out.print("Nhập giá nhập: ");
        double importPrice = sc.nextDouble();

        System.out.print("Nhập giá bán: ");
        double salePrice = sc.nextDouble();

        System.out.print("Nhập số lượng tồn kho: ");
        int stockQuantity = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhập mô tả sản phẩm: ");
        String description = sc.nextLine();

        System.out.print("Nhập trạng thái (Còn hàng / Hết hàng): ");
        String status = sc.nextLine();

        if (salePrice < importPrice) {
            System.out.println("Giá bán phải lớn hơn hoặc bằng giá nhập!");
            return null;
        }

        if (stockQuantity <= 0) {
            System.out.println("Số lượng tồn kho phải lớn hơn 0!");
            return null;
        }

        if (!status.equalsIgnoreCase("Còn hàng") && !status.equalsIgnoreCase("Hết hàng")) {
            System.out.println("Trạng thái không hợp lệ! (Chỉ được nhập 'Còn hàng' hoặc 'Hết hàng')");
            return null;
        }

        Product product = new Product(productId, productName, category, brand,
                importPrice, salePrice, stockQuantity, description, status);
        saveToFile(product);
        System.out.println("Thêm sản phẩm thành công!");
        return product;
    }

    private void saveToFile(Product product) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(product.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi dữ liệu vào file: " + e.getMessage());
        }
    }
}
