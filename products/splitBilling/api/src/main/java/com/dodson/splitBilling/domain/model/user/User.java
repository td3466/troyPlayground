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

    boolean validatePassword( String password );

    boolean changePassword( String oldPassword, String newPassword );
}
