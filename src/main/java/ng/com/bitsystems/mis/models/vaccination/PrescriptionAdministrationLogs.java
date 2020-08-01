package ng.com.bitsystems.mis.models.vaccination;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PrecriptionAdministration;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PrescriptionAdministrationLogs extends PrecriptionAdministration {
     private VaccinationTransaction vaccinationTransaction;
}


