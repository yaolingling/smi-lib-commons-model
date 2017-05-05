/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.credential;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import mockit.Deencapsulation;
import mockit.integration.junit4.JMockit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.dell.isg.smi.commons.model.credential.UserCredential;

@RunWith(JMockit.class)
public class UserCredentialTest {

    private UserCredential userCredential;


    @Before
    public void setup() {
        userCredential = new UserCredential();
    }


    @Test
    public void validateShouldReturnTrueWhenUsernameIsEmail() {

        boolean actual = Deencapsulation.invoke(userCredential, "validate", "thisisaemail@dell.com");
        assertThat(actual, is(true));
    }


    @Test
    public void validateUsernames() {

        // username testcases
        assertThat(Deencapsulation.invoke(userCredential, "validate", "Thisisaemail@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisa'email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisa$email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisis(a)email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "Thisisa!email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisis{a}email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisa&email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisa#email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisa-email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "\fthisisatemail@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisatemail\f@dell.com"), is(true));

        // top domain testcases
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisis(a)email@dell.comnet"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisis(a)email@dell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisis(a)email@dell.comnet"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisis(a)email@dell.COM"), is(true));

        // domain testcases

        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisaemail@delldell.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisa$email@Notmorethan64characters.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisis(a)email@DEll.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "\fthisisatemail@abc.com"), is(true));
        assertThat(Deencapsulation.invoke(userCredential, "validate", "thisisatemail@a55.com"), is(true));

    }

}