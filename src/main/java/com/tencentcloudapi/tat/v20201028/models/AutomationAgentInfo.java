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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutomationAgentInfo extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Agent 版本号。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 上次心跳时间
    */
    @SerializedName("LastHeartbeatTime")
    @Expose
    private String LastHeartbeatTime;

    /**
    * Agent状态，取值范围：
<li> Online：在线
<li> Offline：离线
    */
    @SerializedName("AgentStatus")
    @Expose
    private String AgentStatus;

    /**
    * Agent运行环境，取值范围：
<li> Linux：Linux实例
<li> Windows：Windows实例
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Agent 版本号。 
     * @return Version Agent 版本号。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Agent 版本号。
     * @param Version Agent 版本号。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 上次心跳时间 
     * @return LastHeartbeatTime 上次心跳时间
     */
    public String getLastHeartbeatTime() {
        return this.LastHeartbeatTime;
    }

    /**
     * Set 上次心跳时间
     * @param LastHeartbeatTime 上次心跳时间
     */
    public void setLastHeartbeatTime(String LastHeartbeatTime) {
        this.LastHeartbeatTime = LastHeartbeatTime;
    }

    /**
     * Get Agent状态，取值范围：
<li> Online：在线
<li> Offline：离线 
     * @return AgentStatus Agent状态，取值范围：
<li> Online：在线
<li> Offline：离线
     */
    public String getAgentStatus() {
        return this.AgentStatus;
    }

    /**
     * Set Agent状态，取值范围：
<li> Online：在线
<li> Offline：离线
     * @param AgentStatus Agent状态，取值范围：
<li> Online：在线
<li> Offline：离线
     */
    public void setAgentStatus(String AgentStatus) {
        this.AgentStatus = AgentStatus;
    }

    /**
     * Get Agent运行环境，取值范围：
<li> Linux：Linux实例
<li> Windows：Windows实例 
     * @return Environment Agent运行环境，取值范围：
<li> Linux：Linux实例
<li> Windows：Windows实例
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set Agent运行环境，取值范围：
<li> Linux：Linux实例
<li> Windows：Windows实例
     * @param Environment Agent运行环境，取值范围：
<li> Linux：Linux实例
<li> Windows：Windows实例
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    public AutomationAgentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutomationAgentInfo(AutomationAgentInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LastHeartbeatTime != null) {
            this.LastHeartbeatTime = new String(source.LastHeartbeatTime);
        }
        if (source.AgentStatus != null) {
            this.AgentStatus = new String(source.AgentStatus);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LastHeartbeatTime", this.LastHeartbeatTime);
        this.setParamSimple(map, prefix + "AgentStatus", this.AgentStatus);
        this.setParamSimple(map, prefix + "Environment", this.Environment);

    }
}

