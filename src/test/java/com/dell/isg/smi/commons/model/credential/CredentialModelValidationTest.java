/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.credential;

import org.junit.Assert;
import org.junit.Test;

import com.dell.isg.smi.commons.model.credential.ICredential;
import com.dell.isg.smi.commons.model.credential.IPasswordCredential;
import com.dell.isg.smi.commons.model.credential.WSManPasswordCredential;
import com.dell.isg.smi.commons.model.validation.ValidationResult;

public class CredentialModelValidationTest {

    @Test
    public void usernameNullSpaceAndEmptyTest() {
        IPasswordCredential credential = new WSManPasswordCredential();
        credential.setPassword("foobar");

        // should not allow empty
        credential.setUsername("");
        if (isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("Empty was valid");
            Assert.fail();
        }

        // should not allow null
        credential.setUsername(null);
        if (isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("null was valid");
            Assert.fail();
        }

        // should not allow spaces
        credential.setUsername(" ");
        if (isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("spaces was valid");
            Assert.fail();
        }
    }


    @Test
    public void wsmanPasswordLengthTest() {
        IPasswordCredential credential = new WSManPasswordCredential();
        credential.setUsername("foobar");

        // should allow a 20 character password
        credential.setPassword("12345678901234567890");
        if (!isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("20 character password was not valid");
            Assert.fail();
        }

        // should not allow 21 character password
        credential.setPassword("123456789012345678901");
        if (isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("21 character password was valid");
            Assert.fail();
        }
    }


    @Test
    public void wsmanUsernameLengthTest() {
        IPasswordCredential credential = new WSManPasswordCredential();
        credential.setPassword("foobar");
        credential.setUsername("foobar");

        // should allow a 20 character password
        credential.setUsername("1234567890123456");
        if (!isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("16 character username was not valid");
            Assert.fail();
        }

        // should not allow 21 character password
        credential.setUsername("12345678901234567");
        if (isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("17 character username was valid");
            Assert.fail();
        }

    }


    @Test
    public void passwordNullSpaceAndEmptyTest() {
        IPasswordCredential credential = new WSManPasswordCredential();
        credential.setUsername("foobar");

        // should not allow empty
        credential.setPassword("");
        if (isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("Empty was valid");
            Assert.fail();
        }

        // should not allow null
        credential.setPassword(null);
        if (isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("null was valid");
            Assert.fail();
        }

        // should not allow spaces
        credential.setPassword("a b");
        if (isModelValid(credential)) {
            System.out.println("**************************************");
            System.out.println("spaces was valid");
            Assert.fail();
        }
    }


    @Test
    public void usernameSpecialCharacterTest() {
        // allowed special characters
        char[] specialCharacters = { '%', '(', ')', '\'', '$', '!', '&', '-', '{', '}', '#', '_', '-', '^' };
        for (char character : specialCharacters) {
            IPasswordCredential credential = new WSManPasswordCredential();
            credential.setUsername("" + character);
            credential.setPassword("foobar");
            if (!isModelValid(credential)) {
                System.out.println("**************************************");
                System.out.println("character: " + character + " was not valid");
                Assert.fail();
            }
        }

        // not allowed special characters
        char[] badCharacters = { '@', '*', '/', '\\', '[', ']', ':', ';', '|', '=', ',', '.', '+', '*', '?', '<', '>' };
        for (char badChar : badCharacters) {
            IPasswordCredential credential = new WSManPasswordCredential();
            credential.setUsername("a" + badChar);
            credential.setPassword("foobar");

            if (isModelValid(credential)) {
                System.out.println("**************************************");
                System.out.println("bad character: " + badChar + " was valid.");
                Assert.fail();
            }
        }
    }


    @Test
    public void passwordSpecialCharacterTest() {
        // allowed special characters
        char[] specialCharacters = { '+', '&', '?', '>', '-', '}', '|', '.', '!', '(', '\'', ',', '_', '[', '"', '@', '#', ')', '*', ';', '$', ']', '/', '%', '=', '<', '{', '|', '\\' };
        for (char character : specialCharacters) {
            IPasswordCredential credential = new WSManPasswordCredential();
            credential.setUsername("foo");
            credential.setPassword("" + character);
            if (!isModelValid(credential)) {
                System.out.println("**************************************");
                System.out.println("character: " + character + " was not valid");
                Assert.fail();
            }
        }

        // not allowed special characters
        char[] badCharacters = { '`', '^' };
        for (char badChar : badCharacters) {
            IPasswordCredential credential = new WSManPasswordCredential();
            credential.setUsername("foo");
            credential.setPassword("" + badChar);

            if (isModelValid(credential)) {
                System.out.println("**************************************");
                System.out.println("bad character: " + badChar + " was valid.");
                Assert.fail();
            }
        }
    }


    @Test
    public void domainSpecialCharacterTest() {
        // invalid characters: " / \ : | , * ? < > ~ ! @ # $ % ^ & ' ( ) { } _

        // allowed special characters
        char[] specialCharacters = { '-' };
        for (char character : specialCharacters) {
            IPasswordCredential credential = new WSManPasswordCredential();
            credential.setUsername("foo");
            credential.setPassword("bar");
            credential.setDomain("a" + character + "ab");
            if (!isModelValid(credential)) {
                System.out.println("**************************************");
                System.out.println("character: " + character + " was not valid");
                Assert.fail();
            }
        }

        // not allowed special characters
        char[] badCharacters = { '/', '\\', ':', '|', ',', '*', '?', '<', '>', '~', '!', '@', '#', '$', '%', '^', '&', '\'', '(', ')', '_' };
        for (char badChar : badCharacters) {
            IPasswordCredential credential = new WSManPasswordCredential();
            credential.setUsername("foo");
            credential.setPassword("bar");
            credential.setDomain("ab" + badChar + "ab");

            if (isModelValid(credential)) {
                System.out.println("**************************************");
                System.out.println("bad character: " + badChar + " was valid.");
                Assert.fail();
            }
        }

    }


    @Test
    public void usernameAtDomainTest() {
        WSManPasswordCredential credential = new WSManPasswordCredential();
        credential.setUsername("myUsername");
        credential.setPassword("myPassword");
        credential.setDomain("myDomain");
        Assert.assertEquals("myUsername@myDomain", credential.getUsernameAtDomain());

        credential.setDomain(null);
        Assert.assertEquals("myUsername", credential.getUsernameAtDomain());

        credential.setUsername("");
        Assert.assertEquals(null, credential.getUsernameAtDomain());

    }


    private boolean isModelValid(ICredential model) {
        ValidationResult validationResult = model.validate();
        if (validationResult.isValid()) {
            return true;
        }
        return false;
    }

}
