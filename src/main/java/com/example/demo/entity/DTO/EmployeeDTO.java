package com.example.demo.entity.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "管理员DTO实体类")
@Data
public class EmployeeDTO {
    @Schema(description = "id唯一")
    private Long id;

    private String name;

    private String username;

    private String sex;

    private String idNumber;
}
