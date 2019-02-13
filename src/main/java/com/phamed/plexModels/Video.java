
package com.phamed.plexModels;

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

    /**
     * Gets the value of the director property.
     * 
     * @return
     *     possible object is
     *     {@link Director }
     *     
     */
    public Director getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     * 
     * @param value
     *     allowed object is
     *     {@link Director }
     *     
     */
    public void setDirector(Director value) {
        this.director = value;
    }

    @Override
    public String toString() {
        return "Video{" +
            "director=" + director +
            ", writer=" + writer +
            ", ratingKey='" + ratingKey + '\'' +
            ", key='" + key + '\'' +
            ", parentRatingKey='" + parentRatingKey + '\'' +
            ", grandparentRatingKey='" + grandparentRatingKey + '\'' +
            ", librarySectionTitle='" + librarySectionTitle + '\'' +
            ", librarySectionID='" + librarySectionID + '\'' +
            ", librarySectionKey='" + librarySectionKey + '\'' +
            ", type='" + type + '\'' +
            ", title='" + title + '\'' +
            ", titleSort='" + titleSort + '\'' +
            ", grandparentKey='" + grandparentKey + '\'' +
            ", parentKey='" + parentKey + '\'' +
            ", grandparentTitle='" + grandparentTitle + '\'' +
            ", parentTitle='" + parentTitle + '\'' +
            ", contentRating='" + contentRating + '\'' +
            ", summary='" + summary + '\'' +
            ", index='" + index + '\'' +
            ", parentIndex='" + parentIndex + '\'' +
            ", rating='" + rating + '\'' +
            ", year='" + year + '\'' +
            ", thumb='" + thumb + '\'' +
            ", art='" + art + '\'' +
            ", parentThumb='" + parentThumb + '\'' +
            ", grandparentThumb='" + grandparentThumb + '\'' +
            ", grandparentArt='" + grandparentArt + '\'' +
            ", grandparentTheme='" + grandparentTheme + '\'' +
            ", originallyAvailableAt='" + originallyAvailableAt + '\'' +
            ", addedAt='" + addedAt + '\'' +
            ", updatedAt='" + updatedAt + '\'' +
            '}';
    }

    /**
     * Gets the value of the writer property.
     * 
     * @return
     *     possible object is
     *     {@link Writer }
     *     
     */


    public Writer getWriter() {
        return writer;
    }

    /**
     * Sets the value of the writer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Writer }
     *     
     */
    public void setWriter(Writer value) {
        this.writer = value;
    }

    /**
     * Gets the value of the ratingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatingKey() {
        return ratingKey;
    }

    /**
     * Sets the value of the ratingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatingKey(String value) {
        this.ratingKey = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the parentRatingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRatingKey() {
        return parentRatingKey;
    }

    /**
     * Sets the value of the parentRatingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRatingKey(String value) {
        this.parentRatingKey = value;
    }

    /**
     * Gets the value of the grandparentRatingKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandparentRatingKey() {
        return grandparentRatingKey;
    }

    /**
     * Sets the value of the grandparentRatingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandparentRatingKey(String value) {
        this.grandparentRatingKey = value;
    }

    /**
     * Gets the value of the librarySectionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarySectionTitle() {
        return librarySectionTitle;
    }

    /**
     * Sets the value of the librarySectionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarySectionTitle(String value) {
        this.librarySectionTitle = value;
    }

    /**
     * Gets the value of the librarySectionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarySectionID() {
        return librarySectionID;
    }

    /**
     * Sets the value of the librarySectionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarySectionID(String value) {
        this.librarySectionID = value;
    }

    /**
     * Gets the value of the librarySectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarySectionKey() {
        return librarySectionKey;
    }

    /**
     * Sets the value of the librarySectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarySectionKey(String value) {
        this.librarySectionKey = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the titleSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleSort() {
        return titleSort;
    }

    /**
     * Sets the value of the titleSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleSort(String value) {
        this.titleSort = value;
    }

    /**
     * Gets the value of the grandparentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandparentKey() {
        return grandparentKey;
    }

    /**
     * Sets the value of the grandparentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandparentKey(String value) {
        this.grandparentKey = value;
    }

    /**
     * Gets the value of the parentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentKey() {
        return parentKey;
    }

    /**
     * Sets the value of the parentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentKey(String value) {
        this.parentKey = value;
    }

    /**
     * Gets the value of the grandparentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandparentTitle() {
        return grandparentTitle;
    }

    /**
     * Sets the value of the grandparentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandparentTitle(String value) {
        this.grandparentTitle = value;
    }

    /**
     * Gets the value of the parentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTitle() {
        return parentTitle;
    }

    /**
     * Sets the value of the parentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTitle(String value) {
        this.parentTitle = value;
    }

    /**
     * Gets the value of the contentRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentRating() {
        return contentRating;
    }

    /**
     * Sets the value of the contentRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentRating(String value) {
        this.contentRating = value;
    }

    /**
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the parentIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentIndex() {
        return parentIndex;
    }

    /**
     * Sets the value of the parentIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentIndex(String value) {
        this.parentIndex = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the thumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * Sets the value of the thumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumb(String value) {
        this.thumb = value;
    }

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArt(String value) {
        this.art = value;
    }

    /**
     * Gets the value of the parentThumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentThumb() {
        return parentThumb;
    }

    /**
     * Sets the value of the parentThumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentThumb(String value) {
        this.parentThumb = value;
    }

    /**
     * Gets the value of the grandparentThumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandparentThumb() {
        return grandparentThumb;
    }

    /**
     * Sets the value of the grandparentThumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandparentThumb(String value) {
        this.grandparentThumb = value;
    }

    /**
     * Gets the value of the grandparentArt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandparentArt() {
        return grandparentArt;
    }

    /**
     * Sets the value of the grandparentArt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandparentArt(String value) {
        this.grandparentArt = value;
    }

    /**
     * Gets the value of the grandparentTheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrandparentTheme() {
        return grandparentTheme;
    }

    /**
     * Sets the value of the grandparentTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrandparentTheme(String value) {
        this.grandparentTheme = value;
    }

    /**
     * Gets the value of the originallyAvailableAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    /**
     * Sets the value of the originallyAvailableAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginallyAvailableAt(String value) {
        this.originallyAvailableAt = value;
    }

    /**
     * Gets the value of the addedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedAt() {
        return addedAt;
    }

    /**
     * Sets the value of the addedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedAt(String value) {
        this.addedAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedAt(String value) {
        this.updatedAt = value;
    }

}
