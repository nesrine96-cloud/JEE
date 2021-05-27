package com.example.mini_projet.service;

import com.example.mini_projet.dao.entity.Produit;

import java.util.List;

public interface IProduitService {
    void addProduit(Produit produit);

    void updateProduit(Produit produit);

    void deleteProduit(Long id);

    List<Produit> getAll();
}
