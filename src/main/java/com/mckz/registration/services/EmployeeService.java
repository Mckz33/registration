package com.mckz.registration.services;

import com.mckz.registration.models.EmployeeModel;
import com.mckz.registration.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeModel> findAll(){
        return employeeRepository.findAll();
    }

    public Optional<EmployeeModel> findById(UUID id) {
        return employeeRepository.findById(id);
    }

    @Transactional
    public EmployeeModel save(EmployeeModel employeeModel){
        return employeeRepository.save(employeeModel);
    }

    @Transactional
    public void delete(EmployeeModel employeeModel) {
        employeeRepository.delete(employeeModel);
    }
}
