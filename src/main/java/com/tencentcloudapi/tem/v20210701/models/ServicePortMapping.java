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

public class ServicePortMapping extends AbstractModel {

    /**
    * 服务类型：如：EXTERNAL，VPC，CLUSTER
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 服务名称
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 集群内访问vip
    */
    @SerializedName("ClusterIp")
    @Expose
    private String ClusterIp;

    /**
    * 集群外方位vip
    */
    @SerializedName("ExternalIp")
    @Expose
    private String ExternalIp;

    /**
    * 子网id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * LoadBalance Id
    */
    @SerializedName("LoadBalanceId")
    @Expose
    private String LoadBalanceId;

    /**
    * yaml 内容
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * 暴露端口列表
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 端口映射数组
    */
    @SerializedName("PortMappingItemList")
    @Expose
    private ServicePortMappingItem [] PortMappingItemList;

    /**
    * clb domain
    */
    @SerializedName("ExternalDomain")
    @Expose
    private String ExternalDomain;

    /**
     * Get 服务类型：如：EXTERNAL，VPC，CLUSTER 
     * @return Type 服务类型：如：EXTERNAL，VPC，CLUSTER
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 服务类型：如：EXTERNAL，VPC，CLUSTER
     * @param Type 服务类型：如：EXTERNAL，VPC，CLUSTER
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 服务名称 
     * @return ServiceName 服务名称
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
     * @param ServiceName 服务名称
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 集群内访问vip 
     * @return ClusterIp 集群内访问vip
     */
    public String getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set 集群内访问vip
     * @param ClusterIp 集群内访问vip
     */
    public void setClusterIp(String ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get 集群外方位vip 
     * @return ExternalIp 集群外方位vip
     */
    public String getExternalIp() {
        return this.ExternalIp;
    }

    /**
     * Set 集群外方位vip
     * @param ExternalIp 集群外方位vip
     */
    public void setExternalIp(String ExternalIp) {
        this.ExternalIp = ExternalIp;
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
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get LoadBalance Id 
     * @return LoadBalanceId LoadBalance Id
     */
    public String getLoadBalanceId() {
        return this.LoadBalanceId;
    }

    /**
     * Set LoadBalance Id
     * @param LoadBalanceId LoadBalance Id
     */
    public void setLoadBalanceId(String LoadBalanceId) {
        this.LoadBalanceId = LoadBalanceId;
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
     * Get 暴露端口列表 
     * @return Ports 暴露端口列表
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 暴露端口列表
     * @param Ports 暴露端口列表
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 端口映射数组 
     * @return PortMappingItemList 端口映射数组
     */
    public ServicePortMappingItem [] getPortMappingItemList() {
        return this.PortMappingItemList;
    }

    /**
     * Set 端口映射数组
     * @param PortMappingItemList 端口映射数组
     */
    public void setPortMappingItemList(ServicePortMappingItem [] PortMappingItemList) {
        this.PortMappingItemList = PortMappingItemList;
    }

    /**
     * Get clb domain 
     * @return ExternalDomain clb domain
     */
    public String getExternalDomain() {
        return this.ExternalDomain;
    }

    /**
     * Set clb domain
     * @param ExternalDomain clb domain
     */
    public void setExternalDomain(String ExternalDomain) {
        this.ExternalDomain = ExternalDomain;
    }

    public ServicePortMapping() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServicePortMapping(ServicePortMapping source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ClusterIp != null) {
            this.ClusterIp = new String(source.ClusterIp);
        }
        if (source.ExternalIp != null) {
            this.ExternalIp = new String(source.ExternalIp);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.LoadBalanceId != null) {
            this.LoadBalanceId = new String(source.LoadBalanceId);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
        if (source.Ports != null) {
            this.Ports = new Long[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new Long(source.Ports[i]);
            }
        }
        if (source.PortMappingItemList != null) {
            this.PortMappingItemList = new ServicePortMappingItem[source.PortMappingItemList.length];
            for (int i = 0; i < source.PortMappingItemList.length; i++) {
                this.PortMappingItemList[i] = new ServicePortMappingItem(source.PortMappingItemList[i]);
            }
        }
        if (source.ExternalDomain != null) {
            this.ExternalDomain = new String(source.ExternalDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ClusterIp", this.ClusterIp);
        this.setParamSimple(map, prefix + "ExternalIp", this.ExternalIp);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "LoadBalanceId", this.LoadBalanceId);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);
        this.setParamArraySimple(map, prefix + "Ports.", this.Ports);
        this.setParamArrayObj(map, prefix + "PortMappingItemList.", this.PortMappingItemList);
        this.setParamSimple(map, prefix + "ExternalDomain", this.ExternalDomain);

    }
}

