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
    * <p>可用区</p>
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * <p>私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">私有网络</a>控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a>，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">子网控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群的节点规格，需要输入对应的规格标识：<br>2C8G：rabbit-vip-profession-2c8g<br>4C16G：rabbit-vip-profession-4c16g<br>8C32G：rabbit-vip-profession-8c32g<br>16C32G：rabbit-vip-basic-4<br>16C64G：rabbit-vip-profession-16c64g<br>2C4G：rabbit-vip-basic-5<br>4C8G：rabbit-vip-basic-1<br>8C16G（已售罄）：rabbit-vip-basic-2<br>不传默认为 4C8G：rabbit-vip-basic-1</p>
    */
    @SerializedName("NodeSpec")
    @Expose
    private String NodeSpec;

    /**
    * <p>节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3</p>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>单节点存储规格,不传默认为200G</p>
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * <p>是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false。该参数对4.x集群不生效。</p>
    */
    @SerializedName("EnableCreateDefaultHaMirrorQueue")
    @Expose
    private Boolean EnableCreateDefaultHaMirrorQueue;

    /**
    * <p>仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true</p>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
    * <p>购买时长,不传默认为1(月)</p>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月</p>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>集群版本，不传默认为 3.8.30，可选值为 3.8.30、3.11.8和3.13.7</p>
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>是否国际站请求，默认 false</p>
    */
    @SerializedName("IsIntl")
    @Expose
    private Boolean IsIntl;

    /**
    * <p>资源标签列表</p>
    */
    @SerializedName("ResourceTags")
    @Expose
    private Tag [] ResourceTags;

    /**
    * <p>公网带宽大小，单位 Mbps</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>是否打开公网接入，不传默认为false</p>
    */
    @SerializedName("EnablePublicAccess")
    @Expose
    private Boolean EnablePublicAccess;

    /**
    * <p>是否打开集群删除保护，不传默认为 false</p>
    */
    @SerializedName("EnableDeletionProtection")
    @Expose
    private Boolean EnableDeletionProtection;

    /**
    * <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>CDC 集群 ID</p>
    */
    @SerializedName("CdcClusterId")
    @Expose
    private String CdcClusterId;

    /**
     * Get <p>可用区</p> 
     * @return ZoneIds <p>可用区</p>
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set <p>可用区</p>
     * @param ZoneIds <p>可用区</p>
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get <p>私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">私有网络</a>控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a>，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p> 
     * @return VpcId <p>私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">私有网络</a>控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a>，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">私有网络</a>控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a>，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p>
     * @param VpcId <p>私有网络ID，形如 vpc-xxx。有效的 VpcId 可通过登录<a href="https://console.cloud.tencent.com/vpc/vpc?rid=1">私有网络</a>控制台查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/1372">DescribeVpcEx</a>，从接口返回中的 unVpcId 字段获取。若在创建子机时 VpcId 与 SubnetId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">子网控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p> 
     * @return SubnetId <p>私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">子网控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">子网控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p>
     * @param SubnetId <p>私有网络子网 ID，形如 subnet-xxx。有效的私有网络子网 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/subnet?rid=1">子网控制台</a>查询；也可以调用接口 <a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>，从接口返回中的 unSubnetId 字段获取。若在创建子机时 SubnetId 与 VpcId 同时传入 DEFAULT，则强制使用默认 vpc 网络。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群的节点规格，需要输入对应的规格标识：<br>2C8G：rabbit-vip-profession-2c8g<br>4C16G：rabbit-vip-profession-4c16g<br>8C32G：rabbit-vip-profession-8c32g<br>16C32G：rabbit-vip-basic-4<br>16C64G：rabbit-vip-profession-16c64g<br>2C4G：rabbit-vip-basic-5<br>4C8G：rabbit-vip-basic-1<br>8C16G（已售罄）：rabbit-vip-basic-2<br>不传默认为 4C8G：rabbit-vip-basic-1</p> 
     * @return NodeSpec <p>集群的节点规格，需要输入对应的规格标识：<br>2C8G：rabbit-vip-profession-2c8g<br>4C16G：rabbit-vip-profession-4c16g<br>8C32G：rabbit-vip-profession-8c32g<br>16C32G：rabbit-vip-basic-4<br>16C64G：rabbit-vip-profession-16c64g<br>2C4G：rabbit-vip-basic-5<br>4C8G：rabbit-vip-basic-1<br>8C16G（已售罄）：rabbit-vip-basic-2<br>不传默认为 4C8G：rabbit-vip-basic-1</p>
     */
    public String getNodeSpec() {
        return this.NodeSpec;
    }

    /**
     * Set <p>集群的节点规格，需要输入对应的规格标识：<br>2C8G：rabbit-vip-profession-2c8g<br>4C16G：rabbit-vip-profession-4c16g<br>8C32G：rabbit-vip-profession-8c32g<br>16C32G：rabbit-vip-basic-4<br>16C64G：rabbit-vip-profession-16c64g<br>2C4G：rabbit-vip-basic-5<br>4C8G：rabbit-vip-basic-1<br>8C16G（已售罄）：rabbit-vip-basic-2<br>不传默认为 4C8G：rabbit-vip-basic-1</p>
     * @param NodeSpec <p>集群的节点规格，需要输入对应的规格标识：<br>2C8G：rabbit-vip-profession-2c8g<br>4C16G：rabbit-vip-profession-4c16g<br>8C32G：rabbit-vip-profession-8c32g<br>16C32G：rabbit-vip-basic-4<br>16C64G：rabbit-vip-profession-16c64g<br>2C4G：rabbit-vip-basic-5<br>4C8G：rabbit-vip-basic-1<br>8C16G（已售罄）：rabbit-vip-basic-2<br>不传默认为 4C8G：rabbit-vip-basic-1</p>
     */
    public void setNodeSpec(String NodeSpec) {
        this.NodeSpec = NodeSpec;
    }

    /**
     * Get <p>节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3</p> 
     * @return NodeNum <p>节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3</p>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3</p>
     * @param NodeNum <p>节点数量,多可用区最少为3节点。不传默认单可用区为1,多可用区为3</p>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>单节点存储规格,不传默认为200G</p> 
     * @return StorageSize <p>单节点存储规格,不传默认为200G</p>
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set <p>单节点存储规格,不传默认为200G</p>
     * @param StorageSize <p>单节点存储规格,不传默认为200G</p>
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get <p>是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false。该参数对4.x集群不生效。</p> 
     * @return EnableCreateDefaultHaMirrorQueue <p>是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false。该参数对4.x集群不生效。</p>
     */
    public Boolean getEnableCreateDefaultHaMirrorQueue() {
        return this.EnableCreateDefaultHaMirrorQueue;
    }

    /**
     * Set <p>是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false。该参数对4.x集群不生效。</p>
     * @param EnableCreateDefaultHaMirrorQueue <p>是否开启默认镜像队列，true 表示为开启，false 表示为不开启。不传默认为 false。该参数对4.x集群不生效。</p>
     */
    public void setEnableCreateDefaultHaMirrorQueue(Boolean EnableCreateDefaultHaMirrorQueue) {
        this.EnableCreateDefaultHaMirrorQueue = EnableCreateDefaultHaMirrorQueue;
    }

    /**
     * Get <p>仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true</p> 
     * @return AutoRenewFlag <p>仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true</p>
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true</p>
     * @param AutoRenewFlag <p>仅预付费集群（PayMode 参数为 1 时）使用该参数，表示是否自动续费，true 表示打开自动续费。不传默认为 true</p>
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>购买时长,不传默认为1(月)</p> 
     * @return TimeSpan <p>购买时长,不传默认为1(月)</p>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>购买时长,不传默认为1(月)</p>
     * @param TimeSpan <p>购买时长,不传默认为1(月)</p>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月</p> 
     * @return PayMode <p>付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月</p>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月</p>
     * @param PayMode <p>付费方式，0 为后付费，即按量计费；1 为预付费，即包年包月。默认包年包月</p>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>集群版本，不传默认为 3.8.30，可选值为 3.8.30、3.11.8和3.13.7</p> 
     * @return ClusterVersion <p>集群版本，不传默认为 3.8.30，可选值为 3.8.30、3.11.8和3.13.7</p>
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>集群版本，不传默认为 3.8.30，可选值为 3.8.30、3.11.8和3.13.7</p>
     * @param ClusterVersion <p>集群版本，不传默认为 3.8.30，可选值为 3.8.30、3.11.8和3.13.7</p>
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>是否国际站请求，默认 false</p> 
     * @return IsIntl <p>是否国际站请求，默认 false</p>
     */
    public Boolean getIsIntl() {
        return this.IsIntl;
    }

    /**
     * Set <p>是否国际站请求，默认 false</p>
     * @param IsIntl <p>是否国际站请求，默认 false</p>
     */
    public void setIsIntl(Boolean IsIntl) {
        this.IsIntl = IsIntl;
    }

    /**
     * Get <p>资源标签列表</p> 
     * @return ResourceTags <p>资源标签列表</p>
     */
    public Tag [] getResourceTags() {
        return this.ResourceTags;
    }

    /**
     * Set <p>资源标签列表</p>
     * @param ResourceTags <p>资源标签列表</p>
     */
    public void setResourceTags(Tag [] ResourceTags) {
        this.ResourceTags = ResourceTags;
    }

    /**
     * Get <p>公网带宽大小，单位 Mbps</p> 
     * @return Bandwidth <p>公网带宽大小，单位 Mbps</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>公网带宽大小，单位 Mbps</p>
     * @param Bandwidth <p>公网带宽大小，单位 Mbps</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>是否打开公网接入，不传默认为false</p> 
     * @return EnablePublicAccess <p>是否打开公网接入，不传默认为false</p>
     */
    public Boolean getEnablePublicAccess() {
        return this.EnablePublicAccess;
    }

    /**
     * Set <p>是否打开公网接入，不传默认为false</p>
     * @param EnablePublicAccess <p>是否打开公网接入，不传默认为false</p>
     */
    public void setEnablePublicAccess(Boolean EnablePublicAccess) {
        this.EnablePublicAccess = EnablePublicAccess;
    }

    /**
     * Get <p>是否打开集群删除保护，不传默认为 false</p> 
     * @return EnableDeletionProtection <p>是否打开集群删除保护，不传默认为 false</p>
     */
    public Boolean getEnableDeletionProtection() {
        return this.EnableDeletionProtection;
    }

    /**
     * Set <p>是否打开集群删除保护，不传默认为 false</p>
     * @param EnableDeletionProtection <p>是否打开集群删除保护，不传默认为 false</p>
     */
    public void setEnableDeletionProtection(Boolean EnableDeletionProtection) {
        this.EnableDeletionProtection = EnableDeletionProtection;
    }

    /**
     * Get <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul> 
     * @return ClusterType <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul>
     * @param ClusterType <p>集群类型</p><p>枚举值：</p><ul><li>NORMAL： 公有云</li><li>CDC： 本地专用集群</li></ul>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>CDC 集群 ID</p> 
     * @return CdcClusterId <p>CDC 集群 ID</p>
     */
    public String getCdcClusterId() {
        return this.CdcClusterId;
    }

    /**
     * Set <p>CDC 集群 ID</p>
     * @param CdcClusterId <p>CDC 集群 ID</p>
     */
    public void setCdcClusterId(String CdcClusterId) {
        this.CdcClusterId = CdcClusterId;
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
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.CdcClusterId != null) {
            this.CdcClusterId = new String(source.CdcClusterId);
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
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "CdcClusterId", this.CdcClusterId);

    }
}

