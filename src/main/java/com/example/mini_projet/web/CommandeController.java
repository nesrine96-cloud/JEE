package com.example.mini_projet.web;

import com.example.mini_projet.dao.entity.Commande;
import com.example.mini_projet.service.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/Commande")
public class CommandeController {

    @Autowired
    private ICommandeService service;

    @GetMapping("/all")
    public ModelAndView getAllCommande(){
        List<Commande> allCommandes = service.getAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Commande-page");
        mv.addObject("Commande",allCommandes);
        return mv;
    }

    @PostMapping("/add")
    public void addCommande(@RequestBody Commande commande){
        service.addCommande(commande);
    }

    @PutMapping("/update")
    public void updateCommande(@RequestBody Commande Commande){
        service.updateCommande(Commande);
    }

    @DeleteMapping("{id}")
    public void deleteCommande(@PathVariable("id") Long id){
        service.deleteCommande(id);
    }
}
