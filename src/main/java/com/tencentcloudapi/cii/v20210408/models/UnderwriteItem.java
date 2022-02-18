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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnderwriteItem extends AbstractModel{

    /**
    * 字段名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 结果
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 风险值或者说明
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 参考范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Range")
    @Expose
    private String Range;

    /**
    * 报告时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportDate")
    @Expose
    private String [] ReportDate;

    /**
    * 文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 检查项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InspectProject")
    @Expose
    private String InspectProject;

    /**
    * 单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 原名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginName")
    @Expose
    private String OriginName;

    /**
    * 阴阳性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YinYang")
    @Expose
    private String YinYang;

    /**
     * Get 字段名 
     * @return Name 字段名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名
     * @param Name 字段名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 结果 
     * @return Result 结果
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果
     * @param Result 结果
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 风险值或者说明 
     * @return Value 风险值或者说明
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 风险值或者说明
     * @param Value 风险值或者说明
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 参考范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Range 参考范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRange() {
        return this.Range;
    }

    /**
     * Set 参考范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Range 参考范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRange(String Range) {
        this.Range = Range;
    }

    /**
     * Get 报告时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportDate 报告时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReportDate() {
        return this.ReportDate;
    }

    /**
     * Set 报告时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportDate 报告时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportDate(String [] ReportDate) {
        this.ReportDate = ReportDate;
    }

    /**
     * Get 文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileType 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileType 文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 检查项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InspectProject 检查项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInspectProject() {
        return this.InspectProject;
    }

    /**
     * Set 检查项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param InspectProject 检查项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInspectProject(String InspectProject) {
        this.InspectProject = InspectProject;
    }

    /**
     * Get 单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 原名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginName 原名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginName() {
        return this.OriginName;
    }

    /**
     * Set 原名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginName 原名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginName(String OriginName) {
        this.OriginName = OriginName;
    }

    /**
     * Get 阴阳性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YinYang 阴阳性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYinYang() {
        return this.YinYang;
    }

    /**
     * Set 阴阳性
注意：此字段可能返回 null，表示取不到有效值。
     * @param YinYang 阴阳性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYinYang(String YinYang) {
        this.YinYang = YinYang;
    }

    public UnderwriteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnderwriteItem(UnderwriteItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Range != null) {
            this.Range = new String(source.Range);
        }
        if (source.ReportDate != null) {
            this.ReportDate = new String[source.ReportDate.length];
            for (int i = 0; i < source.ReportDate.length; i++) {
                this.ReportDate[i] = new String(source.ReportDate[i]);
            }
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.InspectProject != null) {
            this.InspectProject = new String(source.InspectProject);
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.OriginName != null) {
            this.OriginName = new String(source.OriginName);
        }
        if (source.YinYang != null) {
            this.YinYang = new String(source.YinYang);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Range", this.Range);
        this.setParamArraySimple(map, prefix + "ReportDate.", this.ReportDate);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "InspectProject", this.InspectProject);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "OriginName", this.OriginName);
        this.setParamSimple(map, prefix + "YinYang", this.YinYang);

    }
}

