
package com.phamed.plexModels;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
//    "director",
//    "writer",
//    "role",
//    "genre",
//    "collection",
//    "country"
//})
@XmlRootElement(name = "Video")
@Getter
@Setter
@ToString
public class Video {

    @XmlElement(name = "Role", required = false)
    protected List<Role> role;
    @XmlElement(name = "Genre", required = false)
    protected List<Genre> genre;
    @XmlElement(name = "Director", required = true)
    protected List<Director> director;
    @XmlElement(name = "Writer", required = true)
    protected List<Writer> writer;
    @XmlElement(name = "Collection")
    protected Collection collection;
    @XmlElement(name = "Country")
    protected Country country;
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
