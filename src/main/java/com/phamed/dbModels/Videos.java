package com.phamed.dbModels;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Videos {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @ManyToMany
  protected List<Roles> role;
  @ManyToMany
  protected List<Genres> genre;
  @ManyToMany
  protected List<Directors> director;
  @ManyToMany
  protected List<Writers> writer;
  @ManyToOne
  protected Collections collection;
  @ManyToOne
  protected Countries country;
  protected String ratingKey;
  protected String key;
  protected String parentRatingKey;
  protected String grandparentRatingKey;
  protected String librarySectionTitle;
  protected String librarySectionID;
  protected String librarySectionKey;
  protected String type;
  protected String title;
  protected String titleSort;
  protected String grandparentKey;
  protected String parentKey;
  protected String grandparentTitle;
  protected String parentTitle;
  protected String contentRating;
  protected String summary;
  protected String index;
  protected String parentIndex;
  protected String rating;
  protected String year;
  protected String thumb;
  protected String art;
  protected String parentThumb;
  protected String grandparentThumb;
  protected String grandparentArt;
  protected String grandparentTheme;
  protected String originallyAvailableAt;
  protected LocalDateTime addedAt;
  protected String updatedAt;
}
