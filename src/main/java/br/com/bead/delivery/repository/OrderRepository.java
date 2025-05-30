package br.com.bead.delivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bead.delivery.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
