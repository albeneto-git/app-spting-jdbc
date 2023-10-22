package br.com.estudo.jdbc.appspringjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.estudo.jdbc.appspringjdbc.repository.PersonJdbcDao;

@SpringBootApplication
public class AppSpringJdbcJpaApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(AppSpringJdbcJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Pesquisa todas as pessoas -> {}", dao.findAll());
	}

}
