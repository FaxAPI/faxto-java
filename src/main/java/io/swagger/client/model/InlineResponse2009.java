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
 * InlineResponse2009
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T11:58:53.587+08:00")
public class InlineResponse2009 {
  @SerializedName("status")
  private String status = null;

  @SerializedName("user_id")
  private Integer userId = null;

  @SerializedName("created_date")
  private OffsetDateTime createdDate = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("orig_filename")
  private String origFilename = null;

  @SerializedName("preview_file")
  private String previewFile = null;

  @SerializedName("preview_image")
  private String previewImage = null;

  @SerializedName("preview_in_storage")
  private Integer previewInStorage = null;

  @SerializedName("file_extension")
  private String fileExtension = null;

  @SerializedName("filename_uploaded")
  private String filenameUploaded = null;

  @SerializedName("filesize")
  private String filesize = null;

  @SerializedName("s3")
  private Integer s3 = null;

  @SerializedName("server_document_id")
  private Integer serverDocumentId = null;

  @SerializedName("team_user_id")
  private Integer teamUserId = null;

  @SerializedName("total_pages")
  private Integer totalPages = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public InlineResponse2009 status(String status) {
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

  public InlineResponse2009 userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public InlineResponse2009 createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public InlineResponse2009 id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InlineResponse2009 filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public InlineResponse2009 origFilename(String origFilename) {
    this.origFilename = origFilename;
    return this;
  }

   /**
   * Get origFilename
   * @return origFilename
  **/
  @ApiModelProperty(value = "")
  public String getOrigFilename() {
    return origFilename;
  }

  public void setOrigFilename(String origFilename) {
    this.origFilename = origFilename;
  }

  public InlineResponse2009 previewFile(String previewFile) {
    this.previewFile = previewFile;
    return this;
  }

   /**
   * Get previewFile
   * @return previewFile
  **/
  @ApiModelProperty(value = "")
  public String getPreviewFile() {
    return previewFile;
  }

  public void setPreviewFile(String previewFile) {
    this.previewFile = previewFile;
  }

  public InlineResponse2009 previewImage(String previewImage) {
    this.previewImage = previewImage;
    return this;
  }

   /**
   * Get previewImage
   * @return previewImage
  **/
  @ApiModelProperty(value = "")
  public String getPreviewImage() {
    return previewImage;
  }

  public void setPreviewImage(String previewImage) {
    this.previewImage = previewImage;
  }

  public InlineResponse2009 previewInStorage(Integer previewInStorage) {
    this.previewInStorage = previewInStorage;
    return this;
  }

   /**
   * Get previewInStorage
   * @return previewInStorage
  **/
  @ApiModelProperty(value = "")
  public Integer getPreviewInStorage() {
    return previewInStorage;
  }

  public void setPreviewInStorage(Integer previewInStorage) {
    this.previewInStorage = previewInStorage;
  }

  public InlineResponse2009 fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

   /**
   * Get fileExtension
   * @return fileExtension
  **/
  @ApiModelProperty(value = "")
  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public InlineResponse2009 filenameUploaded(String filenameUploaded) {
    this.filenameUploaded = filenameUploaded;
    return this;
  }

   /**
   * Get filenameUploaded
   * @return filenameUploaded
  **/
  @ApiModelProperty(value = "")
  public String getFilenameUploaded() {
    return filenameUploaded;
  }

  public void setFilenameUploaded(String filenameUploaded) {
    this.filenameUploaded = filenameUploaded;
  }

  public InlineResponse2009 filesize(String filesize) {
    this.filesize = filesize;
    return this;
  }

   /**
   * Get filesize
   * @return filesize
  **/
  @ApiModelProperty(value = "")
  public String getFilesize() {
    return filesize;
  }

  public void setFilesize(String filesize) {
    this.filesize = filesize;
  }

  public InlineResponse2009 s3(Integer s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty(value = "")
  public Integer getS3() {
    return s3;
  }

  public void setS3(Integer s3) {
    this.s3 = s3;
  }

  public InlineResponse2009 serverDocumentId(Integer serverDocumentId) {
    this.serverDocumentId = serverDocumentId;
    return this;
  }

   /**
   * Get serverDocumentId
   * @return serverDocumentId
  **/
  @ApiModelProperty(value = "")
  public Integer getServerDocumentId() {
    return serverDocumentId;
  }

  public void setServerDocumentId(Integer serverDocumentId) {
    this.serverDocumentId = serverDocumentId;
  }

  public InlineResponse2009 teamUserId(Integer teamUserId) {
    this.teamUserId = teamUserId;
    return this;
  }

   /**
   * Get teamUserId
   * @return teamUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getTeamUserId() {
    return teamUserId;
  }

  public void setTeamUserId(Integer teamUserId) {
    this.teamUserId = teamUserId;
  }

  public InlineResponse2009 totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public InlineResponse2009 updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009 inlineResponse2009 = (InlineResponse2009) o;
    return Objects.equals(this.status, inlineResponse2009.status) &&
        Objects.equals(this.userId, inlineResponse2009.userId) &&
        Objects.equals(this.createdDate, inlineResponse2009.createdDate) &&
        Objects.equals(this.id, inlineResponse2009.id) &&
        Objects.equals(this.filename, inlineResponse2009.filename) &&
        Objects.equals(this.origFilename, inlineResponse2009.origFilename) &&
        Objects.equals(this.previewFile, inlineResponse2009.previewFile) &&
        Objects.equals(this.previewImage, inlineResponse2009.previewImage) &&
        Objects.equals(this.previewInStorage, inlineResponse2009.previewInStorage) &&
        Objects.equals(this.fileExtension, inlineResponse2009.fileExtension) &&
        Objects.equals(this.filenameUploaded, inlineResponse2009.filenameUploaded) &&
        Objects.equals(this.filesize, inlineResponse2009.filesize) &&
        Objects.equals(this.s3, inlineResponse2009.s3) &&
        Objects.equals(this.serverDocumentId, inlineResponse2009.serverDocumentId) &&
        Objects.equals(this.teamUserId, inlineResponse2009.teamUserId) &&
        Objects.equals(this.totalPages, inlineResponse2009.totalPages) &&
        Objects.equals(this.updatedAt, inlineResponse2009.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, userId, createdDate, id, filename, origFilename, previewFile, previewImage, previewInStorage, fileExtension, filenameUploaded, filesize, s3, serverDocumentId, teamUserId, totalPages, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009 {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    origFilename: ").append(toIndentedString(origFilename)).append("\n");
    sb.append("    previewFile: ").append(toIndentedString(previewFile)).append("\n");
    sb.append("    previewImage: ").append(toIndentedString(previewImage)).append("\n");
    sb.append("    previewInStorage: ").append(toIndentedString(previewInStorage)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    filenameUploaded: ").append(toIndentedString(filenameUploaded)).append("\n");
    sb.append("    filesize: ").append(toIndentedString(filesize)).append("\n");
    sb.append("    s3: ").append(toIndentedString(s3)).append("\n");
    sb.append("    serverDocumentId: ").append(toIndentedString(serverDocumentId)).append("\n");
    sb.append("    teamUserId: ").append(toIndentedString(teamUserId)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

