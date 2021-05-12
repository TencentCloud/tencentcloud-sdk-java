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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyFirewallRuleDescriptionRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 防火墙规则。
    */
    @SerializedName("FirewallRule")
    @Expose
    private FirewallRule FirewallRule;

    /**
    * 防火墙当前版本。用户每次更新防火墙规则时版本会自动加1，防止规则已过期，不填不考虑冲突。
    */
    @SerializedName("FirewallVersion")
    @Expose
    private Long FirewallVersion;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 防火墙规则。 
     * @return FirewallRule 防火墙规则。
     */
    public FirewallRule getFirewallRule() {
        return this.FirewallRule;
    }

    /**
     * Set 防火墙规则。
     * @param FirewallRule 防火墙规则。
     */
    public void setFirewallRule(FirewallRule FirewallRule) {
        this.FirewallRule = FirewallRule;
    }

    /**
     * Get 防火墙当前版本。用户每次更新防火墙规则时版本会自动加1，防止规则已过期，不填不考虑冲突。 
     * @return FirewallVersion 防火墙当前版本。用户每次更新防火墙规则时版本会自动加1，防止规则已过期，不填不考虑冲突。
     */
    public Long getFirewallVersion() {
        return this.FirewallVersion;
    }

    /**
     * Set 防火墙当前版本。用户每次更新防火墙规则时版本会自动加1，防止规则已过期，不填不考虑冲突。
     * @param FirewallVersion 防火墙当前版本。用户每次更新防火墙规则时版本会自动加1，防止规则已过期，不填不考虑冲突。
     */
    public void setFirewallVersion(Long FirewallVersion) {
        this.FirewallVersion = FirewallVersion;
    }

    public ModifyFirewallRuleDescriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFirewallRuleDescriptionRequest(ModifyFirewallRuleDescriptionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.FirewallRule != null) {
            this.FirewallRule = new FirewallRule(source.FirewallRule);
        }
        if (source.FirewallVersion != null) {
            this.FirewallVersion = new Long(source.FirewallVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "FirewallRule.", this.FirewallRule);
        this.setParamSimple(map, prefix + "FirewallVersion", this.FirewallVersion);

    }
}

