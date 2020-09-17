package ua.sekator.taco.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ua.sekator.taco.data.UserRepository;
import ua.sekator.taco.domain.User;

/**
 *
 */
@Slf4j
@Service
public class UserRepositoryUserDetailsService
        implements UserDetailsService {

    private UserRepository userRepo;

    @Autowired
    public UserRepositoryUserDetailsService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    /**
     * У метода loadByUsername () есть одно простое правило: он никогда не должен возвращать null
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user != null) {
            return user;
        }
        log.error("detect wrong password or username");
        throw new UsernameNotFoundException(
                "User '" + username + "' not found");
    }
}