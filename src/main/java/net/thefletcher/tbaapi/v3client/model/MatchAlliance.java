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
import java.util.ArrayList;
import java.util.List;

/**
 * MatchAlliance
 */

public class MatchAlliance {
  @SerializedName("score")
  private Integer score = null;

  @SerializedName("team_keys")
  private List<String> teamKeys = new ArrayList<String>();

  @SerializedName("surrogate_team_keys")
  private List<String> surrogateTeamKeys = null;

  @SerializedName("dq_team_keys")
  private List<String> dqTeamKeys = null;

  public MatchAlliance score(Integer score) {
    this.score = score;
    return this;
  }

   /**
   * Score for this alliance. Will be null or -1 for an unplayed match.
   * @return score
  **/
  @ApiModelProperty(required = true, value = "Score for this alliance. Will be null or -1 for an unplayed match.")
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public MatchAlliance teamKeys(List<String> teamKeys) {
    this.teamKeys = teamKeys;
    return this;
  }

  public MatchAlliance addTeamKeysItem(String teamKeysItem) {
    this.teamKeys.add(teamKeysItem);
    return this;
  }

   /**
   * Get teamKeys
   * @return teamKeys
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getTeamKeys() {
    return teamKeys;
  }

  public void setTeamKeys(List<String> teamKeys) {
    this.teamKeys = teamKeys;
  }

  public MatchAlliance surrogateTeamKeys(List<String> surrogateTeamKeys) {
    this.surrogateTeamKeys = surrogateTeamKeys;
    return this;
  }

  public MatchAlliance addSurrogateTeamKeysItem(String surrogateTeamKeysItem) {
    if (this.surrogateTeamKeys == null) {
      this.surrogateTeamKeys = new ArrayList<String>();
    }
    this.surrogateTeamKeys.add(surrogateTeamKeysItem);
    return this;
  }

   /**
   * TBA team keys (eg &#x60;frc254&#x60;) of any teams playing as a surrogate.
   * @return surrogateTeamKeys
  **/
  @ApiModelProperty(value = "TBA team keys (eg `frc254`) of any teams playing as a surrogate.")
  public List<String> getSurrogateTeamKeys() {
    return surrogateTeamKeys;
  }

  public void setSurrogateTeamKeys(List<String> surrogateTeamKeys) {
    this.surrogateTeamKeys = surrogateTeamKeys;
  }

  public MatchAlliance dqTeamKeys(List<String> dqTeamKeys) {
    this.dqTeamKeys = dqTeamKeys;
    return this;
  }

  public MatchAlliance addDqTeamKeysItem(String dqTeamKeysItem) {
    if (this.dqTeamKeys == null) {
      this.dqTeamKeys = new ArrayList<String>();
    }
    this.dqTeamKeys.add(dqTeamKeysItem);
    return this;
  }

   /**
   * TBA team keys (eg &#x60;frc254&#x60;) of any disqualified teams.
   * @return dqTeamKeys
  **/
  @ApiModelProperty(value = "TBA team keys (eg `frc254`) of any disqualified teams.")
  public List<String> getDqTeamKeys() {
    return dqTeamKeys;
  }

  public void setDqTeamKeys(List<String> dqTeamKeys) {
    this.dqTeamKeys = dqTeamKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchAlliance matchAlliance = (MatchAlliance) o;
    return Objects.equals(this.score, matchAlliance.score) &&
        Objects.equals(this.teamKeys, matchAlliance.teamKeys) &&
        Objects.equals(this.surrogateTeamKeys, matchAlliance.surrogateTeamKeys) &&
        Objects.equals(this.dqTeamKeys, matchAlliance.dqTeamKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, teamKeys, surrogateTeamKeys, dqTeamKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchAlliance {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    teamKeys: ").append(toIndentedString(teamKeys)).append("\n");
    sb.append("    surrogateTeamKeys: ").append(toIndentedString(surrogateTeamKeys)).append("\n");
    sb.append("    dqTeamKeys: ").append(toIndentedString(dqTeamKeys)).append("\n");
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

