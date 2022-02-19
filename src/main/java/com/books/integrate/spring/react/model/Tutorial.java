package com.books.integrate.spring.react.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tutorials")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Tutorial {

	@Id
	@Column(name = "id")
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "published")
	private boolean published;

	@Column(name = "price")
	private Double price;

	public Tutorial(String title, String description, boolean b, Double price) {
	}

}
