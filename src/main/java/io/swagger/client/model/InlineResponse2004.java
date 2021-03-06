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
import io.swagger.client.model.InlineResponse2004Inbox;
import io.swagger.client.model.InlineResponse2004Meta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2004
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T11:58:53.587+08:00")
public class InlineResponse2004 {
  @SerializedName("status")
  private String status = null;

  @SerializedName("inbox")
  private List<InlineResponse2004Inbox> inbox = null;

  @SerializedName("meta")
  private InlineResponse2004Meta meta = null;

  public InlineResponse2004 status(String status) {
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

  public InlineResponse2004 inbox(List<InlineResponse2004Inbox> inbox) {
    this.inbox = inbox;
    return this;
  }

  public InlineResponse2004 addInboxItem(InlineResponse2004Inbox inboxItem) {
    if (this.inbox == null) {
      this.inbox = new ArrayList<InlineResponse2004Inbox>();
    }
    this.inbox.add(inboxItem);
    return this;
  }

   /**
   * The faxes received by a certain user
   * @return inbox
  **/
  @ApiModelProperty(value = "The faxes received by a certain user")
  public List<InlineResponse2004Inbox> getInbox() {
    return inbox;
  }

  public void setInbox(List<InlineResponse2004Inbox> inbox) {
    this.inbox = inbox;
  }

  public InlineResponse2004 meta(InlineResponse2004Meta meta) {
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
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.status, inlineResponse2004.status) &&
        Objects.equals(this.inbox, inlineResponse2004.inbox) &&
        Objects.equals(this.meta, inlineResponse2004.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, inbox, meta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    inbox: ").append(toIndentedString(inbox)).append("\n");
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

