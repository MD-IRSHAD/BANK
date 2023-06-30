package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public String addClient(Client client){
        clientRepository.save(client);
        return "Successfully added";
    }
}
