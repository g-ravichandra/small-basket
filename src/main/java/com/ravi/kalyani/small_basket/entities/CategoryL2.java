package com.ravi.kalyani.small_basket.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoryl2")
public class CategoryL2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference // Prevents infinite recursion
    private CategoryL1 categoryL1;

    @OneToMany(mappedBy = "categoryL2", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<CategoryL3> categoryL3List;

    public CategoryL1 getCategoryL1() {
        return categoryL1;
    }

    public void setCategoryL1(CategoryL1 categoryL1) {
        this.categoryL1 = categoryL1;
    }

    public List<CategoryL3> getCategoryL3List() {
        return categoryL3List;
    }

    public void setCategoryL3List(List<CategoryL3> categoryL3List) {
        this.categoryL3List = categoryL3List;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
