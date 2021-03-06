package com.fastcode.abcaq1.application.core.store;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.fastcode.abcaq1.domain.core.address.AddressEntity;
import com.fastcode.abcaq1.domain.core.staff.StaffEntity;
import com.fastcode.abcaq1.application.core.store.dto.*;
import com.fastcode.abcaq1.domain.core.store.StoreEntity;
import java.time.*;

@Mapper(componentModel = "spring")
public interface IStoreMapper {

   StoreEntity createStoreInputToStoreEntity(CreateStoreInput storeDto);
   
   
   @Mappings({ 
   @Mapping(source = "entity.address.addressId", target = "addressId"),                   
   @Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
   @Mapping(source = "entity.staff.staffId", target = "managerStaffId"),                   
   @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   }) 
   CreateStoreOutput storeEntityToCreateStoreOutput(StoreEntity entity);
   
    StoreEntity updateStoreInputToStoreEntity(UpdateStoreInput storeDto);
    
    @Mappings({ 
    @Mapping(source = "entity.address.addressId", target = "addressId"),                   
    @Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
    @Mapping(source = "entity.staff.staffId", target = "managerStaffId"),                   
    @Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   	}) 
   	UpdateStoreOutput storeEntityToUpdateStoreOutput(StoreEntity entity);

   	@Mappings({ 
   	@Mapping(source = "entity.address.addressId", target = "addressId"),                   
   	@Mapping(source = "entity.address.addressId", target = "addressDescriptiveField"),                    
   	@Mapping(source = "entity.staff.staffId", target = "managerStaffId"),                   
   	@Mapping(source = "entity.staff.staffId", target = "staffDescriptiveField"),                    
   	}) 
   	FindStoreByIdOutput storeEntityToFindStoreByIdOutput(StoreEntity entity);


   @Mappings({
   @Mapping(source = "address.address", target = "address"),                  
   @Mapping(source = "address.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "foundStore.storeId", target = "storeStoreId"),
   })
   GetAddressOutput addressEntityToGetAddressOutput(AddressEntity address, StoreEntity foundStore);
   
   @Mappings({
   @Mapping(source = "staff.lastUpdate", target = "lastUpdate"),                  
   @Mapping(source = "staff.storeId", target = "storeId"),                  
   @Mapping(source = "foundStore.storeId", target = "storeStoreId"),
   })
   GetStaffOutput staffEntityToGetStaffOutput(StaffEntity staff, StoreEntity foundStore);
   
}

