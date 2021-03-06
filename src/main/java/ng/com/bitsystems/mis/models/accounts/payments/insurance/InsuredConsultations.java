package ng.com.bitsystems.mis.models.accounts.payments.insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InsuredConsultations extends InsuranceTransactions {

    @ManyToOne
    @JoinColumn(name = "bookconsultation_id")
    private BookConsultation bookConsultation;
}
