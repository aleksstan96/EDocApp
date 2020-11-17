package com.lakica.demo.dao;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.lakica.demo.entity.Mime;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel  = "mimes",  path = "mimes")
public interface MimeRepository extends JpaRepository<Mime, Integer>{
	
	
	public Page<Mime> findByNaziv(@RequestParam("naziv") String naziv, Pageable pageable);
	
}