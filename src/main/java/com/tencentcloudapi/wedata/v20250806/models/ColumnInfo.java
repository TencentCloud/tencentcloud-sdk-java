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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnInfo extends AbstractModel {

    /**
    * 字段类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

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
     * Get 字段名称 
     * @return Name 字段名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名称
     * @param Name 字段名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Length 字段长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 字段长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Length 字段长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLength(Long Length) {
        this.Length = Length;
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

    public ColumnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnInfo(ColumnInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);

    }
}

