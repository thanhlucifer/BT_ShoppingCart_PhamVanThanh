package PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.controller;

import PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.model.Product;
import PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("view")
    public String viewProducts(Model model){
        model.addAttribute("listProducts", productService.getAllProducts());
        return "view_productlist";
    }

    @GetMapping("addnew")
    public String showNewProductForm(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "new_product";
    }

    @PostMapping("save")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "redirect:/product/view";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable(value = "id") int id) {
        this.productService.deleteProductById(id);
        return "redirect:/product/view";
    }

    @GetMapping("/403")
    public String error403(){
        return "403";
    }
}
