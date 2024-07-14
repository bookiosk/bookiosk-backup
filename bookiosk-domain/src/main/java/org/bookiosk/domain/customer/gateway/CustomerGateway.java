package org.bookiosk.domain.customer.gateway;

import org.bookiosk.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
