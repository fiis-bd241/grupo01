package com.sanfernando.sanfernando.services.serviceImpl;

import com.sanfernando.sanfernando.dao.ReclamoDao;
import com.sanfernando.sanfernando.dtos.requests.reclamo.ReclamoFormCreateDTO;
import com.sanfernando.sanfernando.services.ReclamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReclamoServiceImpl implements ReclamoService {
    @Autowired
    private ReclamoDao reclamoDao;

    @Override
    public void crearReclamo(ReclamoFormCreateDTO reclamoDTO) throws Exception {
        reclamoDao.insertarReclamo(reclamoDTO);
    }
}
