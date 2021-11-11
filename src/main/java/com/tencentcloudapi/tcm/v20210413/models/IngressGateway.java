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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressGateway extends AbstractModel{

    /**
    * IngressGateway 实例名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 集群 ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Service 配置
    */
    @SerializedName("Service")
    @Expose
    private Service Service;

    /**
    * Workload 配置
    */
    @SerializedName("Workload")
    @Expose
    private WorkloadConfig Workload;

    /**
    * 负载均衡配置，自动创建 CLB 时返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancer")
    @Expose
    private LoadBalancer LoadBalancer;

    /**
    * IngressGateway 状态信息，只读
    */
    @SerializedName("Status")
    @Expose
    private IngressGatewayStatus Status;

    /**
    * 负载均衡实例ID，使用已有 CLB 时返回
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
     * Get IngressGateway 实例名字 
     * @return Name IngressGateway 实例名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set IngressGateway 实例名字
     * @param Name IngressGateway 实例名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 集群 ID 
     * @return ClusterId 集群 ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
     * @param ClusterId 集群 ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Service 配置 
     * @return Service Service 配置
     */
    public Service getService() {
        return this.Service;
    }

    /**
     * Set Service 配置
     * @param Service Service 配置
     */
    public void setService(Service Service) {
        this.Service = Service;
    }

    /**
     * Get Workload 配置 
     * @return Workload Workload 配置
     */
    public WorkloadConfig getWorkload() {
        return this.Workload;
    }

    /**
     * Set Workload 配置
     * @param Workload Workload 配置
     */
    public void setWorkload(WorkloadConfig Workload) {
        this.Workload = Workload;
    }

    /**
     * Get 负载均衡配置，自动创建 CLB 时返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancer 负载均衡配置，自动创建 CLB 时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoadBalancer getLoadBalancer() {
        return this.LoadBalancer;
    }

    /**
     * Set 负载均衡配置，自动创建 CLB 时返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancer 负载均衡配置，自动创建 CLB 时返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancer(LoadBalancer LoadBalancer) {
        this.LoadBalancer = LoadBalancer;
    }

    /**
     * Get IngressGateway 状态信息，只读 
     * @return Status IngressGateway 状态信息，只读
     */
    public IngressGatewayStatus getStatus() {
        return this.Status;
    }

    /**
     * Set IngressGateway 状态信息，只读
     * @param Status IngressGateway 状态信息，只读
     */
    public void setStatus(IngressGatewayStatus Status) {
        this.Status = Status;
    }

    /**
     * Get 负载均衡实例ID，使用已有 CLB 时返回 
     * @return LoadBalancerId 负载均衡实例ID，使用已有 CLB 时返回
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例ID，使用已有 CLB 时返回
     * @param LoadBalancerId 负载均衡实例ID，使用已有 CLB 时返回
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    public IngressGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressGateway(IngressGateway source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Service != null) {
            this.Service = new Service(source.Service);
        }
        if (source.Workload != null) {
            this.Workload = new WorkloadConfig(source.Workload);
        }
        if (source.LoadBalancer != null) {
            this.LoadBalancer = new LoadBalancer(source.LoadBalancer);
        }
        if (source.Status != null) {
            this.Status = new IngressGatewayStatus(source.Status);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamObj(map, prefix + "Workload.", this.Workload);
        this.setParamObj(map, prefix + "LoadBalancer.", this.LoadBalancer);
        this.setParamObj(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);

    }
}

