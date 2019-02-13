
package com.phamed.plexModels;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Directory")
@Getter
@Setter
@ToString
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



}
