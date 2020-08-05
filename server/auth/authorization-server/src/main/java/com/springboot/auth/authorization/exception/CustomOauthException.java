package com.springboot.auth.authorization.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.springboot.cloud.common.core.entity.vo.Result;
import lombok.Getter;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

@Getter
@JsonSerialize(using = CustomOauthExceptionSerializer.class)
class CustomOauthException extends OAuth2Exception {

    private final Result result;

    CustomOauthException(OAuth2Exception oAuth2Exception) {
        super(oAuth2Exception.getSummary(), oAuth2Exception);
        this.result = Result.fail(AuthErrorType.valueOf(oAuth2Exception.getOAuth2ErrorCode().toUpperCase()), oAuth2Exception);
    }
}
