package ng.com.bitsystems.mis.models.accounts.payments;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1



/**
 * AccountsOtherServiceBillingsPayments generated by hbm2java
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.OtherServices;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OtherServicePayments extends Payments {

     @ManyToOne
     private OtherServices otherServices;
}


