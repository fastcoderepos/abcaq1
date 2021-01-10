package com.fastcode.abcaq1.application.core.category;

import org.springframework.data.domain.Pageable;
import com.fastcode.abcaq1.application.core.category.dto.*;
import com.fastcode.abcaq1.commons.search.SearchCriteria;

import java.util.*;

public interface ICategoryAppService {
	
	//CRUD Operations
	
	CreateCategoryOutput create(CreateCategoryInput category);

    void delete(Integer id);

    UpdateCategoryOutput update(Integer id, UpdateCategoryInput input);

    FindCategoryByIdOutput findById(Integer id);

    List<FindCategoryByIdOutput> find(SearchCriteria search, Pageable pageable) throws Exception;
    
    //Join Column Parsers

	Map<String,String> parseFilmCategorysJoinColumn(String keysString);
}

