package com.example.mini_projet.web;


import com.example.mini_projet.dao.entity.Client;
import com.example.mini_projet.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/Client")
public class ClientController {

    @Autowired
    private IClientService service;

    @GetMapping("/all")
    public ModelAndView getAllClient(){
        List<Client> allClients = service.getAll();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Client-page");
        mv.addObject("Client",allClients);
        return mv;
    }

    @PostMapping("/add")
    public void addClient(@RequestBody Client Client){
        service.addClient(Client);
    }

    @PutMapping("/update")
    public void updateClient(@RequestBody Client Client){
        service.updateClient(Client);
    }

    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable("id") Long id){
        service.deleteClient(id);
    }
}
