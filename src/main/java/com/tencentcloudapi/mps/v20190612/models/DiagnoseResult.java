/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseResult extends AbstractModel{

    /**
    * 诊断出的异常类别。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 诊断出的具体异常类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 诊断出异常开始的PTS时间戳。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Float Timestamp;

    /**
    * 诊断出的异常描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 诊断到异常的北京时间，采用 ISO 日期格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DateTime")
    @Expose
    private String DateTime;

    /**
    * 诊断出的异常级别。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SeverityLevel")
    @Expose
    private String SeverityLevel;

    /**
     * Get 诊断出的异常类别。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 诊断出的异常类别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 诊断出的异常类别。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 诊断出的异常类别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 诊断出的具体异常类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 诊断出的具体异常类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 诊断出的具体异常类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 诊断出的具体异常类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 诊断出异常开始的PTS时间戳。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp 诊断出异常开始的PTS时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 诊断出异常开始的PTS时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp 诊断出异常开始的PTS时间戳。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Float Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 诊断出的异常描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 诊断出的异常描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 诊断出的异常描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 诊断出的异常描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 诊断到异常的北京时间，采用 ISO 日期格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DateTime 诊断到异常的北京时间，采用 ISO 日期格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDateTime() {
        return this.DateTime;
    }

    /**
     * Set 诊断到异常的北京时间，采用 ISO 日期格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DateTime 诊断到异常的北京时间，采用 ISO 日期格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    /**
     * Get 诊断出的异常级别。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SeverityLevel 诊断出的异常级别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSeverityLevel() {
        return this.SeverityLevel;
    }

    /**
     * Set 诊断出的异常级别。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SeverityLevel 诊断出的异常级别。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeverityLevel(String SeverityLevel) {
        this.SeverityLevel = SeverityLevel;
    }

    public DiagnoseResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseResult(DiagnoseResult source) {
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Float(source.Timestamp);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DateTime != null) {
            this.DateTime = new String(source.DateTime);
        }
        if (source.SeverityLevel != null) {
            this.SeverityLevel = new String(source.SeverityLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DateTime", this.DateTime);
        this.setParamSimple(map, prefix + "SeverityLevel", this.SeverityLevel);

    }
}

