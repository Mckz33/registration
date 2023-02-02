package com.mckz.registration.controllers;

import com.mckz.registration.dtos.EmployeeDto;
import com.mckz.registration.models.EmployeeModel;
import com.mckz.registration.services.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/employee")

public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<EmployeeModel>> fingAll() {
        return ResponseEntity.status(HttpStatus.OK).body(employeeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable(value = "id") UUID id){
        Optional<EmployeeModel> optionalEmployeeModel = employeeService.findById(id);
        if (!optionalEmployeeModel.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(optionalEmployeeModel.get());
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody EmployeeDto employeeDto){
        var employeeModel = new EmployeeModel();
        BeanUtils.copyProperties(employeeDto, employeeModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.save(employeeModel));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete (@PathVariable(value = "id") UUID id) {
        Optional<EmployeeModel> optionalEmployeeModel = employeeService.findById(id);
        if (!optionalEmployeeModel.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found.");
        }
        employeeService.delete(optionalEmployeeModel.get());
        return ResponseEntity.status(HttpStatus.OK).body("Employee delete successfully.");
    }

}
