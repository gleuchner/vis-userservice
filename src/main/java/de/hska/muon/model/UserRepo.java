package de.hska.muon.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    @Query(value = "select u from User u where u.username = ?1")
    public Iterable<User> findByUsername(String userName);
}
