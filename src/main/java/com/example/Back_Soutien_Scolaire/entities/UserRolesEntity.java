package com.example.Back_Soutien_Scolaire.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "user_roles", schema = "test_db")

public class UserRolesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
  @Column(name = "role_id")
    private long roleId;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "roe_id")
    private long roeId;

    public long getRoeId() {
        return roeId;
    }

    public void setRoeId(long roeId) {
        this.roeId = roeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRolesEntity that = (UserRolesEntity) o;

        if (roleId != that.roleId) return false;
        if (roeId != that.roeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (roleId ^ (roleId >>> 32));
        result = 31 * result + (int) (roeId ^ (roeId >>> 32));
        return result;
    }
}
