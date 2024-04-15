package ra.md4_ss1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md4_ss1.model.Category;
import ra.md4_ss1.repository.CategoryRepo;

import java.util.List;

@Service
public class CategoryServiceIMPL implements ICategoryService{
    @Autowired
    public CategoryRepo categoryRepo;
    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepo.findById(id);
    }

    @Override
    public Category save(Category newCategory) {
        return categoryRepo.save(newCategory);
    }

    @Override
    public boolean deleteById(Long id) {
        categoryRepo.deleteById(id);
        return true;
    }
}
