package ra.md4_ss1.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ra.md4_ss1.model.Category;
import ra.md4_ss1.model.Product;

import java.util.List;

@Repository
@Transactional
public class CategoryRepoIMPL implements CategoryRepo{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Category> findAll() {
        return  entityManager.createQuery("select p from Category p ", Category.class).getResultList();
    }

    @Override
    public Category findById(Long id) {
        return entityManager.find(Category.class,id);
    }



    @Override
    public Category save(Category newCategory) {
        if (newCategory.getCategoryId()==null){
            entityManager.persist(newCategory);
        }else {
            entityManager.merge(newCategory);
        }
        return newCategory;
    }

    @Override
    public void deleteById(Long id) {
        entityManager.remove(findById(id));
    }
}
