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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterSuperNodeInfoResponse extends AbstractModel {

    /**
    * <p>所属地域 code（原样，如 ap-chengdu）。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>地域中文名（如 西南地区（成都）；由地域 code 经字典翻译得到）。</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>地域英文名（如 Southwest China (Chengdu)；由地域 code 经字典翻译得到）。</p>
    */
    @SerializedName("RegionNameEn")
    @Expose
    private String RegionNameEn;

    /**
    * <p>可用区（中文名，由可用区 code 经字典翻译得到）。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>资产最后更新时间。<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式，UTC时区）</p>
    */
    @SerializedName("AssetSyncTime")
    @Expose
    private String AssetSyncTime;

    /**
    * <p>节点来源（所属集群类型）。<br>枚举值：<br>TKE_MANAGED_CLUSTER：腾讯云标准集群<br>TKE_INDEPENDENT_CLUSTER：腾讯云标准集群（Master自维护）<br>TKE_SERVERLESS_CLUSTER：腾讯云Serverless集群<br>TKE_EDGE_CLUSTER：腾讯云边缘集群<br>SELF_BUILT：腾讯云内自建集群<br>SELF_BUILT_OTHER：非腾讯云自建集群（混合云）</p>
    */
    @SerializedName("NodeSource")
    @Expose
    private String NodeSource;

    /**
    * <p>子网名称。</p>
    */
    @SerializedName("SubNetName")
    @Expose
    private String SubNetName;

    /**
    * <p>子网 ID。</p>
    */
    @SerializedName("SubNetId")
    @Expose
    private String SubNetId;

    /**
    * <p>子网网段（CIDR）。</p>
    */
    @SerializedName("SubNetCIDR")
    @Expose
    private String SubNetCIDR;

    /**
    * <p>核数（由 cpu_request 除以 1000 得到）。<br>单位：核</p>
    */
    @SerializedName("CoresCount")
    @Expose
    private Long CoresCount;

    /**
    * <p>所属集群名称。</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>所属集群 ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>所属集群运行状态。<br>枚举值：<br>Running：运行中<br>Exception：异常<br>Unknown：未知<br>Creating：创建中<br>Destroyed：已销毁</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Kubernetes 版本。</p>
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>Kubelet 版本。</p>
    */
    @SerializedName("KubeletVersion")
    @Expose
    private String KubeletVersion;

    /**
    * <p>超级节点所属账号APPID</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>超级节点实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>超级节点名称</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>VPCID</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>所属地域 code（原样，如 ap-chengdu）。</p> 
     * @return Region <p>所属地域 code（原样，如 ap-chengdu）。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>所属地域 code（原样，如 ap-chengdu）。</p>
     * @param Region <p>所属地域 code（原样，如 ap-chengdu）。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>地域中文名（如 西南地区（成都）；由地域 code 经字典翻译得到）。</p> 
     * @return RegionName <p>地域中文名（如 西南地区（成都）；由地域 code 经字典翻译得到）。</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域中文名（如 西南地区（成都）；由地域 code 经字典翻译得到）。</p>
     * @param RegionName <p>地域中文名（如 西南地区（成都）；由地域 code 经字典翻译得到）。</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>地域英文名（如 Southwest China (Chengdu)；由地域 code 经字典翻译得到）。</p> 
     * @return RegionNameEn <p>地域英文名（如 Southwest China (Chengdu)；由地域 code 经字典翻译得到）。</p>
     */
    public String getRegionNameEn() {
        return this.RegionNameEn;
    }

    /**
     * Set <p>地域英文名（如 Southwest China (Chengdu)；由地域 code 经字典翻译得到）。</p>
     * @param RegionNameEn <p>地域英文名（如 Southwest China (Chengdu)；由地域 code 经字典翻译得到）。</p>
     */
    public void setRegionNameEn(String RegionNameEn) {
        this.RegionNameEn = RegionNameEn;
    }

    /**
     * Get <p>可用区（中文名，由可用区 code 经字典翻译得到）。</p> 
     * @return Zone <p>可用区（中文名，由可用区 code 经字典翻译得到）。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区（中文名，由可用区 code 经字典翻译得到）。</p>
     * @param Zone <p>可用区（中文名，由可用区 code 经字典翻译得到）。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>资产最后更新时间。<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式，UTC时区）</p> 
     * @return AssetSyncTime <p>资产最后更新时间。<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式，UTC时区）</p>
     */
    public String getAssetSyncTime() {
        return this.AssetSyncTime;
    }

    /**
     * Set <p>资产最后更新时间。<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式，UTC时区）</p>
     * @param AssetSyncTime <p>资产最后更新时间。<br>参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式，UTC时区）</p>
     */
    public void setAssetSyncTime(String AssetSyncTime) {
        this.AssetSyncTime = AssetSyncTime;
    }

    /**
     * Get <p>节点来源（所属集群类型）。<br>枚举值：<br>TKE_MANAGED_CLUSTER：腾讯云标准集群<br>TKE_INDEPENDENT_CLUSTER：腾讯云标准集群（Master自维护）<br>TKE_SERVERLESS_CLUSTER：腾讯云Serverless集群<br>TKE_EDGE_CLUSTER：腾讯云边缘集群<br>SELF_BUILT：腾讯云内自建集群<br>SELF_BUILT_OTHER：非腾讯云自建集群（混合云）</p> 
     * @return NodeSource <p>节点来源（所属集群类型）。<br>枚举值：<br>TKE_MANAGED_CLUSTER：腾讯云标准集群<br>TKE_INDEPENDENT_CLUSTER：腾讯云标准集群（Master自维护）<br>TKE_SERVERLESS_CLUSTER：腾讯云Serverless集群<br>TKE_EDGE_CLUSTER：腾讯云边缘集群<br>SELF_BUILT：腾讯云内自建集群<br>SELF_BUILT_OTHER：非腾讯云自建集群（混合云）</p>
     */
    public String getNodeSource() {
        return this.NodeSource;
    }

    /**
     * Set <p>节点来源（所属集群类型）。<br>枚举值：<br>TKE_MANAGED_CLUSTER：腾讯云标准集群<br>TKE_INDEPENDENT_CLUSTER：腾讯云标准集群（Master自维护）<br>TKE_SERVERLESS_CLUSTER：腾讯云Serverless集群<br>TKE_EDGE_CLUSTER：腾讯云边缘集群<br>SELF_BUILT：腾讯云内自建集群<br>SELF_BUILT_OTHER：非腾讯云自建集群（混合云）</p>
     * @param NodeSource <p>节点来源（所属集群类型）。<br>枚举值：<br>TKE_MANAGED_CLUSTER：腾讯云标准集群<br>TKE_INDEPENDENT_CLUSTER：腾讯云标准集群（Master自维护）<br>TKE_SERVERLESS_CLUSTER：腾讯云Serverless集群<br>TKE_EDGE_CLUSTER：腾讯云边缘集群<br>SELF_BUILT：腾讯云内自建集群<br>SELF_BUILT_OTHER：非腾讯云自建集群（混合云）</p>
     */
    public void setNodeSource(String NodeSource) {
        this.NodeSource = NodeSource;
    }

    /**
     * Get <p>子网名称。</p> 
     * @return SubNetName <p>子网名称。</p>
     */
    public String getSubNetName() {
        return this.SubNetName;
    }

    /**
     * Set <p>子网名称。</p>
     * @param SubNetName <p>子网名称。</p>
     */
    public void setSubNetName(String SubNetName) {
        this.SubNetName = SubNetName;
    }

    /**
     * Get <p>子网 ID。</p> 
     * @return SubNetId <p>子网 ID。</p>
     */
    public String getSubNetId() {
        return this.SubNetId;
    }

    /**
     * Set <p>子网 ID。</p>
     * @param SubNetId <p>子网 ID。</p>
     */
    public void setSubNetId(String SubNetId) {
        this.SubNetId = SubNetId;
    }

    /**
     * Get <p>子网网段（CIDR）。</p> 
     * @return SubNetCIDR <p>子网网段（CIDR）。</p>
     */
    public String getSubNetCIDR() {
        return this.SubNetCIDR;
    }

    /**
     * Set <p>子网网段（CIDR）。</p>
     * @param SubNetCIDR <p>子网网段（CIDR）。</p>
     */
    public void setSubNetCIDR(String SubNetCIDR) {
        this.SubNetCIDR = SubNetCIDR;
    }

    /**
     * Get <p>核数（由 cpu_request 除以 1000 得到）。<br>单位：核</p> 
     * @return CoresCount <p>核数（由 cpu_request 除以 1000 得到）。<br>单位：核</p>
     */
    public Long getCoresCount() {
        return this.CoresCount;
    }

    /**
     * Set <p>核数（由 cpu_request 除以 1000 得到）。<br>单位：核</p>
     * @param CoresCount <p>核数（由 cpu_request 除以 1000 得到）。<br>单位：核</p>
     */
    public void setCoresCount(Long CoresCount) {
        this.CoresCount = CoresCount;
    }

    /**
     * Get <p>所属集群名称。</p> 
     * @return ClusterName <p>所属集群名称。</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>所属集群名称。</p>
     * @param ClusterName <p>所属集群名称。</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>所属集群 ID。</p> 
     * @return ClusterId <p>所属集群 ID。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>所属集群 ID。</p>
     * @param ClusterId <p>所属集群 ID。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>所属集群运行状态。<br>枚举值：<br>Running：运行中<br>Exception：异常<br>Unknown：未知<br>Creating：创建中<br>Destroyed：已销毁</p> 
     * @return Status <p>所属集群运行状态。<br>枚举值：<br>Running：运行中<br>Exception：异常<br>Unknown：未知<br>Creating：创建中<br>Destroyed：已销毁</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>所属集群运行状态。<br>枚举值：<br>Running：运行中<br>Exception：异常<br>Unknown：未知<br>Creating：创建中<br>Destroyed：已销毁</p>
     * @param Status <p>所属集群运行状态。<br>枚举值：<br>Running：运行中<br>Exception：异常<br>Unknown：未知<br>Creating：创建中<br>Destroyed：已销毁</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Kubernetes 版本。</p> 
     * @return ClusterVersion <p>Kubernetes 版本。</p>
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>Kubernetes 版本。</p>
     * @param ClusterVersion <p>Kubernetes 版本。</p>
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>Kubelet 版本。</p> 
     * @return KubeletVersion <p>Kubelet 版本。</p>
     */
    public String getKubeletVersion() {
        return this.KubeletVersion;
    }

    /**
     * Set <p>Kubelet 版本。</p>
     * @param KubeletVersion <p>Kubelet 版本。</p>
     */
    public void setKubeletVersion(String KubeletVersion) {
        this.KubeletVersion = KubeletVersion;
    }

    /**
     * Get <p>超级节点所属账号APPID</p> 
     * @return AppID <p>超级节点所属账号APPID</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>超级节点所属账号APPID</p>
     * @param AppID <p>超级节点所属账号APPID</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>超级节点实例ID</p> 
     * @return InstanceId <p>超级节点实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>超级节点实例ID</p>
     * @param InstanceId <p>超级节点实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>超级节点名称</p> 
     * @return NodeName <p>超级节点名称</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>超级节点名称</p>
     * @param NodeName <p>超级节点名称</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>VPCID</p> 
     * @return VpcId <p>VPCID</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPCID</p>
     * @param VpcId <p>VPCID</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeClusterSuperNodeInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterSuperNodeInfoResponse(DescribeClusterSuperNodeInfoResponse source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionNameEn != null) {
            this.RegionNameEn = new String(source.RegionNameEn);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AssetSyncTime != null) {
            this.AssetSyncTime = new String(source.AssetSyncTime);
        }
        if (source.NodeSource != null) {
            this.NodeSource = new String(source.NodeSource);
        }
        if (source.SubNetName != null) {
            this.SubNetName = new String(source.SubNetName);
        }
        if (source.SubNetId != null) {
            this.SubNetId = new String(source.SubNetId);
        }
        if (source.SubNetCIDR != null) {
            this.SubNetCIDR = new String(source.SubNetCIDR);
        }
        if (source.CoresCount != null) {
            this.CoresCount = new Long(source.CoresCount);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.KubeletVersion != null) {
            this.KubeletVersion = new String(source.KubeletVersion);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionNameEn", this.RegionNameEn);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AssetSyncTime", this.AssetSyncTime);
        this.setParamSimple(map, prefix + "NodeSource", this.NodeSource);
        this.setParamSimple(map, prefix + "SubNetName", this.SubNetName);
        this.setParamSimple(map, prefix + "SubNetId", this.SubNetId);
        this.setParamSimple(map, prefix + "SubNetCIDR", this.SubNetCIDR);
        this.setParamSimple(map, prefix + "CoresCount", this.CoresCount);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "KubeletVersion", this.KubeletVersion);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

