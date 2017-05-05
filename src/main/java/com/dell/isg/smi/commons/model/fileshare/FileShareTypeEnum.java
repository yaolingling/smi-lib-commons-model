/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.commons.model.fileshare;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "FileSystemShareTypeEnum", namespace = "")
@XmlEnum
public enum FileShareTypeEnum {
    CIFS, NFS;

    public String value() {
        return name();
    }


    public static FileShareTypeEnum fromValue(String v) {
        return valueOf(v);
    }
}
