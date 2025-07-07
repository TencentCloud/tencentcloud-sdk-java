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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceModifyRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 存储大小，存储资源变配：ClusterId,StorageLimit
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 实例ID，计算资源变配必传: ClusterId,InstanceId,Cpu,Memory 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * serverless实例ccu大小
    */
    @SerializedName("Ccu")
    @Expose
    private Float Ccu;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get CPU核数 
     * @return Cpu CPU核数
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存大小 
     * @return Memory 内存大小
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存大小
     * @param Memory 内存大小
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 存储大小，存储资源变配：ClusterId,StorageLimit 
     * @return StorageLimit 存储大小，存储资源变配：ClusterId,StorageLimit
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储大小，存储资源变配：ClusterId,StorageLimit
     * @param StorageLimit 存储大小，存储资源变配：ClusterId,StorageLimit
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 实例ID，计算资源变配必传: ClusterId,InstanceId,Cpu,Memory  
     * @return InstanceId 实例ID，计算资源变配必传: ClusterId,InstanceId,Cpu,Memory 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，计算资源变配必传: ClusterId,InstanceId,Cpu,Memory 
     * @param InstanceId 实例ID，计算资源变配必传: ClusterId,InstanceId,Cpu,Memory 
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例设备类型 
     * @return DeviceType 实例设备类型
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 实例设备类型
     * @param DeviceType 实例设备类型
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get serverless实例ccu大小 
     * @return Ccu serverless实例ccu大小
     */
    public Float getCcu() {
        return this.Ccu;
    }

    /**
     * Set serverless实例ccu大小
     * @param Ccu serverless实例ccu大小
     */
    public void setCcu(Float Ccu) {
        this.Ccu = Ccu;
    }

    public InquirePriceModifyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceModifyRequest(InquirePriceModifyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Ccu != null) {
            this.Ccu = new Float(source.Ccu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Ccu", this.Ccu);

    }
}

