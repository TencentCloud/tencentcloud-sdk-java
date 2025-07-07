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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLogKafkaStateRequest extends AbstractModel {

    /**
    * 实例名称 如 主机安全测试环境
    */
    @SerializedName("KafkaEnvName")
    @Expose
    private String KafkaEnvName;

    /**
    * 实例ID
    */
    @SerializedName("KafkaId")
    @Expose
    private String KafkaId;

    /**
    * 接入方式，1公网域名接入，2支撑环境接入
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 接入地址
    */
    @SerializedName("AccessAddr")
    @Expose
    private String AccessAddr;

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 区域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区
    */
    @SerializedName("Az")
    @Expose
    private String Az;

    /**
    * 所属网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 所在子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 投递状态，1：健康，2：告警，3：异常
    */
    @SerializedName("DeliverStatus")
    @Expose
    private Long DeliverStatus;

    /**
    * kafka版本
    */
    @SerializedName("InsVersion")
    @Expose
    private String InsVersion;

    /**
    * 峰值带宽
    */
    @SerializedName("BandWidth")
    @Expose
    private Long BandWidth;

    /**
    * 磁盘容量
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get 实例名称 如 主机安全测试环境 
     * @return KafkaEnvName 实例名称 如 主机安全测试环境
     */
    public String getKafkaEnvName() {
        return this.KafkaEnvName;
    }

    /**
     * Set 实例名称 如 主机安全测试环境
     * @param KafkaEnvName 实例名称 如 主机安全测试环境
     */
    public void setKafkaEnvName(String KafkaEnvName) {
        this.KafkaEnvName = KafkaEnvName;
    }

    /**
     * Get 实例ID 
     * @return KafkaId 实例ID
     */
    public String getKafkaId() {
        return this.KafkaId;
    }

    /**
     * Set 实例ID
     * @param KafkaId 实例ID
     */
    public void setKafkaId(String KafkaId) {
        this.KafkaId = KafkaId;
    }

    /**
     * Get 接入方式，1公网域名接入，2支撑环境接入 
     * @return AccessType 接入方式，1公网域名接入，2支撑环境接入
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 接入方式，1公网域名接入，2支撑环境接入
     * @param AccessType 接入方式，1公网域名接入，2支撑环境接入
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 接入地址 
     * @return AccessAddr 接入地址
     */
    public String getAccessAddr() {
        return this.AccessAddr;
    }

    /**
     * Set 接入地址
     * @param AccessAddr 接入地址
     */
    public void setAccessAddr(String AccessAddr) {
        this.AccessAddr = AccessAddr;
    }

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 区域 
     * @return Zone 区域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 区域
     * @param Zone 区域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 可用区 
     * @return Az 可用区
     */
    public String getAz() {
        return this.Az;
    }

    /**
     * Set 可用区
     * @param Az 可用区
     */
    public void setAz(String Az) {
        this.Az = Az;
    }

    /**
     * Get 所属网络 
     * @return VpcId 所属网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 所属网络
     * @param VpcId 所属网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 所在子网 
     * @return SubnetId 所在子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 所在子网
     * @param SubnetId 所在子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 投递状态，1：健康，2：告警，3：异常 
     * @return DeliverStatus 投递状态，1：健康，2：告警，3：异常
     */
    public Long getDeliverStatus() {
        return this.DeliverStatus;
    }

    /**
     * Set 投递状态，1：健康，2：告警，3：异常
     * @param DeliverStatus 投递状态，1：健康，2：告警，3：异常
     */
    public void setDeliverStatus(Long DeliverStatus) {
        this.DeliverStatus = DeliverStatus;
    }

    /**
     * Get kafka版本 
     * @return InsVersion kafka版本
     */
    public String getInsVersion() {
        return this.InsVersion;
    }

    /**
     * Set kafka版本
     * @param InsVersion kafka版本
     */
    public void setInsVersion(String InsVersion) {
        this.InsVersion = InsVersion;
    }

    /**
     * Get 峰值带宽 
     * @return BandWidth 峰值带宽
     */
    public Long getBandWidth() {
        return this.BandWidth;
    }

    /**
     * Set 峰值带宽
     * @param BandWidth 峰值带宽
     */
    public void setBandWidth(Long BandWidth) {
        this.BandWidth = BandWidth;
    }

    /**
     * Get 磁盘容量 
     * @return DiskSize 磁盘容量
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘容量
     * @param DiskSize 磁盘容量
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public ModifyLogKafkaStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogKafkaStateRequest(ModifyLogKafkaStateRequest source) {
        if (source.KafkaEnvName != null) {
            this.KafkaEnvName = new String(source.KafkaEnvName);
        }
        if (source.KafkaId != null) {
            this.KafkaId = new String(source.KafkaId);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.AccessAddr != null) {
            this.AccessAddr = new String(source.AccessAddr);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Az != null) {
            this.Az = new String(source.Az);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.DeliverStatus != null) {
            this.DeliverStatus = new Long(source.DeliverStatus);
        }
        if (source.InsVersion != null) {
            this.InsVersion = new String(source.InsVersion);
        }
        if (source.BandWidth != null) {
            this.BandWidth = new Long(source.BandWidth);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KafkaEnvName", this.KafkaEnvName);
        this.setParamSimple(map, prefix + "KafkaId", this.KafkaId);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "AccessAddr", this.AccessAddr);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Az", this.Az);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DeliverStatus", this.DeliverStatus);
        this.setParamSimple(map, prefix + "InsVersion", this.InsVersion);
        this.setParamSimple(map, prefix + "BandWidth", this.BandWidth);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

