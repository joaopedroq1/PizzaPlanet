package com.example.TrabalhoAPI1.repository;
import com.example.TrabalhoAPI1.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}