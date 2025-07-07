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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePrometheusClusterAgentRequest extends AbstractModel {

    /**
    * agent列表
    */
    @SerializedName("Agents")
    @Expose
    private PrometheusAgentInfo [] Agents;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 在7天可回收期间，强制解除绑定
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get agent列表 
     * @return Agents agent列表
     */
    public PrometheusAgentInfo [] getAgents() {
        return this.Agents;
    }

    /**
     * Set agent列表
     * @param Agents agent列表
     */
    public void setAgents(PrometheusAgentInfo [] Agents) {
        this.Agents = Agents;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 在7天可回收期间，强制解除绑定 
     * @return Force 在7天可回收期间，强制解除绑定
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set 在7天可回收期间，强制解除绑定
     * @param Force 在7天可回收期间，强制解除绑定
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public DeletePrometheusClusterAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeletePrometheusClusterAgentRequest(DeletePrometheusClusterAgentRequest source) {
        if (source.Agents != null) {
            this.Agents = new PrometheusAgentInfo[source.Agents.length];
            for (int i = 0; i < source.Agents.length; i++) {
                this.Agents[i] = new PrometheusAgentInfo(source.Agents[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Agents.", this.Agents);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

