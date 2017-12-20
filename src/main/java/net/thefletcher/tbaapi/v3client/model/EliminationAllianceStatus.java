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
import net.thefletcher.tbaapi.v3client.model.WLTRecord;

/**
 * EliminationAllianceStatus
 */

public class EliminationAllianceStatus {
  @SerializedName("current_level_record")
  private WLTRecord currentLevelRecord = null;

  @SerializedName("level")
  private String level = null;

  @SerializedName("playoff_average")
  private Double playoffAverage = null;

  @SerializedName("record")
  private WLTRecord record = null;

  @SerializedName("status")
  private String status = null;

  public EliminationAllianceStatus currentLevelRecord(WLTRecord currentLevelRecord) {
    this.currentLevelRecord = currentLevelRecord;
    return this;
  }

   /**
   * Get currentLevelRecord
   * @return currentLevelRecord
  **/
  @ApiModelProperty(value = "")
  public WLTRecord getCurrentLevelRecord() {
    return currentLevelRecord;
  }

  public void setCurrentLevelRecord(WLTRecord currentLevelRecord) {
    this.currentLevelRecord = currentLevelRecord;
  }

  public EliminationAllianceStatus level(String level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public EliminationAllianceStatus playoffAverage(Double playoffAverage) {
    this.playoffAverage = playoffAverage;
    return this;
  }

   /**
   * Get playoffAverage
   * @return playoffAverage
  **/
  @ApiModelProperty(value = "")
  public Double getPlayoffAverage() {
    return playoffAverage;
  }

  public void setPlayoffAverage(Double playoffAverage) {
    this.playoffAverage = playoffAverage;
  }

  public EliminationAllianceStatus record(WLTRecord record) {
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

  public EliminationAllianceStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EliminationAllianceStatus eliminationAllianceStatus = (EliminationAllianceStatus) o;
    return Objects.equals(this.currentLevelRecord, eliminationAllianceStatus.currentLevelRecord) &&
        Objects.equals(this.level, eliminationAllianceStatus.level) &&
        Objects.equals(this.playoffAverage, eliminationAllianceStatus.playoffAverage) &&
        Objects.equals(this.record, eliminationAllianceStatus.record) &&
        Objects.equals(this.status, eliminationAllianceStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentLevelRecord, level, playoffAverage, record, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EliminationAllianceStatus {\n");
    
    sb.append("    currentLevelRecord: ").append(toIndentedString(currentLevelRecord)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    playoffAverage: ").append(toIndentedString(playoffAverage)).append("\n");
    sb.append("    record: ").append(toIndentedString(record)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

