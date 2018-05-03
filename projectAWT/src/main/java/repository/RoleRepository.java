package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import enumeration.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
