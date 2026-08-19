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
    * <p>agent的版本号</p>
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;

    /**
    * <p>agent的IP地址</p>
    */
    @SerializedName("AgentIp")
    @Expose
    private String AgentIp;

    /**
    * <p>机器组标签列表</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>agent的instance id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>agent的版本号</p> 
     * @return AgentVersion <p>agent的版本号</p>
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * Set <p>agent的版本号</p>
     * @param AgentVersion <p>agent的版本号</p>
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * Get <p>agent的IP地址</p> 
     * @return AgentIp <p>agent的IP地址</p>
     */
    public String getAgentIp() {
        return this.AgentIp;
    }

    /**
     * Set <p>agent的IP地址</p>
     * @param AgentIp <p>agent的IP地址</p>
     */
    public void setAgentIp(String AgentIp) {
        this.AgentIp = AgentIp;
    }

    /**
     * Get <p>机器组标签列表</p> 
     * @return Labels <p>机器组标签列表</p>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>机器组标签列表</p>
     * @param Labels <p>机器组标签列表</p>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>agent的instance id</p> 
     * @return InstanceId <p>agent的instance id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>agent的instance id</p>
     * @param InstanceId <p>agent的instance id</p>
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

