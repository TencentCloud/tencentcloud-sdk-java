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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRabbitMQVipInstanceRequest extends AbstractModel{

    /**
    * 可用区
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 私有网络VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 节点规格,基础型rabbit-vip-basic-1,标准型rabbit-vip-basic-2,高阶1型rabbit-vip-basic-3,高阶2型rabbit-vip-basic-4。不传默认为基础型
    */
    @SerializedName("NodeSpec")
    @Expose
    private String NodeSpec;

    /**
    * 节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 单节点存储规格,不传默认为200G
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 镜像队列,不传默认为false
    */
    @SerializedName("EnableCreateDefaultHaMirrorQueue")
    @Expose
    private Boolean EnableCreateDefaultHaMirrorQueue;

    /**
    * 自动续费,不传默认为true
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
    * 购买时长,不传默认为1(月)
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
     * Get 可用区 
     * @return ZoneIds 可用区
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 可用区
     * @param ZoneIds 可用区
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 私有网络VpcId 
     * @return VpcId 私有网络VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络VpcId
     * @param VpcId 私有网络VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络SubnetId 
     * @return SubnetId 私有网络SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络SubnetId
     * @param SubnetId 私有网络SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 节点规格,基础型rabbit-vip-basic-1,标准型rabbit-vip-basic-2,高阶1型rabbit-vip-basic-3,高阶2型rabbit-vip-basic-4。不传默认为基础型 
     * @return NodeSpec 节点规格,基础型rabbit-vip-basic-1,标准型rabbit-vip-basic-2,高阶1型rabbit-vip-basic-3,高阶2型rabbit-vip-basic-4。不传默认为基础型
     */
    public String getNodeSpec() {
        return this.NodeSpec;
    }

    /**
     * Set 节点规格,基础型rabbit-vip-basic-1,标准型rabbit-vip-basic-2,高阶1型rabbit-vip-basic-3,高阶2型rabbit-vip-basic-4。不传默认为基础型
     * @param NodeSpec 节点规格,基础型rabbit-vip-basic-1,标准型rabbit-vip-basic-2,高阶1型rabbit-vip-basic-3,高阶2型rabbit-vip-basic-4。不传默认为基础型
     */
    public void setNodeSpec(String NodeSpec) {
        this.NodeSpec = NodeSpec;
    }

    /**
     * Get 节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3 
     * @return NodeNum 节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3
     * @param NodeNum 节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 单节点存储规格,不传默认为200G 
     * @return StorageSize 单节点存储规格,不传默认为200G
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 单节点存储规格,不传默认为200G
     * @param StorageSize 单节点存储规格,不传默认为200G
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 镜像队列,不传默认为false 
     * @return EnableCreateDefaultHaMirrorQueue 镜像队列,不传默认为false
     */
    public Boolean getEnableCreateDefaultHaMirrorQueue() {
        return this.EnableCreateDefaultHaMirrorQueue;
    }

    /**
     * Set 镜像队列,不传默认为false
     * @param EnableCreateDefaultHaMirrorQueue 镜像队列,不传默认为false
     */
    public void setEnableCreateDefaultHaMirrorQueue(Boolean EnableCreateDefaultHaMirrorQueue) {
        this.EnableCreateDefaultHaMirrorQueue = EnableCreateDefaultHaMirrorQueue;
    }

    /**
     * Get 自动续费,不传默认为true 
     * @return AutoRenewFlag 自动续费,不传默认为true
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费,不传默认为true
     * @param AutoRenewFlag 自动续费,不传默认为true
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 购买时长,不传默认为1(月) 
     * @return TimeSpan 购买时长,不传默认为1(月)
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长,不传默认为1(月)
     * @param TimeSpan 购买时长,不传默认为1(月)
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    public CreateRabbitMQVipInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRabbitMQVipInstanceRequest(CreateRabbitMQVipInstanceRequest source) {
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NodeSpec != null) {
            this.NodeSpec = new String(source.NodeSpec);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.EnableCreateDefaultHaMirrorQueue != null) {
            this.EnableCreateDefaultHaMirrorQueue = new Boolean(source.EnableCreateDefaultHaMirrorQueue);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Boolean(source.AutoRenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NodeSpec", this.NodeSpec);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "EnableCreateDefaultHaMirrorQueue", this.EnableCreateDefaultHaMirrorQueue);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}

