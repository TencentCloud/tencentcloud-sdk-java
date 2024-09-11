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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckPolicyRule extends AbstractModel {

    /**
    * 健康检测规则
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否检测此项目
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 是否启用修复
    */
    @SerializedName("AutoRepairEnabled")
    @Expose
    private Boolean AutoRepairEnabled;

    /**
     * Get 健康检测规则 
     * @return Name 健康检测规则
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 健康检测规则
     * @param Name 健康检测规则
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否检测此项目 
     * @return Enabled 是否检测此项目
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否检测此项目
     * @param Enabled 是否检测此项目
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 是否启用修复 
     * @return AutoRepairEnabled 是否启用修复
     */
    public Boolean getAutoRepairEnabled() {
        return this.AutoRepairEnabled;
    }

    /**
     * Set 是否启用修复
     * @param AutoRepairEnabled 是否启用修复
     */
    public void setAutoRepairEnabled(Boolean AutoRepairEnabled) {
        this.AutoRepairEnabled = AutoRepairEnabled;
    }

    public HealthCheckPolicyRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckPolicyRule(HealthCheckPolicyRule source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.AutoRepairEnabled != null) {
            this.AutoRepairEnabled = new Boolean(source.AutoRepairEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "AutoRepairEnabled", this.AutoRepairEnabled);

    }
}

