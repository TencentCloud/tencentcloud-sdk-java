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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RulePayloadItem extends AbstractModel {

    /**
    * 字段Key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldKey")
    @Expose
    private String FieldKey;

    /**
    * 选项（eq:等于,neq:不等于,like,nlike,gt:大于,lt:小于,egt:大于等于,elt:小于等于）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Option")
    @Expose
    private String Option;

    /**
    * 值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
    * 嵌套条件组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private RulePayloadItem [] Groups;

    /**
    * RelateOption 关系操作符（and/or），用于根级别条件关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelateOption")
    @Expose
    private String RelateOption;

    /**
     * Get 字段Key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldKey 字段Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFieldKey() {
        return this.FieldKey;
    }

    /**
     * Set 字段Key
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldKey 字段Key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldKey(String FieldKey) {
        this.FieldKey = FieldKey;
    }

    /**
     * Get 选项（eq:等于,neq:不等于,like,nlike,gt:大于,lt:小于,egt:大于等于,elt:小于等于）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Option 选项（eq:等于,neq:不等于,like,nlike,gt:大于,lt:小于,egt:大于等于,elt:小于等于）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOption() {
        return this.Option;
    }

    /**
     * Set 选项（eq:等于,neq:不等于,like,nlike,gt:大于,lt:小于,egt:大于等于,elt:小于等于）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Option 选项（eq:等于,neq:不等于,like,nlike,gt:大于,lt:小于,egt:大于等于,elt:小于等于）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOption(String Option) {
        this.Option = Option;
    }

    /**
     * Get 值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    /**
     * Get 嵌套条件组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups 嵌套条件组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RulePayloadItem [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 嵌套条件组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups 嵌套条件组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(RulePayloadItem [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get RelateOption 关系操作符（and/or），用于根级别条件关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelateOption RelateOption 关系操作符（and/or），用于根级别条件关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelateOption() {
        return this.RelateOption;
    }

    /**
     * Set RelateOption 关系操作符（and/or），用于根级别条件关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelateOption RelateOption 关系操作符（and/or），用于根级别条件关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelateOption(String RelateOption) {
        this.RelateOption = RelateOption;
    }

    public RulePayloadItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RulePayloadItem(RulePayloadItem source) {
        if (source.FieldKey != null) {
            this.FieldKey = new String(source.FieldKey);
        }
        if (source.Option != null) {
            this.Option = new String(source.Option);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
        if (source.Groups != null) {
            this.Groups = new RulePayloadItem[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new RulePayloadItem(source.Groups[i]);
            }
        }
        if (source.RelateOption != null) {
            this.RelateOption = new String(source.RelateOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldKey", this.FieldKey);
        this.setParamSimple(map, prefix + "Option", this.Option);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "RelateOption", this.RelateOption);

    }
}

