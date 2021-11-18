package com.challenge.apiclients.service;

import com.challenge.apiclients.dao.ClientDAO;
import com.challenge.apiclients.entity.Client;
import com.challenge.apiclients.helper.StandardDeviater;
import com.challenge.apiclients.model.ClientDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientDAO clientDAO;

    public ClientServiceImpl(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    public void createClient(ClientDTO client) {
        Client entity = this.toClientEntity(client);
        clientDAO.save(entity);
    }

    @Override
    public Double getAverage() {
        return clientDAO.findAll().stream()
                .mapToDouble(Client::getAge)
                .average()
                .orElse(Double.NaN);
    }

    @Override
    public Double getStandardDeviation() {
        return clientDAO.findAll()
                .stream()
                .map(c -> c.getAge().doubleValue())
                .collect(Collector.of(
                    StandardDeviater::new,
                    StandardDeviater::accept,
                    StandardDeviater::combine,
                    StandardDeviater::getStandardDeviation
                ));
    }

    @Override
    public List<Client> listAll() {
        return clientDAO.findAll();
    }

    private Client toClientEntity(ClientDTO clientReq) {
        return new Client(null, clientReq.getName(), clientReq.getLastName(), clientReq.getBirthDate());
    }
}
