/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchColumnDocVO extends AbstractModel {

    /**
    * 字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * 字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段类型长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 字段类型精度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Precision")
    @Expose
    private Long Precision;

    /**
    * 字段类型scale
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
    * 字段描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 字段的顺序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 是否为分区字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
    * 列上的索引类型 主键: PRI,唯一索引: UNI,一般索引: MUL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnKey")
    @Expose
    private String ColumnKey;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
     * Get 字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChineseName 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChineseName 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get 字段类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 字段类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字段类型长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Length 字段类型长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 字段类型长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Length 字段类型长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 字段类型精度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Precision 字段类型精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPrecision() {
        return this.Precision;
    }

    /**
     * Set 字段类型精度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Precision 字段类型精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrecision(Long Precision) {
        this.Precision = Precision;
    }

    /**
     * Get 字段类型scale
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scale 字段类型scale
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 字段类型scale
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scale 字段类型scale
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 字段默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Get 字段描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 字段的顺序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 字段的顺序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 字段的顺序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 字段的顺序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 是否为分区字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPartition 是否为分区字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set 是否为分区字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPartition 是否为分区字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    /**
     * Get 列上的索引类型 主键: PRI,唯一索引: UNI,一般索引: MUL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnKey 列上的索引类型 主键: PRI,唯一索引: UNI,一般索引: MUL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnKey() {
        return this.ColumnKey;
    }

    /**
     * Set 列上的索引类型 主键: PRI,唯一索引: UNI,一般索引: MUL
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnKey 列上的索引类型 主键: PRI,唯一索引: UNI,一般索引: MUL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnKey(String ColumnKey) {
        this.ColumnKey = ColumnKey;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    public SearchColumnDocVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchColumnDocVO(SearchColumnDocVO source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ChineseName != null) {
            this.ChineseName = new String(source.ChineseName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.Precision != null) {
            this.Precision = new Long(source.Precision);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.DefaultValue != null) {
            this.DefaultValue = new String(source.DefaultValue);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
        if (source.ColumnKey != null) {
            this.ColumnKey = new String(source.ColumnKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ChineseName", this.ChineseName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);
        this.setParamSimple(map, prefix + "ColumnKey", this.ColumnKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);

    }
}

