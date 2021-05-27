package com.example.mini_projet.service;

import com.example.mini_projet.dao.entity.Client;

import java.util.List;

public interface IClientService {

    void addClient(Client client);

    void updateClient(Client client);

    void deleteClient(Long id);

    List<Client> getAll();  
}
