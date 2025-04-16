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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Column extends AbstractModel {

    /**
    * 列名称，不区分大小写，最大支持25个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 表示整个 numeric 的长度
    */
    @SerializedName("Precision")
    @Expose
    private Long Precision;

    /**
    * 表示小数部分的长度
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * 是否为null
    */
    @SerializedName("Nullable")
    @Expose
    private String Nullable;

    /**
    * 字段位置，小的在前
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 字段创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 字段修改时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 是否为分区字段
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
    * 数据脱敏策略信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataMaskStrategyInfo")
    @Expose
    private DataMaskStrategyInfo DataMaskStrategyInfo;

    /**
     * Get 列名称，不区分大小写，最大支持25个字符。 
     * @return Name 列名称，不区分大小写，最大支持25个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 列名称，不区分大小写，最大支持25个字符。
     * @param Name 列名称，不区分大小写，最大支持25个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype 
     * @return Type string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype
     * @param Type string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 对该类的注释。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 表示整个 numeric 的长度 
     * @return Precision 表示整个 numeric 的长度
     */
    public Long getPrecision() {
        return this.Precision;
    }

    /**
     * Set 表示整个 numeric 的长度
     * @param Precision 表示整个 numeric 的长度
     */
    public void setPrecision(Long Precision) {
        this.Precision = Precision;
    }

    /**
     * Get 表示小数部分的长度 
     * @return Scale 表示小数部分的长度
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 表示小数部分的长度
     * @param Scale 表示小数部分的长度
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 是否为null 
     * @return Nullable 是否为null
     */
    public String getNullable() {
        return this.Nullable;
    }

    /**
     * Set 是否为null
     * @param Nullable 是否为null
     */
    public void setNullable(String Nullable) {
        this.Nullable = Nullable;
    }

    /**
     * Get 字段位置，小的在前 
     * @return Position 字段位置，小的在前
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 字段位置，小的在前
     * @param Position 字段位置，小的在前
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 字段创建时间 
     * @return CreateTime 字段创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 字段创建时间
     * @param CreateTime 字段创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 字段修改时间 
     * @return ModifiedTime 字段修改时间
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 字段修改时间
     * @param ModifiedTime 字段修改时间
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 是否为分区字段 
     * @return IsPartition 是否为分区字段
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set 是否为分区字段
     * @param IsPartition 是否为分区字段
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    /**
     * Get 数据脱敏策略信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataMaskStrategyInfo 数据脱敏策略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataMaskStrategyInfo getDataMaskStrategyInfo() {
        return this.DataMaskStrategyInfo;
    }

    /**
     * Set 数据脱敏策略信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataMaskStrategyInfo 数据脱敏策略信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataMaskStrategyInfo(DataMaskStrategyInfo DataMaskStrategyInfo) {
        this.DataMaskStrategyInfo = DataMaskStrategyInfo;
    }

    public Column() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Column(Column source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Precision != null) {
            this.Precision = new Long(source.Precision);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.Nullable != null) {
            this.Nullable = new String(source.Nullable);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
        if (source.DataMaskStrategyInfo != null) {
            this.DataMaskStrategyInfo = new DataMaskStrategyInfo(source.DataMaskStrategyInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "Nullable", this.Nullable);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);
        this.setParamObj(map, prefix + "DataMaskStrategyInfo.", this.DataMaskStrategyInfo);

    }
}

