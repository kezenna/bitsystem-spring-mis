package ng.com.bitsystems.mis.models.transactions.vaccination;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.Service;
import ng.com.bitsystems.mis.models.vaccination.Vaccines;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationTransactionsDetails extends Service {

     @ManyToOne()
     @JoinColumn(name = "vaccinationtransaction_id")
     private VaccinationTransaction vaccinationTransaction;

     @ManyToOne
     @JoinColumn(name = "vaccinations_id")
     private Vaccines vaccinations;

}


