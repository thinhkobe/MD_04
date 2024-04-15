package ra.md4_ss1.controller.productController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/product-list")
    public String showAll(){
        return "/product-list";
    }
    @RequestMapping("/product-add")
    public String add(){
        return "/product-list";
    }
    @RequestMapping("/doAdd")
    public String doAdd(){
        return "redirect:/product/product-list";
    }
}
