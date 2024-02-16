package com.codigo.msregistro.application.controller;

import com.codigo.msregistro.domain.aggregates.response.ResponseReniec;
import com.codigo.msregistro.domain.ports.in.ReniecServiceIn;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/reniec")
@RequiredArgsConstructor
public class ReniecController {

    private final ReniecServiceIn reniecServiceIn;

    @GetMapping("/inforeniec/{numero}")
    public ResponseEntity<ResponseReniec> getInfo(@PathVariable String numero){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(reniecServiceIn.getInfoIn(numero));

    }


}
