package jadineria.jardineraDelEden.web.controller;

import jadineria.jardineraDelEden.domain.service.ProductServiceImpl;
import jadineria.jardineraDelEden.persistence.Product;
import jadineria.jardineraDelEden.persistence.dtos.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {
    private final ProductServiceImpl productService;


    @Autowired
    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDTO> getAllProduct() {
        return productService.getAll();
    }

    @GetMapping("/products-are-not-in-any-order")
    public List<ProductDTO> getProductsAreNotInAnyOrder(){
        return productService.getProductsAreNotInAnyOrder();
    }

    @GetMapping("/products-are-not-in-any-order-n-d-i")
    public List<String> getProductsAreNotInAnyOrderNDI(){
        return productService.getProductsAreNotInAnyOrderNDI();
    }

    @GetMapping("/find-max-and-min-price")
    public List<Object[]> findMaxAndMinPrice(){
        return productService.findMaxAndMinPrice();
    }
}
