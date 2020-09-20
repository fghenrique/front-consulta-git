package br.com.fabricio.consumirgit.service.impl;

import br.com.fabricio.consumirgit.models.Programadores;
import br.com.fabricio.consumirgit.service.ProgramadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ProgramadoresServiceImpl implements ProgramadoresService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Programadores> findAll() {
        var programadores = Arrays.asList(restTemplate.getForObject("http://localhost:7777/list", Programadores[].class));
        return programadores;
    }

    @Override
    public Programadores findById() {
        return null;
    }
}
