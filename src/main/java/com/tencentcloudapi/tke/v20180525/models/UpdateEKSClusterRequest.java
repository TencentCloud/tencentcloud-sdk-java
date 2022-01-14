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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateEKSClusterRequest extends AbstractModel{

    /**
    * 弹性集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 弹性集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 弹性集群描述信息
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 子网Id 列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 弹性容器集群公网访问LB信息
    */
    @SerializedName("PublicLB")
    @Expose
    private ClusterPublicLB PublicLB;

    /**
    * 弹性容器集群内网访问LB信息
    */
    @SerializedName("InternalLB")
    @Expose
    private ClusterInternalLB InternalLB;

    /**
    * Service 子网Id
    */
    @SerializedName("ServiceSubnetId")
    @Expose
    private String ServiceSubnetId;

    /**
    * 集群自定义的dns 服务器信息
    */
    @SerializedName("DnsServers")
    @Expose
    private DnsServerConf [] DnsServers;

    /**
    * 是否清空自定义dns 服务器设置。为1 表示 是。其他表示 否。
    */
    @SerializedName("ClearDnsServer")
    @Expose
    private String ClearDnsServer;

    /**
    * 将来删除集群时是否要删除cbs。默认为 FALSE
    */
    @SerializedName("NeedDeleteCbs")
    @Expose
    private Boolean NeedDeleteCbs;

    /**
    * 标记是否是新的内外网。默认为false
    */
    @SerializedName("ProxyLB")
    @Expose
    private Boolean ProxyLB;

    /**
    * 扩展参数。须是map[string]string 的json 格式。
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
     * Get 弹性集群Id 
     * @return ClusterId 弹性集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 弹性集群Id
     * @param ClusterId 弹性集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 弹性集群名称 
     * @return ClusterName 弹性集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 弹性集群名称
     * @param ClusterName 弹性集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 弹性集群描述信息 
     * @return ClusterDesc 弹性集群描述信息
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 弹性集群描述信息
     * @param ClusterDesc 弹性集群描述信息
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get 子网Id 列表 
     * @return SubnetIds 子网Id 列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网Id 列表
     * @param SubnetIds 子网Id 列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 弹性容器集群公网访问LB信息 
     * @return PublicLB 弹性容器集群公网访问LB信息
     */
    public ClusterPublicLB getPublicLB() {
        return this.PublicLB;
    }

    /**
     * Set 弹性容器集群公网访问LB信息
     * @param PublicLB 弹性容器集群公网访问LB信息
     */
    public void setPublicLB(ClusterPublicLB PublicLB) {
        this.PublicLB = PublicLB;
    }

    /**
     * Get 弹性容器集群内网访问LB信息 
     * @return InternalLB 弹性容器集群内网访问LB信息
     */
    public ClusterInternalLB getInternalLB() {
        return this.InternalLB;
    }

    /**
     * Set 弹性容器集群内网访问LB信息
     * @param InternalLB 弹性容器集群内网访问LB信息
     */
    public void setInternalLB(ClusterInternalLB InternalLB) {
        this.InternalLB = InternalLB;
    }

    /**
     * Get Service 子网Id 
     * @return ServiceSubnetId Service 子网Id
     */
    public String getServiceSubnetId() {
        return this.ServiceSubnetId;
    }

    /**
     * Set Service 子网Id
     * @param ServiceSubnetId Service 子网Id
     */
    public void setServiceSubnetId(String ServiceSubnetId) {
        this.ServiceSubnetId = ServiceSubnetId;
    }

    /**
     * Get 集群自定义的dns 服务器信息 
     * @return DnsServers 集群自定义的dns 服务器信息
     */
    public DnsServerConf [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set 集群自定义的dns 服务器信息
     * @param DnsServers 集群自定义的dns 服务器信息
     */
    public void setDnsServers(DnsServerConf [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * Get 是否清空自定义dns 服务器设置。为1 表示 是。其他表示 否。 
     * @return ClearDnsServer 是否清空自定义dns 服务器设置。为1 表示 是。其他表示 否。
     */
    public String getClearDnsServer() {
        return this.ClearDnsServer;
    }

    /**
     * Set 是否清空自定义dns 服务器设置。为1 表示 是。其他表示 否。
     * @param ClearDnsServer 是否清空自定义dns 服务器设置。为1 表示 是。其他表示 否。
     */
    public void setClearDnsServer(String ClearDnsServer) {
        this.ClearDnsServer = ClearDnsServer;
    }

    /**
     * Get 将来删除集群时是否要删除cbs。默认为 FALSE 
     * @return NeedDeleteCbs 将来删除集群时是否要删除cbs。默认为 FALSE
     */
    public Boolean getNeedDeleteCbs() {
        return this.NeedDeleteCbs;
    }

    /**
     * Set 将来删除集群时是否要删除cbs。默认为 FALSE
     * @param NeedDeleteCbs 将来删除集群时是否要删除cbs。默认为 FALSE
     */
    public void setNeedDeleteCbs(Boolean NeedDeleteCbs) {
        this.NeedDeleteCbs = NeedDeleteCbs;
    }

    /**
     * Get 标记是否是新的内外网。默认为false 
     * @return ProxyLB 标记是否是新的内外网。默认为false
     */
    public Boolean getProxyLB() {
        return this.ProxyLB;
    }

    /**
     * Set 标记是否是新的内外网。默认为false
     * @param ProxyLB 标记是否是新的内外网。默认为false
     */
    public void setProxyLB(Boolean ProxyLB) {
        this.ProxyLB = ProxyLB;
    }

    /**
     * Get 扩展参数。须是map[string]string 的json 格式。 
     * @return ExtraParam 扩展参数。须是map[string]string 的json 格式。
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 扩展参数。须是map[string]string 的json 格式。
     * @param ExtraParam 扩展参数。须是map[string]string 的json 格式。
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    public UpdateEKSClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateEKSClusterRequest(UpdateEKSClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.PublicLB != null) {
            this.PublicLB = new ClusterPublicLB(source.PublicLB);
        }
        if (source.InternalLB != null) {
            this.InternalLB = new ClusterInternalLB(source.InternalLB);
        }
        if (source.ServiceSubnetId != null) {
            this.ServiceSubnetId = new String(source.ServiceSubnetId);
        }
        if (source.DnsServers != null) {
            this.DnsServers = new DnsServerConf[source.DnsServers.length];
            for (int i = 0; i < source.DnsServers.length; i++) {
                this.DnsServers[i] = new DnsServerConf(source.DnsServers[i]);
            }
        }
        if (source.ClearDnsServer != null) {
            this.ClearDnsServer = new String(source.ClearDnsServer);
        }
        if (source.NeedDeleteCbs != null) {
            this.NeedDeleteCbs = new Boolean(source.NeedDeleteCbs);
        }
        if (source.ProxyLB != null) {
            this.ProxyLB = new Boolean(source.ProxyLB);
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamObj(map, prefix + "PublicLB.", this.PublicLB);
        this.setParamObj(map, prefix + "InternalLB.", this.InternalLB);
        this.setParamSimple(map, prefix + "ServiceSubnetId", this.ServiceSubnetId);
        this.setParamArrayObj(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "ClearDnsServer", this.ClearDnsServer);
        this.setParamSimple(map, prefix + "NeedDeleteCbs", this.NeedDeleteCbs);
        this.setParamSimple(map, prefix + "ProxyLB", this.ProxyLB);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);

    }
}

