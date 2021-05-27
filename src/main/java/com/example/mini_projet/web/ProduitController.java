package com.example.mini_projet.web;


import com.example.mini_projet.dao.entity.Produit;
import com.example.mini_projet.service.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/Produit")
public class ProduitController {
    @Autowired
    private IProduitService service;

    @GetMapping("/all")
    public ModelAndView getAllProduit(){
        List<Produit> allProduits = service.getAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Produit-page");
        mv.addObject("Produit",allProduits);
        return mv;
    }

    @PostMapping("/add")
    public void addProduit(@RequestBody Produit Produit){
        service.addProduit(Produit);
    }

    @PutMapping("/update")
    public void updateProduit(@RequestBody Produit Produit){
        service.updateProduit(Produit);
    }

    @DeleteMapping("{id}")
    public void deleteProduit(@PathVariable("id") Long id){
        service.deleteProduit(id);
    }
}
