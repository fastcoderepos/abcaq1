package com.fastcode.abcaq1.application.extended.authorization.userrole;

import org.springframework.stereotype.Service;
import com.fastcode.abcaq1.application.core.authorization.userrole.UserroleAppService;

import com.fastcode.abcaq1.domain.extended.authorization.userrole.IUserroleRepositoryExtended;
import com.fastcode.abcaq1.domain.extended.authorization.role.IRoleRepositoryExtended;
import com.fastcode.abcaq1.domain.extended.authorization.user.IUserRepositoryExtended;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@Service("userroleAppServiceExtended")
public class UserroleAppServiceExtended extends UserroleAppService implements IUserroleAppServiceExtended {

	public UserroleAppServiceExtended(IUserroleRepositoryExtended userroleRepositoryExtended,
				IRoleRepositoryExtended roleRepositoryExtended,IUserRepositoryExtended userRepositoryExtended,IUserroleMapperExtended mapper,LoggingHelper logHelper) {

		super(userroleRepositoryExtended,
		roleRepositoryExtended,userRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

