package com.fastcode.abcaq1.application.core.authorization.tokenverification;

import com.fastcode.abcaq1.domain.core.authorization.tokenverification.TokenverificationEntity;

public interface ITokenVerificationAppService {
	
	TokenverificationEntity findByTokenAndType(String token, String type);

	TokenverificationEntity generateToken(String type, Long userId );

	TokenverificationEntity findByUserIdAndType( Long userId , String type);

	void deleteToken(TokenverificationEntity entity);

}

