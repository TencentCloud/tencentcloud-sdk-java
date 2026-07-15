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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentConfigsRequest extends AbstractModel {

    /**
    * agent的版本号
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * agent的IP地址
    */
    @SerializedName("AgentIp")
    @Expose
    private String AgentIp;

    /**
    * 机器组标签列表
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * agent的instance id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get agent的版本号 
     * @return AgentVersion agent的版本号
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set agent的版本号
     * @param AgentVersion agent的版本号
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get agent的IP地址 
     * @return AgentIp agent的IP地址
     */
    public String getAgentIp() {
        return this.AgentIp;
    }

    /**
     * Set agent的IP地址
     * @param AgentIp agent的IP地址
     */
    public void setAgentIp(String AgentIp) {
        this.AgentIp = AgentIp;
    }

    /**
     * Get 机器组标签列表 
     * @return Labels 机器组标签列表
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 机器组标签列表
     * @param Labels 机器组标签列表
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get agent的instance id 
     * @return InstanceId agent的instance id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set agent的instance id
     * @param InstanceId agent的instance id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeAgentConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentConfigsRequest(DescribeAgentConfigsRequest source) {
        if (source.AgentVersion != null) {
            this.AgentVersion = new String(source.AgentVersion);
        }
        if (source.AgentIp != null) {
            this.AgentIp = new String(source.AgentIp);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);
        this.setParamSimple(map, prefix + "AgentIp", this.AgentIp);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

