package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.CityController;
import com.fastcode.abcaq1.application.extended.city.ICityAppServiceExtended;
import com.fastcode.abcaq1.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.abcaq1.application.extended.country.ICountryAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/city/extended")
public class CityControllerExtended extends CityController {

		public CityControllerExtended(ICityAppServiceExtended cityAppServiceExtended, IAddressAppServiceExtended addressAppServiceExtended, ICountryAppServiceExtended countryAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		cityAppServiceExtended,
    	addressAppServiceExtended,
    	countryAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

