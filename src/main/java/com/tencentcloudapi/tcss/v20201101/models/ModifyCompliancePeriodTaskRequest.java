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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCompliancePeriodTaskRequest extends AbstractModel{

    /**
    * 要修改的定时任务的ID，由DescribeCompliancePeriodTaskList接口返回。
    */
    @SerializedName("PeriodTaskId")
    @Expose
    private Long PeriodTaskId;

    /**
    * 定时任务的周期规则。不填时，不修改。
    */
    @SerializedName("PeriodRule")
    @Expose
    private CompliancePeriodTaskRule PeriodRule;

    /**
    * 设置合规标准。不填时，不修改。
    */
    @SerializedName("StandardSettings")
    @Expose
    private ComplianceBenchmarkStandardEnable [] StandardSettings;

    /**
     * Get 要修改的定时任务的ID，由DescribeCompliancePeriodTaskList接口返回。 
     * @return PeriodTaskId 要修改的定时任务的ID，由DescribeCompliancePeriodTaskList接口返回。
     */
    public Long getPeriodTaskId() {
        return this.PeriodTaskId;
    }

    /**
     * Set 要修改的定时任务的ID，由DescribeCompliancePeriodTaskList接口返回。
     * @param PeriodTaskId 要修改的定时任务的ID，由DescribeCompliancePeriodTaskList接口返回。
     */
    public void setPeriodTaskId(Long PeriodTaskId) {
        this.PeriodTaskId = PeriodTaskId;
    }

    /**
     * Get 定时任务的周期规则。不填时，不修改。 
     * @return PeriodRule 定时任务的周期规则。不填时，不修改。
     */
    public CompliancePeriodTaskRule getPeriodRule() {
        return this.PeriodRule;
    }

    /**
     * Set 定时任务的周期规则。不填时，不修改。
     * @param PeriodRule 定时任务的周期规则。不填时，不修改。
     */
    public void setPeriodRule(CompliancePeriodTaskRule PeriodRule) {
        this.PeriodRule = PeriodRule;
    }

    /**
     * Get 设置合规标准。不填时，不修改。 
     * @return StandardSettings 设置合规标准。不填时，不修改。
     */
    public ComplianceBenchmarkStandardEnable [] getStandardSettings() {
        return this.StandardSettings;
    }

    /**
     * Set 设置合规标准。不填时，不修改。
     * @param StandardSettings 设置合规标准。不填时，不修改。
     */
    public void setStandardSettings(ComplianceBenchmarkStandardEnable [] StandardSettings) {
        this.StandardSettings = StandardSettings;
    }

    public ModifyCompliancePeriodTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCompliancePeriodTaskRequest(ModifyCompliancePeriodTaskRequest source) {
        if (source.PeriodTaskId != null) {
            this.PeriodTaskId = new Long(source.PeriodTaskId);
        }
        if (source.PeriodRule != null) {
            this.PeriodRule = new CompliancePeriodTaskRule(source.PeriodRule);
        }
        if (source.StandardSettings != null) {
            this.StandardSettings = new ComplianceBenchmarkStandardEnable[source.StandardSettings.length];
            for (int i = 0; i < source.StandardSettings.length; i++) {
                this.StandardSettings[i] = new ComplianceBenchmarkStandardEnable(source.StandardSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeriodTaskId", this.PeriodTaskId);
        this.setParamObj(map, prefix + "PeriodRule.", this.PeriodRule);
        this.setParamArrayObj(map, prefix + "StandardSettings.", this.StandardSettings);

    }
}

