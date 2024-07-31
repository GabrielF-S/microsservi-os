package br.com.gfsantos.payroll_api.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class User {
    private Long Id;
    private String name;
    private String email;
    private String password;
    private Double hourlyPrice;


}
