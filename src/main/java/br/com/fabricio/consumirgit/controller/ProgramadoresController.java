package br.com.fabricio.consumirgit.controller;

import br.com.fabricio.consumirgit.models.Programadores;
import br.com.fabricio.consumirgit.service.ProgramadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProgramadoresController {

    @Autowired
    private ProgramadoresService prcService;

    @GetMapping("list")
    public List<Programadores> list(){
        return prcService.findAll();
    }
}
