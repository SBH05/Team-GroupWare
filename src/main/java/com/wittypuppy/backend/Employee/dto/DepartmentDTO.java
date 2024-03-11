package com.wittypuppy.backend.Employee.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter@ToString
public class DepartmentDTO {
    private Integer departmentCode;
    private Integer parentDepartmentCode;
    private String departmentName;
}
