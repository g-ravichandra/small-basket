package com.ravi.kalyani.small_basket.controller;

import com.ravi.kalyani.small_basket.entities.CategoryL1;
import com.ravi.kalyani.small_basket.entities.CategoryL2;
import com.ravi.kalyani.small_basket.entities.CategoryL3;
import com.ravi.kalyani.small_basket.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /*CategoryL1 CRUD operations*/
    @PostMapping("/level1")
    public ResponseEntity<CategoryL1> createCategoryL1(@RequestBody CategoryL1 categoryL1){
        CategoryL1 savedCategoryL1 = categoryService.createCategoryL1(categoryL1);
        return  new ResponseEntity<>(savedCategoryL1, HttpStatus.CREATED);
    }

    @GetMapping("/level1")
    public List<CategoryL1> getAllCategoryL1s(){
        return categoryService.getallCategoryL1s();
    }

    @GetMapping("/level1/{id}")
    public ResponseEntity<CategoryL1> getCategoryL1ById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.getCategoryL1ById(id));
    }

    @PutMapping("/level1/{id}")
    public ResponseEntity<CategoryL1> updateCategoryL1(@PathVariable Long id, @RequestBody CategoryL1 categoryL1){
        return ResponseEntity.ok(categoryService.updateCategoryL1(id, categoryL1));
    }

    @DeleteMapping("/level1/{id}")
    public ResponseEntity<?> deleteCategoryL1(@PathVariable Long id){
        categoryService.deleteCategoryL1(id);
        return ResponseEntity.ok().build();
    }

    /*CategoryL2 CRUD operations*/
    @PostMapping("/level2")
    public ResponseEntity<CategoryL2> createCategoryL2(@RequestBody CategoryL2 categoryL2){
        CategoryL2 savedCategoryL2 = categoryService.createCategoryL2(categoryL2);
        return  new ResponseEntity<>(savedCategoryL2, HttpStatus.CREATED);
    }

    @GetMapping("/level2")
    public List<CategoryL2> getallCategoryL2s(){
        return categoryService.getallCategoryL2s();
    }

    @GetMapping("/level2/{id}")
    public ResponseEntity<CategoryL2> getCategoryL2ById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.getCategoryL2ById(id));
    }

    @PutMapping("/level2/{id}")
    public ResponseEntity<CategoryL2> updateCategoryL2(@PathVariable Long id, @RequestBody CategoryL2 categoryL2){
        return ResponseEntity.ok(categoryService.updateCategoryL2(id, categoryL2));
    }

    @DeleteMapping("/level2/{id}")
    public ResponseEntity<?> deleteCategoryL2(@PathVariable Long id){
        categoryService.deleteCategoryL2(id);
        return ResponseEntity.ok().build();
    }

    /*CategoryL3 CRUD operations*/
    @PostMapping("/level3")
    public ResponseEntity<CategoryL3> createCategoryL3(@RequestBody CategoryL3 categoryL3){
        CategoryL3 savedCategoryL3 = categoryService.createCategoryL3(categoryL3);
        return  new ResponseEntity<>(savedCategoryL3, HttpStatus.CREATED);
    }

    @GetMapping("/level3")
    public List<CategoryL3> getallCategoryL3s(){
        return categoryService.getallCategoryL3s();
    }

    @GetMapping("/level3/{id}")
    public ResponseEntity<CategoryL3> getCategoryL3ById(@PathVariable Long id){
        return ResponseEntity.ok(categoryService.getCategoryL3ById(id));
    }

    @PutMapping("/level3/{id}")
    public ResponseEntity<CategoryL3> updateCategoryL3(@PathVariable Long id, @RequestBody CategoryL3 categoryL3){
        return ResponseEntity.ok(categoryService.updateCategoryL3(id, categoryL3));
    }

    @DeleteMapping("/level3/{id}")
    public ResponseEntity<?> deleteCategoryL3(@PathVariable Long id){
        categoryService.deleteCategoryL3(id);
        return ResponseEntity.ok().build();
    }

}
