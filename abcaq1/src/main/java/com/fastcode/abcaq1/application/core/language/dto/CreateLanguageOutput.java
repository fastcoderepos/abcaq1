package com.fastcode.abcaq1.application.core.language.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreateLanguageOutput {

    private Integer languageId;
    private LocalDateTime lastUpdate;
    private String name;

}

