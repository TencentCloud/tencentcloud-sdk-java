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
    * 集群高级设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterAdvancedSettings")
    @Expose
    private EdgeClusterAdvancedSettings ClusterAdvancedSettings;

    /**
    * 边缘容器集群级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 是否支持自动提升集群配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private Boolean AutoUpgradeClusterLevel;

    /**
    * 集群付费模式，支持POSTPAID_BY_HOUR或者PREPAID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 边缘集群组件的版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EdgeVersion")
    @Expose
    private String EdgeVersion;

    /**
    * 集群绑定的云标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSpecification")
    @Expose
    private TagSpecification TagSpecification;

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

    /**
     * Get 集群高级设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterAdvancedSettings 集群高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeClusterAdvancedSettings getClusterAdvancedSettings() {
        return this.ClusterAdvancedSettings;
    }

    /**
     * Set 集群高级设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterAdvancedSettings 集群高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterAdvancedSettings(EdgeClusterAdvancedSettings ClusterAdvancedSettings) {
        this.ClusterAdvancedSettings = ClusterAdvancedSettings;
    }

    /**
     * Get 边缘容器集群级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 边缘容器集群级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 边缘容器集群级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 边缘容器集群级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 是否支持自动提升集群配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoUpgradeClusterLevel 是否支持自动提升集群配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set 是否支持自动提升集群配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoUpgradeClusterLevel 是否支持自动提升集群配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoUpgradeClusterLevel(Boolean AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get 集群付费模式，支持POSTPAID_BY_HOUR或者PREPAID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 集群付费模式，支持POSTPAID_BY_HOUR或者PREPAID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 集群付费模式，支持POSTPAID_BY_HOUR或者PREPAID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 集群付费模式，支持POSTPAID_BY_HOUR或者PREPAID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 边缘集群组件的版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EdgeVersion 边缘集群组件的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEdgeVersion() {
        return this.EdgeVersion;
    }

    /**
     * Set 边缘集群组件的版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param EdgeVersion 边缘集群组件的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEdgeVersion(String EdgeVersion) {
        this.EdgeVersion = EdgeVersion;
    }

    /**
     * Get 集群绑定的云标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSpecification 集群绑定的云标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagSpecification getTagSpecification() {
        return this.TagSpecification;
    }

    /**
     * Set 集群绑定的云标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSpecification 集群绑定的云标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSpecification(TagSpecification TagSpecification) {
        this.TagSpecification = TagSpecification;
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
        if (source.ClusterAdvancedSettings != null) {
            this.ClusterAdvancedSettings = new EdgeClusterAdvancedSettings(source.ClusterAdvancedSettings);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.AutoUpgradeClusterLevel != null) {
            this.AutoUpgradeClusterLevel = new Boolean(source.AutoUpgradeClusterLevel);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.EdgeVersion != null) {
            this.EdgeVersion = new String(source.EdgeVersion);
        }
        if (source.TagSpecification != null) {
            this.TagSpecification = new TagSpecification(source.TagSpecification);
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
        this.setParamObj(map, prefix + "ClusterAdvancedSettings.", this.ClusterAdvancedSettings);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "AutoUpgradeClusterLevel", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "EdgeVersion", this.EdgeVersion);
        this.setParamObj(map, prefix + "TagSpecification.", this.TagSpecification);

    }
}

