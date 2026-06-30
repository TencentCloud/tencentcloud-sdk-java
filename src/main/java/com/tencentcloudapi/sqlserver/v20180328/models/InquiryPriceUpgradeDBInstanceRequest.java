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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeDBInstanceRequest extends AbstractModel {

    /**
    * <p>实例ID，形如mssql-njj2mtpl</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例升级后的内存大小，单位GB，其值不能比当前实例内存小</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>实例升级后的CPU核心数，其值不能比当前实例CPU小</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>额外磁盘 IO 吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
    */
    @SerializedName("ThroughputPerformance")
    @Expose
    private Long ThroughputPerformance;

    /**
     * Get <p>实例ID，形如mssql-njj2mtpl</p> 
     * @return InstanceId <p>实例ID，形如mssql-njj2mtpl</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID，形如mssql-njj2mtpl</p>
     * @param InstanceId <p>实例ID，形如mssql-njj2mtpl</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例升级后的内存大小，单位GB，其值不能比当前实例内存小</p> 
     * @return Memory <p>实例升级后的内存大小，单位GB，其值不能比当前实例内存小</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例升级后的内存大小，单位GB，其值不能比当前实例内存小</p>
     * @param Memory <p>实例升级后的内存大小，单位GB，其值不能比当前实例内存小</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小</p> 
     * @return Storage <p>实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小</p>
     * @param Storage <p>实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>实例升级后的CPU核心数，其值不能比当前实例CPU小</p> 
     * @return Cpu <p>实例升级后的CPU核心数，其值不能比当前实例CPU小</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例升级后的CPU核心数，其值不能比当前实例CPU小</p>
     * @param Cpu <p>实例升级后的CPU核心数，其值不能比当前实例CPU小</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>额外磁盘 IO 吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p> 
     * @return ThroughputPerformance <p>额外磁盘 IO 吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     */
    public Long getThroughputPerformance() {
        return this.ThroughputPerformance;
    }

    /**
     * Set <p>额外磁盘 IO 吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     * @param ThroughputPerformance <p>额外磁盘 IO 吞吐量</p><p>取值范围：[0, 650]</p><p>单位：MB/s</p>
     */
    public void setThroughputPerformance(Long ThroughputPerformance) {
        this.ThroughputPerformance = ThroughputPerformance;
    }

    public InquiryPriceUpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpgradeDBInstanceRequest(InquiryPriceUpgradeDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.ThroughputPerformance != null) {
            this.ThroughputPerformance = new Long(source.ThroughputPerformance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "ThroughputPerformance", this.ThroughputPerformance);

    }
}

