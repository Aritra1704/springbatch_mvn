package io.arpaul.springbatch.batch;

import io.arpaul.springbatch.payload.User;
import io.arpaul.springbatch.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("Dta saved for users: " + users);
        userRepository.saveAll(users);
    }
}
