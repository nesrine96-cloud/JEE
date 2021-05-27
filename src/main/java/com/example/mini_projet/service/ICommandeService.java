package com.example.mini_projet.service;

import com.example.mini_projet.dao.entity.Commande;

import java.util.List;

public interface ICommandeService {
    void addCommande(Commande commande);

    void updateCommande(Commande commande);

    void deleteCommande(Long id);

    List<Commande> getAll();
}
