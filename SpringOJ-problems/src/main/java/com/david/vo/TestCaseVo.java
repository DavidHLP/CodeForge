package com.david.vo;

import java.util.List;

import com.david.dto.InputDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TestCaseVo {
    private List<InputDto> inputs;
    private String output;
}
