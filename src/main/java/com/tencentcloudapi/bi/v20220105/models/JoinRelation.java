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

public class JoinRelation extends AbstractModel {

    /**
    * 表关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinId")
    @Expose
    private String JoinId;

    /**
    * 原表节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceTableNodeId")
    @Expose
    private String SourceTableNodeId;

    /**
    * 目标表节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetTableNodeId")
    @Expose
    private String TargetTableNodeId;

    /**
    * 多表关联的关联类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * 多表关联的字段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fields")
    @Expose
    private JoinRelationField [] Fields;

    /**
     * Get 表关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinId 表关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJoinId() {
        return this.JoinId;
    }

    /**
     * Set 表关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinId 表关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinId(String JoinId) {
        this.JoinId = JoinId;
    }

    /**
     * Get 原表节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceTableNodeId 原表节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceTableNodeId() {
        return this.SourceTableNodeId;
    }

    /**
     * Set 原表节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceTableNodeId 原表节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceTableNodeId(String SourceTableNodeId) {
        this.SourceTableNodeId = SourceTableNodeId;
    }

    /**
     * Get 目标表节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetTableNodeId 目标表节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetTableNodeId() {
        return this.TargetTableNodeId;
    }

    /**
     * Set 目标表节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetTableNodeId 目标表节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetTableNodeId(String TargetTableNodeId) {
        this.TargetTableNodeId = TargetTableNodeId;
    }

    /**
     * Get 多表关联的关联类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinType 多表关联的关联类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set 多表关联的关联类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinType 多表关联的关联类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get 多表关联的字段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fields 多表关联的字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JoinRelationField [] getFields() {
        return this.Fields;
    }

    /**
     * Set 多表关联的字段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fields 多表关联的字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFields(JoinRelationField [] Fields) {
        this.Fields = Fields;
    }

    public JoinRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinRelation(JoinRelation source) {
        if (source.JoinId != null) {
            this.JoinId = new String(source.JoinId);
        }
        if (source.SourceTableNodeId != null) {
            this.SourceTableNodeId = new String(source.SourceTableNodeId);
        }
        if (source.TargetTableNodeId != null) {
            this.TargetTableNodeId = new String(source.TargetTableNodeId);
        }
        if (source.JoinType != null) {
            this.JoinType = new String(source.JoinType);
        }
        if (source.Fields != null) {
            this.Fields = new JoinRelationField[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new JoinRelationField(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JoinId", this.JoinId);
        this.setParamSimple(map, prefix + "SourceTableNodeId", this.SourceTableNodeId);
        this.setParamSimple(map, prefix + "TargetTableNodeId", this.TargetTableNodeId);
        this.setParamSimple(map, prefix + "JoinType", this.JoinType);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);

    }
}

