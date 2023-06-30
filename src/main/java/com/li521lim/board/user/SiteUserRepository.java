package com.li521lim.board.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {
	
	Optional<SiteUser> findByusername(String username);

}
