package com.heycristhian.hruser.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String roleName;

	@Deprecated
	Role() {
	}

	public Role(RoleBuilder builder) {
		this.id = builder.id;
		this.roleName = builder.roleName;
	}

	public static class RoleBuilder {
		private Long id;
		private String roleName;

		public RoleBuilder id(Long id) {
			this.id = id;
			return this;
		}

		public RoleBuilder roleName(String roleName) {
			this.roleName = roleName;
			return this;
		}

		public Role build() {
			return new Role(this);
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
