package com.heycristhian.hroauth.entities;

import java.io.Serializable;

public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
