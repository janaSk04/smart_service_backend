package smart.service.system.backend.converter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import smart.service.system.backend.dto.RoleDto;
import smart.service.system.backend.entity.Role;

@Component
@RequiredArgsConstructor
public class RoleConverter {

    public RoleDto convert(Role role) {
        return RoleDto.builder()
                .roleId(role.getRoleId())
                .roleName(role.getRoleName())
                .isActive(role.getIsActive())
                .build();
    }

    public Role convert(RoleDto roleDto) {
        return Role.builder()
                .roleId(roleDto.getRoleId())
                .roleName(roleDto.getRoleName())
                .isActive(Boolean.TRUE)
                .build();
    }

}
