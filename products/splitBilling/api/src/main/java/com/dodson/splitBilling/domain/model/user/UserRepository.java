package com.dodson.splitBilling.domain.model.user;

/**
 * TODO: Documentation
 *
 * @author troy.dodson@mincom.com
 * @since 0.1
 */
public interface UserRepository
{
    String SERVICE_NAME = "userRepository";

    User createUser( String userName )
        throws IllegalArgumentException;

    User findById( long userId );
}
