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
package com.tencentcloudapi.cds.v20180420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DbauditTypesInfo extends AbstractModel{

    /**
    * 规格描述
    */
    @SerializedName("InstanceVersionName")
    @Expose
    private String InstanceVersionName;

    /**
    * 规格名称
    */
    @SerializedName("InstanceVersionKey")
    @Expose
    private String InstanceVersionKey;

    /**
    * 最大吞吐量
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 最大实例数
    */
    @SerializedName("MaxInstances")
    @Expose
    private Long MaxInstances;

    /**
    * 入库速率（每小时）
    */
    @SerializedName("InsertSpeed")
    @Expose
    private Long InsertSpeed;

    /**
    * 最大在线存储量，单位：条
    */
    @SerializedName("OnlineStorageCapacity")
    @Expose
    private Long OnlineStorageCapacity;

    /**
    * 最大归档存储量，单位：条
    */
    @SerializedName("ArchivingStorageCapacity")
    @Expose
    private Long ArchivingStorageCapacity;

    /**
     * Get 规格描述 
     * @return InstanceVersionName 规格描述
     */
    public String getInstanceVersionName() {
        return this.InstanceVersionName;
    }

    /**
     * Set 规格描述
     * @param InstanceVersionName 规格描述
     */
    public void setInstanceVersionName(String InstanceVersionName) {
        this.InstanceVersionName = InstanceVersionName;
    }

    /**
     * Get 规格名称 
     * @return InstanceVersionKey 规格名称
     */
    public String getInstanceVersionKey() {
        return this.InstanceVersionKey;
    }

    /**
     * Set 规格名称
     * @param InstanceVersionKey 规格名称
     */
    public void setInstanceVersionKey(String InstanceVersionKey) {
        this.InstanceVersionKey = InstanceVersionKey;
    }

    /**
     * Get 最大吞吐量 
     * @return Qps 最大吞吐量
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 最大吞吐量
     * @param Qps 最大吞吐量
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 最大实例数 
     * @return MaxInstances 最大实例数
     */
    public Long getMaxInstances() {
        return this.MaxInstances;
    }

    /**
     * Set 最大实例数
     * @param MaxInstances 最大实例数
     */
    public void setMaxInstances(Long MaxInstances) {
        this.MaxInstances = MaxInstances;
    }

    /**
     * Get 入库速率（每小时） 
     * @return InsertSpeed 入库速率（每小时）
     */
    public Long getInsertSpeed() {
        return this.InsertSpeed;
    }

    /**
     * Set 入库速率（每小时）
     * @param InsertSpeed 入库速率（每小时）
     */
    public void setInsertSpeed(Long InsertSpeed) {
        this.InsertSpeed = InsertSpeed;
    }

    /**
     * Get 最大在线存储量，单位：条 
     * @return OnlineStorageCapacity 最大在线存储量，单位：条
     */
    public Long getOnlineStorageCapacity() {
        return this.OnlineStorageCapacity;
    }

    /**
     * Set 最大在线存储量，单位：条
     * @param OnlineStorageCapacity 最大在线存储量，单位：条
     */
    public void setOnlineStorageCapacity(Long OnlineStorageCapacity) {
        this.OnlineStorageCapacity = OnlineStorageCapacity;
    }

    /**
     * Get 最大归档存储量，单位：条 
     * @return ArchivingStorageCapacity 最大归档存储量，单位：条
     */
    public Long getArchivingStorageCapacity() {
        return this.ArchivingStorageCapacity;
    }

    /**
     * Set 最大归档存储量，单位：条
     * @param ArchivingStorageCapacity 最大归档存储量，单位：条
     */
    public void setArchivingStorageCapacity(Long ArchivingStorageCapacity) {
        this.ArchivingStorageCapacity = ArchivingStorageCapacity;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceVersionName", this.InstanceVersionName);
        this.setParamSimple(map, prefix + "InstanceVersionKey", this.InstanceVersionKey);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "MaxInstances", this.MaxInstances);
        this.setParamSimple(map, prefix + "InsertSpeed", this.InsertSpeed);
        this.setParamSimple(map, prefix + "OnlineStorageCapacity", this.OnlineStorageCapacity);
        this.setParamSimple(map, prefix + "ArchivingStorageCapacity", this.ArchivingStorageCapacity);

    }
}

