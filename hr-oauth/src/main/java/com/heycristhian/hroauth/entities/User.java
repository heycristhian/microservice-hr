package com.heycristhian.hroauth.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	private String password;
	private Set<Role> roles = new HashSet<>();

	@Deprecated
	User() {
	}

	public User(UserBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.email = builder.email;
		this.password = builder.password;
	}

	public static UserBuilder builder() {
		return new UserBuilder();
	}

	public static class UserBuilder {
		private Long id;
		private String name;
		private String email;
		private String password;

		public UserBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public UserBuilder name(String name) {
			this.name = name;
			return this;
		}

		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}

		public UserBuilder password(String password) {
			this.password = password;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

}
