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
import java.math.BigDecimal;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T11:58:53.587+08:00")
public class InlineResponse2002 {
  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("user_cash_balance")
  private BigDecimal userCashBalance = null;

  public InlineResponse2002 status(String status) {
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

  public InlineResponse2002 message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Display message
   * @return message
  **/
  @ApiModelProperty(value = "Display message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public InlineResponse2002 userCashBalance(BigDecimal userCashBalance) {
    this.userCashBalance = userCashBalance;
    return this;
  }

   /**
   * Remaining cash balance
   * @return userCashBalance
  **/
  @ApiModelProperty(value = "Remaining cash balance")
  public BigDecimal getUserCashBalance() {
    return userCashBalance;
  }

  public void setUserCashBalance(BigDecimal userCashBalance) {
    this.userCashBalance = userCashBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.status, inlineResponse2002.status) &&
        Objects.equals(this.message, inlineResponse2002.message) &&
        Objects.equals(this.userCashBalance, inlineResponse2002.userCashBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, userCashBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    userCashBalance: ").append(toIndentedString(userCashBalance)).append("\n");
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
