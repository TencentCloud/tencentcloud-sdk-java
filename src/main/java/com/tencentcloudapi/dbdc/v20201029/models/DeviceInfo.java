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

public class DeviceInfo extends AbstractModel{

    /**
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private Long DeviceId;

    /**
    * 设备No
    */
    @SerializedName("DeviceNo")
    @Expose
    private String DeviceNo;

    /**
    * 设备类型
    */
    @SerializedName("DevClass")
    @Expose
    private String DevClass;

    /**
    * 设备总内存，单位GB
    */
    @SerializedName("MaxMemory")
    @Expose
    private Float MaxMemory;

    /**
    * 设备总磁盘，单位GB
    */
    @SerializedName("MaxDisk")
    @Expose
    private Float MaxDisk;

    /**
    * 设备剩余内存，单位GB
    */
    @SerializedName("RestMemory")
    @Expose
    private Float RestMemory;

    /**
    * 设备剩余磁盘，单位GB
    */
    @SerializedName("RestDisk")
    @Expose
    private Float RestDisk;

    /**
    * 设备机器个数
    */
    @SerializedName("RawDeviceNum")
    @Expose
    private Long RawDeviceNum;

    /**
    * 数据库实例个数
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public Long getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(Long DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备No 
     * @return DeviceNo 设备No
     */
    public String getDeviceNo() {
        return this.DeviceNo;
    }

    /**
     * Set 设备No
     * @param DeviceNo 设备No
     */
    public void setDeviceNo(String DeviceNo) {
        this.DeviceNo = DeviceNo;
    }

    /**
     * Get 设备类型 
     * @return DevClass 设备类型
     */
    public String getDevClass() {
        return this.DevClass;
    }

    /**
     * Set 设备类型
     * @param DevClass 设备类型
     */
    public void setDevClass(String DevClass) {
        this.DevClass = DevClass;
    }

    /**
     * Get 设备总内存，单位GB 
     * @return MaxMemory 设备总内存，单位GB
     */
    public Float getMaxMemory() {
        return this.MaxMemory;
    }

    /**
     * Set 设备总内存，单位GB
     * @param MaxMemory 设备总内存，单位GB
     */
    public void setMaxMemory(Float MaxMemory) {
        this.MaxMemory = MaxMemory;
    }

    /**
     * Get 设备总磁盘，单位GB 
     * @return MaxDisk 设备总磁盘，单位GB
     */
    public Float getMaxDisk() {
        return this.MaxDisk;
    }

    /**
     * Set 设备总磁盘，单位GB
     * @param MaxDisk 设备总磁盘，单位GB
     */
    public void setMaxDisk(Float MaxDisk) {
        this.MaxDisk = MaxDisk;
    }

    /**
     * Get 设备剩余内存，单位GB 
     * @return RestMemory 设备剩余内存，单位GB
     */
    public Float getRestMemory() {
        return this.RestMemory;
    }

    /**
     * Set 设备剩余内存，单位GB
     * @param RestMemory 设备剩余内存，单位GB
     */
    public void setRestMemory(Float RestMemory) {
        this.RestMemory = RestMemory;
    }

    /**
     * Get 设备剩余磁盘，单位GB 
     * @return RestDisk 设备剩余磁盘，单位GB
     */
    public Float getRestDisk() {
        return this.RestDisk;
    }

    /**
     * Set 设备剩余磁盘，单位GB
     * @param RestDisk 设备剩余磁盘，单位GB
     */
    public void setRestDisk(Float RestDisk) {
        this.RestDisk = RestDisk;
    }

    /**
     * Get 设备机器个数 
     * @return RawDeviceNum 设备机器个数
     */
    public Long getRawDeviceNum() {
        return this.RawDeviceNum;
    }

    /**
     * Set 设备机器个数
     * @param RawDeviceNum 设备机器个数
     */
    public void setRawDeviceNum(Long RawDeviceNum) {
        this.RawDeviceNum = RawDeviceNum;
    }

    /**
     * Get 数据库实例个数 
     * @return InstanceNum 数据库实例个数
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 数据库实例个数
     * @param InstanceNum 数据库实例个数
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    public DeviceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceInfo(DeviceInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new Long(source.DeviceId);
        }
        if (source.DeviceNo != null) {
            this.DeviceNo = new String(source.DeviceNo);
        }
        if (source.DevClass != null) {
            this.DevClass = new String(source.DevClass);
        }
        if (source.MaxMemory != null) {
            this.MaxMemory = new Float(source.MaxMemory);
        }
        if (source.MaxDisk != null) {
            this.MaxDisk = new Float(source.MaxDisk);
        }
        if (source.RestMemory != null) {
            this.RestMemory = new Float(source.RestMemory);
        }
        if (source.RestDisk != null) {
            this.RestDisk = new Float(source.RestDisk);
        }
        if (source.RawDeviceNum != null) {
            this.RawDeviceNum = new Long(source.RawDeviceNum);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceNo", this.DeviceNo);
        this.setParamSimple(map, prefix + "DevClass", this.DevClass);
        this.setParamSimple(map, prefix + "MaxMemory", this.MaxMemory);
        this.setParamSimple(map, prefix + "MaxDisk", this.MaxDisk);
        this.setParamSimple(map, prefix + "RestMemory", this.RestMemory);
        this.setParamSimple(map, prefix + "RestDisk", this.RestDisk);
        this.setParamSimple(map, prefix + "RawDeviceNum", this.RawDeviceNum);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);

    }
}

