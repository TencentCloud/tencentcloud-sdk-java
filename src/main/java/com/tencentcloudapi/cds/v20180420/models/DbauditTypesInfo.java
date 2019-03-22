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

public class DbauditTypesInfo  extends AbstractModel{

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
    private Integer Qps;

    /**
    * 最大实例数
    */
    @SerializedName("MaxInstances")
    @Expose
    private Integer MaxInstances;

    /**
    * 入库速率（每小时）
    */
    @SerializedName("InsertSpeed")
    @Expose
    private Integer InsertSpeed;

    /**
    * 最大在线存储量，单位：条
    */
    @SerializedName("OnlineStorageCapacity")
    @Expose
    private Integer OnlineStorageCapacity;

    /**
    * 最大归档存储量，单位：条
    */
    @SerializedName("ArchivingStorageCapacity")
    @Expose
    private Integer ArchivingStorageCapacity;

    /**
     * 获取规格描述
     * @return InstanceVersionName 规格描述
     */
    public String getInstanceVersionName() {
        return this.InstanceVersionName;
    }

    /**
     * 设置规格描述
     * @param InstanceVersionName 规格描述
     */
    public void setInstanceVersionName(String InstanceVersionName) {
        this.InstanceVersionName = InstanceVersionName;
    }

    /**
     * 获取规格名称
     * @return InstanceVersionKey 规格名称
     */
    public String getInstanceVersionKey() {
        return this.InstanceVersionKey;
    }

    /**
     * 设置规格名称
     * @param InstanceVersionKey 规格名称
     */
    public void setInstanceVersionKey(String InstanceVersionKey) {
        this.InstanceVersionKey = InstanceVersionKey;
    }

    /**
     * 获取最大吞吐量
     * @return Qps 最大吞吐量
     */
    public Integer getQps() {
        return this.Qps;
    }

    /**
     * 设置最大吞吐量
     * @param Qps 最大吞吐量
     */
    public void setQps(Integer Qps) {
        this.Qps = Qps;
    }

    /**
     * 获取最大实例数
     * @return MaxInstances 最大实例数
     */
    public Integer getMaxInstances() {
        return this.MaxInstances;
    }

    /**
     * 设置最大实例数
     * @param MaxInstances 最大实例数
     */
    public void setMaxInstances(Integer MaxInstances) {
        this.MaxInstances = MaxInstances;
    }

    /**
     * 获取入库速率（每小时）
     * @return InsertSpeed 入库速率（每小时）
     */
    public Integer getInsertSpeed() {
        return this.InsertSpeed;
    }

    /**
     * 设置入库速率（每小时）
     * @param InsertSpeed 入库速率（每小时）
     */
    public void setInsertSpeed(Integer InsertSpeed) {
        this.InsertSpeed = InsertSpeed;
    }

    /**
     * 获取最大在线存储量，单位：条
     * @return OnlineStorageCapacity 最大在线存储量，单位：条
     */
    public Integer getOnlineStorageCapacity() {
        return this.OnlineStorageCapacity;
    }

    /**
     * 设置最大在线存储量，单位：条
     * @param OnlineStorageCapacity 最大在线存储量，单位：条
     */
    public void setOnlineStorageCapacity(Integer OnlineStorageCapacity) {
        this.OnlineStorageCapacity = OnlineStorageCapacity;
    }

    /**
     * 获取最大归档存储量，单位：条
     * @return ArchivingStorageCapacity 最大归档存储量，单位：条
     */
    public Integer getArchivingStorageCapacity() {
        return this.ArchivingStorageCapacity;
    }

    /**
     * 设置最大归档存储量，单位：条
     * @param ArchivingStorageCapacity 最大归档存储量，单位：条
     */
    public void setArchivingStorageCapacity(Integer ArchivingStorageCapacity) {
        this.ArchivingStorageCapacity = ArchivingStorageCapacity;
    }

    /**
     * 内部实现，用户禁止调用
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

