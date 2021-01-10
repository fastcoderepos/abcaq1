package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.FilmController;
import com.fastcode.abcaq1.application.extended.film.IFilmAppServiceExtended;
import com.fastcode.abcaq1.application.extended.filmactor.IFilmActorAppServiceExtended;
import com.fastcode.abcaq1.application.extended.filmcategory.IFilmCategoryAppServiceExtended;
import com.fastcode.abcaq1.application.extended.inventory.IInventoryAppServiceExtended;
import com.fastcode.abcaq1.application.extended.language.ILanguageAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/film/extended")
public class FilmControllerExtended extends FilmController {

		public FilmControllerExtended(IFilmAppServiceExtended filmAppServiceExtended, IFilmActorAppServiceExtended filmActorAppServiceExtended, IFilmCategoryAppServiceExtended filmCategoryAppServiceExtended, IInventoryAppServiceExtended inventoryAppServiceExtended, ILanguageAppServiceExtended languageAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		filmAppServiceExtended,
    	filmActorAppServiceExtended,
    	filmCategoryAppServiceExtended,
    	inventoryAppServiceExtended,
    	languageAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

