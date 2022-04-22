package team.project.WhatToEatToday.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class EatingHouseForm {

    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String name;
    private String tel;
    private String address;
    private String addressDetail;
}