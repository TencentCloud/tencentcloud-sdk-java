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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeCloudCluster extends AbstractModel{

    /**
    * IECP侧边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EdgeId")
    @Expose
    private Long EdgeId;

    /**
    * 边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
    * 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * pod cidr
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * service cidr
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * 边缘版本类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EdgeClusterVersion")
    @Expose
    private String EdgeClusterVersion;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UID")
    @Expose
    private String UID;

    /**
     * Get IECP侧边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EdgeId IECP侧边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEdgeId() {
        return this.EdgeId;
    }

    /**
     * Set IECP侧边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EdgeId IECP侧边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdgeId(Long EdgeId) {
        this.EdgeId = EdgeId;
    }

    /**
     * Get 边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 边缘集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K8SVersion 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getK8SVersion() {
        return this.K8SVersion;
    }

    /**
     * Set 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param K8SVersion 集群版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK8SVersion(String K8SVersion) {
        this.K8SVersion = K8SVersion;
    }

    /**
     * Get 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterDesc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterDesc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get 集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get pod cidr
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodCIDR pod cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodCIDR() {
        return this.PodCIDR;
    }

    /**
     * Set pod cidr
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodCIDR pod cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodCIDR(String PodCIDR) {
        this.PodCIDR = PodCIDR;
    }

    /**
     * Get service cidr
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCIDR service cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set service cidr
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCIDR service cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    /**
     * Get 边缘版本类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EdgeClusterVersion 边缘版本类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEdgeClusterVersion() {
        return this.EdgeClusterVersion;
    }

    /**
     * Set 边缘版本类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EdgeClusterVersion 边缘版本类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdgeClusterVersion(String EdgeClusterVersion) {
        this.EdgeClusterVersion = EdgeClusterVersion;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UID 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUID() {
        return this.UID;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UID 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUID(String UID) {
        this.UID = UID;
    }

    public EdgeCloudCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeCloudCluster(EdgeCloudCluster source) {
        if (source.EdgeId != null) {
            this.EdgeId = new Long(source.EdgeId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
        if (source.EdgeClusterVersion != null) {
            this.EdgeClusterVersion = new String(source.EdgeClusterVersion);
        }
        if (source.UID != null) {
            this.UID = new String(source.UID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeId", this.EdgeId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamSimple(map, prefix + "EdgeClusterVersion", this.EdgeClusterVersion);
        this.setParamSimple(map, prefix + "UID", this.UID);

    }
}

