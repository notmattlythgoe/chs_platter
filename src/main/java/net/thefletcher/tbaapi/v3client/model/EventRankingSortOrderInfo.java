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
 * EventRankingSortOrderInfo
 */

public class EventRankingSortOrderInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("precision")
  private Integer precision = null;

  public EventRankingSortOrderInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the field used in the &#x60;sort_order&#x60; array.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the field used in the `sort_order` array.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EventRankingSortOrderInfo precision(Integer precision) {
    this.precision = precision;
    return this;
  }

   /**
   * Integer expressing the number of digits of precision in the number provided in &#x60;sort_orders&#x60;.
   * @return precision
  **/
  @ApiModelProperty(required = true, value = "Integer expressing the number of digits of precision in the number provided in `sort_orders`.")
  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventRankingSortOrderInfo eventRankingSortOrderInfo = (EventRankingSortOrderInfo) o;
    return Objects.equals(this.name, eventRankingSortOrderInfo.name) &&
        Objects.equals(this.precision, eventRankingSortOrderInfo.precision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, precision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventRankingSortOrderInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
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

