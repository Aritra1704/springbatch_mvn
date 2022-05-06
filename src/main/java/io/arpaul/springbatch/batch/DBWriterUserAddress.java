package io.arpaul.springbatch.batch;

import io.arpaul.springbatch.payload.UserAddress;
import io.arpaul.springbatch.repository.UserAddressRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriterUserAddress implements ItemWriter<UserAddress> {

    @Autowired
    private UserAddressRepository userAddressRepository;

    @Override
    public void write(List<? extends UserAddress> userAddresses) throws Exception {
        userAddressRepository.saveAll(userAddresses);
    }
}
