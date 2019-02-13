
package com.phamed.plexModels;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{}Directory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}Video"/>
 *       &lt;/choice>
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="allowSync" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mediaTagPrefix" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mediaTagVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "directoryOrVideo"
})
@XmlRootElement(name = "MediaContainer")
@Getter
@Setter
@ToString
public class MediaContainer {

    @XmlElements({
        @XmlElement(name = "Directory", type = Directory.class),
        @XmlElement(name = "Video", type = Video.class)
    })
    protected List<Object> directoryOrVideo;
    @XmlAttribute(name = "size")
    protected String size;
    @XmlAttribute(name = "allowSync")
    protected String allowSync;
    @XmlAttribute(name = "identifier")
    protected String identifier;
    @XmlAttribute(name = "mediaTagPrefix")
    protected String mediaTagPrefix;
    @XmlAttribute(name = "mediaTagVersion")
    protected String mediaTagVersion;

}
