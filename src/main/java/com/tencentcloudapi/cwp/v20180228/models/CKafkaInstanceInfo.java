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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CKafkaInstanceInfo extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 版本号
    */
    @SerializedName("KafkaVersion")
    @Expose
    private String KafkaVersion;

    /**
    * 主题列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicList")
    @Expose
    private CKafkaTopicInfo [] TopicList;

    /**
    * 路由列表
    */
    @SerializedName("RouteList")
    @Expose
    private CKafkaRouteInfo [] RouteList;

    /**
    * 磁盘容量，单位GB
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * vpcId，如果为空，说明是基础网络
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 状态，1表示健康，2表示告警，3 表示实例状态异常
    */
    @SerializedName("Healthy")
    @Expose
    private Long Healthy;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 地域
    */
    @SerializedName("Az")
    @Expose
    private String Az;

    /**
    * 实例带宽，单位Mbps
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get 实例ID 
     * @return InstanceID 实例ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
     * @param InstanceID 实例ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 版本号 
     * @return KafkaVersion 版本号
     */
    public String getKafkaVersion() {
        return this.KafkaVersion;
    }

    /**
     * Set 版本号
     * @param KafkaVersion 版本号
     */
    public void setKafkaVersion(String KafkaVersion) {
        this.KafkaVersion = KafkaVersion;
    }

    /**
     * Get 主题列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicList 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CKafkaTopicInfo [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicList 主题列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicList(CKafkaTopicInfo [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get 路由列表 
     * @return RouteList 路由列表
     */
    public CKafkaRouteInfo [] getRouteList() {
        return this.RouteList;
    }

    /**
     * Set 路由列表
     * @param RouteList 路由列表
     */
    public void setRouteList(CKafkaRouteInfo [] RouteList) {
        this.RouteList = RouteList;
    }

    /**
     * Get 磁盘容量，单位GB 
     * @return DiskSize 磁盘容量，单位GB
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 磁盘容量，单位GB
     * @param DiskSize 磁盘容量，单位GB
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get vpcId，如果为空，说明是基础网络 
     * @return VpcId vpcId，如果为空，说明是基础网络
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId，如果为空，说明是基础网络
     * @param VpcId vpcId，如果为空，说明是基础网络
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id 
     * @return SubnetId 子网id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
     * @param SubnetId 子网id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 状态，1表示健康，2表示告警，3 表示实例状态异常 
     * @return Healthy 状态，1表示健康，2表示告警，3 表示实例状态异常
     */
    public Long getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 状态，1表示健康，2表示告警，3 表示实例状态异常
     * @param Healthy 状态，1表示健康，2表示告警，3 表示实例状态异常
     */
    public void setHealthy(Long Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 地域 
     * @return Az 地域
     */
    public String getAz() {
        return this.Az;
    }

    /**
     * Set 地域
     * @param Az 地域
     */
    public void setAz(String Az) {
        this.Az = Az;
    }

    /**
     * Get 实例带宽，单位Mbps 
     * @return Bandwidth 实例带宽，单位Mbps
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 实例带宽，单位Mbps
     * @param Bandwidth 实例带宽，单位Mbps
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public CKafkaInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CKafkaInstanceInfo(CKafkaInstanceInfo source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.KafkaVersion != null) {
            this.KafkaVersion = new String(source.KafkaVersion);
        }
        if (source.TopicList != null) {
            this.TopicList = new CKafkaTopicInfo[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new CKafkaTopicInfo(source.TopicList[i]);
            }
        }
        if (source.RouteList != null) {
            this.RouteList = new CKafkaRouteInfo[source.RouteList.length];
            for (int i = 0; i < source.RouteList.length; i++) {
                this.RouteList[i] = new CKafkaRouteInfo(source.RouteList[i]);
            }
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Healthy != null) {
            this.Healthy = new Long(source.Healthy);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Az != null) {
            this.Az = new String(source.Az);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "KafkaVersion", this.KafkaVersion);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamArrayObj(map, prefix + "RouteList.", this.RouteList);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Az", this.Az);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

