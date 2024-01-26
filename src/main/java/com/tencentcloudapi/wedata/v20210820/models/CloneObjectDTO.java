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

public class CloneObjectDTO extends AbstractModel {

    /**
    * OBJECT_WORKFLOW，OBJECT_PARAMETER，OBJECT_EVENT，OBJECT_FUNCTION，MAPPING_CALC_ENGINE_INSTANCE，MAPPING_RESOURCE_QUEUE，MAPPING_DATASOURCE，MAPPING_DATABASE，STRATEGY_NAME_CONFLICT，STRATEGY_TASK_AUTO_COMMIT，STRATEGY_PARAMETER_AUTO_COMMIT，STRATEGY_FUNCTION_AUTO_COMMIT，STRATEGY_EVENT_AUTO_COMMIT，CONDITION_WORKFLOW，CONDITION_PARAMETER，CONDITION_EVENT，CONDITION_FUNCTION，OBJECT_PRE_CHECK
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 对象Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 对象值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 子对象列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubInfo")
    @Expose
    private SubCloneObjectDTO [] SubInfo;

    /**
     * Get OBJECT_WORKFLOW，OBJECT_PARAMETER，OBJECT_EVENT，OBJECT_FUNCTION，MAPPING_CALC_ENGINE_INSTANCE，MAPPING_RESOURCE_QUEUE，MAPPING_DATASOURCE，MAPPING_DATABASE，STRATEGY_NAME_CONFLICT，STRATEGY_TASK_AUTO_COMMIT，STRATEGY_PARAMETER_AUTO_COMMIT，STRATEGY_FUNCTION_AUTO_COMMIT，STRATEGY_EVENT_AUTO_COMMIT，CONDITION_WORKFLOW，CONDITION_PARAMETER，CONDITION_EVENT，CONDITION_FUNCTION，OBJECT_PRE_CHECK
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type OBJECT_WORKFLOW，OBJECT_PARAMETER，OBJECT_EVENT，OBJECT_FUNCTION，MAPPING_CALC_ENGINE_INSTANCE，MAPPING_RESOURCE_QUEUE，MAPPING_DATASOURCE，MAPPING_DATABASE，STRATEGY_NAME_CONFLICT，STRATEGY_TASK_AUTO_COMMIT，STRATEGY_PARAMETER_AUTO_COMMIT，STRATEGY_FUNCTION_AUTO_COMMIT，STRATEGY_EVENT_AUTO_COMMIT，CONDITION_WORKFLOW，CONDITION_PARAMETER，CONDITION_EVENT，CONDITION_FUNCTION，OBJECT_PRE_CHECK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set OBJECT_WORKFLOW，OBJECT_PARAMETER，OBJECT_EVENT，OBJECT_FUNCTION，MAPPING_CALC_ENGINE_INSTANCE，MAPPING_RESOURCE_QUEUE，MAPPING_DATASOURCE，MAPPING_DATABASE，STRATEGY_NAME_CONFLICT，STRATEGY_TASK_AUTO_COMMIT，STRATEGY_PARAMETER_AUTO_COMMIT，STRATEGY_FUNCTION_AUTO_COMMIT，STRATEGY_EVENT_AUTO_COMMIT，CONDITION_WORKFLOW，CONDITION_PARAMETER，CONDITION_EVENT，CONDITION_FUNCTION，OBJECT_PRE_CHECK
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type OBJECT_WORKFLOW，OBJECT_PARAMETER，OBJECT_EVENT，OBJECT_FUNCTION，MAPPING_CALC_ENGINE_INSTANCE，MAPPING_RESOURCE_QUEUE，MAPPING_DATASOURCE，MAPPING_DATABASE，STRATEGY_NAME_CONFLICT，STRATEGY_TASK_AUTO_COMMIT，STRATEGY_PARAMETER_AUTO_COMMIT，STRATEGY_FUNCTION_AUTO_COMMIT，STRATEGY_EVENT_AUTO_COMMIT，CONDITION_WORKFLOW，CONDITION_PARAMETER，CONDITION_EVENT，CONDITION_FUNCTION，OBJECT_PRE_CHECK
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 对象Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 对象Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 对象Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 对象Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 对象值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 对象值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 对象值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 对象值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 子对象列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubInfo 子对象列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubCloneObjectDTO [] getSubInfo() {
        return this.SubInfo;
    }

    /**
     * Set 子对象列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubInfo 子对象列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubInfo(SubCloneObjectDTO [] SubInfo) {
        this.SubInfo = SubInfo;
    }

    public CloneObjectDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneObjectDTO(CloneObjectDTO source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.SubInfo != null) {
            this.SubInfo = new SubCloneObjectDTO[source.SubInfo.length];
            for (int i = 0; i < source.SubInfo.length; i++) {
                this.SubInfo[i] = new SubCloneObjectDTO(source.SubInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "SubInfo.", this.SubInfo);

    }
}

