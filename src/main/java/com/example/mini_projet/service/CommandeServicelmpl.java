package com.example.mini_projet.service;

import com.example.mini_projet.dao.entity.Commande;
import com.example.mini_projet.dao.repository.ICommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeServicelmpl implements ICommandeService{
    @Autowired
    private ICommandeRepository iCommandeRepository;

    @Override
    public void addCommande(Commande Commande) {
        iCommandeRepository.save(Commande);
    }

    @Override
    public void updateCommande(Commande Commande) {

                iCommandeRepository.save(Commande);

    }

    @Override
    public void deleteCommande(Long id) {

            iCommandeRepository.deleteById(id);

    }

    @Override
    public List<Commande> getAll() {
        return iCommandeRepository.findAll();
    }
}
