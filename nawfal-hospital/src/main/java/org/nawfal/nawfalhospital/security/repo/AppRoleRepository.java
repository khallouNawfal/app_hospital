package org.nawfal.nawfalhospital.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.nawfal.nawfalhospital.security.entities.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
}