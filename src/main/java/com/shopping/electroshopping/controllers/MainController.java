package com.shopping.electroshopping.controllers;

import com.shopping.electroshopping.model.category.Category;
import com.shopping.electroshopping.model.product.Product;
import com.shopping.electroshopping.repository.CategoryRepository;
import com.shopping.electroshopping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
    @GetMapping("/")
    public String home(Model model)

    {
        List<Product> productList=productRepository.findAll();

        model.addAttribute("listProducts",productList);

        return "index";
    }






}
