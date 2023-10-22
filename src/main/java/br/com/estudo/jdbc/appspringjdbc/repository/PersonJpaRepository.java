package br.com.estudo.jdbc.appspringjdbc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.estudo.jdbc.appspringjdbc.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQueryPerson = entityManager.createNamedQuery("find_All_Person", Person.class);
		return namedQueryPerson.getResultList();
	}
	public Person findById(final int id) {
		return entityManager.find(Person.class, id);
	}	
	
	public Person update(Person person) {
		return entityManager.merge(person); // update
	}
	
	public Person insert(Person person) {
		return entityManager.merge(person); // insert com sequence
	}
	
	public void deleteById(int id) {
		Person deletePerson = this.findById(id);
		entityManager.remove(deletePerson);
	}
}
