package br.com.bead.delivery.service;

import org.springframework.stereotype.Service; // Define esta classe como Service.
import br.com.bead.delivery.repository.OrderRepository;
import br.com.bead.delivery.model.Order;
import br.com.bead.delivery.dto.OrderDTO;
import br.com.bead.delivery.dto.OrderRequest;
import org.modelmapper.ModelMapper; // Facilita o mapeamento entre objetos.

import java.time.LocalDateTime;

@Service
public class OrderService {
  private final OrderRepository repo;
  private final ModelMapper mapper;

  public OrderService(OrderRepository repo, ModelMapper mapper) {
    this.repo = repo;
    this.mapper = mapper;
  }

  public OrderDTO createOrder(OrderRequest req) {
    Order order = new Order(); // Cria nova instância da entidade
    order.setCustomerName(req.getCustomerName());
    order.setTotalAmount(req.getTotalAmount());
    order.setCreatedAt(LocalDateTime.now()); // Define o horário atual.
    // Salva no banco de dados.
    Order saved = repo.save(order);

    // Converte a entidade salva para DTO e retorna.
    return mapper.map(saved, OrderDTO.class);
  }

}
