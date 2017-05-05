/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
/**
 * 
 */
package com.dell.isg.smi.commons.model.server;

/**
 * @author rahman.muhammad
 *
 */
public class JobStatusEnum {
    public static enum LCJobStatus {
        INPROGRESS("inProgress"), COMPLETED("Completed"), SCHEDULED("Scheduled"), RUNNING("Running"), NEW("New"), FAILED("Failed"), PENDING(""), NO_UPDATE_NEEDED("");

        private String value;


        LCJobStatus(String value) {
            this.value = value;
        }


        public String getValue() {
            return this.value;
        }

    }
}
