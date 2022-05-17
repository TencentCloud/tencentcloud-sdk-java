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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostInfo extends AbstractModel{

    /**
    * 宿主机IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 云服务类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 宿主机运行状态
    */
    @SerializedName("HostStatus")
    @Expose
    private String HostStatus;

    /**
    * 宿主机类型
    */
    @SerializedName("HostType")
    @Expose
    private String HostType;

    /**
    * cpu可用数
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Long CpuAvailable;

    /**
    * cpu总数
    */
    @SerializedName("CpuTotal")
    @Expose
    private Long CpuTotal;

    /**
    * 内存可用数
    */
    @SerializedName("MemAvailable")
    @Expose
    private Long MemAvailable;

    /**
    * 内存总数
    */
    @SerializedName("MemTotal")
    @Expose
    private Long MemTotal;

    /**
    * 运行时间
    */
    @SerializedName("RunTime")
    @Expose
    private String RunTime;

    /**
    * 到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 宿主机IP 
     * @return HostIp 宿主机IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 宿主机IP
     * @param HostIp 宿主机IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 云服务类型 
     * @return ServiceType 云服务类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 云服务类型
     * @param ServiceType 云服务类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 宿主机运行状态 
     * @return HostStatus 宿主机运行状态
     */
    public String getHostStatus() {
        return this.HostStatus;
    }

    /**
     * Set 宿主机运行状态
     * @param HostStatus 宿主机运行状态
     */
    public void setHostStatus(String HostStatus) {
        this.HostStatus = HostStatus;
    }

    /**
     * Get 宿主机类型 
     * @return HostType 宿主机类型
     */
    public String getHostType() {
        return this.HostType;
    }

    /**
     * Set 宿主机类型
     * @param HostType 宿主机类型
     */
    public void setHostType(String HostType) {
        this.HostType = HostType;
    }

    /**
     * Get cpu可用数 
     * @return CpuAvailable cpu可用数
     */
    public Long getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * Set cpu可用数
     * @param CpuAvailable cpu可用数
     */
    public void setCpuAvailable(Long CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * Get cpu总数 
     * @return CpuTotal cpu总数
     */
    public Long getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * Set cpu总数
     * @param CpuTotal cpu总数
     */
    public void setCpuTotal(Long CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * Get 内存可用数 
     * @return MemAvailable 内存可用数
     */
    public Long getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * Set 内存可用数
     * @param MemAvailable 内存可用数
     */
    public void setMemAvailable(Long MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * Get 内存总数 
     * @return MemTotal 内存总数
     */
    public Long getMemTotal() {
        return this.MemTotal;
    }

    /**
     * Set 内存总数
     * @param MemTotal 内存总数
     */
    public void setMemTotal(Long MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * Get 运行时间 
     * @return RunTime 运行时间
     */
    public String getRunTime() {
        return this.RunTime;
    }

    /**
     * Set 运行时间
     * @param RunTime 运行时间
     */
    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    /**
     * Get 到期时间 
     * @return ExpireTime 到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
     * @param ExpireTime 到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public HostInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostInfo(HostInfo source) {
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.HostStatus != null) {
            this.HostStatus = new String(source.HostStatus);
        }
        if (source.HostType != null) {
            this.HostType = new String(source.HostType);
        }
        if (source.CpuAvailable != null) {
            this.CpuAvailable = new Long(source.CpuAvailable);
        }
        if (source.CpuTotal != null) {
            this.CpuTotal = new Long(source.CpuTotal);
        }
        if (source.MemAvailable != null) {
            this.MemAvailable = new Long(source.MemAvailable);
        }
        if (source.MemTotal != null) {
            this.MemTotal = new Long(source.MemTotal);
        }
        if (source.RunTime != null) {
            this.RunTime = new String(source.RunTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "HostStatus", this.HostStatus);
        this.setParamSimple(map, prefix + "HostType", this.HostType);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "RunTime", this.RunTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

