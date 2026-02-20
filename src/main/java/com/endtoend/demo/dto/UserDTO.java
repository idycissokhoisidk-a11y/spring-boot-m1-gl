package com.endtoend.demo.dto;

import com.endtoend.demo.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends BaseDTO {
    private String email;
    private String firstName;
    private String lastName;
    private Role role;
}
