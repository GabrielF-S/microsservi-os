package br.com.gfsantos.payroll_api.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter @Setter
@AllArgsConstructor
public class StandarError {
    private LocalDate timestemp;
    private String erros;
    private Integer status;

    private String path;

}
