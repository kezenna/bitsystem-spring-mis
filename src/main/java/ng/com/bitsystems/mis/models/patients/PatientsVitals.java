package ng.com.bitsystems.mis.models.patients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1



/**
 * PatientsVitals generated by hbm2java
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsVitals  extends BaseEntity {

     private Patients patients;
     private Double height;
     private String bloodPresure;
     private String pulseRate;
     private Double weight;
     private String bloodSugar;
     private Double tempreture;
     private LocalDateTime localDateTime;

}


