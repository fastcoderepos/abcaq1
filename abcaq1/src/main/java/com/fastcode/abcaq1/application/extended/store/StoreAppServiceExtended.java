package com.fastcode.abcaq1.application.extended.store;

import org.springframework.stereotype.Service;
import com.fastcode.abcaq1.application.core.store.StoreAppService;

import com.fastcode.abcaq1.domain.extended.store.IStoreRepositoryExtended;
import com.fastcode.abcaq1.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.abcaq1.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@Service("storeAppServiceExtended")
public class StoreAppServiceExtended extends StoreAppService implements IStoreAppServiceExtended {

	public StoreAppServiceExtended(IStoreRepositoryExtended storeRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IStoreMapperExtended mapper,LoggingHelper logHelper) {

		super(storeRepositoryExtended,
		addressRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

