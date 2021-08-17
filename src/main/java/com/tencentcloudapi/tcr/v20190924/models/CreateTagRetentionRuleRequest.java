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

public class CreateTagRetentionRuleRequest extends AbstractModel{

    /**
    * 主实例iD
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 命名空间的Id
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
    * 保留策略
    */
    @SerializedName("RetentionRule")
    @Expose
    private RetentionRule RetentionRule;

    /**
    * 执行周期，当前只能选择： manual;daily;weekly;monthly
    */
    @SerializedName("CronSetting")
    @Expose
    private String CronSetting;

    /**
    * 是否禁用规则，默认值为false
    */
    @SerializedName("Disabled")
    @Expose
    private Boolean Disabled;

    /**
     * Get 主实例iD 
     * @return RegistryId 主实例iD
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 主实例iD
     * @param RegistryId 主实例iD
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 命名空间的Id 
     * @return NamespaceId 命名空间的Id
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间的Id
     * @param NamespaceId 命名空间的Id
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 保留策略 
     * @return RetentionRule 保留策略
     */
    public RetentionRule getRetentionRule() {
        return this.RetentionRule;
    }

    /**
     * Set 保留策略
     * @param RetentionRule 保留策略
     */
    public void setRetentionRule(RetentionRule RetentionRule) {
        this.RetentionRule = RetentionRule;
    }

    /**
     * Get 执行周期，当前只能选择： manual;daily;weekly;monthly 
     * @return CronSetting 执行周期，当前只能选择： manual;daily;weekly;monthly
     */
    public String getCronSetting() {
        return this.CronSetting;
    }

    /**
     * Set 执行周期，当前只能选择： manual;daily;weekly;monthly
     * @param CronSetting 执行周期，当前只能选择： manual;daily;weekly;monthly
     */
    public void setCronSetting(String CronSetting) {
        this.CronSetting = CronSetting;
    }

    /**
     * Get 是否禁用规则，默认值为false 
     * @return Disabled 是否禁用规则，默认值为false
     */
    public Boolean getDisabled() {
        return this.Disabled;
    }

    /**
     * Set 是否禁用规则，默认值为false
     * @param Disabled 是否禁用规则，默认值为false
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
        if (source.RetentionRule != null) {
            this.RetentionRule = new RetentionRule(source.RetentionRule);
        }
        if (source.CronSetting != null) {
            this.CronSetting = new String(source.CronSetting);
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
        this.setParamObj(map, prefix + "RetentionRule.", this.RetentionRule);
        this.setParamSimple(map, prefix + "CronSetting", this.CronSetting);
        this.setParamSimple(map, prefix + "Disabled", this.Disabled);

    }
}

