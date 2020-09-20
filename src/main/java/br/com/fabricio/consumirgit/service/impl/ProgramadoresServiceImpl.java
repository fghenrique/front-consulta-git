package br.com.fabricio.consumirgit.service.impl;

import br.com.fabricio.consumirgit.client.ProgramadoresClientRest;
import br.com.fabricio.consumirgit.models.Programadores;
import br.com.fabricio.consumirgit.service.ProgramadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramadoresServiceImpl implements ProgramadoresService {

    @Autowired
    private ProgramadoresClientRest programadoresClientRest;

    @Override
    public List<Programadores> findAll() {
        return programadoresClientRest.list();
    }

    @Override
    public Programadores findById() {
        return null;
    }
}
