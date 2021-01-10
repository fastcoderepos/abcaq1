package com.fastcode.abcaq1.application.extended.customer;

import org.springframework.stereotype.Service;
import com.fastcode.abcaq1.application.core.customer.CustomerAppService;

import com.fastcode.abcaq1.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.abcaq1.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.abcaq1.commons.logging.LoggingHelper;

@Service("customerAppServiceExtended")
public class CustomerAppServiceExtended extends CustomerAppService implements ICustomerAppServiceExtended {

	public CustomerAppServiceExtended(ICustomerRepositoryExtended customerRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,ICustomerMapperExtended mapper,LoggingHelper logHelper) {

		super(customerRepositoryExtended,
		addressRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

