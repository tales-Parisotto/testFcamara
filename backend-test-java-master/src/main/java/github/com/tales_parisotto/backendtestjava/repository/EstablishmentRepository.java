package github.com.tales_parisotto.backendtestjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import github.com.tales_parisotto.backendtestjava.entity.Establishment;

public interface EstablishmentRepository extends JpaRepository<Establishment, Long>{

    boolean existsByCnpj(String anyString);

}
