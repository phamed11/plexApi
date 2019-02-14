
package com.phamed.plexModels;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Writer")
@Getter
@Setter
@ToString
public class Writer {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "tag")
    protected String tag;



}
