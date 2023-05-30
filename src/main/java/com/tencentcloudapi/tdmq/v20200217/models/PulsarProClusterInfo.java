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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PulsarProClusterInfo extends AbstractModel{

    /**
    * 集群Id。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 说明信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 集群状态，0:创建中，1:正常，2:隔离
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 集群版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 节点分布情况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeDistribution")
    @Expose
    private InstanceNodeDistribution [] NodeDistribution;

    /**
    * 最大储存容量，单位：MB
    */
    @SerializedName("MaxStorage")
    @Expose
    private Long MaxStorage;

    /**
    * 是否可以修改路由
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanEditRoute")
    @Expose
    private Boolean CanEditRoute;

    /**
     * Get 集群Id。 
     * @return ClusterId 集群Id。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群Id。
     * @param ClusterId 集群Id。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称。 
     * @return ClusterName 集群名称。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称。
     * @param ClusterName 集群名称。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 说明信息。 
     * @return Remark 说明信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息。
     * @param Remark 说明信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 集群状态，0:创建中，1:正常，2:隔离 
     * @return Status 集群状态，0:创建中，1:正常，2:隔离
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态，0:创建中，1:正常，2:隔离
     * @param Status 集群状态，0:创建中，1:正常，2:隔离
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 集群版本 
     * @return Version 集群版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 集群版本
     * @param Version 集群版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 节点分布情况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeDistribution 节点分布情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNodeDistribution [] getNodeDistribution() {
        return this.NodeDistribution;
    }

    /**
     * Set 节点分布情况
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeDistribution 节点分布情况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeDistribution(InstanceNodeDistribution [] NodeDistribution) {
        this.NodeDistribution = NodeDistribution;
    }

    /**
     * Get 最大储存容量，单位：MB 
     * @return MaxStorage 最大储存容量，单位：MB
     */
    public Long getMaxStorage() {
        return this.MaxStorage;
    }

    /**
     * Set 最大储存容量，单位：MB
     * @param MaxStorage 最大储存容量，单位：MB
     */
    public void setMaxStorage(Long MaxStorage) {
        this.MaxStorage = MaxStorage;
    }

    /**
     * Get 是否可以修改路由
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanEditRoute 是否可以修改路由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCanEditRoute() {
        return this.CanEditRoute;
    }

    /**
     * Set 是否可以修改路由
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanEditRoute 是否可以修改路由
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanEditRoute(Boolean CanEditRoute) {
        this.CanEditRoute = CanEditRoute;
    }

    public PulsarProClusterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarProClusterInfo(PulsarProClusterInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.NodeDistribution != null) {
            this.NodeDistribution = new InstanceNodeDistribution[source.NodeDistribution.length];
            for (int i = 0; i < source.NodeDistribution.length; i++) {
                this.NodeDistribution[i] = new InstanceNodeDistribution(source.NodeDistribution[i]);
            }
        }
        if (source.MaxStorage != null) {
            this.MaxStorage = new Long(source.MaxStorage);
        }
        if (source.CanEditRoute != null) {
            this.CanEditRoute = new Boolean(source.CanEditRoute);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamArrayObj(map, prefix + "NodeDistribution.", this.NodeDistribution);
        this.setParamSimple(map, prefix + "MaxStorage", this.MaxStorage);
        this.setParamSimple(map, prefix + "CanEditRoute", this.CanEditRoute);

    }
}

