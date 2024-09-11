package github.com.tales_parisotto.backendtestjava.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import github.com.tales_parisotto.backendtestjava.DTO.EstablishmentDTO;
import github.com.tales_parisotto.backendtestjava.entity.Establishment;
import github.com.tales_parisotto.backendtestjava.exception.BusinessException;
import github.com.tales_parisotto.backendtestjava.repository.EstablishmentRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstablishmentService {

    private final EstablishmentRepository establishmentRepository ;

    public EstablishmentDTO save(EstablishmentDTO estb) {
        if (establishmentRepository.existsByCnpj(estb.getCnpj())) {
            throw new BusinessException("Cpnj is already registered, please contact the administration");
        }

        Establishment estbSaved = establishmentRepository.save(EstablishmentDTO.toOrigin(estb));
        return EstablishmentDTO.toDTO(estbSaved);
    }

    public EstablishmentDTO getReferenceById(Long id) {
        return EstablishmentDTO.toDTO(establishmentRepository.getReferenceById(id));
    }

    public Optional<Establishment> findById(Long id) {
        return establishmentRepository.findById(id);
    }

}
