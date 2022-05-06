package io.arpaul.springbatch.batch;

import io.arpaul.springbatch.payload.UserAddress;
import io.arpaul.springbatch.payload.UserState;
import io.arpaul.springbatch.utils.Constants;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
public class ProcessorUserState implements ItemProcessor<UserAddress, UserState> {

    private  static final LinkedHashMap<String, String> states = new LinkedHashMap<>();

    private static int count = 0;
    public ProcessorUserState() {
    }

    @Override
    public UserState process(UserAddress userAddress) throws Exception {
        UserState userState = new UserState(userAddress.getState(), Constants.getStateNames().get(userAddress.getState()));
        return userState;
    }
}
