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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否仅做预检查，不实际执行变配。true: 仅返回变配计划和预检查结果；false: 实际执行变配（默认）</p>
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * <p>对等节点CPU核数，不传则保持当前值不变</p>
    */
    @SerializedName("HybridNodeCpu")
    @Expose
    private Long HybridNodeCpu;

    /**
    * <p>对等节点内存大小，单位GB，不传则保持当前值不变</p>
    */
    @SerializedName("HybridNodeMem")
    @Expose
    private Long HybridNodeMem;

    /**
    * <p>对等节点数量，不传则保持当前值不变</p>
    */
    @SerializedName("HybridNodeNum")
    @Expose
    private Long HybridNodeNum;

    /**
    * <p>对等节点磁盘容量，单位GB，不传则保持当前值不变</p>
    */
    @SerializedName("Disk")
    @Expose
    private Long Disk;

    /**
    * <p>存储类型，可选值：CLOUD_HSSD（增强型SSD云硬盘）、CLOUD_TCS（本地盘）、CLOUD_BSSD（通用型SSD云硬盘），不传则保持当前值不变</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>规格编码，如 4c8g、16c32g 等</p>
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * <p>目标可用区列表，不传则保持当前值不变</p>
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * <p>可用区模式，1: 单可用区，3: 多可用区主AZ模式</p>
    */
    @SerializedName("AZMode")
    @Expose
    private Long AZMode;

    /**
    * <p>主可用区，AZMode传3时生效</p>
    */
    @SerializedName("PrimaryAZ")
    @Expose
    private String PrimaryAZ;

    /**
    * <p>全功能型副本数，取值范围1-3</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否仅做预检查，不实际执行变配。true: 仅返回变配计划和预检查结果；false: 实际执行变配（默认）</p> 
     * @return DryRun <p>是否仅做预检查，不实际执行变配。true: 仅返回变配计划和预检查结果；false: 实际执行变配（默认）</p>
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set <p>是否仅做预检查，不实际执行变配。true: 仅返回变配计划和预检查结果；false: 实际执行变配（默认）</p>
     * @param DryRun <p>是否仅做预检查，不实际执行变配。true: 仅返回变配计划和预检查结果；false: 实际执行变配（默认）</p>
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get <p>对等节点CPU核数，不传则保持当前值不变</p> 
     * @return HybridNodeCpu <p>对等节点CPU核数，不传则保持当前值不变</p>
     */
    public Long getHybridNodeCpu() {
        return this.HybridNodeCpu;
    }

    /**
     * Set <p>对等节点CPU核数，不传则保持当前值不变</p>
     * @param HybridNodeCpu <p>对等节点CPU核数，不传则保持当前值不变</p>
     */
    public void setHybridNodeCpu(Long HybridNodeCpu) {
        this.HybridNodeCpu = HybridNodeCpu;
    }

    /**
     * Get <p>对等节点内存大小，单位GB，不传则保持当前值不变</p> 
     * @return HybridNodeMem <p>对等节点内存大小，单位GB，不传则保持当前值不变</p>
     */
    public Long getHybridNodeMem() {
        return this.HybridNodeMem;
    }

    /**
     * Set <p>对等节点内存大小，单位GB，不传则保持当前值不变</p>
     * @param HybridNodeMem <p>对等节点内存大小，单位GB，不传则保持当前值不变</p>
     */
    public void setHybridNodeMem(Long HybridNodeMem) {
        this.HybridNodeMem = HybridNodeMem;
    }

    /**
     * Get <p>对等节点数量，不传则保持当前值不变</p> 
     * @return HybridNodeNum <p>对等节点数量，不传则保持当前值不变</p>
     */
    public Long getHybridNodeNum() {
        return this.HybridNodeNum;
    }

    /**
     * Set <p>对等节点数量，不传则保持当前值不变</p>
     * @param HybridNodeNum <p>对等节点数量，不传则保持当前值不变</p>
     */
    public void setHybridNodeNum(Long HybridNodeNum) {
        this.HybridNodeNum = HybridNodeNum;
    }

    /**
     * Get <p>对等节点磁盘容量，单位GB，不传则保持当前值不变</p> 
     * @return Disk <p>对等节点磁盘容量，单位GB，不传则保持当前值不变</p>
     */
    public Long getDisk() {
        return this.Disk;
    }

    /**
     * Set <p>对等节点磁盘容量，单位GB，不传则保持当前值不变</p>
     * @param Disk <p>对等节点磁盘容量，单位GB，不传则保持当前值不变</p>
     */
    public void setDisk(Long Disk) {
        this.Disk = Disk;
    }

    /**
     * Get <p>存储类型，可选值：CLOUD_HSSD（增强型SSD云硬盘）、CLOUD_TCS（本地盘）、CLOUD_BSSD（通用型SSD云硬盘），不传则保持当前值不变</p> 
     * @return StorageType <p>存储类型，可选值：CLOUD_HSSD（增强型SSD云硬盘）、CLOUD_TCS（本地盘）、CLOUD_BSSD（通用型SSD云硬盘），不传则保持当前值不变</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>存储类型，可选值：CLOUD_HSSD（增强型SSD云硬盘）、CLOUD_TCS（本地盘）、CLOUD_BSSD（通用型SSD云硬盘），不传则保持当前值不变</p>
     * @param StorageType <p>存储类型，可选值：CLOUD_HSSD（增强型SSD云硬盘）、CLOUD_TCS（本地盘）、CLOUD_BSSD（通用型SSD云硬盘），不传则保持当前值不变</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>规格编码，如 4c8g、16c32g 等</p> 
     * @return SpecCode <p>规格编码，如 4c8g、16c32g 等</p>
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * Set <p>规格编码，如 4c8g、16c32g 等</p>
     * @param SpecCode <p>规格编码，如 4c8g、16c32g 等</p>
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * Get <p>目标可用区列表，不传则保持当前值不变</p> 
     * @return Zones <p>目标可用区列表，不传则保持当前值不变</p>
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set <p>目标可用区列表，不传则保持当前值不变</p>
     * @param Zones <p>目标可用区列表，不传则保持当前值不变</p>
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get <p>可用区模式，1: 单可用区，3: 多可用区主AZ模式</p> 
     * @return AZMode <p>可用区模式，1: 单可用区，3: 多可用区主AZ模式</p>
     */
    public Long getAZMode() {
        return this.AZMode;
    }

    /**
     * Set <p>可用区模式，1: 单可用区，3: 多可用区主AZ模式</p>
     * @param AZMode <p>可用区模式，1: 单可用区，3: 多可用区主AZ模式</p>
     */
    public void setAZMode(Long AZMode) {
        this.AZMode = AZMode;
    }

    /**
     * Get <p>主可用区，AZMode传3时生效</p> 
     * @return PrimaryAZ <p>主可用区，AZMode传3时生效</p>
     */
    public String getPrimaryAZ() {
        return this.PrimaryAZ;
    }

    /**
     * Set <p>主可用区，AZMode传3时生效</p>
     * @param PrimaryAZ <p>主可用区，AZMode传3时生效</p>
     */
    public void setPrimaryAZ(String PrimaryAZ) {
        this.PrimaryAZ = PrimaryAZ;
    }

    /**
     * Get <p>全功能型副本数，取值范围1-3</p> 
     * @return FullReplications <p>全功能型副本数，取值范围1-3</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>全功能型副本数，取值范围1-3</p>
     * @param FullReplications <p>全功能型副本数，取值范围1-3</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    public ModifyDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceRequest(ModifyDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.HybridNodeCpu != null) {
            this.HybridNodeCpu = new Long(source.HybridNodeCpu);
        }
        if (source.HybridNodeMem != null) {
            this.HybridNodeMem = new Long(source.HybridNodeMem);
        }
        if (source.HybridNodeNum != null) {
            this.HybridNodeNum = new Long(source.HybridNodeNum);
        }
        if (source.Disk != null) {
            this.Disk = new Long(source.Disk);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.SpecCode != null) {
            this.SpecCode = new String(source.SpecCode);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.AZMode != null) {
            this.AZMode = new Long(source.AZMode);
        }
        if (source.PrimaryAZ != null) {
            this.PrimaryAZ = new String(source.PrimaryAZ);
        }
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "HybridNodeCpu", this.HybridNodeCpu);
        this.setParamSimple(map, prefix + "HybridNodeMem", this.HybridNodeMem);
        this.setParamSimple(map, prefix + "HybridNodeNum", this.HybridNodeNum);
        this.setParamSimple(map, prefix + "Disk", this.Disk);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "AZMode", this.AZMode);
        this.setParamSimple(map, prefix + "PrimaryAZ", this.PrimaryAZ);
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);

    }
}

