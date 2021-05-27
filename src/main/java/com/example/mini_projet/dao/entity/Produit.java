package com.example.mini_projet.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "Produit")
public class Produit {


    @Id
    @GeneratedValue
    private Long id ;
    private Integer codeProd;
    private String categorie;
    private Integer quantite;

    @OneToOne
    private Commande commande;


    public Produit(Long id, Integer codeProd, String categorie, Integer quantite, Commande commande) {
        this.id = id;
        this.codeProd = codeProd;
        this.categorie = categorie;
        this.quantite = quantite;
        this.commande = commande;
    }

    public Produit() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodeProd() {
        return codeProd;
    }

    public void setCodeProd(Integer codeProd) {
        this.codeProd = codeProd;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
