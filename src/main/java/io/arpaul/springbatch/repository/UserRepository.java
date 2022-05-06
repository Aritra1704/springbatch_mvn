package io.arpaul.springbatch.repository;

import io.arpaul.springbatch.payload.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
