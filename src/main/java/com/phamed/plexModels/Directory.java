
package com.phamed.plexModels;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element ref="{}Genre" minOccurs="0"/>
 *         &lt;element ref="{}Role" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ratingKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="key" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="librarySectionTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="librarySectionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="librarySectionKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="studio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="titleSort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="contentRating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="summary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="rating" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="viewCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastViewedAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="art" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="banner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="theme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originallyAvailableAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="leafCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="viewedLeafCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="childCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="addedAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updatedAt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentRatingKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentTitle" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentThumb" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentTheme" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Directory")
public class Directory {

    @XmlElementRefs({
        @XmlElementRef(name = "Genre", type = Genre.class, required = false),
        @XmlElementRef(name = "Role", type = Role.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "ratingKey")
    protected String ratingKey;
    @XmlAttribute(name = "key")
    protected String key;
    @XmlAttribute(name = "librarySectionTitle")
    protected String librarySectionTitle;
    @XmlAttribute(name = "librarySectionID")
    protected String librarySectionID;
    @XmlAttribute(name = "librarySectionKey")
    protected String librarySectionKey;
    @XmlAttribute(name = "studio")
    protected String studio;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "titleSort")
    protected String titleSort;
    @XmlAttribute(name = "contentRating")
    protected String contentRating;
    @XmlAttribute(name = "summary")
    protected String summary;
    @XmlAttribute(name = "index")
    protected String index;
    @XmlAttribute(name = "rating")
    protected String rating;
    @XmlAttribute(name = "viewCount")
    protected String viewCount;
    @XmlAttribute(name = "lastViewedAt")
    protected String lastViewedAt;
    @XmlAttribute(name = "year")
    protected String year;
    @XmlAttribute(name = "thumb")
    protected String thumb;
    @XmlAttribute(name = "art")
    protected String art;
    @XmlAttribute(name = "banner")
    protected String banner;
    @XmlAttribute(name = "theme")
    protected String theme;
    @XmlAttribute(name = "duration")
    protected String duration;
    @XmlAttribute(name = "originallyAvailableAt")
    protected String originallyAvailableAt;
    @XmlAttribute(name = "leafCount")
    protected String leafCount;
    @XmlAttribute(name = "viewedLeafCount")
    protected String viewedLeafCount;
    @XmlAttribute(name = "childCount")
    protected String childCount;
    @XmlAttribute(name = "addedAt")
    protected String addedAt;
    @XmlAttribute(name = "updatedAt")
    protected String updatedAt;
    @XmlAttribute(name = "parentRatingKey")
    protected String parentRatingKey;
    @XmlAttribute(name = "parentKey")
    protected String parentKey;
    @XmlAttribute(name = "parentTitle")
    protected String parentTitle;
    @XmlAttribute(name = "parentIndex")
    protected String parentIndex;
    @XmlAttribute(name = "parentThumb")
    protected String parentThumb;
    @XmlAttribute(name = "parentTheme")
    protected String parentTheme;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Role }
     * {@link Genre }
     * {@link String }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Gets the value of the studio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudio() {
        return studio;
    }

    /**
     * Sets the value of the studio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudio(String value) {
        this.studio = value;
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
     * Gets the value of the viewCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewCount() {
        return viewCount;
    }

    /**
     * Sets the value of the viewCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewCount(String value) {
        this.viewCount = value;
    }

    /**
     * Gets the value of the lastViewedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastViewedAt() {
        return lastViewedAt;
    }

    /**
     * Sets the value of the lastViewedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastViewedAt(String value) {
        this.lastViewedAt = value;
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
     * Gets the value of the banner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanner() {
        return banner;
    }

    /**
     * Sets the value of the banner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanner(String value) {
        this.banner = value;
    }

    /**
     * Gets the value of the theme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Sets the value of the theme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
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
     * Gets the value of the leafCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeafCount() {
        return leafCount;
    }

    /**
     * Sets the value of the leafCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeafCount(String value) {
        this.leafCount = value;
    }

    /**
     * Gets the value of the viewedLeafCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewedLeafCount() {
        return viewedLeafCount;
    }

    /**
     * Sets the value of the viewedLeafCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewedLeafCount(String value) {
        this.viewedLeafCount = value;
    }

    /**
     * Gets the value of the childCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildCount() {
        return childCount;
    }

    /**
     * Sets the value of the childCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildCount(String value) {
        this.childCount = value;
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
     * Gets the value of the parentTheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentTheme() {
        return parentTheme;
    }

    /**
     * Sets the value of the parentTheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentTheme(String value) {
        this.parentTheme = value;
    }

}
