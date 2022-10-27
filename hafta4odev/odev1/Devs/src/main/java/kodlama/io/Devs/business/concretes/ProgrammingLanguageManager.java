package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {		
		return languageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getLanguage(int id) {
		return languageRepository.getLanguage(id);
	}

	@Override
	public ProgrammingLanguage addLanguage(ProgrammingLanguage language) {
		List<ProgrammingLanguage> languages = languageRepository.getAll();
		boolean nameOkey = true;
		for (ProgrammingLanguage programmingLanguage : languages) {
			if(programmingLanguage.getName() == language.getName() || language.getName().isEmpty()) {
				nameOkey = false;
			}
			
			if(nameOkey) {
				languageRepository.addLanguage(language);
			}
		}
		return language;
	}

}
