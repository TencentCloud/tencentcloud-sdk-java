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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectionConfigItem extends AbstractModel {

    /**
    * 配置项ID
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 配置项名称
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置项描述
    */
    @SerializedName("ConfigDescription")
    @Expose
    private String ConfigDescription;

    /**
    * 配置分组
枚举值：
auto_risk_discovery：自动风险发现
auto_defense：自动防御
client_hardening：客户端强化
    */
    @SerializedName("ConfigGroup")
    @Expose
    private String ConfigGroup;

    /**
    * 是否已开启
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 配置项ID 
     * @return ConfigId 配置项ID
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 配置项ID
     * @param ConfigId 配置项ID
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 配置项名称 
     * @return ConfigName 配置项名称
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置项名称
     * @param ConfigName 配置项名称
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置项描述 
     * @return ConfigDescription 配置项描述
     */
    public String getConfigDescription() {
        return this.ConfigDescription;
    }

    /**
     * Set 配置项描述
     * @param ConfigDescription 配置项描述
     */
    public void setConfigDescription(String ConfigDescription) {
        this.ConfigDescription = ConfigDescription;
    }

    /**
     * Get 配置分组
枚举值：
auto_risk_discovery：自动风险发现
auto_defense：自动防御
client_hardening：客户端强化 
     * @return ConfigGroup 配置分组
枚举值：
auto_risk_discovery：自动风险发现
auto_defense：自动防御
client_hardening：客户端强化
     */
    public String getConfigGroup() {
        return this.ConfigGroup;
    }

    /**
     * Set 配置分组
枚举值：
auto_risk_discovery：自动风险发现
auto_defense：自动防御
client_hardening：客户端强化
     * @param ConfigGroup 配置分组
枚举值：
auto_risk_discovery：自动风险发现
auto_defense：自动防御
client_hardening：客户端强化
     */
    public void setConfigGroup(String ConfigGroup) {
        this.ConfigGroup = ConfigGroup;
    }

    /**
     * Get 是否已开启 
     * @return Enabled 是否已开启
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否已开启
     * @param Enabled 是否已开启
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ProtectionConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectionConfigItem(ProtectionConfigItem source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigDescription != null) {
            this.ConfigDescription = new String(source.ConfigDescription);
        }
        if (source.ConfigGroup != null) {
            this.ConfigGroup = new String(source.ConfigGroup);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigDescription", this.ConfigDescription);
        this.setParamSimple(map, prefix + "ConfigGroup", this.ConfigGroup);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

