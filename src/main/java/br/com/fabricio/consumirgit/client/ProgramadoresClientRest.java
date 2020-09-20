package br.com.fabricio.consumirgit.client;

import br.com.fabricio.consumirgit.models.Programadores;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "api.git", url="localhost:7777" )
public interface ProgramadoresClientRest {

    @GetMapping("/list")
    List<Programadores> list();
}
