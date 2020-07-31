package ng.com.bitsystems.mis.models.users;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class States  extends BaseEntity {

     private String state;
     private int code;
     private Set patientses = new HashSet(0);

}

