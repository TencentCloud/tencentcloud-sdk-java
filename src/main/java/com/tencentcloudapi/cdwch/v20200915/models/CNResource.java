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
    * 无
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 无
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 无
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * 无
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 无
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 无
    */
    @SerializedName("DeployMode")
    @Expose
    private Long DeployMode;

    /**
    * 无
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 无
    */
    @SerializedName("ResourceID")
    @Expose
    private String ResourceID;

    /**
    * 无
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 无
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 无
    */
    @SerializedName("CPU")
    @Expose
    private Long CPU;

    /**
    * 无
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 无
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 无
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 无
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 无
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 无
    */
    @SerializedName("Details")
    @Expose
    private String Details;

    /**
    * 无
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 无
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 无
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get 无 
     * @return ID 无
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 无
     * @param ID 无
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 无 
     * @return InstanceID 无
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 无
     * @param InstanceID 无
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 无 
     * @return AppID 无
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set 无
     * @param AppID 无
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 无 
     * @return Uin 无
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 无
     * @param Uin 无
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 无 
     * @return Component 无
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 无
     * @param Component 无
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 无 
     * @return DeployMode 无
     */
    public Long getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 无
     * @param DeployMode 无
     */
    public void setDeployMode(Long DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 无 
     * @return SpecName 无
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 无
     * @param SpecName 无
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 无 
     * @return ResourceID 无
     */
    public String getResourceID() {
        return this.ResourceID;
    }

    /**
     * Set 无
     * @param ResourceID 无
     */
    public void setResourceID(String ResourceID) {
        this.ResourceID = ResourceID;
    }

    /**
     * Get 无 
     * @return Status 无
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 无
     * @param Status 无
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 无 
     * @return IP 无
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 无
     * @param IP 无
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 无 
     * @return CPU 无
     */
    public Long getCPU() {
        return this.CPU;
    }

    /**
     * Set 无
     * @param CPU 无
     */
    public void setCPU(Long CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 无 
     * @return Memory 无
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 无
     * @param Memory 无
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 无 
     * @return Storage 无
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 无
     * @param Storage 无
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 无 
     * @return UUID 无
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 无
     * @param UUID 无
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 无 
     * @return Region 无
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 无
     * @param Region 无
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 无 
     * @return Zone 无
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 无
     * @param Zone 无
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 无 
     * @return Details 无
     */
    public String getDetails() {
        return this.Details;
    }

    /**
     * Set 无
     * @param Details 无
     */
    public void setDetails(String Details) {
        this.Details = Details;
    }

    /**
     * Get 无 
     * @return CreateTime 无
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 无
     * @param CreateTime 无
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 无 
     * @return ModifyTime 无
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 无
     * @param ModifyTime 无
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 无 
     * @return ExpireTime 无
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 无
     * @param ExpireTime 无
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

