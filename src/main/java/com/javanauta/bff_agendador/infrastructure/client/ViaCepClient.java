package com.javanauta.bff_agendador.infrastructure.client;

import com.javanauta.bff_agendador.business.dto.out.ViaCepDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

    @FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
    public interface ViaCepClient {

        @GetMapping("/{cep}/json/")
        ViaCepDTOResponse buscarDadosDeCep(@PathVariable("cep") String cep);
    }
