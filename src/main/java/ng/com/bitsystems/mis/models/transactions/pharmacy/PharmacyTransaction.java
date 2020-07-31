package ng.com.bitsystems.mis.models.transactions.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyTransaction extends Transaction {

     private Set pharmacyTransactionses = new HashSet(0);

}

