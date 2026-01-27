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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionPolicy extends AbstractModel {

    /**
    * <p>版本保留策略Id</p>
    */
    @SerializedName("RetentionId")
    @Expose
    private Long RetentionId;

    /**
    * <p>命名空间的名称</p>
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * <p>规则列表</p>
    */
    @SerializedName("RetentionRuleList")
    @Expose
    private RetentionRule [] RetentionRuleList;

    /**
    * <p>高级保留规则列表</p>
    */
    @SerializedName("AdvancedRuleItems")
    @Expose
    private RetentionRuleItem [] AdvancedRuleItems;

    /**
    * <p>定期执行方式</p>
    */
    @SerializedName("CronSetting")
    @Expose
    private String CronSetting;

    /**
    * <p>是否启用规则</p>
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
    * <p>基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用</p>
    */
    @SerializedName("NextExecutionTime")
    @Expose
    private String NextExecutionTime;

    /**
     * Get <p>版本保留策略Id</p> 
     * @return RetentionId <p>版本保留策略Id</p>
     */
    public Long getRetentionId() {
        return this.RetentionId;
    }

    /**
     * Set <p>版本保留策略Id</p>
     * @param RetentionId <p>版本保留策略Id</p>
     */
    public void setRetentionId(Long RetentionId) {
        this.RetentionId = RetentionId;
    }

    /**
     * Get <p>命名空间的名称</p> 
     * @return NamespaceName <p>命名空间的名称</p>
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>命名空间的名称</p>
     * @param NamespaceName <p>命名空间的名称</p>
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get <p>规则列表</p> 
     * @return RetentionRuleList <p>规则列表</p>
     */
    public RetentionRule [] getRetentionRuleList() {
        return this.RetentionRuleList;
    }

    /**
     * Set <p>规则列表</p>
     * @param RetentionRuleList <p>规则列表</p>
     */
    public void setRetentionRuleList(RetentionRule [] RetentionRuleList) {
        this.RetentionRuleList = RetentionRuleList;
    }

    /**
     * Get <p>高级保留规则列表</p> 
     * @return AdvancedRuleItems <p>高级保留规则列表</p>
     */
    public RetentionRuleItem [] getAdvancedRuleItems() {
        return this.AdvancedRuleItems;
    }

    /**
     * Set <p>高级保留规则列表</p>
     * @param AdvancedRuleItems <p>高级保留规则列表</p>
     */
    public void setAdvancedRuleItems(RetentionRuleItem [] AdvancedRuleItems) {
        this.AdvancedRuleItems = AdvancedRuleItems;
    }

    /**
     * Get <p>定期执行方式</p> 
     * @return CronSetting <p>定期执行方式</p>
     */
    public String getCronSetting() {
        return this.CronSetting;
    }

    /**
     * Set <p>定期执行方式</p>
     * @param CronSetting <p>定期执行方式</p>
     */
    public void setCronSetting(String CronSetting) {
        this.CronSetting = CronSetting;
    }

    /**
     * Get <p>是否启用规则</p> 
     * @return Disabled <p>是否启用规则</p>
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set <p>是否启用规则</p>
     * @param Disabled <p>是否启用规则</p>
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    /**
     * Get <p>基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用</p> 
     * @return NextExecutionTime <p>基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用</p>
     */
    public String getNextExecutionTime() {
        return this.NextExecutionTime;
    }

    /**
     * Set <p>基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用</p>
     * @param NextExecutionTime <p>基于当前时间根据cronSetting后下一次任务要执行的时间，仅做参考使用</p>
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
        if (source.AdvancedRuleItems != null) {
            this.AdvancedRuleItems = new RetentionRuleItem[source.AdvancedRuleItems.length];
            for (int i = 0; i < source.AdvancedRuleItems.length; i++) {
                this.AdvancedRuleItems[i] = new RetentionRuleItem(source.AdvancedRuleItems[i]);
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
        this.setParamArrayObj(map, prefix + "AdvancedRuleItems.", this.AdvancedRuleItems);
        this.setParamSimple(map, prefix + "CronSetting", this.CronSetting);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);
        this.setParamSimple(map, prefix + "NextExecutionTime", this.NextExecutionTime);

    }
}

