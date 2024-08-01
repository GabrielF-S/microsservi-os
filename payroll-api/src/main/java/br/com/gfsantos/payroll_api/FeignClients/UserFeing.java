package br.com.gfsantos.payroll_api.FeignClients;

import br.com.gfsantos.payroll_api.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-api")
public interface UserFeing {
    @GetMapping(value = "api/users/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<User> findAll();
}
