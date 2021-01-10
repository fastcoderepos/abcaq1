package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.CategoryController;
import com.fastcode.abcaq1.application.extended.category.ICategoryAppServiceExtended;
import com.fastcode.abcaq1.application.extended.filmcategory.IFilmCategoryAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/category/extended")
public class CategoryControllerExtended extends CategoryController {

		public CategoryControllerExtended(ICategoryAppServiceExtended categoryAppServiceExtended, IFilmCategoryAppServiceExtended filmCategoryAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		categoryAppServiceExtended,
    	filmCategoryAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

