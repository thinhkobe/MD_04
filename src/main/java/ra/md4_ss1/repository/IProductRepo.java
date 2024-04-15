package ra.md4_ss1.repository;

import ra.md4_ss1.model.Product;

import java.util.List;

public interface IProductRepo  {
    List<Product> findAll();
    Product findById(Long id);
    Product save(Product newProduct);
    void deleteById(Long id);
}
