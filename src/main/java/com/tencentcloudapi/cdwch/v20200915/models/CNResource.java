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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNResource extends AbstractModel {

    /**
    * 资源id
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 集群的id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 用户appid
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 用户uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 组件
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 部署模式
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * 规格名称
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 资源id
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * 资源的状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 私有网络ip
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 核数
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
    * 存储大小
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 服务器ID
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 详细信息
    */
    @SerializedName("Details")
    @Expose
    private String Details;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 资源id 
     * @return ID 资源id
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 资源id
     * @param ID 资源id
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 集群的id 
     * @return InstanceID 集群的id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 集群的id
     * @param InstanceID 集群的id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 用户appid 
     * @return AppID 用户appid
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 用户appid
     * @param AppID 用户appid
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 用户uin 
     * @return Uin 用户uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
     * @param Uin 用户uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 组件 
     * @return Component 组件
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件
     * @param Component 组件
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 部署模式 
     * @return DeployMode 部署模式
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署模式
     * @param DeployMode 部署模式
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 规格名称 
     * @return SpecName 规格名称
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 规格名称
     * @param SpecName 规格名称
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 资源id 
     * @return ResourceID 资源id
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set 资源id
     * @param ResourceID 资源id
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get 资源的状态 
     * @return Status 资源的状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源的状态
     * @param Status 资源的状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 私有网络ip 
     * @return IP 私有网络ip
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 私有网络ip
     * @param IP 私有网络ip
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 核数 
     * @return CPU 核数
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 核数
     * @param CPU 核数
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
     * Get 存储大小 
     * @return Storage 存储大小
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小
     * @param Storage 存储大小
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 服务器ID 
     * @return UUID 服务器ID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 服务器ID
     * @param UUID 服务器ID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 地区 
     * @return Zone 地区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地区
     * @param Zone 地区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 详细信息 
     * @return Details 详细信息
     */
    public String getDetails() {
        return this.Details;
    }

    /**
     * Set 详细信息
     * @param Details 详细信息
     */
    public void setDetails(String Details) {
        this.Details = Details;
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
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public CNResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNResource(CNResource source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new Long(source.DeployMode);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.ResourceID != null) {
            this.ResourceID = new String(source.ResourceID);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.CPU != null) {
            this.CPU = new Long(source.CPU);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Details != null) {
            this.Details = new String(source.Details);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "ResourceID", this.ResourceID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Details", this.Details);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

