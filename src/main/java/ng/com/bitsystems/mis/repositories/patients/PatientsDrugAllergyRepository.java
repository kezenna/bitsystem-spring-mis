package ng.com.bitsystems.mis.repositories.patients;

import ng.com.bitsystems.mis.models.patients.PatientDrugAllergy;
import org.springframework.data.repository.CrudRepository;

public interface PatientsDrugAllergyRepository extends CrudRepository<PatientDrugAllergy, Long> {
}
