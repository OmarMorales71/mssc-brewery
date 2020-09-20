package omar.springframework.msscbrewery.services;

import omar.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .Id(UUID.randomUUID())
                .name("Omar")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {

        customerDto.setId(UUID.randomUUID());
        return customerDto;
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        System.out.println("Customer "+customerId+" updated!");
    }

    @Override
    public void deleteById(UUID customerId) {
        System.out.println("Customer "+customerId+" deleted!");
    }


}
