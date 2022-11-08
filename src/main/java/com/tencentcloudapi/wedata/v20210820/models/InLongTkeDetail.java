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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InLongTkeDetail extends AbstractModel{

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
    * TKE集群状态 (Running 运行中 Creating 创建中 Idling 闲置中 Abnormal 异常)
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 是否安装Agent，true: 是，false: 否
    */
    @SerializedName("HasAgent")
    @Expose
    private Boolean HasAgent;

    /**
    * 采集器ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentId")
    @Expose
    private String AgentId;

    /**
    * VPC ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * TKE集群区域ID
    */
    @SerializedName("TkeRegion")
    @Expose
    private String TkeRegion;

    /**
    * 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

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
     * Get TKE集群状态 (Running 运行中 Creating 创建中 Idling 闲置中 Abnormal 异常) 
     * @return Status TKE集群状态 (Running 运行中 Creating 创建中 Idling 闲置中 Abnormal 异常)
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set TKE集群状态 (Running 运行中 Creating 创建中 Idling 闲置中 Abnormal 异常)
     * @param Status TKE集群状态 (Running 运行中 Creating 创建中 Idling 闲置中 Abnormal 异常)
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 是否安装Agent，true: 是，false: 否 
     * @return HasAgent 是否安装Agent，true: 是，false: 否
     */
    public Boolean getHasAgent() {
        return this.HasAgent;
    }

    /**
     * Set 是否安装Agent，true: 是，false: 否
     * @param HasAgent 是否安装Agent，true: 是，false: 否
     */
    public void setHasAgent(Boolean HasAgent) {
        this.HasAgent = HasAgent;
    }

    /**
     * Get 采集器ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentId 采集器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentId() {
        return this.AgentId;
    }

    /**
     * Set 采集器ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentId 采集器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentId(String AgentId) {
        this.AgentId = AgentId;
    }

    /**
     * Get VPC ID 
     * @return VpcId VPC ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
     * @param VpcId VPC ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get TKE集群区域ID 
     * @return TkeRegion TKE集群区域ID
     */
    public String getTkeRegion() {
        return this.TkeRegion;
    }

    /**
     * Set TKE集群区域ID
     * @param TkeRegion TKE集群区域ID
     */
    public void setTkeRegion(String TkeRegion) {
        this.TkeRegion = TkeRegion;
    }

    /**
     * Get 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER 
     * @return ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER
     * @param ClusterType 集群类型，托管集群：MANAGED_CLUSTER，独立集群：INDEPENDENT_CLUSTER
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public InLongTkeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InLongTkeDetail(InLongTkeDetail source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.HasAgent != null) {
            this.HasAgent = new Boolean(source.HasAgent);
        }
        if (source.AgentId != null) {
            this.AgentId = new String(source.AgentId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.TkeRegion != null) {
            this.TkeRegion = new String(source.TkeRegion);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "HasAgent", this.HasAgent);
        this.setParamSimple(map, prefix + "AgentId", this.AgentId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "TkeRegion", this.TkeRegion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

