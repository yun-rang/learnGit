package com.example.demo.entity.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishPageObject {
    private int currentPage = 1;
    private int pageSize = 5;
    public int getStart() {
        return (currentPage - 1) * pageSize;
    }
}
