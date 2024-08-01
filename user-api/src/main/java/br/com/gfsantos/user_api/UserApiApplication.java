package br.com.gfsantos.user_api;

import br.com.gfsantos.user_api.domain.User;
import br.com.gfsantos.user_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {
	@Autowired
	private  UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(
				new User(null, "Gabriel", "gabrielboni2008@hotmail.com","123",30.0)
		));
	}
}
