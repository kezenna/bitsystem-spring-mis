package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;

/**
 * LaboratoryPackageDetails generated by hbm2java
 */


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class LaboratoryPackageDetails  extends BaseEntity {

     private Packages packages;
     private LaboratoryInvestigations laboratoryInvestigations;


}

