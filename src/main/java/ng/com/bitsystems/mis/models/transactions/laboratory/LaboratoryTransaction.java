package ng.com.bitsystems.mis.models.transactions.laboratory;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.laboratories.ObservationQueue;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class LaboratoryTransaction extends Transaction {
     private String presentingComplaint;
     private String provsionalDiagnosis;
     private Set laboratoryTransactionses = new HashSet(0);
     private Set<ObservationQueue> observationQueues = new HashSet<>();
}

