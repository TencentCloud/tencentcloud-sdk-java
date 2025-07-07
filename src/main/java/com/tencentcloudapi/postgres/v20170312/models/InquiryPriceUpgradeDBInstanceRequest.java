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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeDBInstanceRequest extends AbstractModel {

    /**
    * 实例的磁盘大小，单位GB
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 实例的内存大小，单位GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例ID，形如postgres-hez4fh0v
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例计费类型。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 实例的Cpu大小，单位Core
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get 实例的磁盘大小，单位GB 
     * @return Storage 实例的磁盘大小，单位GB
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例的磁盘大小，单位GB
     * @param Storage 实例的磁盘大小，单位GB
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 实例的内存大小，单位GB 
     * @return Memory 实例的内存大小，单位GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例的内存大小，单位GB
     * @param Memory 实例的内存大小，单位GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例ID，形如postgres-hez4fh0v 
     * @return DBInstanceId 实例ID，形如postgres-hez4fh0v
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID，形如postgres-hez4fh0v
     * @param DBInstanceId 实例ID，形如postgres-hez4fh0v
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 实例计费类型。 
     * @return InstanceChargeType 实例计费类型。
     * @deprecated
     */
    @Deprecated
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 实例计费类型。
     * @param InstanceChargeType 实例计费类型。
     * @deprecated
     */
    @Deprecated
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 实例的Cpu大小，单位Core 
     * @return Cpu 实例的Cpu大小，单位Core
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例的Cpu大小，单位Core
     * @param Cpu 实例的Cpu大小，单位Core
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    public InquiryPriceUpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpgradeDBInstanceRequest(InquiryPriceUpgradeDBInstanceRequest source) {
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

