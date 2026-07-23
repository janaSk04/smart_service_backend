package smart.service.system.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import smart.service.system.backend.entity.Role;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Long> {

    boolean existsByRoleNameAndIsActiveTrue(String roleName);

    @Query("SELECT r FROM Role r WHERE r.isActive = true")
    List<Role> findAllUserRoleList();
}
