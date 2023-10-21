package com.spring.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/product", produces = "application/json")
public class ProductController {

    /*@Autowired
    private ProductRepository productRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        Product product = productRepository.findById(id).orElse(null);

        if(product != null){
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product createdProduct = productRepository.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }*/
    @GetMapping("/test")
    public String Test() {
        return "testtesttest!!!";
    }
}
