package com.challenge.apiclients.dao;

import com.challenge.apiclients.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDAO extends JpaRepository<Client, Long> {
}
