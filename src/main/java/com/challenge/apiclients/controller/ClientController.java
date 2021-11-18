package com.challenge.apiclients.controller;

import com.challenge.apiclients.entity.Client;
import com.challenge.apiclients.model.ClientDTO;
import com.challenge.apiclients.model.ResultResponseDTO;
import com.challenge.apiclients.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping(value = "/createcliente")
    public void createClient(@RequestBody ClientDTO clientReq){
        clientService.createClient(clientReq);
    }

    @GetMapping(value= "/kpidclientes")
    public ResponseEntity<ResultResponseDTO> getAverage() {
        Double average = clientService.getAverage();
        Double standardDeviation = clientService.getStandardDeviation();

        ResultResponseDTO resultResponse = new ResultResponseDTO(average, standardDeviation);

        return ResponseEntity.ok(resultResponse);
    }

    @GetMapping("/listclientes")
    public List<Client> getListClient(){
        return clientService.listAll();
    }
}
