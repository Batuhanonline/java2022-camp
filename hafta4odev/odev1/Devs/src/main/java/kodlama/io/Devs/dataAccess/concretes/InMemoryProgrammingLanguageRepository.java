package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> languages;
	
	

	public InMemoryProgrammingLanguageRepository() {
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "C#"));
		languages.add(new ProgrammingLanguage(2, "Java"));
		languages.add(new ProgrammingLanguage(3, "Python"));
	}
	
	



	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}





	@Override
	public ProgrammingLanguage getLanguage(int id) {
		for (ProgrammingLanguage programmingLanguage : languages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}





	@Override
	public ProgrammingLanguage addLanguage(ProgrammingLanguage language) {
		languages.add(new ProgrammingLanguage(language.getId(), language.getName()));
		return language;
	}





	@Override
	public ProgrammingLanguage deleteLanguage() {
		// TODO Auto-generated method stub
		return null;
	}

}
