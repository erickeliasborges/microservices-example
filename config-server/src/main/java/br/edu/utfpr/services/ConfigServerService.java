package br.edu.utfpr.services;

import br.edu.utfpr.entity.ConfigServerEntity;
import br.edu.utfpr.repository.ConfigServerRepository;
import br.edu.utfpr.request.ConfigServerRequest;
import org.springframework.stereotype.Service;

@Service
public record ConfigServerService(ConfigServerRepository configServerRepository) {

    public void saveConfig(ConfigServerRequest configServerRequest) {
        ConfigServerEntity configServerEntity =
                ConfigServerEntity.builder()
                        .application(configServerRequest.application())
                        .profile(configServerRequest.profile())
                        .label(configServerRequest.label())
                        .key(configServerRequest.key())
                        .value(configServerRequest.value())
                        .build();
        configServerRepository.saveAndFlush(configServerEntity);
    }

}
