//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.10.03 at 02:27:05 PM EDT
//


package com.bbn.marti.excheck.checklist;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checklistTasks complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * {@code
 * &lt;complexType name="checklistTasks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checklistTask" type="{}checklistTask" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checklistTasks", propOrder = {
    "checklistTask"
})
public class ChecklistTasks {

    @XmlElement(required = true)
    protected List<ChecklistTask> checklistTask;

    /**
     * Gets the value of the checklistTask property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checklistTask property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChecklistTask().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChecklistTask }
     *
     *
     */
    public List<ChecklistTask> getChecklistTask() {
        if (checklistTask == null) {
            checklistTask = new ArrayList<ChecklistTask>();
        }
        return this.checklistTask;
    }

}
