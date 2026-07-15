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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConditionsTemp extends AbstractModel {

    /**
    * <p>模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Condition")
    @Expose
    private AlarmPolicyCondition Condition;

    /**
    * <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventCondition")
    @Expose
    private AlarmPolicyEventCondition EventCondition;

    /**
     * Get <p>模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateName <p>模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set <p>模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateName <p>模板名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Condition <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyCondition getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Condition <p>指标触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCondition(AlarmPolicyCondition Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventCondition <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyEventCondition getEventCondition() {
        return this.EventCondition;
    }

    /**
     * Set <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventCondition <p>事件触发条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventCondition(AlarmPolicyEventCondition EventCondition) {
        this.EventCondition = EventCondition;
    }

    public ConditionsTemp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConditionsTemp(ConditionsTemp source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Condition != null) {
            this.Condition = new AlarmPolicyCondition(source.Condition);
        }
        if (source.EventCondition != null) {
            this.EventCondition = new AlarmPolicyEventCondition(source.EventCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamObj(map, prefix + "Condition.", this.Condition);
        this.setParamObj(map, prefix + "EventCondition.", this.EventCondition);

    }
}

