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

public class EksCluster extends AbstractModel{

    /**
    * 集群Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Vpc Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网列表
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * k8s 版本号
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
    * 集群状态(running运行中，initializing 初始化中，failed异常)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 集群描述信息
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 集群创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Service 子网Id
    */
    @SerializedName("ServiceSubnetId")
    @Expose
    private String ServiceSubnetId;

    /**
    * 集群的自定义dns 服务器信息
    */
    @SerializedName("DnsServers")
    @Expose
    private DnsServerConf [] DnsServers;

    /**
    * 将来删除集群时是否要删除cbs。默认为 FALSE
    */
    @SerializedName("NeedDeleteCbs")
    @Expose
    private Boolean NeedDeleteCbs;

    /**
    * 是否在用户集群内开启Dns。默认为TRUE
    */
    @SerializedName("EnableVpcCoreDNS")
    @Expose
    private Boolean EnableVpcCoreDNS;

    /**
    * 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification [] TagSpecification;

    /**
     * Get 集群Id 
     * @return ClusterId 集群Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id
     * @param ClusterId 集群Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get Vpc Id 
     * @return VpcId Vpc Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Vpc Id
     * @param VpcId Vpc Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网列表 
     * @return SubnetIds 子网列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网列表
     * @param SubnetIds 子网列表
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get k8s 版本号 
     * @return K8SVersion k8s 版本号
     */
    public String getK8SVersion() {
        return this.K8SVersion;
    }

    /**
     * Set k8s 版本号
     * @param K8SVersion k8s 版本号
     */
    public void setK8SVersion(String K8SVersion) {
        this.K8SVersion = K8SVersion;
    }

    /**
     * Get 集群状态(running运行中，initializing 初始化中，failed异常) 
     * @return Status 集群状态(running运行中，initializing 初始化中，failed异常)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态(running运行中，initializing 初始化中，failed异常)
     * @param Status 集群状态(running运行中，initializing 初始化中，failed异常)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 集群描述信息 
     * @return ClusterDesc 集群描述信息
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 集群描述信息
     * @param ClusterDesc 集群描述信息
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get 集群创建时间 
     * @return CreatedTime 集群创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 集群创建时间
     * @param CreatedTime 集群创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
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
     * Get 集群的自定义dns 服务器信息 
     * @return DnsServers 集群的自定义dns 服务器信息
     */
    public DnsServerConf [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set 集群的自定义dns 服务器信息
     * @param DnsServers 集群的自定义dns 服务器信息
     */
    public void setDnsServers(DnsServerConf [] DnsServers) {
        this.DnsServers = DnsServers;
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
     * Get 是否在用户集群内开启Dns。默认为TRUE 
     * @return EnableVpcCoreDNS 是否在用户集群内开启Dns。默认为TRUE
     */
    public Boolean getEnableVpcCoreDNS() {
        return this.EnableVpcCoreDNS;
    }

    /**
     * Set 是否在用户集群内开启Dns。默认为TRUE
     * @param EnableVpcCoreDNS 是否在用户集群内开启Dns。默认为TRUE
     */
    public void setEnableVpcCoreDNS(Boolean EnableVpcCoreDNS) {
        this.EnableVpcCoreDNS = EnableVpcCoreDNS;
    }

    /**
     * Get 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSpecification [] getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification 标签描述列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(TagSpecification [] TagSpecification) {
        this.TagSpecification = TagSpecification;
    }

    public EksCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EksCluster(EksCluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
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
        if (source.NeedDeleteCbs != null) {
            this.NeedDeleteCbs = new Boolean(source.NeedDeleteCbs);
        }
        if (source.EnableVpcCoreDNS != null) {
            this.EnableVpcCoreDNS = new Boolean(source.EnableVpcCoreDNS);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification[source.TagSpecification.length];
            for (int i = 0; i < source.TagSpecification.length; i++) {
                this.TagSpecification[i] = new TagSpecification(source.TagSpecification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ServiceSubnetId", this.ServiceSubnetId);
        this.setParamArrayObj(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "NeedDeleteCbs", this.NeedDeleteCbs);
        this.setParamSimple(map, prefix + "EnableVpcCoreDNS", this.EnableVpcCoreDNS);
        this.setParamArrayObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

