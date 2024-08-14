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

public class TColumn extends AbstractModel {

    /**
    * 字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * 字段是否是非空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotNull")
    @Expose
    private Boolean NotNull;

    /**
    * 表示整个 numeric 的长度,取值1-38
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Precision")
    @Expose
    private Long Precision;

    /**
    * 表示小数部分的长度
Scale小于Precision
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
    * 字段位置，小的在前
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
     * Get 字段描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 字段描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 字段默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Default 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Default 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get 字段是否是非空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotNull 字段是否是非空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNotNull() {
        return this.NotNull;
    }

    /**
     * Set 字段是否是非空
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotNull 字段是否是非空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotNull(Boolean NotNull) {
        this.NotNull = NotNull;
    }

    /**
     * Get 表示整个 numeric 的长度,取值1-38
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Precision 表示整个 numeric 的长度,取值1-38
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPrecision() {
        return this.Precision;
    }

    /**
     * Set 表示整个 numeric 的长度,取值1-38
注意：此字段可能返回 null，表示取不到有效值。
     * @param Precision 表示整个 numeric 的长度,取值1-38
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrecision(Long Precision) {
        this.Precision = Precision;
    }

    /**
     * Get 表示小数部分的长度
Scale小于Precision
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scale 表示小数部分的长度
Scale小于Precision
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 表示小数部分的长度
Scale小于Precision
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scale 表示小数部分的长度
Scale小于Precision
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 字段位置，小的在前
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 字段位置，小的在前
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 字段位置，小的在前
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 字段位置，小的在前
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

    public TColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TColumn(TColumn source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.NotNull != null) {
            this.NotNull = new Boolean(source.NotNull);
        }
        if (source.Precision != null) {
            this.Precision = new Long(source.Precision);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "NotNull", this.NotNull);
        this.setParamSimple(map, prefix + "Precision", this.Precision);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);

    }
}

