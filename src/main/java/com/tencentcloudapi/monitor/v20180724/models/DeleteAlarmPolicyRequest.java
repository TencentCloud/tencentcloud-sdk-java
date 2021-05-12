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

public class DeleteAlarmPolicyRequest extends AbstractModel{

    /**
    * 模块名，固定值 monitor
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 告警策略 ID 列表
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

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
     * Get 告警策略 ID 列表 
     * @return PolicyIds 告警策略 ID 列表
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 告警策略 ID 列表
     * @param PolicyIds 告警策略 ID 列表
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    public DeleteAlarmPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAlarmPolicyRequest(DeleteAlarmPolicyRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);

    }
}

