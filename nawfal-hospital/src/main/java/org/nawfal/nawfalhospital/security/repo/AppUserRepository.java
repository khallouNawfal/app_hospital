package org.nawfal.nawfalhospital.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.nawfal.nawfalhospital.security.entities.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
