package com.proyectoTFG.PoyectoTFG.services;

import java.util.List;

import com.proyectoTFG.PoyectoTFG.entities.Compra;

public interface CompraService {
    List<Compra> findAll();
    Compra findById(Integer id);
    Compra save(Compra compra);
    void deleteById(Integer id);
}
