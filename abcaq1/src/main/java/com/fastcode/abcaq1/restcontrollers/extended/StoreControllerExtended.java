package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.StoreController;
import com.fastcode.abcaq1.application.extended.store.IStoreAppServiceExtended;
import com.fastcode.abcaq1.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.abcaq1.application.extended.staff.IStaffAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/store/extended")
public class StoreControllerExtended extends StoreController {

		public StoreControllerExtended(IStoreAppServiceExtended storeAppServiceExtended, IAddressAppServiceExtended addressAppServiceExtended, IStaffAppServiceExtended staffAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		storeAppServiceExtended,
    	addressAppServiceExtended,
    	staffAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

