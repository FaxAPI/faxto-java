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
import io.swagger.client.model.InlineResponse20017Numbers;
import io.swagger.client.model.InlineResponse2004Meta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse20017
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T11:58:53.587+08:00")
public class InlineResponse20017 {
  @SerializedName("status")
  private String status = null;

  @SerializedName("numbers")
  private List<InlineResponse20017Numbers> numbers = null;

  @SerializedName("meta")
  private InlineResponse2004Meta meta = null;

  public InlineResponse20017 status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the API request
   * @return status
  **/
  @ApiModelProperty(value = "The status of the API request")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public InlineResponse20017 numbers(List<InlineResponse20017Numbers> numbers) {
    this.numbers = numbers;
    return this;
  }

  public InlineResponse20017 addNumbersItem(InlineResponse20017Numbers numbersItem) {
    if (this.numbers == null) {
      this.numbers = new ArrayList<InlineResponse20017Numbers>();
    }
    this.numbers.add(numbersItem);
    return this;
  }

   /**
   * Numbers data
   * @return numbers
  **/
  @ApiModelProperty(value = "Numbers data")
  public List<InlineResponse20017Numbers> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<InlineResponse20017Numbers> numbers) {
    this.numbers = numbers;
  }

  public InlineResponse20017 meta(InlineResponse2004Meta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2004Meta getMeta() {
    return meta;
  }

  public void setMeta(InlineResponse2004Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20017 inlineResponse20017 = (InlineResponse20017) o;
    return Objects.equals(this.status, inlineResponse20017.status) &&
        Objects.equals(this.numbers, inlineResponse20017.numbers) &&
        Objects.equals(this.meta, inlineResponse20017.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, numbers, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20017 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numbers: ").append(toIndentedString(numbers)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

