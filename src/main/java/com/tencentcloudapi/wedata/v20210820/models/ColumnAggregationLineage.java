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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnAggregationLineage extends AbstractModel{

    /**
    * 表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * 字符串类型的父节点集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentSet")
    @Expose
    private String ParentSet;

    /**
    * 字符串类型的子节点集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChildSet")
    @Expose
    private String ChildSet;

    /**
    * 列信息集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnInfoSet")
    @Expose
    private SimpleColumnInfo [] ColumnInfoSet;

    /**
     * Get 表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 父节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 元数据类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastoreType 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastoreType 元数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastoreType(String MetastoreType) {
        this.MetastoreType = MetastoreType;
    }

    /**
     * Get 字符串类型的父节点集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentSet 字符串类型的父节点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentSet() {
        return this.ParentSet;
    }

    /**
     * Set 字符串类型的父节点集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentSet 字符串类型的父节点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentSet(String ParentSet) {
        this.ParentSet = ParentSet;
    }

    /**
     * Get 字符串类型的子节点集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChildSet 字符串类型的子节点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChildSet() {
        return this.ChildSet;
    }

    /**
     * Set 字符串类型的子节点集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChildSet 字符串类型的子节点集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChildSet(String ChildSet) {
        this.ChildSet = ChildSet;
    }

    /**
     * Get 列信息集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnInfoSet 列信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimpleColumnInfo [] getColumnInfoSet() {
        return this.ColumnInfoSet;
    }

    /**
     * Set 列信息集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnInfoSet 列信息集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnInfoSet(SimpleColumnInfo [] ColumnInfoSet) {
        this.ColumnInfoSet = ColumnInfoSet;
    }

    public ColumnAggregationLineage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnAggregationLineage(ColumnAggregationLineage source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.ParentSet != null) {
            this.ParentSet = new String(source.ParentSet);
        }
        if (source.ChildSet != null) {
            this.ChildSet = new String(source.ChildSet);
        }
        if (source.ColumnInfoSet != null) {
            this.ColumnInfoSet = new SimpleColumnInfo[source.ColumnInfoSet.length];
            for (int i = 0; i < source.ColumnInfoSet.length; i++) {
                this.ColumnInfoSet[i] = new SimpleColumnInfo(source.ColumnInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "ParentSet", this.ParentSet);
        this.setParamSimple(map, prefix + "ChildSet", this.ChildSet);
        this.setParamArrayObj(map, prefix + "ColumnInfoSet.", this.ColumnInfoSet);

    }
}

