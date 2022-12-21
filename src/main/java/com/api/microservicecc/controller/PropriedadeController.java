package com.api.microservicecc.controller;

import com.api.microservicecc.model.Propriedade;
import com.api.microservicecc.repository.PropriedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropriedadeController {

    private final PropriedadeRepository repository;

    public PropriedadeController(PropriedadeRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/find")
    List<Propriedade> findByFiltro ()	{
        return	repository.findAll();
    }

}
