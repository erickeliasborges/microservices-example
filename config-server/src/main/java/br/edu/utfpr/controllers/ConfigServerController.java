package br.edu.utfpr.controllers;

import br.edu.utfpr.entity.ConfigServerEntity;
import br.edu.utfpr.request.ConfigServerRequest;
import br.edu.utfpr.services.ConfigServerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("v1/config-server/new-configuration")
public record ConfigServerController(ConfigServerService configServerService) {

    @PostMapping
    public void newConfiguration(@RequestBody ConfigServerRequest configServerRequest) {
        configServerService.saveConfig(configServerRequest);
    }

}
