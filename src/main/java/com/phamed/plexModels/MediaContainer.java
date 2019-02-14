
package com.phamed.plexModels;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;


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
@XmlRootElement(name = "MediaContainer")
@Getter
@Setter
@ToString
public class MediaContainer {

    @XmlElement(name = "Directory")
    protected List<Directory> directories;
    @XmlElement(name = "Video")
    protected List<Video> videos;
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
