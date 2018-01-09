package com.github.eppt.config;

/**
 * Created by avew on 12/22/17.
 */
public final class Constants {
    //Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymoususer";

    private Constants() {
    }
}
