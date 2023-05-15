package com.devsuperior.desafiocomponentes.services;

import com.devsuperior.desafiocomponentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() >= 100.0 & order.getBasic() <= 200.00) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}
