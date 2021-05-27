package com.example.mini_projet.service;

import com.example.mini_projet.dao.entity.Client;
import com.example.mini_projet.dao.repository.IClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServicelmpl implements IClientService{
    @Autowired
    private IClientRepository iClientRepository;

    @Override
    public void addClient(Client Client) {
        iClientRepository.save(Client);
    }

    @Override
    public void updateClient(Client Client) {

                iClientRepository.save(Client);

    }

    @Override
    public void deleteClient(Long id) {

            iClientRepository.deleteById(id);

    }

    @Override
    public List<Client> getAll() {
        return iClientRepository.findAll();
    }
}
