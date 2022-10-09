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

public class CreateTKEEdgeClusterRequest extends AbstractModel{

    /**
    * k8s版本号
    */
    @SerializedName("K8SVersion")
    @Expose
    private String K8SVersion;

    /**
    * vpc 的Id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群pod cidr
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * 集群service cidr
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * 集群描述信息
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 集群高级设置
    */
    @SerializedName("ClusterAdvancedSettings")
    @Expose
    private EdgeClusterAdvancedSettings ClusterAdvancedSettings;

    /**
    * 节点上最大Pod数量
    */
    @SerializedName("MaxNodePodNum")
    @Expose
    private Long MaxNodePodNum;

    /**
    * 边缘计算集群公网访问LB信息
    */
    @SerializedName("PublicLB")
    @Expose
    private EdgeClusterPublicLB PublicLB;

    /**
    * 集群的级别
    */
    @SerializedName("ClusterLevel")
    @Expose
    private String ClusterLevel;

    /**
    * 集群是否支持自动升配
    */
    @SerializedName("AutoUpgradeClusterLevel")
    @Expose
    private Boolean AutoUpgradeClusterLevel;

    /**
    * 集群计费方式
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 边缘集群版本，此版本区别于k8s版本，是整个集群各组件版本集合
    */
    @SerializedName("EdgeVersion")
    @Expose
    private String EdgeVersion;

    /**
    * 边缘组件镜像仓库前缀
    */
    @SerializedName("RegistryPrefix")
    @Expose
    private String RegistryPrefix;

    /**
     * Get k8s版本号 
     * @return K8SVersion k8s版本号
     */
    public String getK8SVersion() {
        return this.K8SVersion;
    }

    /**
     * Set k8s版本号
     * @param K8SVersion k8s版本号
     */
    public void setK8SVersion(String K8SVersion) {
        this.K8SVersion = K8SVersion;
    }

    /**
     * Get vpc 的Id 
     * @return VpcId vpc 的Id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc 的Id
     * @param VpcId vpc 的Id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
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
     * Get 集群service cidr 
     * @return ServiceCIDR 集群service cidr
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set 集群service cidr
     * @param ServiceCIDR 集群service cidr
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
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
     * Get 集群高级设置 
     * @return ClusterAdvancedSettings 集群高级设置
     */
    public EdgeClusterAdvancedSettings getClusterAdvancedSettings() {
        return this.ClusterAdvancedSettings;
    }

    /**
     * Set 集群高级设置
     * @param ClusterAdvancedSettings 集群高级设置
     */
    public void setClusterAdvancedSettings(EdgeClusterAdvancedSettings ClusterAdvancedSettings) {
        this.ClusterAdvancedSettings = ClusterAdvancedSettings;
    }

    /**
     * Get 节点上最大Pod数量 
     * @return MaxNodePodNum 节点上最大Pod数量
     */
    public Long getMaxNodePodNum() {
        return this.MaxNodePodNum;
    }

    /**
     * Set 节点上最大Pod数量
     * @param MaxNodePodNum 节点上最大Pod数量
     */
    public void setMaxNodePodNum(Long MaxNodePodNum) {
        this.MaxNodePodNum = MaxNodePodNum;
    }

    /**
     * Get 边缘计算集群公网访问LB信息 
     * @return PublicLB 边缘计算集群公网访问LB信息
     */
    public EdgeClusterPublicLB getPublicLB() {
        return this.PublicLB;
    }

    /**
     * Set 边缘计算集群公网访问LB信息
     * @param PublicLB 边缘计算集群公网访问LB信息
     */
    public void setPublicLB(EdgeClusterPublicLB PublicLB) {
        this.PublicLB = PublicLB;
    }

    /**
     * Get 集群的级别 
     * @return ClusterLevel 集群的级别
     */
    public String getClusterLevel() {
        return this.ClusterLevel;
    }

    /**
     * Set 集群的级别
     * @param ClusterLevel 集群的级别
     */
    public void setClusterLevel(String ClusterLevel) {
        this.ClusterLevel = ClusterLevel;
    }

    /**
     * Get 集群是否支持自动升配 
     * @return AutoUpgradeClusterLevel 集群是否支持自动升配
     */
    public Boolean getAutoUpgradeClusterLevel() {
        return this.AutoUpgradeClusterLevel;
    }

    /**
     * Set 集群是否支持自动升配
     * @param AutoUpgradeClusterLevel 集群是否支持自动升配
     */
    public void setAutoUpgradeClusterLevel(Boolean AutoUpgradeClusterLevel) {
        this.AutoUpgradeClusterLevel = AutoUpgradeClusterLevel;
    }

    /**
     * Get 集群计费方式 
     * @return ChargeType 集群计费方式
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 集群计费方式
     * @param ChargeType 集群计费方式
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 边缘集群版本，此版本区别于k8s版本，是整个集群各组件版本集合 
     * @return EdgeVersion 边缘集群版本，此版本区别于k8s版本，是整个集群各组件版本集合
     */
    public String getEdgeVersion() {
        return this.EdgeVersion;
    }

    /**
     * Set 边缘集群版本，此版本区别于k8s版本，是整个集群各组件版本集合
     * @param EdgeVersion 边缘集群版本，此版本区别于k8s版本，是整个集群各组件版本集合
     */
    public void setEdgeVersion(String EdgeVersion) {
        this.EdgeVersion = EdgeVersion;
    }

    /**
     * Get 边缘组件镜像仓库前缀 
     * @return RegistryPrefix 边缘组件镜像仓库前缀
     */
    public String getRegistryPrefix() {
        return this.RegistryPrefix;
    }

    /**
     * Set 边缘组件镜像仓库前缀
     * @param RegistryPrefix 边缘组件镜像仓库前缀
     */
    public void setRegistryPrefix(String RegistryPrefix) {
        this.RegistryPrefix = RegistryPrefix;
    }

    public CreateTKEEdgeClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTKEEdgeClusterRequest(CreateTKEEdgeClusterRequest source) {
        if (source.K8SVersion != null) {
            this.K8SVersion = new String(source.K8SVersion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.ClusterAdvancedSettings != null) {
            this.ClusterAdvancedSettings = new EdgeClusterAdvancedSettings(source.ClusterAdvancedSettings);
        }
        if (source.MaxNodePodNum != null) {
            this.MaxNodePodNum = new Long(source.MaxNodePodNum);
        }
        if (source.PublicLB != null) {
            this.PublicLB = new EdgeClusterPublicLB(source.PublicLB);
        }
        if (source.ClusterLevel != null) {
            this.ClusterLevel = new String(source.ClusterLevel);
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
        if (source.RegistryPrefix != null) {
            this.RegistryPrefix = new String(source.RegistryPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "K8SVersion", this.K8SVersion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamObj(map, prefix + "ClusterAdvancedSettings.", this.ClusterAdvancedSettings);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);
        this.setParamObj(map, prefix + "PublicLB.", this.PublicLB);
        this.setParamSimple(map, prefix + "ClusterLevel", this.ClusterLevel);
        this.setParamSimple(map, prefix + "AutoUpgradeClusterLevel", this.AutoUpgradeClusterLevel);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "EdgeVersion", this.EdgeVersion);
        this.setParamSimple(map, prefix + "RegistryPrefix", this.RegistryPrefix);

    }
}

