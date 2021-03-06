package io.arpaul.springbatch.batch;

import io.arpaul.springbatch.payload.UserAddress;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ProcessorUserAddress implements ItemProcessor<UserAddress, UserAddress> {
    private static int count = 0;
    public ProcessorUserAddress() {
    }

    @Override
    public UserAddress process(UserAddress userAddress) throws Exception {
        userAddress.setTime(new Date());
        return userAddress;
    }
}
