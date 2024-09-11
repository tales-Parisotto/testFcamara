package github.com.tales_parisotto.backendtestjava.entity;

import org.hibernate.validator.constraints.Range;

import io.micrometer.common.lang.NonNullFields;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NonNullFields
@NoArgsConstructor
@AllArgsConstructor
public class Establishment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String cnpj;

    @Range(min = 1 , message = "Motorcycle spots must be greater than zero")
    private Integer motorcycleSpots;

    @Range(min = 1 , message = "Car spots must be greater than zero")
    private Integer carSpots;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne
    @JoinColumn(name = "phones_id")
    private Phones phones;
}
