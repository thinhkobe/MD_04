package ra.md4_ss1.repository;

import ra.md4_ss1.model.Category;
import ra.md4_ss1.model.Product;

import java.util.List;

public interface CategoryRepo {
    List<Category> findAll();
    Category findById(Long id);
    Category save(Category newCategory);
    void deleteById(Long id);
}
