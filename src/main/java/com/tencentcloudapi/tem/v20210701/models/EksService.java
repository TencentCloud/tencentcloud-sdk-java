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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EksService extends AbstractModel {

    /**
    * service name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 可用端口
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * yaml 内容
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * 服务名
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 版本名
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 内网ip
    */
    @SerializedName("ClusterIp")
    @Expose
    private String [] ClusterIp;

    /**
    * 外网ip
    */
    @SerializedName("ExternalIp")
    @Expose
    private String ExternalIp;

    /**
    * 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 子网ID，只在类型为vpc访问时才有值
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
    */
    @SerializedName("LoadBalanceId")
    @Expose
    private String LoadBalanceId;

    /**
    * 端口映射
    */
    @SerializedName("PortMappings")
    @Expose
    private PortMapping [] PortMappings;

    /**
    * 每种类型访问配置详情
    */
    @SerializedName("ServicePortMappingList")
    @Expose
    private ServicePortMapping [] ServicePortMappingList;

    /**
    * 刷新复写所有类型
    */
    @SerializedName("FlushAll")
    @Expose
    private Boolean FlushAll;

    /**
    * 1: 下次部署自动注入注册中心信息；0：不注入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRegistryNextDeploy")
    @Expose
    private Long EnableRegistryNextDeploy;

    /**
    * 返回应用id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 所有服务IP是否已经ready
    */
    @SerializedName("AllIpDone")
    @Expose
    private Boolean AllIpDone;

    /**
    * clb 域名
    */
    @SerializedName("ExternalDomain")
    @Expose
    private String ExternalDomain;

    /**
     * Get service name 
     * @return Name service name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set service name
     * @param Name service name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 可用端口 
     * @return Ports 可用端口
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 可用端口
     * @param Ports 可用端口
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get yaml 内容 
     * @return Yaml yaml 内容
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set yaml 内容
     * @param Yaml yaml 内容
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get 服务名 
     * @return ApplicationName 服务名
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 服务名
     * @param ApplicationName 服务名
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 版本名 
     * @return VersionName 版本名
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
     * @param VersionName 版本名
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 内网ip 
     * @return ClusterIp 内网ip
     */
    public String [] getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set 内网ip
     * @param ClusterIp 内网ip
     */
    public void setClusterIp(String [] ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get 外网ip 
     * @return ExternalIp 外网ip
     */
    public String getExternalIp() {
        return this.ExternalIp;
    }

    /**
     * Set 外网ip
     * @param ExternalIp 外网ip
     */
    public void setExternalIp(String ExternalIp) {
        this.ExternalIp = ExternalIp;
    }

    /**
     * Get 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问） 
     * @return Type 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
     * @param Type 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 子网ID，只在类型为vpc访问时才有值 
     * @return SubnetId 子网ID，只在类型为vpc访问时才有值
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID，只在类型为vpc访问时才有值
     * @param SubnetId 子网ID，只在类型为vpc访问时才有值
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建 
     * @return LoadBalanceId 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
     */
    public String getLoadBalanceId() {
        return this.LoadBalanceId;
    }

    /**
     * Set 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
     * @param LoadBalanceId 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
     */
    public void setLoadBalanceId(String LoadBalanceId) {
        this.LoadBalanceId = LoadBalanceId;
    }

    /**
     * Get 端口映射 
     * @return PortMappings 端口映射
     */
    public PortMapping [] getPortMappings() {
        return this.PortMappings;
    }

    /**
     * Set 端口映射
     * @param PortMappings 端口映射
     */
    public void setPortMappings(PortMapping [] PortMappings) {
        this.PortMappings = PortMappings;
    }

    /**
     * Get 每种类型访问配置详情 
     * @return ServicePortMappingList 每种类型访问配置详情
     */
    public ServicePortMapping [] getServicePortMappingList() {
        return this.ServicePortMappingList;
    }

    /**
     * Set 每种类型访问配置详情
     * @param ServicePortMappingList 每种类型访问配置详情
     */
    public void setServicePortMappingList(ServicePortMapping [] ServicePortMappingList) {
        this.ServicePortMappingList = ServicePortMappingList;
    }

    /**
     * Get 刷新复写所有类型 
     * @return FlushAll 刷新复写所有类型
     */
    public Boolean getFlushAll() {
        return this.FlushAll;
    }

    /**
     * Set 刷新复写所有类型
     * @param FlushAll 刷新复写所有类型
     */
    public void setFlushAll(Boolean FlushAll) {
        this.FlushAll = FlushAll;
    }

    /**
     * Get 1: 下次部署自动注入注册中心信息；0：不注入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRegistryNextDeploy 1: 下次部署自动注入注册中心信息；0：不注入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableRegistryNextDeploy() {
        return this.EnableRegistryNextDeploy;
    }

    /**
     * Set 1: 下次部署自动注入注册中心信息；0：不注入
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRegistryNextDeploy 1: 下次部署自动注入注册中心信息；0：不注入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRegistryNextDeploy(Long EnableRegistryNextDeploy) {
        this.EnableRegistryNextDeploy = EnableRegistryNextDeploy;
    }

    /**
     * Get 返回应用id 
     * @return ApplicationId 返回应用id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 返回应用id
     * @param ApplicationId 返回应用id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 所有服务IP是否已经ready 
     * @return AllIpDone 所有服务IP是否已经ready
     */
    public Boolean getAllIpDone() {
        return this.AllIpDone;
    }

    /**
     * Set 所有服务IP是否已经ready
     * @param AllIpDone 所有服务IP是否已经ready
     */
    public void setAllIpDone(Boolean AllIpDone) {
        this.AllIpDone = AllIpDone;
    }

    /**
     * Get clb 域名 
     * @return ExternalDomain clb 域名
     */
    public String getExternalDomain() {
        return this.ExternalDomain;
    }

    /**
     * Set clb 域名
     * @param ExternalDomain clb 域名
     */
    public void setExternalDomain(String ExternalDomain) {
        this.ExternalDomain = ExternalDomain;
    }

    public EksService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EksService(EksService source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.ClusterIp != null) {
            this.ClusterIp = new String[source.ClusterIp.length];
            for (int i = 0; i < source.ClusterIp.length; i++) {
                this.ClusterIp[i] = new String(source.ClusterIp[i]);
            }
        }
        if (source.ExternalIp != null) {
            this.ExternalIp = new String(source.ExternalIp);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.LoadBalanceId != null) {
            this.LoadBalanceId = new String(source.LoadBalanceId);
        }
        if (source.PortMappings != null) {
            this.PortMappings = new PortMapping[source.PortMappings.length];
            for (int i = 0; i < source.PortMappings.length; i++) {
                this.PortMappings[i] = new PortMapping(source.PortMappings[i]);
            }
        }
        if (source.ServicePortMappingList != null) {
            this.ServicePortMappingList = new ServicePortMapping[source.ServicePortMappingList.length];
            for (int i = 0; i < source.ServicePortMappingList.length; i++) {
                this.ServicePortMappingList[i] = new ServicePortMapping(source.ServicePortMappingList[i]);
            }
        }
        if (source.FlushAll != null) {
            this.FlushAll = new Boolean(source.FlushAll);
        }
        if (source.EnableRegistryNextDeploy != null) {
            this.EnableRegistryNextDeploy = new Long(source.EnableRegistryNextDeploy);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.AllIpDone != null) {
            this.AllIpDone = new Boolean(source.AllIpDone);
        }
        if (source.ExternalDomain != null) {
            this.ExternalDomain = new String(source.ExternalDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamArraySimple(map, prefix + "ClusterIp.", this.ClusterIp);
        this.setParamSimple(map, prefix + "ExternalIp", this.ExternalIp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LoadBalanceId", this.LoadBalanceId);
        this.setParamArrayObj(map, prefix + "PortMappings.", this.PortMappings);
        this.setParamArrayObj(map, prefix + "ServicePortMappingList.", this.ServicePortMappingList);
        this.setParamSimple(map, prefix + "FlushAll", this.FlushAll);
        this.setParamSimple(map, prefix + "EnableRegistryNextDeploy", this.EnableRegistryNextDeploy);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "AllIpDone", this.AllIpDone);
        this.setParamSimple(map, prefix + "ExternalDomain", this.ExternalDomain);

    }
}

