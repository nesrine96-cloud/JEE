package com.example.mini_projet.service;

import com.example.mini_projet.dao.entity.Produit;
import com.example.mini_projet.dao.repository.IProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProduitServicelmpl implements IProduitService{
    @Autowired
    private IProduitRepository iProduitRepository;

    @Override
    public void addProduit(Produit Produit) {
        iProduitRepository.save(Produit);
    }

    @Override
    public void updateProduit(Produit Produit) {

                iProduitRepository.save(Produit);

    }

    @Override
    public void deleteProduit(Long id) {

            iProduitRepository.deleteById(id);

    }

    @Override
    public List<Produit> getAll() {
        return iProduitRepository.findAll();
    }
}
