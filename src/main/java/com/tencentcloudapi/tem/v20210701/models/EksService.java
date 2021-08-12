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

public class EksService extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 版本名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 内网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterIp")
    @Expose
    private String [] ClusterIp;

    /**
    * 外网ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalIp")
    @Expose
    private String ExternalIp;

    /**
    * 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 子网ID，只在类型为vpc访问时才有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalanceId")
    @Expose
    private String LoadBalanceId;

    /**
    * 端口映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortMappings")
    @Expose
    private PortMapping [] PortMappings;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 服务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 版本名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 版本名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 版本名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 内网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterIp 内网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterIp(String [] ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get 外网ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalIp 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalIp() {
        return this.ExternalIp;
    }

    /**
     * Set 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalIp 外网ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalIp(String ExternalIp) {
        this.ExternalIp = ExternalIp;
    }

    /**
     * Get 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 访问类型，可选值：
- EXTERNAL（公网访问）
- VPC（vpc内访问）
- CLUSTER（集群内访问）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 子网ID，只在类型为vpc访问时才有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID，只在类型为vpc访问时才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID，只在类型为vpc访问时才有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID，只在类型为vpc访问时才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalanceId 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalanceId() {
        return this.LoadBalanceId;
    }

    /**
     * Set 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalanceId 负载均衡ID，只在外网访问和vpc内访问才有值，默认自动创建
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalanceId(String LoadBalanceId) {
        this.LoadBalanceId = LoadBalanceId;
    }

    /**
     * Get 端口映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortMappings 端口映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PortMapping [] getPortMappings() {
        return this.PortMappings;
    }

    /**
     * Set 端口映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortMappings 端口映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortMappings(PortMapping [] PortMappings) {
        this.PortMappings = PortMappings;
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

    }
}

