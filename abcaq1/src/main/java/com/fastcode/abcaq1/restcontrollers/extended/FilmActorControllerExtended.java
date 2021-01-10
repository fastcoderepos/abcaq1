package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.FilmActorController;
import com.fastcode.abcaq1.application.extended.filmactor.IFilmActorAppServiceExtended;
import com.fastcode.abcaq1.application.extended.actor.IActorAppServiceExtended;
import com.fastcode.abcaq1.application.extended.film.IFilmAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/filmActor/extended")
public class FilmActorControllerExtended extends FilmActorController {

		public FilmActorControllerExtended(IFilmActorAppServiceExtended filmActorAppServiceExtended, IActorAppServiceExtended actorAppServiceExtended, IFilmAppServiceExtended filmAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		filmActorAppServiceExtended,
    	actorAppServiceExtended,
    	filmAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

