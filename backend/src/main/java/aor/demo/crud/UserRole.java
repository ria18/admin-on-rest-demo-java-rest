package aor.demo.crud;

import aor.demo.crud.enums.Role;

public class UserRole {



    protected int id;

    public UserRole() {
    }

    public UserRole(int id, Role role) {
        this.id = id;
        this.role = role;
    }

    protected Role role;

    public Role getRole() {
        return role;
    }

}