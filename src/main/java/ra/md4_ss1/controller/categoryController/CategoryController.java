package ra.md4_ss1.controller.categoryController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ra.md4_ss1.model.Category;
import ra.md4_ss1.service.ICategoryService;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;

    @RequestMapping("/category-list")
    public String showAll(Model model) {
        List<Category> categoryList = iCategoryService.findAll();
        if (categoryList.isEmpty()) {
            model.addAttribute("categoryListIsEmpty", "categoryListIsEmpty");
            return "/category-list";
        }
        model.addAttribute("categoryList", categoryList);
        return "/category-list";
    }

    @RequestMapping(value = "/doAdd", method = RequestMethod.POST)
    public String doAdd(@ModelAttribute Category newCategory) {
        iCategoryService.save(newCategory);
        return "redirect:/category/category-list";
    }

    @RequestMapping(value = "/edit/{id}")
    public String edit(@PathVariable Long id,Model model) {
        Category category=iCategoryService.findById(id);
        model.addAttribute("category",category);
        return "/category-edit";
    }
 @RequestMapping(value = "/doEdit", method = RequestMethod.POST)
    public String doEit(@ModelAttribute Category newCategory) {
        iCategoryService.save(newCategory);
        return "redirect:/category/category-list";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable Long id) {
        iCategoryService.deleteById(id);
        return "redirect:/category/category-list";
    }
}
