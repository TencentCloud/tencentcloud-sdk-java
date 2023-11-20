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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUpgradeInstanceCheckRequest extends AbstractModel {

    /**
    * 数据库实例ID，形如mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例变配后的CPU核心数，不填则不修改
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 实例变配后内存大小，单位GB，不填则不修改
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 实例变配后磁盘大小，单位GB，不填则不修改
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 实例版本，不填则不修改
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 实例变配后的类型，可选值：CLUSTER-集群，不填则不修改
    */
    @SerializedName("HAType")
    @Expose
    private String HAType;

    /**
    * 实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改
    */
    @SerializedName("MultiZones")
    @Expose
    private String MultiZones;

    /**
     * Get 数据库实例ID，形如mssql-njj2mtpl 
     * @return InstanceId 数据库实例ID，形如mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据库实例ID，形如mssql-njj2mtpl
     * @param InstanceId 数据库实例ID，形如mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例变配后的CPU核心数，不填则不修改 
     * @return Cpu 实例变配后的CPU核心数，不填则不修改
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 实例变配后的CPU核心数，不填则不修改
     * @param Cpu 实例变配后的CPU核心数，不填则不修改
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 实例变配后内存大小，单位GB，不填则不修改 
     * @return Memory 实例变配后内存大小，单位GB，不填则不修改
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 实例变配后内存大小，单位GB，不填则不修改
     * @param Memory 实例变配后内存大小，单位GB，不填则不修改
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 实例变配后磁盘大小，单位GB，不填则不修改 
     * @return Storage 实例变配后磁盘大小，单位GB，不填则不修改
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 实例变配后磁盘大小，单位GB，不填则不修改
     * @param Storage 实例变配后磁盘大小，单位GB，不填则不修改
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 实例版本，不填则不修改 
     * @return DBVersion 实例版本，不填则不修改
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * Set 实例版本，不填则不修改
     * @param DBVersion 实例版本，不填则不修改
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * Get 实例变配后的类型，可选值：CLUSTER-集群，不填则不修改 
     * @return HAType 实例变配后的类型，可选值：CLUSTER-集群，不填则不修改
     */
    public String getHAType() {
        return this.HAType;
    }

    /**
     * Set 实例变配后的类型，可选值：CLUSTER-集群，不填则不修改
     * @param HAType 实例变配后的类型，可选值：CLUSTER-集群，不填则不修改
     */
    public void setHAType(String HAType) {
        this.HAType = HAType;
    }

    /**
     * Get 实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改 
     * @return MultiZones 实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改
     */
    public String getMultiZones() {
        return this.MultiZones;
    }

    /**
     * Set 实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改
     * @param MultiZones 实例变配后的跨可用区类型，可选值： SameZones-修改为同可用区 MultiZones-修改为跨可用区，不填则不修改
     */
    public void setMultiZones(String MultiZones) {
        this.MultiZones = MultiZones;
    }

    public DescribeUpgradeInstanceCheckRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUpgradeInstanceCheckRequest(DescribeUpgradeInstanceCheckRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.DBVersion != null) {
            this.DBVersion = new String(source.DBVersion);
        }
        if (source.HAType != null) {
            this.HAType = new String(source.HAType);
        }
        if (source.MultiZones != null) {
            this.MultiZones = new String(source.MultiZones);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "HAType", this.HAType);
        this.setParamSimple(map, prefix + "MultiZones", this.MultiZones);

    }
}

