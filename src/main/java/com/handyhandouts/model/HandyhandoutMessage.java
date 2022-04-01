package com.handyhandouts.model;

import javax.persistence.*;




@Entity
@Table(name="handyhandout_message",uniqueConstraints = {
		@UniqueConstraint(columnNames = "id")
})
public class HandyhandoutMessage {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
     @Column(name="name",length=255)
     private String name;
     
     @Column(name="message")
     private String message;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
