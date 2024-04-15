package ra.md4_ss1.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ra.md4_ss1.model.Product;

import java.util.List;

@Repository
@Transactional
public class ProductRepoIMPL implements IProductRepo{
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Product> findAll() {
        return  entityManager.createQuery("select p from Product p ", Product.class).getResultList();
    }

    @Override
    public Product findById(Long id) {
        return entityManager.find(Product.class,id);
    }

    @Override
    public Product save(Product newProduct) {
        if (newProduct.getId()==null){
            entityManager.persist(newProduct);
        }else {
            entityManager.merge(newProduct);
        }
        return newProduct;
    }

    @Override
    public void deleteById(Long id) {
        entityManager.remove(findById(id));
    }


}
