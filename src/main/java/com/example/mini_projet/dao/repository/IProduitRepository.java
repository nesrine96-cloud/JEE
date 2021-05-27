package com.example.mini_projet.dao.repository;

import com.example.mini_projet.dao.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduitRepository extends JpaRepository<Produit,Long> {
}
