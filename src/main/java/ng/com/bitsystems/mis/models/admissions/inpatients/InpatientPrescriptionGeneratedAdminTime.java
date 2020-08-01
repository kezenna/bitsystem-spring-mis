package ng.com.bitsystems.mis.models.admissions.inpatients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InpatientPrescriptionGeneratedAdminTime  extends BaseEntity {

     private InpatientPrescriptionSchedule schedule;
     private LocalDate extimatedAdminTime;

}


