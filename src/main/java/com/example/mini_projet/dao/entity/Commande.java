package com.example.mini_projet.dao.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue
    private Long id ;
    private Integer NCom;
    private Date dateCom;
    private String StatCom ;
    @OneToOne
    private Client client;
    @OneToMany
    private List<Produit> produitList ;

    public Commande(Long id, Integer NCom, Date dateCom, String statCom, Client client, List<Produit> produitList) {
        this.id = id;
        this.NCom = NCom;
        this.dateCom = dateCom;
        StatCom = statCom;
        this.client = client;
        this.produitList = produitList;
    }

    public Commande() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNCom() {
        return NCom;
    }

    public void setNCom(Integer NCom) {
        this.NCom = NCom;
    }

    public Date getDateCom() {
        return dateCom;
    }

    public void setDateCom(Date dateCom) {
        this.dateCom = dateCom;
    }

    public String getStatCom() {
        return StatCom;
    }

    public void setStatCom(String statCom) {
        StatCom = statCom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }
}
