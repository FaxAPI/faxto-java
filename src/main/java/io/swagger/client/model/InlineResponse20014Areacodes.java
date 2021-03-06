/*
 * Fax.to REST API client for Java
 * This is Fax.to REST API client for Java.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: inquiries@fax.to
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InlineResponse20014Areacodes
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T11:58:53.587+08:00")
public class InlineResponse20014Areacodes {
  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("state_id")
  private Integer stateId = null;

  @SerializedName("area_code")
  private String areaCode = null;

  public InlineResponse20014Areacodes countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Get countryCode
   * @return countryCode
  **/
  @ApiModelProperty(value = "")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public InlineResponse20014Areacodes stateId(Integer stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @ApiModelProperty(value = "")
  public Integer getStateId() {
    return stateId;
  }

  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }

  public InlineResponse20014Areacodes areaCode(String areaCode) {
    this.areaCode = areaCode;
    return this;
  }

   /**
   * Get areaCode
   * @return areaCode
  **/
  @ApiModelProperty(value = "")
  public String getAreaCode() {
    return areaCode;
  }

  public void setAreaCode(String areaCode) {
    this.areaCode = areaCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014Areacodes inlineResponse20014Areacodes = (InlineResponse20014Areacodes) o;
    return Objects.equals(this.countryCode, inlineResponse20014Areacodes.countryCode) &&
        Objects.equals(this.stateId, inlineResponse20014Areacodes.stateId) &&
        Objects.equals(this.areaCode, inlineResponse20014Areacodes.areaCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, stateId, areaCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014Areacodes {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
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

