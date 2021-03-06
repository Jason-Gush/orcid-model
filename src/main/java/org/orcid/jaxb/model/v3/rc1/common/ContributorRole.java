package org.orcid.jaxb.model.v3.rc1.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

import io.swagger.annotations.ApiModel;

/**
 * @author Declan Newman (declan) Date: 07/08/2012
 */
@XmlType(name = "contributorRole")
@XmlEnum
@ApiModel(value = "ContributorRoleV3_0_rc1")
public enum ContributorRole implements Serializable {

    @XmlEnumValue("author")
    AUTHOR("author"), @XmlEnumValue("assignee")
    ASSIGNEE("assignee"), @XmlEnumValue("editor")
    EDITOR("editor"), @XmlEnumValue("chair-or-translator")
    CHAIR_OR_TRANSLATOR("chair-or-translator"), @XmlEnumValue("co-investigator")
    CO_INVESTIGATOR("co-investigator"), @XmlEnumValue("co-inventor")
    CO_INVENTOR("co-inventor"), @XmlEnumValue("graduate-student")
    GRADUATE_STUDENT("graduate-student"), @XmlEnumValue("other-inventor")
    OTHER_INVENTOR("other-inventor"), @XmlEnumValue("principal-investigator")
    PRINCIPAL_INVESTIGATOR("principal-investigator"), @XmlEnumValue("postdoctoral-researcher")
    POSTDOCTORAL_RESEARCHER("postdoctoral-researcher"), @XmlEnumValue("support-staff")
    SUPPORT_STAFF("support-staff");

    private final String value;

    ContributorRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }
    
    public static ContributorRole fromValue(String v) {
        for (ContributorRole c : ContributorRole.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
