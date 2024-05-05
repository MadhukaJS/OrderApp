package com.example.demo.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CusDTO {
    @Id
    private int cus_id;
    private String cus_name;
    private int cus_age;
}
