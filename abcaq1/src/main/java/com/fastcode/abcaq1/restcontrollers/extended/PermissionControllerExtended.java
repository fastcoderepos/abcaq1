package com.fastcode.abcaq1.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.abcaq1.restcontrollers.core.PermissionController;
import com.fastcode.abcaq1.application.extended.authorization.permission.IPermissionAppServiceExtended;
import com.fastcode.abcaq1.application.extended.authorization.rolepermission.IRolepermissionAppServiceExtended;
import com.fastcode.abcaq1.application.extended.authorization.userpermission.IUserpermissionAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/permission/extended")
public class PermissionControllerExtended extends PermissionController {

		public PermissionControllerExtended(IPermissionAppServiceExtended permissionAppServiceExtended, IRolepermissionAppServiceExtended rolepermissionAppServiceExtended, IUserpermissionAppServiceExtended userpermissionAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		permissionAppServiceExtended,
    	rolepermissionAppServiceExtended,
    	userpermissionAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

