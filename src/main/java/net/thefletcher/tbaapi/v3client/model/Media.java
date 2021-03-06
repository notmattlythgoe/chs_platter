/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events. If you are looking for the old version (v2) of the API, documentation can be found [here](/apidocs/v2).   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * OpenAPI spec version: 3.0.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.thefletcher.tbaapi.v3client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The &#x60;Media&#x60; object contains a reference for most any media associated with a team or event on TBA.
 */
@ApiModel(description = "The `Media` object contains a reference for most any media associated with a team or event on TBA.")

public class Media {
  @SerializedName("key")
  private String key = null;

  /**
   * String type of the media element.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    YOUTUBE("youtube"),
    
    CDPHOTOTHREAD("cdphotothread"),
    
    IMGUR("imgur"),
    
    FACEBOOK_PROFILE("facebook-profile"),
    
    YOUTUBE_CHANNEL("youtube-channel"),
    
    TWITTER_PROFILE("twitter-profile"),
    
    GITHUB_PROFILE("github-profile"),
    
    INSTAGRAM_PROFILE("instagram-profile"),
    
    PERISCOPE_PROFILE("periscope-profile"),
    
    GRABCAD("grabcad"),
    
    INSTAGRAM_IMAGE("instagram-image"),
    
    EXTERNAL_LINK("external-link");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("foreign_key")
  private String foreignKey = null;

  @SerializedName("details")
  private Object details = null;

  @SerializedName("preferred")
  private Boolean preferred = null;

  public Media key(String key) {
    this.key = key;
    return this;
  }

   /**
   * TBA identifier for this media.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "TBA identifier for this media.")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Media type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * String type of the media element.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "String type of the media element.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Media foreignKey(String foreignKey) {
    this.foreignKey = foreignKey;
    return this;
  }

   /**
   * The key used to identify this media on the media site.
   * @return foreignKey
  **/
  @ApiModelProperty(value = "The key used to identify this media on the media site.")
  public String getForeignKey() {
    return foreignKey;
  }

  public void setForeignKey(String foreignKey) {
    this.foreignKey = foreignKey;
  }

  public Media details(Object details) {
    this.details = details;
    return this;
  }

   /**
   * If required, a JSON dict of additional media information.
   * @return details
  **/
  @ApiModelProperty(value = "If required, a JSON dict of additional media information.")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  public Media preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

   /**
   * True if the media is of high quality.
   * @return preferred
  **/
  @ApiModelProperty(value = "True if the media is of high quality.")
  public Boolean getPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Media media = (Media) o;
    return Objects.equals(this.key, media.key) &&
        Objects.equals(this.type, media.type) &&
        Objects.equals(this.foreignKey, media.foreignKey) &&
        Objects.equals(this.details, media.details) &&
        Objects.equals(this.preferred, media.preferred);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, foreignKey, details, preferred);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    foreignKey: ").append(toIndentedString(foreignKey)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

