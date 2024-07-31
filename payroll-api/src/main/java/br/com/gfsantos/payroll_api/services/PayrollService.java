package br.com.gfsantos.payroll_api.services;

import br.com.gfsantos.payroll_api.FeignClients.UserFeing;
import br.com.gfsantos.payroll_api.domain.Payroll;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Slf4j
@Service
public class PayrollService {

    private final Environment env;
    private  final UserFeing feign;
    public Payroll getPayment(Long workerId, Payroll payroll){
        log.info("PAYROLL_SERVICE ::: GET request on " + env.getProperty("local.server.port") + " port");
        try {
            var user = feign.findById(workerId).getBody();
            if (Objects.nonNull(user)){
                return  new Payroll(
                        user.getName(),
                        payroll.getDescription(),
                        user.getHourlyPrice(),
                        payroll.getWorkedHours(),
                        user.getHourlyPrice()* payroll.getWorkedHours()
                        );
            }
        }catch (FeignException.NotFound ex){
            throw  new ObjectNotFoundException("Object not found");

        }catch (Exception ex){
        throw new IllegalArgumentException("Illegal argument Exception");
        }
        return  null;
    }
}
