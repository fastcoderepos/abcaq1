package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.UserpermissionController;
import com.fastcode.abcaq1.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import com.fastcode.abcaq1.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.abcaq1.application.extended.authorization.user.IUserAppServiceExtended;
import com.fastcode.abcaq1.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/userpermission/extended")
public class UserpermissionControllerExtended extends UserpermissionController {

		public UserpermissionControllerExtended(IUserpermissionAppServiceExtended userpermissionAppServiceExtended, IPermissionAppServiceExtended permissionAppServiceExtended, IUserAppServiceExtended userAppServiceExtended,
	    JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		userpermissionAppServiceExtended,
    	permissionAppServiceExtended,
    	userAppServiceExtended,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

