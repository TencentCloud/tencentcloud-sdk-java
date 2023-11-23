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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnMeta extends AbstractModel {

    /**
    * 字段英文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameCn")
    @Expose
    private String NameCn;

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
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 字段序号
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
    * 字段名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * HBase列簇属性集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnFamiliesFieldSet")
    @Expose
    private Pair [] ColumnFamiliesFieldSet;

    /**
     * Get 字段英文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameEn 字段英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set 字段英文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameEn 字段英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameCn 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameCn() {
        return this.NameCn;
    }

    /**
     * Set 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameCn 字段中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameCn(String NameCn) {
        this.NameCn = NameCn;
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
     * Get 字段序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 字段序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 字段序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 字段序号
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
     * Get 字段名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 字段名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get HBase列簇属性集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnFamiliesFieldSet HBase列簇属性集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Pair [] getColumnFamiliesFieldSet() {
        return this.ColumnFamiliesFieldSet;
    }

    /**
     * Set HBase列簇属性集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnFamiliesFieldSet HBase列簇属性集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnFamiliesFieldSet(Pair [] ColumnFamiliesFieldSet) {
        this.ColumnFamiliesFieldSet = ColumnFamiliesFieldSet;
    }

    public ColumnMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnMeta(ColumnMeta source) {
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.NameCn != null) {
            this.NameCn = new String(source.NameCn);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ColumnFamiliesFieldSet != null) {
            this.ColumnFamiliesFieldSet = new Pair[source.ColumnFamiliesFieldSet.length];
            for (int i = 0; i < source.ColumnFamiliesFieldSet.length; i++) {
                this.ColumnFamiliesFieldSet[i] = new Pair(source.ColumnFamiliesFieldSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "NameCn", this.NameCn);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "ColumnFamiliesFieldSet.", this.ColumnFamiliesFieldSet);

    }
}

