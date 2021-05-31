package kodlama.io.hrms.core.adapters.concretes;

import java.time.LocalDate;

import kodlama.io.hrms.core.adapters.abstracts.FakeMernisService;

public class FakeMernisManager implements FakeMernisService {

	@Override
	public boolean simulatedMernis(String firstName, String lastName, String identityNumber, LocalDate birthDate) {
		System.out.println("Mernis doğrulaması başarılı");
		return true;
	}

	

}
