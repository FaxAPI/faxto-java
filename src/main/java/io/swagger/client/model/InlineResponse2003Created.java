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
import org.threeten.bp.OffsetDateTime;

/**
 * InlineResponse2003Created
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T11:58:53.587+08:00")
public class InlineResponse2003Created {
  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("timezone_type")
  private Integer timezoneType = null;

  @SerializedName("timezone")
  private String timezone = null;

  public InlineResponse2003Created date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public InlineResponse2003Created timezoneType(Integer timezoneType) {
    this.timezoneType = timezoneType;
    return this;
  }

   /**
   * Get timezoneType
   * @return timezoneType
  **/
  @ApiModelProperty(value = "")
  public Integer getTimezoneType() {
    return timezoneType;
  }

  public void setTimezoneType(Integer timezoneType) {
    this.timezoneType = timezoneType;
  }

  public InlineResponse2003Created timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @ApiModelProperty(value = "")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Created inlineResponse2003Created = (InlineResponse2003Created) o;
    return Objects.equals(this.date, inlineResponse2003Created.date) &&
        Objects.equals(this.timezoneType, inlineResponse2003Created.timezoneType) &&
        Objects.equals(this.timezone, inlineResponse2003Created.timezone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, timezoneType, timezone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Created {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    timezoneType: ").append(toIndentedString(timezoneType)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

