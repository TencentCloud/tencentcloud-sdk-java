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

public class DrReadableInfo extends AbstractModel {

    /**
    * 备机资源ID
    */
    @SerializedName("DrInstanceId")
    @Expose
    private String DrInstanceId;

    /**
    * 备机可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 备机状态
DR_CREATING-备机创建中
DR_RUNNING-备机运行中
DR_UNAVAILABLE-备机不可用
DR_ISOLATED-备机已隔离
DR_RECYCLING-备机回收中
DR_RECYCLED-备机已回收
DR_JOB_RUNNING-备机执行任务中
DR_OFFLINE-备机已下线
DR_FAIL_OVER-备机只读故障转移中
    */
    @SerializedName("SlaveStatus")
    @Expose
    private String SlaveStatus;

    /**
    * 备机可读状态，enable-已开启，disable-已关闭
    */
    @SerializedName("ReadableStatus")
    @Expose
    private String ReadableStatus;

    /**
    * 备机只读vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 备机只读端口
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 备机所在私有网络ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * 备机所在私有网络子网ID
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * 备机只读权重
    */
    @SerializedName("RoWeight")
    @Expose
    private Long RoWeight;

    /**
    * 备机只读模式，BalancedReadOnly-多备一读模式，SingleReadOnly-一备一读模式
    */
    @SerializedName("ReadMode")
    @Expose
    private String ReadMode;

    /**
     * Get 备机资源ID 
     * @return DrInstanceId 备机资源ID
     */
    public String getDrInstanceId() {
        return this.DrInstanceId;
    }

    /**
     * Set 备机资源ID
     * @param DrInstanceId 备机资源ID
     */
    public void setDrInstanceId(String DrInstanceId) {
        this.DrInstanceId = DrInstanceId;
    }

    /**
     * Get 备机可用区 
     * @return Zone 备机可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 备机可用区
     * @param Zone 备机可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 备机状态
DR_CREATING-备机创建中
DR_RUNNING-备机运行中
DR_UNAVAILABLE-备机不可用
DR_ISOLATED-备机已隔离
DR_RECYCLING-备机回收中
DR_RECYCLED-备机已回收
DR_JOB_RUNNING-备机执行任务中
DR_OFFLINE-备机已下线
DR_FAIL_OVER-备机只读故障转移中 
     * @return SlaveStatus 备机状态
DR_CREATING-备机创建中
DR_RUNNING-备机运行中
DR_UNAVAILABLE-备机不可用
DR_ISOLATED-备机已隔离
DR_RECYCLING-备机回收中
DR_RECYCLED-备机已回收
DR_JOB_RUNNING-备机执行任务中
DR_OFFLINE-备机已下线
DR_FAIL_OVER-备机只读故障转移中
     */
    public String getSlaveStatus() {
        return this.SlaveStatus;
    }

    /**
     * Set 备机状态
DR_CREATING-备机创建中
DR_RUNNING-备机运行中
DR_UNAVAILABLE-备机不可用
DR_ISOLATED-备机已隔离
DR_RECYCLING-备机回收中
DR_RECYCLED-备机已回收
DR_JOB_RUNNING-备机执行任务中
DR_OFFLINE-备机已下线
DR_FAIL_OVER-备机只读故障转移中
     * @param SlaveStatus 备机状态
DR_CREATING-备机创建中
DR_RUNNING-备机运行中
DR_UNAVAILABLE-备机不可用
DR_ISOLATED-备机已隔离
DR_RECYCLING-备机回收中
DR_RECYCLED-备机已回收
DR_JOB_RUNNING-备机执行任务中
DR_OFFLINE-备机已下线
DR_FAIL_OVER-备机只读故障转移中
     */
    public void setSlaveStatus(String SlaveStatus) {
        this.SlaveStatus = SlaveStatus;
    }

    /**
     * Get 备机可读状态，enable-已开启，disable-已关闭 
     * @return ReadableStatus 备机可读状态，enable-已开启，disable-已关闭
     */
    public String getReadableStatus() {
        return this.ReadableStatus;
    }

    /**
     * Set 备机可读状态，enable-已开启，disable-已关闭
     * @param ReadableStatus 备机可读状态，enable-已开启，disable-已关闭
     */
    public void setReadableStatus(String ReadableStatus) {
        this.ReadableStatus = ReadableStatus;
    }

    /**
     * Get 备机只读vip 
     * @return Vip 备机只读vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 备机只读vip
     * @param Vip 备机只读vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 备机只读端口 
     * @return VPort 备机只读端口
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 备机只读端口
     * @param VPort 备机只读端口
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 备机所在私有网络ID 
     * @return UniqVpcId 备机所在私有网络ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 备机所在私有网络ID
     * @param UniqVpcId 备机所在私有网络ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get 备机所在私有网络子网ID 
     * @return UniqSubnetId 备机所在私有网络子网ID
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 备机所在私有网络子网ID
     * @param UniqSubnetId 备机所在私有网络子网ID
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get 备机只读权重 
     * @return RoWeight 备机只读权重
     */
    public Long getRoWeight() {
        return this.RoWeight;
    }

    /**
     * Set 备机只读权重
     * @param RoWeight 备机只读权重
     */
    public void setRoWeight(Long RoWeight) {
        this.RoWeight = RoWeight;
    }

    /**
     * Get 备机只读模式，BalancedReadOnly-多备一读模式，SingleReadOnly-一备一读模式 
     * @return ReadMode 备机只读模式，BalancedReadOnly-多备一读模式，SingleReadOnly-一备一读模式
     */
    public String getReadMode() {
        return this.ReadMode;
    }

    /**
     * Set 备机只读模式，BalancedReadOnly-多备一读模式，SingleReadOnly-一备一读模式
     * @param ReadMode 备机只读模式，BalancedReadOnly-多备一读模式，SingleReadOnly-一备一读模式
     */
    public void setReadMode(String ReadMode) {
        this.ReadMode = ReadMode;
    }

    public DrReadableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrReadableInfo(DrReadableInfo source) {
        if (source.DrInstanceId != null) {
            this.DrInstanceId = new String(source.DrInstanceId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SlaveStatus != null) {
            this.SlaveStatus = new String(source.SlaveStatus);
        }
        if (source.ReadableStatus != null) {
            this.ReadableStatus = new String(source.ReadableStatus);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.RoWeight != null) {
            this.RoWeight = new Long(source.RoWeight);
        }
        if (source.ReadMode != null) {
            this.ReadMode = new String(source.ReadMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrInstanceId", this.DrInstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SlaveStatus", this.SlaveStatus);
        this.setParamSimple(map, prefix + "ReadableStatus", this.ReadableStatus);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "RoWeight", this.RoWeight);
        this.setParamSimple(map, prefix + "ReadMode", this.ReadMode);

    }
}

