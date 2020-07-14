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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeDBInstanceRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例升级后的内存大小，单位GB，其值不能比当前实例内存小
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 实例升级后的CPU核心数，其值不能比当前实例CPU小
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get 实例ID，形如mssql-njj2mtpl 
     * @return InstanceId 实例ID，形如mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-njj2mtpl
     * @param InstanceId 实例ID，形如mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例升级后的内存大小，单位GB，其值不能比当前实例内存小 
     * @return Memory 实例升级后的内存大小，单位GB，其值不能比当前实例内存小
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例升级后的内存大小，单位GB，其值不能比当前实例内存小
     * @param Memory 实例升级后的内存大小，单位GB，其值不能比当前实例内存小
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小 
     * @return Storage 实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
     * @param Storage 实例升级后的磁盘大小，单位GB，其值不能比当前实例磁盘小
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 实例升级后的CPU核心数，其值不能比当前实例CPU小 
     * @return Cpu 实例升级后的CPU核心数，其值不能比当前实例CPU小
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例升级后的CPU核心数，其值不能比当前实例CPU小
     * @param Cpu 实例升级后的CPU核心数，其值不能比当前实例CPU小
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

