package com.example.demo.service;

import com.example.demo.dto.CusDTO;
import com.example.demo.entity.customer;
import com.example.demo.repo.CusRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CusService {
    @Autowired
    private CusRepo cusRepo;
    @Autowired
    private ModelMapper modelMapper;

    public CusDTO saveUser(CusDTO cusDTO){
        cusRepo.save(modelMapper.map(cusDTO, customer.class));
        return cusDTO;
    }
}
