package com.challenge.apiclients.service;

import com.challenge.apiclients.entity.Client;
import com.challenge.apiclients.model.ClientDTO;

import java.util.List;

public interface ClientService {

    void createClient(ClientDTO client);

    Double getAverage();

    Double getStandardDeviation();

    List<Client> listAll();
}
