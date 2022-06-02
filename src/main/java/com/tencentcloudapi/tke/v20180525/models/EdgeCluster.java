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

public class EdgeCluster extends AbstractModel{

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
    * 集群pod cidr
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * 集群 service cidr
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * k8s 版本号
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
    * 集群状态
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
    * 边缘集群版本
    */
    @SerializedName("EdgeClusterVersion")
    @Expose
    private String EdgeClusterVersion;

    /**
    * 节点最大Pod数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxNodePodNum")
    @Expose
    private Long MaxNodePodNum;

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
     * Get 集群pod cidr 
     * @return PodCIDR 集群pod cidr
     */
    public String getPodCIDR() {
        return this.PodCIDR;
    }

    /**
     * Set 集群pod cidr
     * @param PodCIDR 集群pod cidr
     */
    public void setPodCIDR(String PodCIDR) {
        this.PodCIDR = PodCIDR;
    }

    /**
     * Get 集群 service cidr 
     * @return ServiceCIDR 集群 service cidr
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set 集群 service cidr
     * @param ServiceCIDR 集群 service cidr
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
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
     * Get 集群状态 
     * @return Status 集群状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态
     * @param Status 集群状态
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
     * Get 边缘集群版本 
     * @return EdgeClusterVersion 边缘集群版本
     */
    public String getEdgeClusterVersion() {
        return this.EdgeClusterVersion;
    }

    /**
     * Set 边缘集群版本
     * @param EdgeClusterVersion 边缘集群版本
     */
    public void setEdgeClusterVersion(String EdgeClusterVersion) {
        this.EdgeClusterVersion = EdgeClusterVersion;
    }

    /**
     * Get 节点最大Pod数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxNodePodNum 节点最大Pod数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxNodePodNum() {
        return this.MaxNodePodNum;
    }

    /**
     * Set 节点最大Pod数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxNodePodNum 节点最大Pod数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxNodePodNum(Long MaxNodePodNum) {
        this.MaxNodePodNum = MaxNodePodNum;
    }

    public EdgeCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeCluster(EdgeCluster source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
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
        if (source.EdgeClusterVersion != null) {
            this.EdgeClusterVersion = new String(source.EdgeClusterVersion);
        }
        if (source.MaxNodePodNum != null) {
            this.MaxNodePodNum = new Long(source.MaxNodePodNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "EdgeClusterVersion", this.EdgeClusterVersion);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);

    }
}

