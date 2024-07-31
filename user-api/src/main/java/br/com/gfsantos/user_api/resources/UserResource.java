package br.com.gfsantos.user_api.resources;

import br.com.gfsantos.user_api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface UserResource {
    @GetMapping(value = "/{id}")
    ResponseEntity<?> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<User>> findAll();
}