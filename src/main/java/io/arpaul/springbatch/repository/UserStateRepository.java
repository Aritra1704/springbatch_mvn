package io.arpaul.springbatch.repository;

import io.arpaul.springbatch.payload.UserState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStateRepository extends JpaRepository<UserState, Long> {
}
