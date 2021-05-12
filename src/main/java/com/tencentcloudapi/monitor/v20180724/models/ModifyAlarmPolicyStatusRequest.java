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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAlarmPolicyStatusRequest extends AbstractModel{

    /**
    * 模块名，固定值 monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 告警策略 ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 启停状态 0=停用 1=启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 模块名，固定值 monitor 
     * @return Module 模块名，固定值 monitor
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，固定值 monitor
     * @param Module 模块名，固定值 monitor
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 告警策略 ID 
     * @return PolicyId 告警策略 ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 告警策略 ID
     * @param PolicyId 告警策略 ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 启停状态 0=停用 1=启用 
     * @return Enable 启停状态 0=停用 1=启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 启停状态 0=停用 1=启用
     * @param Enable 启停状态 0=停用 1=启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public ModifyAlarmPolicyStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAlarmPolicyStatusRequest(ModifyAlarmPolicyStatusRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

