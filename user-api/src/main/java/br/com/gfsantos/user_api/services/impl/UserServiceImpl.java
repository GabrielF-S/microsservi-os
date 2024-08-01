package br.com.gfsantos.user_api.services.impl;

import br.com.gfsantos.user_api.domain.User;
import br.com.gfsantos.user_api.repositories.UserRepository;
import br.com.gfsantos.user_api.services.UserService;
import br.com.gfsantos.user_api.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepository;
    private final Environment env;
    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: GET request on " + env.getProperty("local.server.port") + " port");
        return   userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
