package br.com.gfsantos.payroll_api.resources;

import br.com.gfsantos.payroll_api.FeignClients.UserFeing;
import br.com.gfsantos.payroll_api.domain.Payroll;
import br.com.gfsantos.payroll_api.domain.User;
import br.com.gfsantos.payroll_api.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/payments")
public class PlayrollResource {
  private final PayrollService service;
@GetMapping(value ="/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment){

    return  ResponseEntity.ok().body(service.getPayment(workerId, payment));

    }
}
