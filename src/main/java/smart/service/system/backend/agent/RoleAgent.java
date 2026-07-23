package smart.service.system.backend.agent;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smart.service.system.backend.converter.RoleConverter;
import smart.service.system.backend.dto.ResponseDto;
import smart.service.system.backend.dto.RoleDto;
import smart.service.system.backend.service.RoleService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleAgent {

    private final RoleService roleService;
    private  final RoleConverter roleConverter;

    public ResponseDto saveUserRole(RoleDto roleDto) {
        return roleService.saveUserRole(roleConverter.convert(roleDto));
    }

    public List<RoleDto> getAllUserRoleList() {
        return roleService.getAllUserRoleList().stream().map(roleConverter::convert).toList();
    }
}
