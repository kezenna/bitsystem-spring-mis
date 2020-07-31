package ng.com.bitsystems.mis.models.pharmacy;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PrecriptionAdministration extends BaseEntity {
    private Users users;
    private Date administrationTime;
    private String commentObservation;
}