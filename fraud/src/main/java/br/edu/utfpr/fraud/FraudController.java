package br.edu.utfpr.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("fraud/v1/fraud-check")
@RequiredArgsConstructor
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @PostMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckService
                .isFraudCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }


}
