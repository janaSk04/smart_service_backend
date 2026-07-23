package smart.service.system.backend.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smart.service.system.backend.constants.ApplicationConstants;
import smart.service.system.backend.dto.ResponseDto;
import smart.service.system.backend.entity.Role;
import smart.service.system.backend.repository.RoleRepository;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public ResponseDto saveUserRole(Role role) {

        boolean isRoleExist = roleRepository.existsByRoleNameAndIsActiveTrue(role.getRoleName());

        if (isRoleExist) {
            throw new IllegalArgumentException(ApplicationConstants.ROLE_ALREADY_EXIST);
        }

        Role savedRole = roleRepository.save(role);

        return ResponseDto.builder()
                .id(String.valueOf(savedRole.getRoleId()))
                .message(ApplicationConstants.ROLE_ADDED_SUCCESSFULLY)
                .build();
    }

    public List<Role> getAllUserRoleList() {
        return roleRepository.findAllUserRoleList();
    }
}
