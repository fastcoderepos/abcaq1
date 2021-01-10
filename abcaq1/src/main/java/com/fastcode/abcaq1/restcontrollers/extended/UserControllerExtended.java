package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.UserController;
import com.fastcode.abcaq1.application.extended.authorization.user.IUserAppServiceExtended;
import com.fastcode.abcaq1.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import com.fastcode.abcaq1.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.fastcode.abcaq1.security.JWTAppService;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/user/extended")
public class UserControllerExtended extends UserController {

		public UserControllerExtended(IUserAppServiceExtended userAppServiceExtended, IUserpermissionAppServiceExtended userpermissionAppServiceExtended, IUserroleAppServiceExtended userroleAppServiceExtended,
	    PasswordEncoder pEncoder,JWTAppService jwtAppService, LoggingHelper helper, Environment env) {
		super(
		userAppServiceExtended,
    	userpermissionAppServiceExtended,
    	userroleAppServiceExtended,
	    pEncoder,
	    jwtAppService,
		helper, env);
	}

	//Add your custom code here

}

