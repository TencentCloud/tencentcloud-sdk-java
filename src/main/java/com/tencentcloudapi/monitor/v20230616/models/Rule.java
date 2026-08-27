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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rule extends AbstractModel {

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 对外namespace
    */
    @SerializedName("ExtNamespace")
    @Expose
    private String ExtNamespace;

    /**
    * 对外指标列表
    */
    @SerializedName("ExtMetric")
    @Expose
    private ExtMetric [] ExtMetric;

    /**
    * 输出信息
    */
    @SerializedName("Producer")
    @Expose
    private Producer Producer;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 规则触发状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 指标粒度周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Period")
    @Expose
    private Long [] Period;

    /**
    * 转发过滤条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DispenseConditions")
    @Expose
    private DispenseCondition [] DispenseConditions;

    /**
    * 转发地域列表
    */
    @SerializedName("DispenseRegions")
    @Expose
    private String [] DispenseRegions;

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 对外namespace 
     * @return ExtNamespace 对外namespace
     */
    public String getExtNamespace() {
        return this.ExtNamespace;
    }

    /**
     * Set 对外namespace
     * @param ExtNamespace 对外namespace
     */
    public void setExtNamespace(String ExtNamespace) {
        this.ExtNamespace = ExtNamespace;
    }

    /**
     * Get 对外指标列表 
     * @return ExtMetric 对外指标列表
     */
    public ExtMetric [] getExtMetric() {
        return this.ExtMetric;
    }

    /**
     * Set 对外指标列表
     * @param ExtMetric 对外指标列表
     */
    public void setExtMetric(ExtMetric [] ExtMetric) {
        this.ExtMetric = ExtMetric;
    }

    /**
     * Get 输出信息 
     * @return Producer 输出信息
     */
    public Producer getProducer() {
        return this.Producer;
    }

    /**
     * Set 输出信息
     * @param Producer 输出信息
     */
    public void setProducer(Producer Producer) {
        this.Producer = Producer;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 规则触发状态 
     * @return Status 规则触发状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则触发状态
     * @param Status 规则触发状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 指标粒度周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Period 指标粒度周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPeriod() {
        return this.Period;
    }

    /**
     * Set 指标粒度周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Period 指标粒度周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriod(Long [] Period) {
        this.Period = Period;
    }

    /**
     * Get 转发过滤条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DispenseConditions 转发过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DispenseCondition [] getDispenseConditions() {
        return this.DispenseConditions;
    }

    /**
     * Set 转发过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param DispenseConditions 转发过滤条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDispenseConditions(DispenseCondition [] DispenseConditions) {
        this.DispenseConditions = DispenseConditions;
    }

    /**
     * Get 转发地域列表 
     * @return DispenseRegions 转发地域列表
     */
    public String [] getDispenseRegions() {
        return this.DispenseRegions;
    }

    /**
     * Set 转发地域列表
     * @param DispenseRegions 转发地域列表
     */
    public void setDispenseRegions(String [] DispenseRegions) {
        this.DispenseRegions = DispenseRegions;
    }

    public Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rule(Rule source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExtNamespace != null) {
            this.ExtNamespace = new String(source.ExtNamespace);
        }
        if (source.ExtMetric != null) {
            this.ExtMetric = new ExtMetric[source.ExtMetric.length];
            for (int i = 0; i < source.ExtMetric.length; i++) {
                this.ExtMetric[i] = new ExtMetric(source.ExtMetric[i]);
            }
        }
        if (source.Producer != null) {
            this.Producer = new Producer(source.Producer);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Period != null) {
            this.Period = new Long[source.Period.length];
            for (int i = 0; i < source.Period.length; i++) {
                this.Period[i] = new Long(source.Period[i]);
            }
        }
        if (source.DispenseConditions != null) {
            this.DispenseConditions = new DispenseCondition[source.DispenseConditions.length];
            for (int i = 0; i < source.DispenseConditions.length; i++) {
                this.DispenseConditions[i] = new DispenseCondition(source.DispenseConditions[i]);
            }
        }
        if (source.DispenseRegions != null) {
            this.DispenseRegions = new String[source.DispenseRegions.length];
            for (int i = 0; i < source.DispenseRegions.length; i++) {
                this.DispenseRegions[i] = new String(source.DispenseRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExtNamespace", this.ExtNamespace);
        this.setParamArrayObj(map, prefix + "ExtMetric.", this.ExtMetric);
        this.setParamObj(map, prefix + "Producer.", this.Producer);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Period.", this.Period);
        this.setParamArrayObj(map, prefix + "DispenseConditions.", this.DispenseConditions);
        this.setParamArraySimple(map, prefix + "DispenseRegions.", this.DispenseRegions);

    }
}

