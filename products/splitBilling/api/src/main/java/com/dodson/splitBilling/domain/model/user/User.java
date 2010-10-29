package com.dodson.splitBilling.domain.model.user;

/**
 * TODO: Documentation
 *
 * @author troy.dodson@mincom.com
 * @since 0.1
 */
public interface User
{
    Long id();

    /**
     * @return user name of this user; never returns {@code null}.
     *
     * @since 0.1
     */
    String userName();

    /**
     * Authenticate user password with the specified password argument.
     *
     * @param password the password to authenticate.
     *
     * @return {@code true} if the password matches, {@code false} otherwise.
     *
     * @since 0.1
     */
    boolean authenticate( String password );

    boolean changePassword( String oldPassword, String newPassword );
}
