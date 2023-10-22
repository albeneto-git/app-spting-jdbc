package br.com.estudo.jdbc.appspringjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import br.com.estudo.jdbc.appspringjdbc.repository.PersonJdbcDao;

//@SpringBootApplication
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
		logger.info("Pesquisa pessoas id: 4 -> {}", dao.findById(4));
		logger.info("Deletando pessoas id: 4 -> {}", dao.deleteById(4));
		logger.info("Pesquisa todas as pessoas -> {}", dao.findAll());
	}

}
