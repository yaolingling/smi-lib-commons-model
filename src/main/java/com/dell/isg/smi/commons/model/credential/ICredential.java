/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.credential;

import com.dell.isg.smi.commons.model.validation.ValidationResult;

public interface ICredential {

    /**
     * Validate method
     * 
     * @return ValidationResult - the validation result object
     */
    ValidationResult validate();

}
