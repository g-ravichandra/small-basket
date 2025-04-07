package com.ravi.kalyani.small_basket.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoryl1")
public class CategoryL1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "categoryL1", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<CategoryL2> categoryL2List;

    public List<CategoryL2> getCategoryL2List() {
        return categoryL2List;
    }

    public void setCategoryL2List(List<CategoryL2> categoryL2List) {
        this.categoryL2List = categoryL2List;
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
