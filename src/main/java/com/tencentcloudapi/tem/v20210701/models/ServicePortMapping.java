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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServicePortMapping extends AbstractModel{

    /**
    * 服务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 集群内访问vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterIp")
    @Expose
    private String ClusterIp;

    /**
    * 集群外方位vip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalIp")
    @Expose
    private String ExternalIp;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * vpc id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * LoadBalance Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalanceId")
    @Expose
    private String LoadBalanceId;

    /**
    * yaml 内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
    * 暴露端口列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ports")
    @Expose
    private Long [] Ports;

    /**
    * 端口映射数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortMappingItemList")
    @Expose
    private ServicePortMappingItem [] PortMappingItemList;

    /**
     * Get 服务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 集群内访问vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterIp 集群内访问vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set 集群内访问vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterIp 集群内访问vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterIp(String ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get 集群外方位vip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalIp 集群外方位vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalIp() {
        return this.ExternalIp;
    }

    /**
     * Set 集群外方位vip
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalIp 集群外方位vip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalIp(String ExternalIp) {
        this.ExternalIp = ExternalIp;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get vpc id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get LoadBalance Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalanceId LoadBalance Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalanceId() {
        return this.LoadBalanceId;
    }

    /**
     * Set LoadBalance Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalanceId LoadBalance Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalanceId(String LoadBalanceId) {
        this.LoadBalanceId = LoadBalanceId;
    }

    /**
     * Get yaml 内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Yaml yaml 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set yaml 内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Yaml yaml 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    /**
     * Get 暴露端口列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ports 暴露端口列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 暴露端口列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ports 暴露端口列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPorts(Long [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 端口映射数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortMappingItemList 端口映射数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServicePortMappingItem [] getPortMappingItemList() {
        return this.PortMappingItemList;
    }

    /**
     * Set 端口映射数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortMappingItemList 端口映射数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortMappingItemList(ServicePortMappingItem [] PortMappingItemList) {
        this.PortMappingItemList = PortMappingItemList;
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

    }
}

