package com.example.TrabalhoAPI1.repository;
import com.example.TrabalhoAPI1.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {}