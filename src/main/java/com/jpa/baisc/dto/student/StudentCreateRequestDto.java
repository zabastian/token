package com.jpa.baisc.dto.student;

import lombok.Getter;

@Getter
public class StudentCreateRequestDto {
    private String studentName;
    private Long courseId;
}
