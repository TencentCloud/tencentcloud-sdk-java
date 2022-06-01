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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceDetail extends AbstractModel{

    /**
    * 集群状态，0：运行中，1：不在运行
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 读写集群剩余内存容量，单位GB
    */
    @SerializedName("ReadWriteTotalLeaveMemory")
    @Expose
    private Float ReadWriteTotalLeaveMemory;

    /**
    * 读写集群剩余磁盘容量，单位GB
    */
    @SerializedName("ReadWriteTotalLeaveDisk")
    @Expose
    private Float ReadWriteTotalLeaveDisk;

    /**
    * 读写集群总内存容量，单位GB
    */
    @SerializedName("ReadWriteTotalMemory")
    @Expose
    private Float ReadWriteTotalMemory;

    /**
    * 读写集群总磁盘容量，单位GB
    */
    @SerializedName("ReadWriteTotalDisk")
    @Expose
    private Float ReadWriteTotalDisk;

    /**
    * 只读集群剩余内存容量，单位GB
    */
    @SerializedName("ReadOnlyTotalLeaveMemory")
    @Expose
    private Float ReadOnlyTotalLeaveMemory;

    /**
    * 只读集群剩余磁盘容量，单位GB
    */
    @SerializedName("ReadOnlyTotalLeaveDisk")
    @Expose
    private Float ReadOnlyTotalLeaveDisk;

    /**
    * 只读集群总内存容量，单位GB
    */
    @SerializedName("ReadOnlyTotalMemory")
    @Expose
    private Float ReadOnlyTotalMemory;

    /**
    * 只读集群总磁盘容量，单位GB
    */
    @SerializedName("ReadOnlyTotalDisk")
    @Expose
    private Float ReadOnlyTotalDisk;

    /**
    * 集群设备详情
    */
    @SerializedName("InstanceDeviceInfos")
    @Expose
    private InstanceDeviceInfo [] InstanceDeviceInfos;

    /**
     * Get 集群状态，0：运行中，1：不在运行 
     * @return Status 集群状态，0：运行中，1：不在运行
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态，0：运行中，1：不在运行
     * @param Status 集群状态，0：运行中，1：不在运行
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 读写集群剩余内存容量，单位GB 
     * @return ReadWriteTotalLeaveMemory 读写集群剩余内存容量，单位GB
     */
    public Float getReadWriteTotalLeaveMemory() {
        return this.ReadWriteTotalLeaveMemory;
    }

    /**
     * Set 读写集群剩余内存容量，单位GB
     * @param ReadWriteTotalLeaveMemory 读写集群剩余内存容量，单位GB
     */
    public void setReadWriteTotalLeaveMemory(Float ReadWriteTotalLeaveMemory) {
        this.ReadWriteTotalLeaveMemory = ReadWriteTotalLeaveMemory;
    }

    /**
     * Get 读写集群剩余磁盘容量，单位GB 
     * @return ReadWriteTotalLeaveDisk 读写集群剩余磁盘容量，单位GB
     */
    public Float getReadWriteTotalLeaveDisk() {
        return this.ReadWriteTotalLeaveDisk;
    }

    /**
     * Set 读写集群剩余磁盘容量，单位GB
     * @param ReadWriteTotalLeaveDisk 读写集群剩余磁盘容量，单位GB
     */
    public void setReadWriteTotalLeaveDisk(Float ReadWriteTotalLeaveDisk) {
        this.ReadWriteTotalLeaveDisk = ReadWriteTotalLeaveDisk;
    }

    /**
     * Get 读写集群总内存容量，单位GB 
     * @return ReadWriteTotalMemory 读写集群总内存容量，单位GB
     */
    public Float getReadWriteTotalMemory() {
        return this.ReadWriteTotalMemory;
    }

    /**
     * Set 读写集群总内存容量，单位GB
     * @param ReadWriteTotalMemory 读写集群总内存容量，单位GB
     */
    public void setReadWriteTotalMemory(Float ReadWriteTotalMemory) {
        this.ReadWriteTotalMemory = ReadWriteTotalMemory;
    }

    /**
     * Get 读写集群总磁盘容量，单位GB 
     * @return ReadWriteTotalDisk 读写集群总磁盘容量，单位GB
     */
    public Float getReadWriteTotalDisk() {
        return this.ReadWriteTotalDisk;
    }

    /**
     * Set 读写集群总磁盘容量，单位GB
     * @param ReadWriteTotalDisk 读写集群总磁盘容量，单位GB
     */
    public void setReadWriteTotalDisk(Float ReadWriteTotalDisk) {
        this.ReadWriteTotalDisk = ReadWriteTotalDisk;
    }

    /**
     * Get 只读集群剩余内存容量，单位GB 
     * @return ReadOnlyTotalLeaveMemory 只读集群剩余内存容量，单位GB
     */
    public Float getReadOnlyTotalLeaveMemory() {
        return this.ReadOnlyTotalLeaveMemory;
    }

    /**
     * Set 只读集群剩余内存容量，单位GB
     * @param ReadOnlyTotalLeaveMemory 只读集群剩余内存容量，单位GB
     */
    public void setReadOnlyTotalLeaveMemory(Float ReadOnlyTotalLeaveMemory) {
        this.ReadOnlyTotalLeaveMemory = ReadOnlyTotalLeaveMemory;
    }

    /**
     * Get 只读集群剩余磁盘容量，单位GB 
     * @return ReadOnlyTotalLeaveDisk 只读集群剩余磁盘容量，单位GB
     */
    public Float getReadOnlyTotalLeaveDisk() {
        return this.ReadOnlyTotalLeaveDisk;
    }

    /**
     * Set 只读集群剩余磁盘容量，单位GB
     * @param ReadOnlyTotalLeaveDisk 只读集群剩余磁盘容量，单位GB
     */
    public void setReadOnlyTotalLeaveDisk(Float ReadOnlyTotalLeaveDisk) {
        this.ReadOnlyTotalLeaveDisk = ReadOnlyTotalLeaveDisk;
    }

    /**
     * Get 只读集群总内存容量，单位GB 
     * @return ReadOnlyTotalMemory 只读集群总内存容量，单位GB
     */
    public Float getReadOnlyTotalMemory() {
        return this.ReadOnlyTotalMemory;
    }

    /**
     * Set 只读集群总内存容量，单位GB
     * @param ReadOnlyTotalMemory 只读集群总内存容量，单位GB
     */
    public void setReadOnlyTotalMemory(Float ReadOnlyTotalMemory) {
        this.ReadOnlyTotalMemory = ReadOnlyTotalMemory;
    }

    /**
     * Get 只读集群总磁盘容量，单位GB 
     * @return ReadOnlyTotalDisk 只读集群总磁盘容量，单位GB
     */
    public Float getReadOnlyTotalDisk() {
        return this.ReadOnlyTotalDisk;
    }

    /**
     * Set 只读集群总磁盘容量，单位GB
     * @param ReadOnlyTotalDisk 只读集群总磁盘容量，单位GB
     */
    public void setReadOnlyTotalDisk(Float ReadOnlyTotalDisk) {
        this.ReadOnlyTotalDisk = ReadOnlyTotalDisk;
    }

    /**
     * Get 集群设备详情 
     * @return InstanceDeviceInfos 集群设备详情
     */
    public InstanceDeviceInfo [] getInstanceDeviceInfos() {
        return this.InstanceDeviceInfos;
    }

    /**
     * Set 集群设备详情
     * @param InstanceDeviceInfos 集群设备详情
     */
    public void setInstanceDeviceInfos(InstanceDeviceInfo [] InstanceDeviceInfos) {
        this.InstanceDeviceInfos = InstanceDeviceInfos;
    }

    public InstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceDetail(InstanceDetail source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ReadWriteTotalLeaveMemory != null) {
            this.ReadWriteTotalLeaveMemory = new Float(source.ReadWriteTotalLeaveMemory);
        }
        if (source.ReadWriteTotalLeaveDisk != null) {
            this.ReadWriteTotalLeaveDisk = new Float(source.ReadWriteTotalLeaveDisk);
        }
        if (source.ReadWriteTotalMemory != null) {
            this.ReadWriteTotalMemory = new Float(source.ReadWriteTotalMemory);
        }
        if (source.ReadWriteTotalDisk != null) {
            this.ReadWriteTotalDisk = new Float(source.ReadWriteTotalDisk);
        }
        if (source.ReadOnlyTotalLeaveMemory != null) {
            this.ReadOnlyTotalLeaveMemory = new Float(source.ReadOnlyTotalLeaveMemory);
        }
        if (source.ReadOnlyTotalLeaveDisk != null) {
            this.ReadOnlyTotalLeaveDisk = new Float(source.ReadOnlyTotalLeaveDisk);
        }
        if (source.ReadOnlyTotalMemory != null) {
            this.ReadOnlyTotalMemory = new Float(source.ReadOnlyTotalMemory);
        }
        if (source.ReadOnlyTotalDisk != null) {
            this.ReadOnlyTotalDisk = new Float(source.ReadOnlyTotalDisk);
        }
        if (source.InstanceDeviceInfos != null) {
            this.InstanceDeviceInfos = new InstanceDeviceInfo[source.InstanceDeviceInfos.length];
            for (int i = 0; i < source.InstanceDeviceInfos.length; i++) {
                this.InstanceDeviceInfos[i] = new InstanceDeviceInfo(source.InstanceDeviceInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ReadWriteTotalLeaveMemory", this.ReadWriteTotalLeaveMemory);
        this.setParamSimple(map, prefix + "ReadWriteTotalLeaveDisk", this.ReadWriteTotalLeaveDisk);
        this.setParamSimple(map, prefix + "ReadWriteTotalMemory", this.ReadWriteTotalMemory);
        this.setParamSimple(map, prefix + "ReadWriteTotalDisk", this.ReadWriteTotalDisk);
        this.setParamSimple(map, prefix + "ReadOnlyTotalLeaveMemory", this.ReadOnlyTotalLeaveMemory);
        this.setParamSimple(map, prefix + "ReadOnlyTotalLeaveDisk", this.ReadOnlyTotalLeaveDisk);
        this.setParamSimple(map, prefix + "ReadOnlyTotalMemory", this.ReadOnlyTotalMemory);
        this.setParamSimple(map, prefix + "ReadOnlyTotalDisk", this.ReadOnlyTotalDisk);
        this.setParamArrayObj(map, prefix + "InstanceDeviceInfos.", this.InstanceDeviceInfos);

    }
}

