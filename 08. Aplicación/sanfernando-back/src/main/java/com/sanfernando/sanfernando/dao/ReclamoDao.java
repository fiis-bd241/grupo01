package com.sanfernando.sanfernando.dao;

import com.sanfernando.sanfernando.dtos.requests.reclamo.ReclamoFormCreateDTO;

public interface ReclamoDao {
    void insertarReclamo(ReclamoFormCreateDTO reclamoDTO) throws Exception;
}
