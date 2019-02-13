
package com.phamed.plexModels;

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

    /**
     * Gets the value of the directoryOrVideo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directoryOrVideo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectoryOrVideo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Directory }
     * {@link Video }
     * 
     * 
     */
    public List<Object> getDirectoryOrVideo() {
        if (directoryOrVideo == null) {
            directoryOrVideo = new ArrayList<Object>();
        }
        return this.directoryOrVideo;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Gets the value of the allowSync property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowSync() {
        return allowSync;
    }

    /**
     * Sets the value of the allowSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowSync(String value) {
        this.allowSync = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the mediaTagPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTagPrefix() {
        return mediaTagPrefix;
    }

    /**
     * Sets the value of the mediaTagPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTagPrefix(String value) {
        this.mediaTagPrefix = value;
    }

    /**
     * Gets the value of the mediaTagVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTagVersion() {
        return mediaTagVersion;
    }

    /**
     * Sets the value of the mediaTagVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTagVersion(String value) {
        this.mediaTagVersion = value;
    }

}
