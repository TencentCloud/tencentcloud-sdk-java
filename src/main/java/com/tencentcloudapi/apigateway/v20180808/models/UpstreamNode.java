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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamNode extends AbstractModel{

    /**
    * IP或域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 端口[0, 65535]
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 权重[0, 100], 0为禁用
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * CVM实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VmInstanceId")
    @Expose
    private String VmInstanceId;

    /**
    * 染色标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 节点健康状态，创建、编辑时不需要传该参数。OFF：关闭，HEALTHY：健康，UNHEALTHY：异常，NO_DATA：数据未上报。目前只支持VPC通道。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Healthy")
    @Expose
    private String Healthy;

    /**
    * K8S容器服务名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * K8S命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * TKE集群的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Node的来源，取值范围：K8S
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * API网关内部记录唯一的服务名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UniqueServiceName")
    @Expose
    private String UniqueServiceName;

    /**
     * Get IP或域名 
     * @return Host IP或域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set IP或域名
     * @param Host IP或域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 端口[0, 65535] 
     * @return Port 端口[0, 65535]
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 端口[0, 65535]
     * @param Port 端口[0, 65535]
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 权重[0, 100], 0为禁用 
     * @return Weight 权重[0, 100], 0为禁用
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重[0, 100], 0为禁用
     * @param Weight 权重[0, 100], 0为禁用
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get CVM实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VmInstanceId CVM实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVmInstanceId() {
        return this.VmInstanceId;
    }

    /**
     * Set CVM实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VmInstanceId CVM实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVmInstanceId(String VmInstanceId) {
        this.VmInstanceId = VmInstanceId;
    }

    /**
     * Get 染色标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 染色标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 染色标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 染色标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 节点健康状态，创建、编辑时不需要传该参数。OFF：关闭，HEALTHY：健康，UNHEALTHY：异常，NO_DATA：数据未上报。目前只支持VPC通道。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Healthy 节点健康状态，创建、编辑时不需要传该参数。OFF：关闭，HEALTHY：健康，UNHEALTHY：异常，NO_DATA：数据未上报。目前只支持VPC通道。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthy() {
        return this.Healthy;
    }

    /**
     * Set 节点健康状态，创建、编辑时不需要传该参数。OFF：关闭，HEALTHY：健康，UNHEALTHY：异常，NO_DATA：数据未上报。目前只支持VPC通道。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Healthy 节点健康状态，创建、编辑时不需要传该参数。OFF：关闭，HEALTHY：健康，UNHEALTHY：异常，NO_DATA：数据未上报。目前只支持VPC通道。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthy(String Healthy) {
        this.Healthy = Healthy;
    }

    /**
     * Get K8S容器服务名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceName K8S容器服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set K8S容器服务名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceName K8S容器服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get K8S命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameSpace K8S命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set K8S命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameSpace K8S命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get TKE集群的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId TKE集群的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set TKE集群的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId TKE集群的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Node的来源，取值范围：K8S
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source Node的来源，取值范围：K8S
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Node的来源，取值范围：K8S
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source Node的来源，取值范围：K8S
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get API网关内部记录唯一的服务名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UniqueServiceName API网关内部记录唯一的服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUniqueServiceName() {
        return this.UniqueServiceName;
    }

    /**
     * Set API网关内部记录唯一的服务名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param UniqueServiceName API网关内部记录唯一的服务名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUniqueServiceName(String UniqueServiceName) {
        this.UniqueServiceName = UniqueServiceName;
    }

    public UpstreamNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamNode(UpstreamNode source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.VmInstanceId != null) {
            this.VmInstanceId = new String(source.VmInstanceId);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Healthy != null) {
            this.Healthy = new String(source.Healthy);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.UniqueServiceName != null) {
            this.UniqueServiceName = new String(source.UniqueServiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "VmInstanceId", this.VmInstanceId);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Healthy", this.Healthy);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "UniqueServiceName", this.UniqueServiceName);

    }
}

