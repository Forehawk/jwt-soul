package org.yt.jwts.exception;

/**
 * 没有权限的异常
 */
public class UnauthorizedException extends TokenException {

    private static final long serialVersionUID = 8109117719383003891L;

    public UnauthorizedException() {
        super(403, "没有访问权限");
    }
}
