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

public class ModifyDispenseExternalRuleRequest extends AbstractModel {

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 云监控对外命名空间
    */
    @SerializedName("ExtNamespace")
    @Expose
    private String ExtNamespace;

    /**
    * 转发目标消信息
    */
    @SerializedName("Producer")
    @Expose
    private Producer Producer;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 转发部署地域列表
    */
    @SerializedName("DispenseRegions")
    @Expose
    private String [] DispenseRegions;

    /**
    * 云监控对外指标
    */
    @SerializedName("ExtMetrics")
    @Expose
    private String [] ExtMetrics;

    /**
    * 指标统计周期
    */
    @SerializedName("Period")
    @Expose
    private Long [] Period;

    /**
    * 转发过滤信息
    */
    @SerializedName("DispenseConditions")
    @Expose
    private DispenseCondition [] DispenseConditions;

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
     * Get 云监控对外命名空间 
     * @return ExtNamespace 云监控对外命名空间
     */
    public String getExtNamespace() {
        return this.ExtNamespace;
    }

    /**
     * Set 云监控对外命名空间
     * @param ExtNamespace 云监控对外命名空间
     */
    public void setExtNamespace(String ExtNamespace) {
        this.ExtNamespace = ExtNamespace;
    }

    /**
     * Get 转发目标消信息 
     * @return Producer 转发目标消信息
     */
    public Producer getProducer() {
        return this.Producer;
    }

    /**
     * Set 转发目标消信息
     * @param Producer 转发目标消信息
     */
    public void setProducer(Producer Producer) {
        this.Producer = Producer;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 转发部署地域列表 
     * @return DispenseRegions 转发部署地域列表
     */
    public String [] getDispenseRegions() {
        return this.DispenseRegions;
    }

    /**
     * Set 转发部署地域列表
     * @param DispenseRegions 转发部署地域列表
     */
    public void setDispenseRegions(String [] DispenseRegions) {
        this.DispenseRegions = DispenseRegions;
    }

    /**
     * Get 云监控对外指标 
     * @return ExtMetrics 云监控对外指标
     */
    public String [] getExtMetrics() {
        return this.ExtMetrics;
    }

    /**
     * Set 云监控对外指标
     * @param ExtMetrics 云监控对外指标
     */
    public void setExtMetrics(String [] ExtMetrics) {
        this.ExtMetrics = ExtMetrics;
    }

    /**
     * Get 指标统计周期 
     * @return Period 指标统计周期
     */
    public Long [] getPeriod() {
        return this.Period;
    }

    /**
     * Set 指标统计周期
     * @param Period 指标统计周期
     */
    public void setPeriod(Long [] Period) {
        this.Period = Period;
    }

    /**
     * Get 转发过滤信息 
     * @return DispenseConditions 转发过滤信息
     */
    public DispenseCondition [] getDispenseConditions() {
        return this.DispenseConditions;
    }

    /**
     * Set 转发过滤信息
     * @param DispenseConditions 转发过滤信息
     */
    public void setDispenseConditions(DispenseCondition [] DispenseConditions) {
        this.DispenseConditions = DispenseConditions;
    }

    public ModifyDispenseExternalRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDispenseExternalRuleRequest(ModifyDispenseExternalRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExtNamespace != null) {
            this.ExtNamespace = new String(source.ExtNamespace);
        }
        if (source.Producer != null) {
            this.Producer = new Producer(source.Producer);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.DispenseRegions != null) {
            this.DispenseRegions = new String[source.DispenseRegions.length];
            for (int i = 0; i < source.DispenseRegions.length; i++) {
                this.DispenseRegions[i] = new String(source.DispenseRegions[i]);
            }
        }
        if (source.ExtMetrics != null) {
            this.ExtMetrics = new String[source.ExtMetrics.length];
            for (int i = 0; i < source.ExtMetrics.length; i++) {
                this.ExtMetrics[i] = new String(source.ExtMetrics[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExtNamespace", this.ExtNamespace);
        this.setParamObj(map, prefix + "Producer.", this.Producer);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "DispenseRegions.", this.DispenseRegions);
        this.setParamArraySimple(map, prefix + "ExtMetrics.", this.ExtMetrics);
        this.setParamArraySimple(map, prefix + "Period.", this.Period);
        this.setParamArrayObj(map, prefix + "DispenseConditions.", this.DispenseConditions);

    }
}

