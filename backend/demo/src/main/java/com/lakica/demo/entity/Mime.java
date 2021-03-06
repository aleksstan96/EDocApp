package com.lakica.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;

@Entity
@Table(name = "mime", schema = "prod")
@Data
public class Mime {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "rbr")
	private String rbr;
	
	@Column(name = "ext")
	private String ext;
	
	@Lob 
	@Column(name = "att64")
	@Type(type = "org.hibernate.type.TextType")
	private String att;
	
	@Column(name = "naziv")
	private String naziv;
}
