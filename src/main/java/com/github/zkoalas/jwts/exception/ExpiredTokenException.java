package com.github.zkoalas.jwts.exception;

/**
 * token过期异常
 */
public class ExpiredTokenException extends TokenException {

    private static final long serialVersionUID = -8019541050781876369L;

    public ExpiredTokenException() {
        super(402, "登录已过期");
    }
}
