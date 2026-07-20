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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rule extends AbstractModel {

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>修改时间</p>
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * <p>使能开关</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>规则ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>事件集ID</p>
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * <p>规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>Target 简要信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Targets")
    @Expose
    private TargetBrief [] Targets;

    /**
    * <p>rule设置的dlq规则. 可能为null</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeadLetterConfig")
    @Expose
    private DeadLetterConfig DeadLetterConfig;

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>修改时间</p> 
     * @return ModTime <p>修改时间</p>
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set <p>修改时间</p>
     * @param ModTime <p>修改时间</p>
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get <p>使能开关</p> 
     * @return Enable <p>使能开关</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>使能开关</p>
     * @param Enable <p>使能开关</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>规则ID</p> 
     * @return RuleId <p>规则ID</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则ID</p>
     * @param RuleId <p>规则ID</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>创建时间</p> 
     * @return AddTime <p>创建时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param AddTime <p>创建时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>事件集ID</p> 
     * @return EventBusId <p>事件集ID</p>
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set <p>事件集ID</p>
     * @param EventBusId <p>事件集ID</p>
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get <p>规则名称</p> 
     * @return RuleName <p>规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称</p>
     * @param RuleName <p>规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>Target 简要信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Targets <p>Target 简要信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetBrief [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>Target 简要信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Targets <p>Target 简要信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargets(TargetBrief [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>rule设置的dlq规则. 可能为null</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeadLetterConfig <p>rule设置的dlq规则. 可能为null</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeadLetterConfig getDeadLetterConfig() {
        return this.DeadLetterConfig;
    }

    /**
     * Set <p>rule设置的dlq规则. 可能为null</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeadLetterConfig <p>rule设置的dlq规则. 可能为null</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadLetterConfig(DeadLetterConfig DeadLetterConfig) {
        this.DeadLetterConfig = DeadLetterConfig;
    }

    public Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rule(Rule source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Targets != null) {
            this.Targets = new TargetBrief[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new TargetBrief(source.Targets[i]);
            }
        }
        if (source.DeadLetterConfig != null) {
            this.DeadLetterConfig = new DeadLetterConfig(source.DeadLetterConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamObj(map, prefix + "DeadLetterConfig.", this.DeadLetterConfig);

    }
}

