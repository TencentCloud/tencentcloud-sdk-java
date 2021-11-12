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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterRequest extends AbstractModel{

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 分配给集群容器和服务IP的CIDR
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 集群备注
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 集群所属TSF地域
    */
    @SerializedName("TsfRegionId")
    @Expose
    private String TsfRegionId;

    /**
    * 集群所属TSF可用区
    */
    @SerializedName("TsfZoneId")
    @Expose
    private String TsfZoneId;

    /**
    * 私有网络子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 集群版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群中每个Node上最大的Pod数量。取值范围4～256。不为2的幂值时会向上取最接近的2的幂值。
    */
    @SerializedName("MaxNodePodNum")
    @Expose
    private Long MaxNodePodNum;

    /**
    * 集群最大的service数量。取值范围32～32768，不为2的幂值时会向上取最接近的2的幂值。
    */
    @SerializedName("MaxClusterServiceNum")
    @Expose
    private Long MaxClusterServiceNum;

    /**
    * 需要绑定的数据集ID
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * api地址
    */
    @SerializedName("KuberneteApiServer")
    @Expose
    private String KuberneteApiServer;

    /**
    * K : kubeconfig, S : service account
    */
    @SerializedName("KuberneteNativeType")
    @Expose
    private String KuberneteNativeType;

    /**
    * native secret
    */
    @SerializedName("KuberneteNativeSecret")
    @Expose
    private String KuberneteNativeSecret;

    /**
    * 无
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

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
     * Get 集群类型 
     * @return ClusterType 集群类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
     * @param ClusterType 集群类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 分配给集群容器和服务IP的CIDR 
     * @return ClusterCIDR 分配给集群容器和服务IP的CIDR
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set 分配给集群容器和服务IP的CIDR
     * @param ClusterCIDR 分配给集群容器和服务IP的CIDR
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get 集群备注 
     * @return ClusterDesc 集群备注
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 集群备注
     * @param ClusterDesc 集群备注
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get 集群所属TSF地域 
     * @return TsfRegionId 集群所属TSF地域
     */
    public String getTsfRegionId() {
        return this.TsfRegionId;
    }

    /**
     * Set 集群所属TSF地域
     * @param TsfRegionId 集群所属TSF地域
     */
    public void setTsfRegionId(String TsfRegionId) {
        this.TsfRegionId = TsfRegionId;
    }

    /**
     * Get 集群所属TSF可用区 
     * @return TsfZoneId 集群所属TSF可用区
     */
    public String getTsfZoneId() {
        return this.TsfZoneId;
    }

    /**
     * Set 集群所属TSF可用区
     * @param TsfZoneId 集群所属TSF可用区
     */
    public void setTsfZoneId(String TsfZoneId) {
        this.TsfZoneId = TsfZoneId;
    }

    /**
     * Get 私有网络子网ID 
     * @return SubnetId 私有网络子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 私有网络子网ID
     * @param SubnetId 私有网络子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 集群版本 
     * @return ClusterVersion 集群版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本
     * @param ClusterVersion 集群版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 集群中每个Node上最大的Pod数量。取值范围4～256。不为2的幂值时会向上取最接近的2的幂值。 
     * @return MaxNodePodNum 集群中每个Node上最大的Pod数量。取值范围4～256。不为2的幂值时会向上取最接近的2的幂值。
     */
    public Long getMaxNodePodNum() {
        return this.MaxNodePodNum;
    }

    /**
     * Set 集群中每个Node上最大的Pod数量。取值范围4～256。不为2的幂值时会向上取最接近的2的幂值。
     * @param MaxNodePodNum 集群中每个Node上最大的Pod数量。取值范围4～256。不为2的幂值时会向上取最接近的2的幂值。
     */
    public void setMaxNodePodNum(Long MaxNodePodNum) {
        this.MaxNodePodNum = MaxNodePodNum;
    }

    /**
     * Get 集群最大的service数量。取值范围32～32768，不为2的幂值时会向上取最接近的2的幂值。 
     * @return MaxClusterServiceNum 集群最大的service数量。取值范围32～32768，不为2的幂值时会向上取最接近的2的幂值。
     */
    public Long getMaxClusterServiceNum() {
        return this.MaxClusterServiceNum;
    }

    /**
     * Set 集群最大的service数量。取值范围32～32768，不为2的幂值时会向上取最接近的2的幂值。
     * @param MaxClusterServiceNum 集群最大的service数量。取值范围32～32768，不为2的幂值时会向上取最接近的2的幂值。
     */
    public void setMaxClusterServiceNum(Long MaxClusterServiceNum) {
        this.MaxClusterServiceNum = MaxClusterServiceNum;
    }

    /**
     * Get 需要绑定的数据集ID 
     * @return ProgramId 需要绑定的数据集ID
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set 需要绑定的数据集ID
     * @param ProgramId 需要绑定的数据集ID
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get api地址 
     * @return KuberneteApiServer api地址
     */
    public String getKuberneteApiServer() {
        return this.KuberneteApiServer;
    }

    /**
     * Set api地址
     * @param KuberneteApiServer api地址
     */
    public void setKuberneteApiServer(String KuberneteApiServer) {
        this.KuberneteApiServer = KuberneteApiServer;
    }

    /**
     * Get K : kubeconfig, S : service account 
     * @return KuberneteNativeType K : kubeconfig, S : service account
     */
    public String getKuberneteNativeType() {
        return this.KuberneteNativeType;
    }

    /**
     * Set K : kubeconfig, S : service account
     * @param KuberneteNativeType K : kubeconfig, S : service account
     */
    public void setKuberneteNativeType(String KuberneteNativeType) {
        this.KuberneteNativeType = KuberneteNativeType;
    }

    /**
     * Get native secret 
     * @return KuberneteNativeSecret native secret
     */
    public String getKuberneteNativeSecret() {
        return this.KuberneteNativeSecret;
    }

    /**
     * Set native secret
     * @param KuberneteNativeSecret native secret
     */
    public void setKuberneteNativeSecret(String KuberneteNativeSecret) {
        this.KuberneteNativeSecret = KuberneteNativeSecret;
    }

    /**
     * Get 无 
     * @return ProgramIdList 无
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set 无
     * @param ProgramIdList 无
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    public CreateClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterRequest(CreateClusterRequest source) {
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ClusterCIDR != null) {
            this.ClusterCIDR = new String(source.ClusterCIDR);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.TsfRegionId != null) {
            this.TsfRegionId = new String(source.TsfRegionId);
        }
        if (source.TsfZoneId != null) {
            this.TsfZoneId = new String(source.TsfZoneId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.MaxNodePodNum != null) {
            this.MaxNodePodNum = new Long(source.MaxNodePodNum);
        }
        if (source.MaxClusterServiceNum != null) {
            this.MaxClusterServiceNum = new Long(source.MaxClusterServiceNum);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.KuberneteApiServer != null) {
            this.KuberneteApiServer = new String(source.KuberneteApiServer);
        }
        if (source.KuberneteNativeType != null) {
            this.KuberneteNativeType = new String(source.KuberneteNativeType);
        }
        if (source.KuberneteNativeSecret != null) {
            this.KuberneteNativeSecret = new String(source.KuberneteNativeSecret);
        }
        if (source.ProgramIdList != null) {
            this.ProgramIdList = new String[source.ProgramIdList.length];
            for (int i = 0; i < source.ProgramIdList.length; i++) {
                this.ProgramIdList[i] = new String(source.ProgramIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "TsfRegionId", this.TsfRegionId);
        this.setParamSimple(map, prefix + "TsfZoneId", this.TsfZoneId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);
        this.setParamSimple(map, prefix + "MaxClusterServiceNum", this.MaxClusterServiceNum);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamSimple(map, prefix + "KuberneteApiServer", this.KuberneteApiServer);
        this.setParamSimple(map, prefix + "KuberneteNativeType", this.KuberneteNativeType);
        this.setParamSimple(map, prefix + "KuberneteNativeSecret", this.KuberneteNativeSecret);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);

    }
}

