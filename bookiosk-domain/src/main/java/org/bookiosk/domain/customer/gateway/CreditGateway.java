package org.bookiosk.domain.customer.gateway;

import org.bookiosk.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
