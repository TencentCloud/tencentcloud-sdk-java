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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExternalNodeSupportConfigResponse extends AbstractModel {

    /**
    * 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 集群网络插件类型，支持：CiliumBGP、CiliumVXLan
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 是否开启第三方节点专线连接支持
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 节点所属交换机的BGP AS 号
    */
    @SerializedName("AS")
    @Expose
    private String AS;

    /**
    * 节点所属交换机的交换机 IP
    */
    @SerializedName("SwitchIP")
    @Expose
    private String SwitchIP;

    /**
    * 开启第三方节点池状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 如果开启失败原因
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * 内网访问地址
    */
    @SerializedName("Master")
    @Expose
    private String Master;

    /**
    * 镜像仓库代理地址
    */
    @SerializedName("Proxy")
    @Expose
    private String Proxy;

    /**
    * 用于记录开启第三方节点的过程进行到哪一步了
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Step [] Progress;

    /**
    * 是否开启第三方节点公网连接支持
    */
    @SerializedName("EnabledPublicConnect")
    @Expose
    private Boolean EnabledPublicConnect;

    /**
    * 注册节点公网版公网连接地址
    */
    @SerializedName("PublicConnectUrl")
    @Expose
    private String PublicConnectUrl;

    /**
    * 注册节点公网版自定义域名
    */
    @SerializedName("PublicCustomDomain")
    @Expose
    private String PublicCustomDomain;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。 
     * @return ClusterCIDR 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     * @param ClusterCIDR 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get 集群网络插件类型，支持：CiliumBGP、CiliumVXLan 
     * @return NetworkType 集群网络插件类型，支持：CiliumBGP、CiliumVXLan
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 集群网络插件类型，支持：CiliumBGP、CiliumVXLan
     * @param NetworkType 集群网络插件类型，支持：CiliumBGP、CiliumVXLan
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 是否开启第三方节点专线连接支持 
     * @return Enabled 是否开启第三方节点专线连接支持
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启第三方节点专线连接支持
     * @param Enabled 是否开启第三方节点专线连接支持
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 节点所属交换机的BGP AS 号 
     * @return AS 节点所属交换机的BGP AS 号
     */
    public String getAS() {
        return this.AS;
    }

    /**
     * Set 节点所属交换机的BGP AS 号
     * @param AS 节点所属交换机的BGP AS 号
     */
    public void setAS(String AS) {
        this.AS = AS;
    }

    /**
     * Get 节点所属交换机的交换机 IP 
     * @return SwitchIP 节点所属交换机的交换机 IP
     */
    public String getSwitchIP() {
        return this.SwitchIP;
    }

    /**
     * Set 节点所属交换机的交换机 IP
     * @param SwitchIP 节点所属交换机的交换机 IP
     */
    public void setSwitchIP(String SwitchIP) {
        this.SwitchIP = SwitchIP;
    }

    /**
     * Get 开启第三方节点池状态 
     * @return Status 开启第三方节点池状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 开启第三方节点池状态
     * @param Status 开启第三方节点池状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 如果开启失败原因 
     * @return FailedReason 如果开启失败原因
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set 如果开启失败原因
     * @param FailedReason 如果开启失败原因
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get 内网访问地址 
     * @return Master 内网访问地址
     */
    public String getMaster() {
        return this.Master;
    }

    /**
     * Set 内网访问地址
     * @param Master 内网访问地址
     */
    public void setMaster(String Master) {
        this.Master = Master;
    }

    /**
     * Get 镜像仓库代理地址 
     * @return Proxy 镜像仓库代理地址
     */
    public String getProxy() {
        return this.Proxy;
    }

    /**
     * Set 镜像仓库代理地址
     * @param Proxy 镜像仓库代理地址
     */
    public void setProxy(String Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get 用于记录开启第三方节点的过程进行到哪一步了
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 用于记录开启第三方节点的过程进行到哪一步了
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Step [] getProgress() {
        return this.Progress;
    }

    /**
     * Set 用于记录开启第三方节点的过程进行到哪一步了
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 用于记录开启第三方节点的过程进行到哪一步了
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Step [] Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 是否开启第三方节点公网连接支持 
     * @return EnabledPublicConnect 是否开启第三方节点公网连接支持
     */
    public Boolean getEnabledPublicConnect() {
        return this.EnabledPublicConnect;
    }

    /**
     * Set 是否开启第三方节点公网连接支持
     * @param EnabledPublicConnect 是否开启第三方节点公网连接支持
     */
    public void setEnabledPublicConnect(Boolean EnabledPublicConnect) {
        this.EnabledPublicConnect = EnabledPublicConnect;
    }

    /**
     * Get 注册节点公网版公网连接地址 
     * @return PublicConnectUrl 注册节点公网版公网连接地址
     */
    public String getPublicConnectUrl() {
        return this.PublicConnectUrl;
    }

    /**
     * Set 注册节点公网版公网连接地址
     * @param PublicConnectUrl 注册节点公网版公网连接地址
     */
    public void setPublicConnectUrl(String PublicConnectUrl) {
        this.PublicConnectUrl = PublicConnectUrl;
    }

    /**
     * Get 注册节点公网版自定义域名 
     * @return PublicCustomDomain 注册节点公网版自定义域名
     */
    public String getPublicCustomDomain() {
        return this.PublicCustomDomain;
    }

    /**
     * Set 注册节点公网版自定义域名
     * @param PublicCustomDomain 注册节点公网版自定义域名
     */
    public void setPublicCustomDomain(String PublicCustomDomain) {
        this.PublicCustomDomain = PublicCustomDomain;
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

    public DescribeExternalNodeSupportConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExternalNodeSupportConfigResponse(DescribeExternalNodeSupportConfigResponse source) {
        if (source.ClusterCIDR != null) {
            this.ClusterCIDR = new String(source.ClusterCIDR);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.AS != null) {
            this.AS = new String(source.AS);
        }
        if (source.SwitchIP != null) {
            this.SwitchIP = new String(source.SwitchIP);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.Master != null) {
            this.Master = new String(source.Master);
        }
        if (source.Proxy != null) {
            this.Proxy = new String(source.Proxy);
        }
        if (source.Progress != null) {
            this.Progress = new Step[source.Progress.length];
            for (int i = 0; i < source.Progress.length; i++) {
                this.Progress[i] = new Step(source.Progress[i]);
            }
        }
        if (source.EnabledPublicConnect != null) {
            this.EnabledPublicConnect = new Boolean(source.EnabledPublicConnect);
        }
        if (source.PublicConnectUrl != null) {
            this.PublicConnectUrl = new String(source.PublicConnectUrl);
        }
        if (source.PublicCustomDomain != null) {
            this.PublicCustomDomain = new String(source.PublicCustomDomain);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "AS", this.AS);
        this.setParamSimple(map, prefix + "SwitchIP", this.SwitchIP);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "Master", this.Master);
        this.setParamSimple(map, prefix + "Proxy", this.Proxy);
        this.setParamArrayObj(map, prefix + "Progress.", this.Progress);
        this.setParamSimple(map, prefix + "EnabledPublicConnect", this.EnabledPublicConnect);
        this.setParamSimple(map, prefix + "PublicConnectUrl", this.PublicConnectUrl);
        this.setParamSimple(map, prefix + "PublicCustomDomain", this.PublicCustomDomain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

