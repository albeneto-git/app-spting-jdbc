package br.com.estudo.jdbc.appspringjdbc;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.estudo.jdbc.appspringjdbc.model.Person;
import br.com.estudo.jdbc.appspringjdbc.repository.PersonJpaRepository;

@SpringBootApplication
public class AppSpringJpaApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(AppSpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("\nBusca Persoa id: 1001 -> {}", repository.findById(1001));
//		logger.info("\nInserindo uma pessoa-> {}", repository.insert(new Person("Fernandinho", "Santos", new Date())));
//		logger.info("\nAtualizando uma pessoa id: 1001 -> {}", repository.update(new Person(1001, "Valdemar", "Amazonas", new Date())));
//		logger.info("\nBusca Persoa id: 1 -> {}", repository.findById(1));
//		logger.info("\nBusca Persoa id: 1001 -> {}", repository.findById(1001));
//		repository.deleteById(1005);
		logger.info("\nInserindo uma pessoa-> {}", repository.insert(new Person("Fernandinho", "Santos", new Date())));
		logger.info("\nBusca todas Persoa -> {}", repository.findAll());
	}

}
