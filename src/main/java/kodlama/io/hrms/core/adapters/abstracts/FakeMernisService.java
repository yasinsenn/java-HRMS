package kodlama.io.hrms.core.adapters.abstracts;

import java.time.LocalDate;

public interface FakeMernisService {

	boolean simulatedMernis(String firstName, String lastName,
			String identityNumber, LocalDate birthDate);
}
