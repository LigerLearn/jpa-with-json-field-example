package com.ligerlearn.example.rest;

import com.ligerlearn.example.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "people", itemResourceRel = "person", collectionResourceRel = "people")
public interface PersonRestRepository extends JpaRepository<Person, Long> {}
