package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.LanguageController;
import com.fastcode.abcaq1.application.extended.language.ILanguageAppServiceExtended;
import com.fastcode.abcaq1.application.extended.film.IFilmAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/language/extended")
public class LanguageControllerExtended extends LanguageController {

		public LanguageControllerExtended(ILanguageAppServiceExtended languageAppServiceExtended, IFilmAppServiceExtended filmAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		languageAppServiceExtended,
    	filmAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

