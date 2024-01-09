//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.08.23 at 11:11:10 AM EDT
//


package com.bbn.marti.excheck.checklist;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checklistColumnType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * {@code
 * &lt;simpleType name="checklistColumnType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ShortString"/>
 *     &lt;enumeration value="LongString"/>
 *     &lt;enumeration value="Integer"/>
 *     &lt;enumeration value="ActualTime"/>
 *     &lt;enumeration value="RelativeTime"/>
 *     &lt;enumeration value="List"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * }
 * </pre>
 *
 */
@XmlType(name = "checklistColumnType")
@XmlEnum
public enum ChecklistColumnType {

    @XmlEnumValue("ShortString")
    SHORT_STRING("ShortString"),
    @XmlEnumValue("LongString")
    LONG_STRING("LongString"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("ActualTime")
    ACTUAL_TIME("ActualTime"),
    @XmlEnumValue("RelativeTime")
    RELATIVE_TIME("RelativeTime"),
    @XmlEnumValue("List")
    LIST("List");
    private final String value;

    ChecklistColumnType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChecklistColumnType fromValue(String v) {
        for (ChecklistColumnType c: ChecklistColumnType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
