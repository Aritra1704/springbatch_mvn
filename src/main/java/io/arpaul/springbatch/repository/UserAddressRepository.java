package io.arpaul.springbatch.repository;

import io.arpaul.springbatch.payload.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress, String> {
}
