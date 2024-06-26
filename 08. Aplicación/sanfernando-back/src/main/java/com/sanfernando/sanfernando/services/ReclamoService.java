package com.sanfernando.sanfernando.services;

import com.sanfernando.sanfernando.dtos.requests.reclamo.ReclamoFormCreateDTO;

public interface ReclamoService {
    void crearReclamo(ReclamoFormCreateDTO reclamoDTO) throws Exception;
}
