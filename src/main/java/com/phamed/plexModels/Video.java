
package com.phamed.plexModels;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}Director"/>
 *         &lt;element ref="{}Writer"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ratingKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentRatingKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grandparentRatingKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="librarySectionTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="librarySectionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="librarySectionKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="titleSort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grandparentKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grandparentTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentRating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="art" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentThumb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grandparentThumb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grandparentArt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="grandparentTheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originallyAvailableAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addedAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "director",
    "writer"
})
@XmlRootElement(name = "Video")
@Getter
@Setter
@ToString
public class Video {

    @XmlElement(name = "Director", required = true)
    protected Director director;
    @XmlElement(name = "Writer", required = true)
    protected Writer writer;
    @XmlAttribute(name = "ratingKey")
    protected String ratingKey;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "parentRatingKey")
    protected String parentRatingKey;
    @XmlAttribute(name = "grandparentRatingKey")
    protected String grandparentRatingKey;
    @XmlAttribute(name = "librarySectionTitle")
    protected String librarySectionTitle;
    @XmlAttribute(name = "librarySectionID")
    protected String librarySectionID;
    @XmlAttribute(name = "librarySectionKey")
    protected String librarySectionKey;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "titleSort")
    protected String titleSort;
    @XmlAttribute(name = "grandparentKey")
    protected String grandparentKey;
    @XmlAttribute(name = "parentKey")
    protected String parentKey;
    @XmlAttribute(name = "grandparentTitle")
    protected String grandparentTitle;
    @XmlAttribute(name = "parentTitle")
    protected String parentTitle;
    @XmlAttribute(name = "contentRating")
    protected String contentRating;
    @XmlAttribute(name = "summary")
    protected String summary;
    @XmlAttribute(name = "index")
    protected String index;
    @XmlAttribute(name = "parentIndex")
    protected String parentIndex;
    @XmlAttribute(name = "rating")
    protected String rating;
    @XmlAttribute(name = "year")
    protected String year;
    @XmlAttribute(name = "thumb")
    protected String thumb;
    @XmlAttribute(name = "art")
    protected String art;
    @XmlAttribute(name = "parentThumb")
    protected String parentThumb;
    @XmlAttribute(name = "grandparentThumb")
    protected String grandparentThumb;
    @XmlAttribute(name = "grandparentArt")
    protected String grandparentArt;
    @XmlAttribute(name = "grandparentTheme")
    protected String grandparentTheme;
    @XmlAttribute(name = "originallyAvailableAt")
    protected String originallyAvailableAt;
    @XmlAttribute(name = "addedAt")
    protected String addedAt;
    @XmlAttribute(name = "updatedAt")
    protected String updatedAt;


}
