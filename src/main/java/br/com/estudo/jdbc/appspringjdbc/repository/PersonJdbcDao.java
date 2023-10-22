package br.com.estudo.jdbc.appspringjdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.estudo.jdbc.appspringjdbc.model.Person;

@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;	// representa a conexão com db
	
	public List<Person> findAll(){
		// faz a chamada ao bando de dados
		return jdbcTemplate.query("select * from person", 
					new BeanPropertyRowMapper<Person>(Person.class)); // usa um parseador para traduzir do modelo relacional para o objeto de negócio.
	}
	
	public Person findById(final int id){
		// faz a chamada ao bando de dados por id
		return jdbcTemplate.queryForObject("select * from person where id = ?", new Object[]{id},
					new BeanPropertyRowMapper<Person>(Person.class)); // usa um parseador para traduzir do modelo relacional para o objeto de negócio.
	}
	
	public int deleteById(final int id){
		// faz a chamada ao bando de dados por id
		return jdbcTemplate.update("delete from person where id = ?", new Object[]{id}); // usa um parseador para traduzir do modelo relacional para o objeto de negócio.
	}
}
