package br.com.bead.delivery.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bead.delivery.model.Order;


public class OrderRepository extends JpaRepository<Order, Long> {

    public Order save(Order order) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
