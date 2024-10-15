package ie.atu.week5cicd1;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    List<Product> productList = new ArrayList<>();
    @GetMapping
    public List<Product> getProducts(){
        return productList;
    }

    @PostMapping
    public List<Product> addProduct(@Valid @RequestBody Product product){
      productList.add(product);
        return productList;
    }
}
