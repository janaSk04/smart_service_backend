package smart.service.system.backend.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import smart.service.system.backend.agent.RoleAgent;
import smart.service.system.backend.dto.ResponseDto;
import smart.service.system.backend.dto.RoleDto;

import java.util.List;

@RestController
@RequestMapping("/userRole")
@RequiredArgsConstructor
public class RoleController {

    private final RoleAgent roleAgent;

    @PostMapping("/save")
    public ResponseDto saveUserRole(@RequestBody RoleDto roleDto){
        return roleAgent.saveUserRole(roleDto);
    }

    @GetMapping("/all")
    public List<RoleDto> getAllUserRoleList(){
        return roleAgent.getAllUserRoleList();
    }


}
