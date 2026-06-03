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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JoinSourceTable extends AbstractModel {

    /**
    * 1:数据源原表,2:本地表,3:Excel表,4:API表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNodeType")
    @Expose
    private Long TableNodeType;

    /**
    * 原始表节点Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNodeId")
    @Expose
    private String TableNodeId;

    /**
    * 父节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 非必填, 数据源原表没有ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 必填,数据源原表用原始表名, 其他类型用BI的逻辑表名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 原始表需要展示的字段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fields")
    @Expose
    private TableField [] Fields;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 非必填,前端展示的数据源别名,excel建表需要
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableAlias")
    @Expose
    private String TableAlias;

    /**
     * Get 1:数据源原表,2:本地表,3:Excel表,4:API表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNodeType 1:数据源原表,2:本地表,3:Excel表,4:API表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableNodeType() {
        return this.TableNodeType;
    }

    /**
     * Set 1:数据源原表,2:本地表,3:Excel表,4:API表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNodeType 1:数据源原表,2:本地表,3:Excel表,4:API表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNodeType(Long TableNodeType) {
        this.TableNodeType = TableNodeType;
    }

    /**
     * Get 原始表节点Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNodeId 原始表节点Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableNodeId() {
        return this.TableNodeId;
    }

    /**
     * Set 原始表节点Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNodeId 原始表节点Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNodeId(String TableNodeId) {
        this.TableNodeId = TableNodeId;
    }

    /**
     * Get 父节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 父节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 父节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 父节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 非必填, 数据源原表没有ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 非必填, 数据源原表没有ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 非必填, 数据源原表没有ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 非必填, 数据源原表没有ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 必填,数据源原表用原始表名, 其他类型用BI的逻辑表名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 必填,数据源原表用原始表名, 其他类型用BI的逻辑表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 必填,数据源原表用原始表名, 其他类型用BI的逻辑表名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 必填,数据源原表用原始表名, 其他类型用BI的逻辑表名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 原始表需要展示的字段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fields 原始表需要展示的字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableField [] getFields() {
        return this.Fields;
    }

    /**
     * Set 原始表需要展示的字段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fields 原始表需要展示的字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFields(TableField [] Fields) {
        this.Fields = Fields;
    }

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 非必填,前端展示的数据源别名,excel建表需要
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableAlias 非必填,前端展示的数据源别名,excel建表需要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableAlias() {
        return this.TableAlias;
    }

    /**
     * Set 非必填,前端展示的数据源别名,excel建表需要
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableAlias 非必填,前端展示的数据源别名,excel建表需要
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableAlias(String TableAlias) {
        this.TableAlias = TableAlias;
    }

    public JoinSourceTable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinSourceTable(JoinSourceTable source) {
        if (source.TableNodeType != null) {
            this.TableNodeType = new Long(source.TableNodeType);
        }
        if (source.TableNodeId != null) {
            this.TableNodeId = new String(source.TableNodeId);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Fields != null) {
            this.Fields = new TableField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new TableField(source.Fields[i]);
            }
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.TableAlias != null) {
            this.TableAlias = new String(source.TableAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableNodeType", this.TableNodeType);
        this.setParamSimple(map, prefix + "TableNodeId", this.TableNodeId);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "TableAlias", this.TableAlias);

    }
}

