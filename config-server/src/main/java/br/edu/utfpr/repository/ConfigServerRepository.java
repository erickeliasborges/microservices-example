package br.edu.utfpr.repository;

import br.edu.utfpr.entity.ConfigServerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigServerRepository extends JpaRepository<ConfigServerEntity, Integer> {
}
