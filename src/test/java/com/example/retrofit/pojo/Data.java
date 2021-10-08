package com.example.retrofit.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data{

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("id")
	private int id;

	@JsonProperty("avatar")
	private String avatar;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("email")
	private String email;

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLastName() {
		return lastName;
	}

	public int getId() {
		return id;
	}

	public String getAvatar() {
		return avatar;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Data{" +
				"lastName='" + lastName + '\'' +
				", id=" + id +
				", avatar='" + avatar + '\'' +
				", firstName='" + firstName + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}