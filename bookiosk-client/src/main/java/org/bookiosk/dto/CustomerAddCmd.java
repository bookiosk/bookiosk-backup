package org.bookiosk.dto;

import org.bookiosk.dto.data.CustomerDTO;
import lombok.Data;

@Data
public class CustomerAddCmd{

    private CustomerDTO customerDTO;

}
