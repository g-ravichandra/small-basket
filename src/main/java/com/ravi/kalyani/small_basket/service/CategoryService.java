package com.ravi.kalyani.small_basket.service;

import com.ravi.kalyani.small_basket.entities.CategoryL1;
import com.ravi.kalyani.small_basket.entities.CategoryL2;
import com.ravi.kalyani.small_basket.entities.CategoryL3;
import com.ravi.kalyani.small_basket.exception.ResourceNotFoundException;
import com.ravi.kalyani.small_basket.repository.CategoryL1Repo;
import com.ravi.kalyani.small_basket.repository.CategoryL2Repo;
import com.ravi.kalyani.small_basket.repository.CategoryL3Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryL1Repo categoryL1Repo;

    @Autowired
    CategoryL2Repo categoryL2Repo;

    @Autowired
    CategoryL3Repo categoryL3Repo;


   /*Level One Categories CRUD Operations*/

    public CategoryL1 createCategoryL1(CategoryL1 categoryL1){
        return categoryL1Repo.save(categoryL1);
    }

    public List<CategoryL1> getallCategoryL1s(){
        return categoryL1Repo.findAll();
    }

    public CategoryL1 getCategoryL1ById(Long id){
        return categoryL1Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 1 Category not found with id: " + id));
    }

    public CategoryL1 updateCategoryL1(Long id, CategoryL1 categoryL1Details){
        CategoryL1 categoryL1 = categoryL1Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 1 Category not found with id: " + id));
        categoryL1.setName(categoryL1Details.getName());

        return categoryL1Repo.save(categoryL1);
    }

    public void deleteCategoryL1(Long id){
        CategoryL1 categoryL1 = categoryL1Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 1 Category not found with id: " + id));
        categoryL1Repo.delete(categoryL1);
    }

    /*Level Two Categories CRUD Operations*/

    public CategoryL2 createCategoryL2(CategoryL2 categoryL2){
        return categoryL2Repo.save(categoryL2);
    }

    public List<CategoryL2> getallCategoryL2s(){
        return categoryL2Repo.findAll();
    }

    public CategoryL2 getCategoryL2ById(Long id){
        return categoryL2Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 2 Category not found with id: " + id));
    }

    public CategoryL2 updateCategoryL2(Long id, CategoryL2 categoryL2Details){
        CategoryL2 categoryL2 = categoryL2Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 2 Category not found with id: " + id));
        categoryL2.setName(categoryL2Details.getName());

        return categoryL2Repo.save(categoryL2);
    }

    public void deleteCategoryL2(Long id){
        CategoryL2 categoryL2 = categoryL2Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 2 Category not found with id: " + id));
        categoryL2Repo.delete(categoryL2);
    }

    /*Level Three Categories CRUD Operations*/

    public CategoryL3 createCategoryL3(CategoryL3 categoryL3){
        return categoryL3Repo.save(categoryL3);
    }

    public List<CategoryL3> getallCategoryL3s(){
        return categoryL3Repo.findAll();
    }

    public CategoryL3 getCategoryL3ById(Long id){
        return categoryL3Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 3 Category not found with id: " + id));
    }

    public CategoryL3 updateCategoryL3(Long id, CategoryL3 categoryL3Details){
        CategoryL3 categoryL3 = categoryL3Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 3 Category not found with id: " + id));
        categoryL3.setName(categoryL3Details.getName());

        return categoryL3Repo.save(categoryL3);
    }

    public void deleteCategoryL3(Long id){
        CategoryL3 categoryL3 = categoryL3Repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Level 3 Category not found with id: " + id));
        categoryL3Repo.delete(categoryL3);
    }

}
