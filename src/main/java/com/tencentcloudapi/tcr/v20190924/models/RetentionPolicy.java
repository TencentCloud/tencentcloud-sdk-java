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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionPolicy extends AbstractModel{

    /**
    * 版本保留策略Id
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
    * 命名空间的名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 规则列表
    */
    @SerializedName("RetentionRuleList")
    @Expose
    private RetentionRule [] RetentionRuleList;

    /**
    * 定期执行方式
    */
    @SerializedName("CronSetting")
    @Expose
    private String CronSetting;

    /**
    * 是否启用规则
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * 基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用
    */
    @SerializedName("NextExecutionTime")
    @Expose
    private String NextExecutionTime;

    /**
     * Get 版本保留策略Id 
     * @return RetentionId 版本保留策略Id
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set 版本保留策略Id
     * @param RetentionId 版本保留策略Id
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    /**
     * Get 命名空间的名称 
     * @return NamespaceName 命名空间的名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间的名称
     * @param NamespaceName 命名空间的名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 规则列表 
     * @return RetentionRuleList 规则列表
     */
    public RetentionRule [] getRetentionRuleList() {
        return this.RetentionRuleList;
    }

    /**
     * Set 规则列表
     * @param RetentionRuleList 规则列表
     */
    public void setRetentionRuleList(RetentionRule [] RetentionRuleList) {
        this.RetentionRuleList = RetentionRuleList;
    }

    /**
     * Get 定期执行方式 
     * @return CronSetting 定期执行方式
     */
    public String getCronSetting() {
        return this.CronSetting;
    }

    /**
     * Set 定期执行方式
     * @param CronSetting 定期执行方式
     */
    public void setCronSetting(String CronSetting) {
        this.CronSetting = CronSetting;
    }

    /**
     * Get 是否启用规则 
     * @return Disabled 是否启用规则
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 是否启用规则
     * @param Disabled 是否启用规则
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get 基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用 
     * @return NextExecutionTime 基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用
     */
    public String getNextExecutionTime() {
        return this.NextExecutionTime;
    }

    /**
     * Set 基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用
     * @param NextExecutionTime 基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用
     */
    public void setNextExecutionTime(String NextExecutionTime) {
        this.NextExecutionTime = NextExecutionTime;
    }

    public RetentionPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionPolicy(RetentionPolicy source) {
        if (source.RetentionId != null) {
            this.RetentionId = new Long(source.RetentionId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RetentionRuleList != null) {
            this.RetentionRuleList = new RetentionRule[source.RetentionRuleList.length];
            for (int i = 0; i < source.RetentionRuleList.length; i++) {
                this.RetentionRuleList[i] = new RetentionRule(source.RetentionRuleList[i]);
            }
        }
        if (source.CronSetting != null) {
            this.CronSetting = new String(source.CronSetting);
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
        if (source.NextExecutionTime != null) {
            this.NextExecutionTime = new String(source.NextExecutionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetentionId", this.RetentionId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamArrayObj(map, prefix + "RetentionRuleList.", this.RetentionRuleList);
        this.setParamSimple(map, prefix + "CronSetting", this.CronSetting);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "NextExecutionTime", this.NextExecutionTime);

    }
}

