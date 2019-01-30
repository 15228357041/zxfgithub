package com.test.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
* A manager for the CSRF token for a given session. The {@link #getTokenForSession(HttpSession)} should used to
* obtain the token value for the current session (and this should be the only way to obtain the token value).
* csrf安全过滤使用UUID生成随机的token
 * ***/

public final class CSRFTokenManager {

    /**
     * The token parameter name
     */
    static final String CSRF_PARAM_NAME = "CSRFToken";

    /**
     * The location on the session which stores the token
     */
    public static final  String CSRF_TOKEN_FOR_SESSION_ATTR_NAME = CSRFTokenManager.class
            .getName() + ".tokenval";

    public static String getTokenForSession(HttpSession session) {
        String token = null;
        
        // I cannot allow more than one token on a session - in the case of two
        // requests trying to
        // init the token concurrently
        synchronized (session) {
            token = UUID.randomUUID().toString();
            session.setAttribute(CSRF_TOKEN_FOR_SESSION_ATTR_NAME, token);
        }
        return token;
    }

    /**
     * Extracts the token value from the session
     * 
     * @param request
     * @return
     */
    public static String getTokenFromRequest(HttpServletRequest request) {
        return request.getParameter(CSRF_PARAM_NAME);
    }

    private CSRFTokenManager() {
    };

}