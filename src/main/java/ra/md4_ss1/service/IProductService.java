package ra.md4_ss1.service;

import ra.md4_ss1.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
    Product save(Product newProduct);
    boolean deleteById(Long id);
}
