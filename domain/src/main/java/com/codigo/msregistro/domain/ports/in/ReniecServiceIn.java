package com.codigo.msregistro.domain.ports.in;

import com.codigo.msregistro.domain.aggregates.response.ResponseReniec;

public interface ReniecServiceIn {
    ResponseReniec getInfoIn(String numero);
}
