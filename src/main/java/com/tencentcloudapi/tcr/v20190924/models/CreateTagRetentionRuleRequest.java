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

public class CreateTagRetentionRuleRequest extends AbstractModel {

    /**
    * <p>主实例iD</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>命名空间的Id</p>
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
    * <p>执行周期，当前只能选择： manual;daily;weekly;monthly</p>
    */
    @SerializedName("CronSetting")
    @Expose
    private String CronSetting;

    /**
    * <p>保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p>
    */
    @SerializedName("RetentionRule")
    @Expose
    private RetentionRule RetentionRule;

    /**
    * <p>高级版本保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p>
    */
    @SerializedName("AdvancedRuleItems")
    @Expose
    private RetentionRuleItem [] AdvancedRuleItems;

    /**
    * <p>是否禁用规则，默认值为false</p>
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
     * Get <p>主实例iD</p> 
     * @return RegistryId <p>主实例iD</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>主实例iD</p>
     * @param RegistryId <p>主实例iD</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>命名空间的Id</p> 
     * @return NamespaceId <p>命名空间的Id</p>
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set <p>命名空间的Id</p>
     * @param NamespaceId <p>命名空间的Id</p>
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get <p>执行周期，当前只能选择： manual;daily;weekly;monthly</p> 
     * @return CronSetting <p>执行周期，当前只能选择： manual;daily;weekly;monthly</p>
     */
    public String getCronSetting() {
        return this.CronSetting;
    }

    /**
     * Set <p>执行周期，当前只能选择： manual;daily;weekly;monthly</p>
     * @param CronSetting <p>执行周期，当前只能选择： manual;daily;weekly;monthly</p>
     */
    public void setCronSetting(String CronSetting) {
        this.CronSetting = CronSetting;
    }

    /**
     * Get <p>保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p> 
     * @return RetentionRule <p>保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p>
     */
    public RetentionRule getRetentionRule() {
        return this.RetentionRule;
    }

    /**
     * Set <p>保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p>
     * @param RetentionRule <p>保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p>
     */
    public void setRetentionRule(RetentionRule RetentionRule) {
        this.RetentionRule = RetentionRule;
    }

    /**
     * Get <p>高级版本保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p> 
     * @return AdvancedRuleItems <p>高级版本保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p>
     */
    public RetentionRuleItem [] getAdvancedRuleItems() {
        return this.AdvancedRuleItems;
    }

    /**
     * Set <p>高级版本保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p>
     * @param AdvancedRuleItems <p>高级版本保留策略，当基本保留策略和高级保留策略同时配置时，优先使用高级保留策略</p>
     */
    public void setAdvancedRuleItems(RetentionRuleItem [] AdvancedRuleItems) {
        this.AdvancedRuleItems = AdvancedRuleItems;
    }

    /**
     * Get <p>是否禁用规则，默认值为false</p> 
     * @return Disabled <p>是否禁用规则，默认值为false</p>
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set <p>是否禁用规则，默认值为false</p>
     * @param Disabled <p>是否禁用规则，默认值为false</p>
     */
    public void setDisabled(Boolean Disabled) {
        this.Disabled = Disabled;
    }

    public CreateTagRetentionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTagRetentionRuleRequest(CreateTagRetentionRuleRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new Long(source.NamespaceId);
        }
        if (source.CronSetting != null) {
            this.CronSetting = new String(source.CronSetting);
        }
        if (source.RetentionRule != null) {
            this.RetentionRule = new RetentionRule(source.RetentionRule);
        }
        if (source.AdvancedRuleItems != null) {
            this.AdvancedRuleItems = new RetentionRuleItem[source.AdvancedRuleItems.length];
            for (int i = 0; i < source.AdvancedRuleItems.length; i++) {
                this.AdvancedRuleItems[i] = new RetentionRuleItem(source.AdvancedRuleItems[i]);
            }
        }
        if (source.Disabled != null) {
            this.Disabled = new Boolean(source.Disabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "CronSetting", this.CronSetting);
        this.setParamObj(map, prefix + "RetentionRule.", this.RetentionRule);
        this.setParamArrayObj(map, prefix + "AdvancedRuleItems.", this.AdvancedRuleItems);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);

    }
}

