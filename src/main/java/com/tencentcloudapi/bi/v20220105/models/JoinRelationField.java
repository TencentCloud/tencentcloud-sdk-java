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

public class JoinRelationField extends AbstractModel {

    /**
    * 字段关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldJoinId")
    @Expose
    private String FieldJoinId;

    /**
    * 原表字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceField")
    @Expose
    private TableField SourceField;

    /**
    * 目标表字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetField")
    @Expose
    private TableField TargetField;

    /**
     * Get 字段关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldJoinId 字段关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFieldJoinId() {
        return this.FieldJoinId;
    }

    /**
     * Set 字段关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldJoinId 字段关联关系id,前端使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldJoinId(String FieldJoinId) {
        this.FieldJoinId = FieldJoinId;
    }

    /**
     * Get 原表字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceField 原表字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableField getSourceField() {
        return this.SourceField;
    }

    /**
     * Set 原表字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceField 原表字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceField(TableField SourceField) {
        this.SourceField = SourceField;
    }

    /**
     * Get 目标表字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetField 目标表字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableField getTargetField() {
        return this.TargetField;
    }

    /**
     * Set 目标表字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetField 目标表字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetField(TableField TargetField) {
        this.TargetField = TargetField;
    }

    public JoinRelationField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinRelationField(JoinRelationField source) {
        if (source.FieldJoinId != null) {
            this.FieldJoinId = new String(source.FieldJoinId);
        }
        if (source.SourceField != null) {
            this.SourceField = new TableField(source.SourceField);
        }
        if (source.TargetField != null) {
            this.TargetField = new TableField(source.TargetField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldJoinId", this.FieldJoinId);
        this.setParamObj(map, prefix + "SourceField.", this.SourceField);
        this.setParamObj(map, prefix + "TargetField.", this.TargetField);

    }
}

