package smart.service.system.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="user_roles")
@Getter
@Setter
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @Column(name = "role_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "is_active")
    private Boolean isActive;
}
