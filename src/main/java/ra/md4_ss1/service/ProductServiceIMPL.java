package ra.md4_ss1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.md4_ss1.model.Product;
import ra.md4_ss1.repository.IProductRepo;

import java.util.List;

@Service
public class ProductServiceIMPL implements IProductService{
    @Autowired
    private IProductRepo iProductRepo;
    @Override
    public List<Product> findAll() {
        return iProductRepo.findAll();
    }

    @Override
    public Product findById(Long id) {
        return iProductRepo.findById(id);
    }

    @Override
    public Product save(Product newProduct) {
        return iProductRepo.save(newProduct);
    }

    @Override
    public boolean deleteById(Long id) {
         iProductRepo.deleteById(id);
         return true;
    }
}
