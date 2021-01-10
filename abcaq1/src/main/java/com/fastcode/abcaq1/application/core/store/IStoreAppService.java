package com.fastcode.abcaq1.application.core.store;

import org.springframework.data.domain.Pageable;
import com.fastcode.abcaq1.application.core.store.dto.*;
import com.fastcode.abcaq1.commons.search.SearchCriteria;

import java.util.*;

public interface IStoreAppService {
	
	//CRUD Operations
	
	CreateStoreOutput create(CreateStoreInput store);

    void delete(Integer id);

    UpdateStoreOutput update(Integer id, UpdateStoreInput input);

    FindStoreByIdOutput findById(Integer id);

    List<FindStoreByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
	//Relationship Operations
	//Relationship Operations
    
    GetAddressOutput getAddress(Integer storeid);
    
    GetStaffOutput getStaff(Integer storeid);
    
    //Join Column Parsers
}
