package omar.springframework.msscbrewery.web.mappers;

import omar.springframework.msscbrewery.domain.Customer;
import omar.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
