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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import net.thefletcher.tbaapi.v3client.model.WLTRecord;

/**
 * TeamEventStatusRankRanking
 */

public class TeamEventStatusRankRanking {
  @SerializedName("dq")
  private Integer dq = null;

  @SerializedName("matches_played")
  private Integer matchesPlayed = null;

  @SerializedName("qual_average")
  private Double qualAverage = null;

  @SerializedName("rank")
  private Integer rank = null;

  @SerializedName("record")
  private WLTRecord record = null;

  @SerializedName("sort_orders")
  private List<BigDecimal> sortOrders = null;

  @SerializedName("team_key")
  private String teamKey = null;

  public TeamEventStatusRankRanking dq(Integer dq) {
    this.dq = dq;
    return this;
  }

   /**
   * Number of matches the team was disqualified for.
   * @return dq
  **/
  @ApiModelProperty(value = "Number of matches the team was disqualified for.")
  public Integer getDq() {
    return dq;
  }

  public void setDq(Integer dq) {
    this.dq = dq;
  }

  public TeamEventStatusRankRanking matchesPlayed(Integer matchesPlayed) {
    this.matchesPlayed = matchesPlayed;
    return this;
  }

   /**
   * Number of matches played.
   * @return matchesPlayed
  **/
  @ApiModelProperty(value = "Number of matches played.")
  public Integer getMatchesPlayed() {
    return matchesPlayed;
  }

  public void setMatchesPlayed(Integer matchesPlayed) {
    this.matchesPlayed = matchesPlayed;
  }

  public TeamEventStatusRankRanking qualAverage(Double qualAverage) {
    this.qualAverage = qualAverage;
    return this;
  }

   /**
   * For some years, average qualification score. Can be null.
   * @return qualAverage
  **/
  @ApiModelProperty(value = "For some years, average qualification score. Can be null.")
  public Double getQualAverage() {
    return qualAverage;
  }

  public void setQualAverage(Double qualAverage) {
    this.qualAverage = qualAverage;
  }

  public TeamEventStatusRankRanking rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * Relative rank of this team.
   * @return rank
  **/
  @ApiModelProperty(value = "Relative rank of this team.")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public TeamEventStatusRankRanking record(WLTRecord record) {
    this.record = record;
    return this;
  }

   /**
   * Get record
   * @return record
  **/
  @ApiModelProperty(value = "")
  public WLTRecord getRecord() {
    return record;
  }

  public void setRecord(WLTRecord record) {
    this.record = record;
  }

  public TeamEventStatusRankRanking sortOrders(List<BigDecimal> sortOrders) {
    this.sortOrders = sortOrders;
    return this;
  }

  public TeamEventStatusRankRanking addSortOrdersItem(BigDecimal sortOrdersItem) {
    if (this.sortOrders == null) {
      this.sortOrders = new ArrayList<BigDecimal>();
    }
    this.sortOrders.add(sortOrdersItem);
    return this;
  }

   /**
   * Ordered list of values used to determine the rank. See the &#x60;sort_order_info&#x60; property for the name of each value.
   * @return sortOrders
  **/
  @ApiModelProperty(value = "Ordered list of values used to determine the rank. See the `sort_order_info` property for the name of each value.")
  public List<BigDecimal> getSortOrders() {
    return sortOrders;
  }

  public void setSortOrders(List<BigDecimal> sortOrders) {
    this.sortOrders = sortOrders;
  }

  public TeamEventStatusRankRanking teamKey(String teamKey) {
    this.teamKey = teamKey;
    return this;
  }

   /**
   * TBA team key for this rank.
   * @return teamKey
  **/
  @ApiModelProperty(value = "TBA team key for this rank.")
  public String getTeamKey() {
    return teamKey;
  }

  public void setTeamKey(String teamKey) {
    this.teamKey = teamKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamEventStatusRankRanking teamEventStatusRankRanking = (TeamEventStatusRankRanking) o;
    return Objects.equals(this.dq, teamEventStatusRankRanking.dq) &&
        Objects.equals(this.matchesPlayed, teamEventStatusRankRanking.matchesPlayed) &&
        Objects.equals(this.qualAverage, teamEventStatusRankRanking.qualAverage) &&
        Objects.equals(this.rank, teamEventStatusRankRanking.rank) &&
        Objects.equals(this.record, teamEventStatusRankRanking.record) &&
        Objects.equals(this.sortOrders, teamEventStatusRankRanking.sortOrders) &&
        Objects.equals(this.teamKey, teamEventStatusRankRanking.teamKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dq, matchesPlayed, qualAverage, rank, record, sortOrders, teamKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEventStatusRankRanking {\n");
    
    sb.append("    dq: ").append(toIndentedString(dq)).append("\n");
    sb.append("    matchesPlayed: ").append(toIndentedString(matchesPlayed)).append("\n");
    sb.append("    qualAverage: ").append(toIndentedString(qualAverage)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    sortOrders: ").append(toIndentedString(sortOrders)).append("\n");
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
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

