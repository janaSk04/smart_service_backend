package smart.service.system.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private Long userId;
    private String fullName;
    private String email;
    private String password;
    private Long roleId;
    private String roleName;
    private Long zoneDepartmentId;
    private String zoneDepartmentName;
    private String status;
    private Boolean isActive;
    private Long agentUserId;
}
