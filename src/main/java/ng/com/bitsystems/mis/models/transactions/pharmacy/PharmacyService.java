package ng.com.bitsystems.mis.models.transactions.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.Sales;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyService extends Sales {

     private PharmacyProducts pharmacyProducts;
     private PharmacyTransaction pharmacyTransaction;
     private Double qty;
     private Set pharmacyPromoProductRecivedLogses = new HashSet(0);
     private Set pharmacyTransactionsAdditionalDetailses = new HashSet(0);

}

