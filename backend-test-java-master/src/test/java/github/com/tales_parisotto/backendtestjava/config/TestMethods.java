package github.com.tales_parisotto.backendtestjava.config;

import github.com.tales_parisotto.backendtestjava.DTO.EstablishmentDTO;
import github.com.tales_parisotto.backendtestjava.entity.Address;
import github.com.tales_parisotto.backendtestjava.entity.Establishment;
import github.com.tales_parisotto.backendtestjava.entity.Phones;

public class TestMethods {
 
    public static EstablishmentDTO createEstablishmentDTO() {
        return EstablishmentDTO.builder()
                .name("mockName")
                .cnpj("mockCNPj")
                .address(createAddressEstablishment())
                .phones(createPhonesEstablishment())
                .motorcycleSpots(10)
                .carSpots(10)
                .build();
    }

    public static Establishment createEstablishment() {
        return Establishment.builder()
                .cnpj("mockCNPj")
                .address(createAddressEstablishment())
                .phones(createPhonesEstablishment())
                .motorcycleSpots(10)
                .carSpots(10)
                .build();
    }

    public static Address createAddressEstablishment() {
        return Address.builder()
                .UF("MG")
                .city("Vespasiano")
                .neighborhood("Serra Dourada")
                .street("Serra do Contorno")
                .build();
    }

    public static Phones createPhonesEstablishment() {
        return Phones.builder()
                .phone1("31996709760")
                .phone2("31998288542")
                .build();
    }
}
