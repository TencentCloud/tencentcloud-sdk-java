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

public class UpdatePrometheusAgentStatusRequest extends AbstractModel{

    /**
    * Prometheus 实例 ID，例如：prom-abcd1234
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent ID 列表，例如：agent-abcd1234，可在控制台 Agent 管理中获取
    */
    @SerializedName("AgentIds")
    @Expose
    private String [] AgentIds;

    /**
    * 要更新的状态
<li> 1= 开启 </li>
<li> 2= 关闭 </li>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Prometheus 实例 ID，例如：prom-abcd1234 
     * @return InstanceId Prometheus 实例 ID，例如：prom-abcd1234
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Prometheus 实例 ID，例如：prom-abcd1234
     * @param InstanceId Prometheus 实例 ID，例如：prom-abcd1234
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent ID 列表，例如：agent-abcd1234，可在控制台 Agent 管理中获取 
     * @return AgentIds Agent ID 列表，例如：agent-abcd1234，可在控制台 Agent 管理中获取
     */
    public String [] getAgentIds() {
        return this.AgentIds;
    }

    /**
     * Set Agent ID 列表，例如：agent-abcd1234，可在控制台 Agent 管理中获取
     * @param AgentIds Agent ID 列表，例如：agent-abcd1234，可在控制台 Agent 管理中获取
     */
    public void setAgentIds(String [] AgentIds) {
        this.AgentIds = AgentIds;
    }

    /**
     * Get 要更新的状态
<li> 1= 开启 </li>
<li> 2= 关闭 </li> 
     * @return Status 要更新的状态
<li> 1= 开启 </li>
<li> 2= 关闭 </li>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 要更新的状态
<li> 1= 开启 </li>
<li> 2= 关闭 </li>
     * @param Status 要更新的状态
<li> 1= 开启 </li>
<li> 2= 关闭 </li>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public UpdatePrometheusAgentStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdatePrometheusAgentStatusRequest(UpdatePrometheusAgentStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentIds != null) {
            this.AgentIds = new String[source.AgentIds.length];
            for (int i = 0; i < source.AgentIds.length; i++) {
                this.AgentIds[i] = new String(source.AgentIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "AgentIds.", this.AgentIds);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

