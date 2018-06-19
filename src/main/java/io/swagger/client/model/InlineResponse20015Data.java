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
 * InlineResponse20015Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T11:58:53.587+08:00")
public class InlineResponse20015Data {
  @SerializedName("did_group_id")
  private Integer didGroupId = null;

  @SerializedName("area_code")
  private String areaCode = null;

  @SerializedName("city_name")
  private String cityName = null;

  public InlineResponse20015Data didGroupId(Integer didGroupId) {
    this.didGroupId = didGroupId;
    return this;
  }

   /**
   * Get didGroupId
   * @return didGroupId
  **/
  @ApiModelProperty(value = "")
  public Integer getDidGroupId() {
    return didGroupId;
  }

  public void setDidGroupId(Integer didGroupId) {
    this.didGroupId = didGroupId;
  }

  public InlineResponse20015Data areaCode(String areaCode) {
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

  public InlineResponse20015Data cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * Get cityName
   * @return cityName
  **/
  @ApiModelProperty(value = "")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20015Data inlineResponse20015Data = (InlineResponse20015Data) o;
    return Objects.equals(this.didGroupId, inlineResponse20015Data.didGroupId) &&
        Objects.equals(this.areaCode, inlineResponse20015Data.areaCode) &&
        Objects.equals(this.cityName, inlineResponse20015Data.cityName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(didGroupId, areaCode, cityName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20015Data {\n");
    
    sb.append("    didGroupId: ").append(toIndentedString(didGroupId)).append("\n");
    sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
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
