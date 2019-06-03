package com.awstest.services.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CUSTOMER")
public class CustomerEntity extends AbstractTimestampEntity {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "id_seq_gen", sequenceName = "customer_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_seq_gen")
	private long id;

	@Column(name = "COMPANYNAME", columnDefinition = "VARCHAR(255)", nullable = true)
	private String companyname;

	@Column(name = "CONTACTNAME", columnDefinition = "VARCHAR(255)", nullable = false)
	private String contactname;

	@Column(name = "CONTACTEMAIL", columnDefinition = "VARCHAR(100)", nullable = false)
	private String contactemail;

	@Column(name = "PUBLICKEYCONFIRMED", columnDefinition = "TINYINT(1)", nullable = false)
	private boolean publickeyconfirmed;

	@Column(name = "UNIQUECUSTOMERID", columnDefinition = "VARCHAR(255)", nullable = true)
	private String uniquecustomerid;

	@Column(name = "HSMUSERID", columnDefinition = "VARCHAR(255)", nullable = true)
	private String hsmuserid;

}
