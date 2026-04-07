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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Column extends AbstractModel {

    /**
    * <p>列名称，不区分大小写，最大支持25个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>对该类的注释。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>表示整个 numeric 的长度</p>
    */
    @SerializedName("Precision")
    @Expose
    private Long Precision;

    /**
    * <p>表示小数部分的长度</p>
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * <p>是否为null</p>
    */
    @SerializedName("Nullable")
    @Expose
    private String Nullable;

    /**
    * <p>字段位置，小的在前</p>
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * <p>字段创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>字段修改时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * <p>是否为分区字段</p>
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
    * <p>数据脱敏策略信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataMaskStrategyInfo")
    @Expose
    private DataMaskStrategyInfo DataMaskStrategyInfo;

    /**
    * <p>数据字段说明</p>
    */
    @SerializedName("TypeText")
    @Expose
    private String TypeText;

    /**
     * Get <p>列名称，不区分大小写，最大支持25个字符。</p> 
     * @return Name <p>列名称，不区分大小写，最大支持25个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>列名称，不区分大小写，最大支持25个字符。</p>
     * @param Name <p>列名称，不区分大小写，最大支持25个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype</p> 
     * @return Type <p>string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype</p>
     * @param Type <p>string|tinyint|smallint|int|bigint|boolean|float|double|decimal|timestamp|date|binary|array|map|struct|uniontype</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>对该类的注释。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment <p>对该类的注释。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>对该类的注释。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment <p>对该类的注释。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>表示整个 numeric 的长度</p> 
     * @return Precision <p>表示整个 numeric 的长度</p>
     */
    public Long getPrecision() {
        return this.Precision;
    }

    /**
     * Set <p>表示整个 numeric 的长度</p>
     * @param Precision <p>表示整个 numeric 的长度</p>
     */
    public void setPrecision(Long Precision) {
        this.Precision = Precision;
    }

    /**
     * Get <p>表示小数部分的长度</p> 
     * @return Scale <p>表示小数部分的长度</p>
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set <p>表示小数部分的长度</p>
     * @param Scale <p>表示小数部分的长度</p>
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get <p>是否为null</p> 
     * @return Nullable <p>是否为null</p>
     */
    public String getNullable() {
        return this.Nullable;
    }

    /**
     * Set <p>是否为null</p>
     * @param Nullable <p>是否为null</p>
     */
    public void setNullable(String Nullable) {
        this.Nullable = Nullable;
    }

    /**
     * Get <p>字段位置，小的在前</p> 
     * @return Position <p>字段位置，小的在前</p>
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set <p>字段位置，小的在前</p>
     * @param Position <p>字段位置，小的在前</p>
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get <p>字段创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return CreateTime <p>字段创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>字段创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param CreateTime <p>字段创建时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>字段修改时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return ModifiedTime <p>字段修改时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>字段修改时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param ModifiedTime <p>字段修改时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>是否为分区字段</p> 
     * @return IsPartition <p>是否为分区字段</p>
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set <p>是否为分区字段</p>
     * @param IsPartition <p>是否为分区字段</p>
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    /**
     * Get <p>数据脱敏策略信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataMaskStrategyInfo <p>数据脱敏策略信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataMaskStrategyInfo getDataMaskStrategyInfo() {
        return this.DataMaskStrategyInfo;
    }

    /**
     * Set <p>数据脱敏策略信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataMaskStrategyInfo <p>数据脱敏策略信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataMaskStrategyInfo(DataMaskStrategyInfo DataMaskStrategyInfo) {
        this.DataMaskStrategyInfo = DataMaskStrategyInfo;
    }

    /**
     * Get <p>数据字段说明</p> 
     * @return TypeText <p>数据字段说明</p>
     */
    public String getTypeText() {
        return this.TypeText;
    }

    /**
     * Set <p>数据字段说明</p>
     * @param TypeText <p>数据字段说明</p>
     */
    public void setTypeText(String TypeText) {
        this.TypeText = TypeText;
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
        if (source.TypeText != null) {
            this.TypeText = new String(source.TypeText);
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
        this.setParamSimple(map, prefix + "TypeText", this.TypeText);

    }
}

