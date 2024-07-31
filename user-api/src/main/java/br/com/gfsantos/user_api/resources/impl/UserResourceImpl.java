package br.com.gfsantos.user_api.resources.impl;

import br.com.gfsantos.user_api.domain.User;
import br.com.gfsantos.user_api.resources.UserResource;
import br.com.gfsantos.user_api.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource {
    @Autowired
    private final UserService service;
    @Override
    public ResponseEntity<?> findById(Long id) {
        return  ResponseEntity.ok().body(service.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(service.findAll());
    }
}
