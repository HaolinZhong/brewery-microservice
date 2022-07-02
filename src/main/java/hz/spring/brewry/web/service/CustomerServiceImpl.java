package hz.spring.brewry.web.service;

import hz.spring.brewry.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID CustomerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("John Doe")
                .build();
    }
}
