/*
 * The Blue Alliance API v3
 * # Overview    Information and statistics about FIRST Robotics Competition teams and events. If you are looking for the old version (v2) of the API, documentation can be found [here](/apidocs/v2).   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
 *
 * OpenAPI spec version: 3.0.4
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
import java.util.ArrayList;
import java.util.List;

/**
 * EventDistrictPointsTiebreakers
 */

public class EventDistrictPointsTiebreakers {
  @SerializedName("highest_qual_scores")
  private List<Integer> highestQualScores = null;

  @SerializedName("qual_wins")
  private Integer qualWins = null;

  public EventDistrictPointsTiebreakers highestQualScores(List<Integer> highestQualScores) {
    this.highestQualScores = highestQualScores;
    return this;
  }

  public EventDistrictPointsTiebreakers addHighestQualScoresItem(Integer highestQualScoresItem) {
    if (this.highestQualScores == null) {
      this.highestQualScores = new ArrayList<Integer>();
    }
    this.highestQualScores.add(highestQualScoresItem);
    return this;
  }

   /**
   * Get highestQualScores
   * @return highestQualScores
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getHighestQualScores() {
    return highestQualScores;
  }

  public void setHighestQualScores(List<Integer> highestQualScores) {
    this.highestQualScores = highestQualScores;
  }

  public EventDistrictPointsTiebreakers qualWins(Integer qualWins) {
    this.qualWins = qualWins;
    return this;
  }

   /**
   * Get qualWins
   * @return qualWins
  **/
  @ApiModelProperty(value = "")
  public Integer getQualWins() {
    return qualWins;
  }

  public void setQualWins(Integer qualWins) {
    this.qualWins = qualWins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventDistrictPointsTiebreakers eventDistrictPointsTiebreakers = (EventDistrictPointsTiebreakers) o;
    return Objects.equals(this.highestQualScores, eventDistrictPointsTiebreakers.highestQualScores) &&
        Objects.equals(this.qualWins, eventDistrictPointsTiebreakers.qualWins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highestQualScores, qualWins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventDistrictPointsTiebreakers {\n");
    
    sb.append("    highestQualScores: ").append(toIndentedString(highestQualScores)).append("\n");
    sb.append("    qualWins: ").append(toIndentedString(qualWins)).append("\n");
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
