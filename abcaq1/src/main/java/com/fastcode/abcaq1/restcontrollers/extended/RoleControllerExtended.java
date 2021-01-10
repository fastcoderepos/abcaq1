package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.RoleController;
import com.fastcode.abcaq1.application.extended.authorization.role.IRoleAppServiceExtended;
import com.fastcode.abcaq1.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.abcaq1.application.extended.authorization.userrole.IUserroleAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/role/extended")
public class RoleControllerExtended extends RoleController {

		public RoleControllerExtended(IRoleAppServiceExtended roleAppServiceExtended, IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IUserroleAppServiceExtended userroleAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		roleAppServiceExtended,
    	rolepermissionAppServiceExtended,
    	userroleAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

