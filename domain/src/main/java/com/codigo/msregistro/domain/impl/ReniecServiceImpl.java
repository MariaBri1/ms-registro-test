package com.codigo.msregistro.domain.impl;

import com.codigo.msregistro.domain.aggregates.response.ResponseReniec;
import com.codigo.msregistro.domain.ports.in.ReniecServiceIn;
import com.codigo.msregistro.domain.ports.out.RestReniecOut;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReniecServiceImpl implements ReniecServiceIn {

    private final RestReniecOut reniec;

    @Override
    public ResponseReniec getInfoIn(String numero) {
        return reniec.getInfoReniec(numero);
    }
}
