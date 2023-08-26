package com.koushik.SpringSecurityWithJWT.Repository;

import com.koushik.SpringSecurityWithJWT.Domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<AppUser, Long> {
    
}
