package br.com.gfsantos.user_api.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter @Setter
@AllArgsConstructor
public class StandarError {
    private LocalDateTime timestemp;
    private String erros;
    private Integer status;

    private String path;

}
