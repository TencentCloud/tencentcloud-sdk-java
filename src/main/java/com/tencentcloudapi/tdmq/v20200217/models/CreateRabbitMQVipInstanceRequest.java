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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRabbitMQVipInstanceRequest extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * 私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录[私有网络](https://console.cloud.tencent.com/vpc/vpc?rid=1)控制台查询；也可以调用接口 [DescribeVpcEx](https://cloud.tencent.com/document/api/215/1372)，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录[子网控制台](https://console.cloud.tencent.com/vpc/subnet?rid=1)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784)，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。
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
    * 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为 4C8G：rabbit-vip-basic-1
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
    * 是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false
    */
    @SerializedName("EnableCreateDefaultHaMirrorQueue")
    @Expose
    private Boolean EnableCreateDefaultHaMirrorQueue;

    /**
    * 仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true
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
    * 付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 集群版本，不传默认为 3.8.30，可选值为 3.8.30 和 3.11.8
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 是否国际站请求，默认 false
    */
    @SerializedName("IsIntl")
    @Expose
    private Boolean IsIntl;

    /**
    * 资源标签列表
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * 公网带宽大小，单位 Mbps
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 是否打开公网接入，不传默认为false
    */
    @SerializedName("EnablePublicAccess")
    @Expose
    private Boolean EnablePublicAccess;

    /**
    * 是否打开集群删除保护，不传默认为 false
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

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
     * Get 私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录[私有网络](https://console.cloud.tencent.com/vpc/vpc?rid=1)控制台查询；也可以调用接口 [DescribeVpcEx](https://cloud.tencent.com/document/api/215/1372)，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。 
     * @return VpcId 私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录[私有网络](https://console.cloud.tencent.com/vpc/vpc?rid=1)控制台查询；也可以调用接口 [DescribeVpcEx](https://cloud.tencent.com/document/api/215/1372)，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录[私有网络](https://console.cloud.tencent.com/vpc/vpc?rid=1)控制台查询；也可以调用接口 [DescribeVpcEx](https://cloud.tencent.com/document/api/215/1372)，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。
     * @param VpcId 私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录[私有网络](https://console.cloud.tencent.com/vpc/vpc?rid=1)控制台查询；也可以调用接口 [DescribeVpcEx](https://cloud.tencent.com/document/api/215/1372)，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录[子网控制台](https://console.cloud.tencent.com/vpc/subnet?rid=1)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784)，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。 
     * @return SubnetId 私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录[子网控制台](https://console.cloud.tencent.com/vpc/subnet?rid=1)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784)，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录[子网控制台](https://console.cloud.tencent.com/vpc/subnet?rid=1)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784)，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。
     * @param SubnetId 私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录[子网控制台](https://console.cloud.tencent.com/vpc/subnet?rid=1)查询；也可以调用接口 [DescribeSubnets](https://cloud.tencent.com/document/api/215/15784)，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。
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
     * Get 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为 4C8G：rabbit-vip-basic-1 
     * @return NodeSpec 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为 4C8G：rabbit-vip-basic-1
     */
    public String getNodeSpec() {
        return this.NodeSpec;
    }

    /**
     * Set 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为 4C8G：rabbit-vip-basic-1
     * @param NodeSpec 集群的节点规格，需要输入对应的规格标识：
2C8G：rabbit-vip-basic-2c8g
4C16G：rabbit-vip-basic-4c16g
8C32G：rabbit-vip-basic-8c32g
16C32G：rabbit-vip-basic-4
16C64G：rabbit-vip-basic-16c64g
2C4G：rabbit-vip-basic-5
4C8G：rabbit-vip-basic-1
8C16G（已售罄）：rabbit-vip-basic-2
不传默认为 4C8G：rabbit-vip-basic-1
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
     * Get 是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false 
     * @return EnableCreateDefaultHaMirrorQueue 是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false
     */
    public Boolean getEnableCreateDefaultHaMirrorQueue() {
        return this.EnableCreateDefaultHaMirrorQueue;
    }

    /**
     * Set 是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false
     * @param EnableCreateDefaultHaMirrorQueue 是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false
     */
    public void setEnableCreateDefaultHaMirrorQueue(Boolean EnableCreateDefaultHaMirrorQueue) {
        this.EnableCreateDefaultHaMirrorQueue = EnableCreateDefaultHaMirrorQueue;
    }

    /**
     * Get 仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true 
     * @return AutoRenewFlag 仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true
     * @param AutoRenewFlag 仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true
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

    /**
     * Get 付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月 
     * @return PayMode 付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月
     * @param PayMode 付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 集群版本，不传默认为 3.8.30，可选值为 3.8.30 和 3.11.8 
     * @return ClusterVersion 集群版本，不传默认为 3.8.30，可选值为 3.8.30 和 3.11.8
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本，不传默认为 3.8.30，可选值为 3.8.30 和 3.11.8
     * @param ClusterVersion 集群版本，不传默认为 3.8.30，可选值为 3.8.30 和 3.11.8
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 是否国际站请求，默认 false 
     * @return IsIntl 是否国际站请求，默认 false
     */
    public Boolean getIsIntl() {
        return this.IsIntl;
    }

    /**
     * Set 是否国际站请求，默认 false
     * @param IsIntl 是否国际站请求，默认 false
     */
    public void setIsIntl(Boolean IsIntl) {
        this.IsIntl = IsIntl;
    }

    /**
     * Get 资源标签列表 
     * @return ResourceTags 资源标签列表
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set 资源标签列表
     * @param ResourceTags 资源标签列表
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get 公网带宽大小，单位 Mbps 
     * @return Bandwidth 公网带宽大小，单位 Mbps
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 公网带宽大小，单位 Mbps
     * @param Bandwidth 公网带宽大小，单位 Mbps
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 是否打开公网接入，不传默认为false 
     * @return EnablePublicAccess 是否打开公网接入，不传默认为false
     */
    public Boolean getEnablePublicAccess() {
        return this.EnablePublicAccess;
    }

    /**
     * Set 是否打开公网接入，不传默认为false
     * @param EnablePublicAccess 是否打开公网接入，不传默认为false
     */
    public void setEnablePublicAccess(Boolean EnablePublicAccess) {
        this.EnablePublicAccess = EnablePublicAccess;
    }

    /**
     * Get 是否打开集群删除保护，不传默认为 false 
     * @return EnableDeletionProtection 是否打开集群删除保护，不传默认为 false
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set 是否打开集群删除保护，不传默认为 false
     * @param EnableDeletionProtection 是否打开集群删除保护，不传默认为 false
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
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
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.IsIntl != null) {
            this.IsIntl = new Boolean(source.IsIntl);
        }
        if (source.ResourceTags != null) {
            this.ResourceTags = new Tag[source.ResourceTags.length];
            for (int i = 0; i < source.ResourceTags.length; i++) {
                this.ResourceTags[i] = new Tag(source.ResourceTags[i]);
            }
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.EnablePublicAccess != null) {
            this.EnablePublicAccess = new Boolean(source.EnablePublicAccess);
        }
        if (source.EnableDeletionProtection != null) {
            this.EnableDeletionProtection = new Boolean(source.EnableDeletionProtection);
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
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "IsIntl", this.IsIntl);
        this.setParamArrayObj(map, prefix + "ResourceTags.", this.ResourceTags);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "EnablePublicAccess", this.EnablePublicAccess);
        this.setParamSimple(map, prefix + "EnableDeletionProtection", this.EnableDeletionProtection);

    }
}

