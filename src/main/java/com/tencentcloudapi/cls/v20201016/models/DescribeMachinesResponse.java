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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMachinesResponse extends AbstractModel{

    /**
    * 机器状态信息组
    */
    @SerializedName("Machines")
    @Expose
    private MachineInfo [] Machines;

    /**
    * 机器组是否开启自动升级功能
    */
    @SerializedName("AutoUpdate")
    @Expose
    private Long AutoUpdate;

    /**
    * 机器组自动升级功能预设开始时间
    */
    @SerializedName("UpdateStartTime")
    @Expose
    private String UpdateStartTime;

    /**
    * 机器组自动升级功能预设结束时间
    */
    @SerializedName("UpdateEndTime")
    @Expose
    private String UpdateEndTime;

    /**
    * 当前用户可用最新的Loglistener版本
    */
    @SerializedName("LatestAgentVersion")
    @Expose
    private String LatestAgentVersion;

    /**
    * 是否开启服务日志
    */
    @SerializedName("ServiceLogging")
    @Expose
    private Boolean ServiceLogging;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 机器状态信息组 
     * @return Machines 机器状态信息组
     */
    public MachineInfo [] getMachines() {
        return this.Machines;
    }

    /**
     * Set 机器状态信息组
     * @param Machines 机器状态信息组
     */
    public void setMachines(MachineInfo [] Machines) {
        this.Machines = Machines;
    }

    /**
     * Get 机器组是否开启自动升级功能 
     * @return AutoUpdate 机器组是否开启自动升级功能
     */
    public Long getAutoUpdate() {
        return this.AutoUpdate;
    }

    /**
     * Set 机器组是否开启自动升级功能
     * @param AutoUpdate 机器组是否开启自动升级功能
     */
    public void setAutoUpdate(Long AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    /**
     * Get 机器组自动升级功能预设开始时间 
     * @return UpdateStartTime 机器组自动升级功能预设开始时间
     */
    public String getUpdateStartTime() {
        return this.UpdateStartTime;
    }

    /**
     * Set 机器组自动升级功能预设开始时间
     * @param UpdateStartTime 机器组自动升级功能预设开始时间
     */
    public void setUpdateStartTime(String UpdateStartTime) {
        this.UpdateStartTime = UpdateStartTime;
    }

    /**
     * Get 机器组自动升级功能预设结束时间 
     * @return UpdateEndTime 机器组自动升级功能预设结束时间
     */
    public String getUpdateEndTime() {
        return this.UpdateEndTime;
    }

    /**
     * Set 机器组自动升级功能预设结束时间
     * @param UpdateEndTime 机器组自动升级功能预设结束时间
     */
    public void setUpdateEndTime(String UpdateEndTime) {
        this.UpdateEndTime = UpdateEndTime;
    }

    /**
     * Get 当前用户可用最新的Loglistener版本 
     * @return LatestAgentVersion 当前用户可用最新的Loglistener版本
     */
    public String getLatestAgentVersion() {
        return this.LatestAgentVersion;
    }

    /**
     * Set 当前用户可用最新的Loglistener版本
     * @param LatestAgentVersion 当前用户可用最新的Loglistener版本
     */
    public void setLatestAgentVersion(String LatestAgentVersion) {
        this.LatestAgentVersion = LatestAgentVersion;
    }

    /**
     * Get 是否开启服务日志 
     * @return ServiceLogging 是否开启服务日志
     */
    public Boolean getServiceLogging() {
        return this.ServiceLogging;
    }

    /**
     * Set 是否开启服务日志
     * @param ServiceLogging 是否开启服务日志
     */
    public void setServiceLogging(Boolean ServiceLogging) {
        this.ServiceLogging = ServiceLogging;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeMachinesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachinesResponse(DescribeMachinesResponse source) {
        if (source.Machines != null) {
            this.Machines = new MachineInfo[source.Machines.length];
            for (int i = 0; i < source.Machines.length; i++) {
                this.Machines[i] = new MachineInfo(source.Machines[i]);
            }
        }
        if (source.AutoUpdate != null) {
            this.AutoUpdate = new Long(source.AutoUpdate);
        }
        if (source.UpdateStartTime != null) {
            this.UpdateStartTime = new String(source.UpdateStartTime);
        }
        if (source.UpdateEndTime != null) {
            this.UpdateEndTime = new String(source.UpdateEndTime);
        }
        if (source.LatestAgentVersion != null) {
            this.LatestAgentVersion = new String(source.LatestAgentVersion);
        }
        if (source.ServiceLogging != null) {
            this.ServiceLogging = new Boolean(source.ServiceLogging);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Machines.", this.Machines);
        this.setParamSimple(map, prefix + "AutoUpdate", this.AutoUpdate);
        this.setParamSimple(map, prefix + "UpdateStartTime", this.UpdateStartTime);
        this.setParamSimple(map, prefix + "UpdateEndTime", this.UpdateEndTime);
        this.setParamSimple(map, prefix + "LatestAgentVersion", this.LatestAgentVersion);
        this.setParamSimple(map, prefix + "ServiceLogging", this.ServiceLogging);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

