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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HPCInstance extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * CPU数量
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 内存
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计费类型
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 系统名称
    */
    @SerializedName("OSName")
    @Expose
    private String OSName;

    /**
    * 系统盘
    */
    @SerializedName("SystemDisk")
    @Expose
    private HPCDisk SystemDisk;

    /**
    * GPU
    */
    @SerializedName("GPUInfo")
    @Expose
    private HPCGPUInfo GPUInfo;

    /**
    * 内网IP地址
    */
    @SerializedName("PrivateIPAddresses")
    @Expose
    private String [] PrivateIPAddresses;

    /**
    * 公网IP地址
    */
    @SerializedName("PublicIPAddresses")
    @Expose
    private String [] PublicIPAddresses;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 节点网络信息
    */
    @SerializedName("InternetInfo")
    @Expose
    private HPCInternetInfo InternetInfo;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get CPU数量 
     * @return CPU CPU数量
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU数量
     * @param CPU CPU数量
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存 
     * @return Memory 内存
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存
     * @param Memory 内存
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 状态 
     * @return State 状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态
     * @param State 状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 计费类型 
     * @return ChargeType 计费类型
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型
     * @param ChargeType 计费类型
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 系统名称 
     * @return OSName 系统名称
     */
    public String getOSName() {
        return this.OSName;
    }

    /**
     * Set 系统名称
     * @param OSName 系统名称
     */
    public void setOSName(String OSName) {
        this.OSName = OSName;
    }

    /**
     * Get 系统盘 
     * @return SystemDisk 系统盘
     */
    public HPCDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 系统盘
     * @param SystemDisk 系统盘
     */
    public void setSystemDisk(HPCDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get GPU 
     * @return GPUInfo GPU
     */
    public HPCGPUInfo getGPUInfo() {
        return this.GPUInfo;
    }

    /**
     * Set GPU
     * @param GPUInfo GPU
     */
    public void setGPUInfo(HPCGPUInfo GPUInfo) {
        this.GPUInfo = GPUInfo;
    }

    /**
     * Get 内网IP地址 
     * @return PrivateIPAddresses 内网IP地址
     */
    public String [] getPrivateIPAddresses() {
        return this.PrivateIPAddresses;
    }

    /**
     * Set 内网IP地址
     * @param PrivateIPAddresses 内网IP地址
     */
    public void setPrivateIPAddresses(String [] PrivateIPAddresses) {
        this.PrivateIPAddresses = PrivateIPAddresses;
    }

    /**
     * Get 公网IP地址 
     * @return PublicIPAddresses 公网IP地址
     */
    public String [] getPublicIPAddresses() {
        return this.PublicIPAddresses;
    }

    /**
     * Set 公网IP地址
     * @param PublicIPAddresses 公网IP地址
     */
    public void setPublicIPAddresses(String [] PublicIPAddresses) {
        this.PublicIPAddresses = PublicIPAddresses;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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

    /**
     * Get Uuid 
     * @return Uuid Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Uuid
     * @param Uuid Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 节点网络信息 
     * @return InternetInfo 节点网络信息
     */
    public HPCInternetInfo getInternetInfo() {
        return this.InternetInfo;
    }

    /**
     * Set 节点网络信息
     * @param InternetInfo 节点网络信息
     */
    public void setInternetInfo(HPCInternetInfo InternetInfo) {
        this.InternetInfo = InternetInfo;
    }

    public HPCInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HPCInstance(HPCInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.OSName != null) {
            this.OSName = new String(source.OSName);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new HPCDisk(source.SystemDisk);
        }
        if (source.GPUInfo != null) {
            this.GPUInfo = new HPCGPUInfo(source.GPUInfo);
        }
        if (source.PrivateIPAddresses != null) {
            this.PrivateIPAddresses = new String[source.PrivateIPAddresses.length];
            for (int i = 0; i < source.PrivateIPAddresses.length; i++) {
                this.PrivateIPAddresses[i] = new String(source.PrivateIPAddresses[i]);
            }
        }
        if (source.PublicIPAddresses != null) {
            this.PublicIPAddresses = new String[source.PublicIPAddresses.length];
            for (int i = 0; i < source.PublicIPAddresses.length; i++) {
                this.PublicIPAddresses[i] = new String(source.PublicIPAddresses[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.InternetInfo != null) {
            this.InternetInfo = new HPCInternetInfo(source.InternetInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "OSName", this.OSName);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamObj(map, prefix + "GPUInfo.", this.GPUInfo);
        this.setParamArraySimple(map, prefix + "PrivateIPAddresses.", this.PrivateIPAddresses);
        this.setParamArraySimple(map, prefix + "PublicIPAddresses.", this.PublicIPAddresses);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamObj(map, prefix + "InternetInfo.", this.InternetInfo);

    }
}

