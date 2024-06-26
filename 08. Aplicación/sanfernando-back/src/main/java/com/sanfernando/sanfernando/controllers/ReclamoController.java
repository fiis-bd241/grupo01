package com.sanfernando.sanfernando.controllers;


import com.sanfernando.sanfernando.dtos.requests.reclamo.ReclamoFormCreateDTO;
import com.sanfernando.sanfernando.services.ReclamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/api/reclamos")
@RequiredArgsConstructor
public class ReclamoController {
    @Autowired
    private ReclamoService reclamoService;

    @PostMapping("/crear")
    public ResponseEntity<String> crearReclamo(@RequestBody ReclamoFormCreateDTO reclamoDTO) {
        try {
            reclamoService.crearReclamo(reclamoDTO);
            return ResponseEntity.ok("Reclamo creado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al crear el reclamo: " + e.getMessage());
        }
    }
}

