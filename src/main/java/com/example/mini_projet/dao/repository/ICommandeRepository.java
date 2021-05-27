package com.example.mini_projet.dao.repository;

import com.example.mini_projet.dao.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommandeRepository extends JpaRepository<Commande,Long> {
}
