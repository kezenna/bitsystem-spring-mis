package ng.com.bitsystems.mis.repositories.laboratories.bloodbank;

import ng.com.bitsystems.mis.models.laboratories.bloodbank.Donations;
import org.springframework.data.repository.CrudRepository;

public interface DonationRepository extends CrudRepository<Donations, Long> {
}
