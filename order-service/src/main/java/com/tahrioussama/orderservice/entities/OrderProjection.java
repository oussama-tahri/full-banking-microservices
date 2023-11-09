package com.tahrioussama.orderservice.entities;

import com.tahrioussama.orderservice.enums.OrderStatus;
import org.springframework.data.rest.core.config.Projection;
import java.util.Date;
@Projection(name="fullOrder",types = Order.class)
public interface OrderProjection {
    Long getId();
    Date getCreatedAt();
    Long getCustomerId();
    OrderStatus getStatus();
}
