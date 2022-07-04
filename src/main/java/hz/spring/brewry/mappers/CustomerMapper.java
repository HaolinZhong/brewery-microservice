package hz.spring.brewry.mappers;

import hz.spring.brewry.domain.Customer;
import hz.spring.brewry.web.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDTO customerToCustomerDTO(Customer customer);
    Customer customerDTOToCustomer(CustomerDTO customerDTO);
}
