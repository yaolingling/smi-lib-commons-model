/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.credential;

import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.dell.isg.smi.commons.model.validation.ValidationResult;

/**
 * The Class UserCredential.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UserCredential extends PasswordCredential {

    // *************** User name Requirements ***********************
    //  between 1 and 64 characters long
    //  no non-printable characters, so start at x20 (space) in the ascii table
    //  invalid characters for UserName : " / \ [ ] : ; | = , + * ? < >
    //  invalid characters for domain : " / \ : | , * ? < > ~ ! @ # $ % ^ & ' ( ) { } _
    //  exclude the @ sign to avoid confusion with user@domain
    @XmlTransient
    public static final String USERNAME_REGEX = "^(?![\\x20.]+)([^\\\\/\"\\[\\]:|<>+=;,?*@]{1,64})@([a-zA-Z](?![\\x20.]+$)([^\\\\/\"\\[\\]:|<>~!@#$%&*^',?(){}_ ]{0,63}))\\.([a-zA-Z]{2,6})$";

    // ************** Password Requirements ************************
    //  between 0 and 127 characters long (Note: Blank Password allowed)
    //  any character, printable and non-printable is allowed
    @XmlTransient
    public static final String ZASSWORD_REGEX = "^.{0,127}$";


    /* (non-Javadoc)
     * @see com.dell.isg.smi.commons.model.credential.PasswordCredential#validate()
     */
    @Override
    public ValidationResult validate() {
        ValidationResult result = super.validate();
        result.setValid(validate(getUsername()));
        return result;
    }


    private boolean validate(String usr) {
        Pattern pattern = Pattern.compile(USERNAME_REGEX);
        if ((usr == null) || (usr.trim().isEmpty())) {
            return false;
        }

        if (!pattern.matcher(usr).matches()) {
            return false;
        }

        // Helper function in UserHelper will throw exception when they're invalid, otherwise return true.
        return true;
    }
}
