package ra.md4_ss1.service;

import ra.md4_ss1.model.Category;
import ra.md4_ss1.model.Product;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(Long id);
    Category save(Category newCategory);
    boolean deleteById(Long id);
}
