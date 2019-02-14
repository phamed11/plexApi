
package com.phamed.plexModels;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@Getter
@Setter
@ToString
@XmlRootElement(name = "Collection")
public class Collection {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "tag")
    protected String tag;



}
