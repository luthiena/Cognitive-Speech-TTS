/*
 * Speech Services API v3.0-beta1
 * Speech Services API v3.0-beta1.
 *
 * OpenAPI spec version: v3.0-beta1
 * Contact: crservice@microsoft.com
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DatasetDefinition
 */
public class DatasetDefinition {
  /**
   * The kind of the dataset (e.g. acoustic data, language data ...)
   */
  @JsonAdapter(DataImportKindEnum.Adapter.class)
  public enum DataImportKindEnum {
    NONE("None"),
    
    LANGUAGE("Language"),
    
    ACOUSTIC("Acoustic"),
    
    PRONUNCIATION("Pronunciation"),
    
    CUSTOMVOICE("CustomVoice"),
    
    LANGUAGEGENERATION("LanguageGeneration"),
    
    AUDIOFILES("AudioFiles");

    private String value;

    DataImportKindEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataImportKindEnum fromValue(String text) {
      for (DataImportKindEnum b : DataImportKindEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DataImportKindEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataImportKindEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataImportKindEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DataImportKindEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("dataImportKind")
  private DataImportKindEnum dataImportKind = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("properties")
  private Map<String, String> properties = null;

  @SerializedName("locale")
  private String locale = null;

  public DatasetDefinition dataImportKind(DataImportKindEnum dataImportKind) {
    this.dataImportKind = dataImportKind;
    return this;
  }

   /**
   * The kind of the dataset (e.g. acoustic data, language data ...)
   * @return dataImportKind
  **/
  @ApiModelProperty(required = true, value = "The kind of the dataset (e.g. acoustic data, language data ...)")
  public DataImportKindEnum getDataImportKind() {
    return dataImportKind;
  }

  public void setDataImportKind(DataImportKindEnum dataImportKind) {
    this.dataImportKind = dataImportKind;
  }

  public DatasetDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the object
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DatasetDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the object
   * @return description
  **/
  @ApiModelProperty(value = "The description of the object")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DatasetDefinition properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public DatasetDefinition putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The custom properties of this entity
   * @return properties
  **/
  @ApiModelProperty(value = "The custom properties of this entity")
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  public DatasetDefinition locale(String locale) {
    this.locale = locale;
    return this;
  }

   /**
   * The locale of the contained data
   * @return locale
  **/
  @ApiModelProperty(value = "The locale of the contained data")
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetDefinition datasetDefinition = (DatasetDefinition) o;
    return Objects.equals(this.dataImportKind, datasetDefinition.dataImportKind) &&
        Objects.equals(this.name, datasetDefinition.name) &&
        Objects.equals(this.description, datasetDefinition.description) &&
        Objects.equals(this.properties, datasetDefinition.properties) &&
        Objects.equals(this.locale, datasetDefinition.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataImportKind, name, description, properties, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetDefinition {\n");
    
    sb.append("    dataImportKind: ").append(toIndentedString(dataImportKind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
