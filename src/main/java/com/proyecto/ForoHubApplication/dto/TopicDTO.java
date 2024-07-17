package com.proyecto.ForoHubApplication.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TopicDTO {
    @NotBlank
    private String title;
    @NotBlank
    private String message;
    @NotBlank
    private String status;
    @NotBlank
    private String author;
    @NotBlank
    private String course;
}
