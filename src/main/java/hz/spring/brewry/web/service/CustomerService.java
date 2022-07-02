package hz.spring.brewry.web.service;

import hz.spring.brewry.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {

    CustomerDTO getCustomerById(UUID CustomerId);

    CustomerDTO saveNewCustomer(CustomerDTO customerDTO);

    void update(UUID customerId, CustomerDTO customerDTO);

    void deleteById(UUID beerId);
}
