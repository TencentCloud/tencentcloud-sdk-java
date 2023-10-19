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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceRegionInfo extends AbstractModel {

    /**
    * 引擎部署地域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * 引擎在该地域的副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replica")
    @Expose
    private Long Replica;

    /**
    * 引擎在该地域的规格id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * 客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntranetVpcInfos")
    @Expose
    private VpcInfo [] IntranetVpcInfos;

    /**
    * 控制台内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConsoleIntranetVpcInfos")
    @Expose
    private VpcInfo [] ConsoleIntranetVpcInfos;

    /**
    * 是否开公网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableClientInternet")
    @Expose
    private Boolean EnableClientInternet;

    /**
    * 限流客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimiterIntranetVpcInfos")
    @Expose
    private VpcInfo [] LimiterIntranetVpcInfos;

    /**
    * 是否为主地域，仅在服务治理中心多地域有效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainRegion")
    @Expose
    private Boolean MainRegion;

    /**
    * 该地域所在的EKS集群
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EKSClusterID")
    @Expose
    private String EKSClusterID;

    /**
     * Get 引擎部署地域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineRegion 引擎部署地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 引擎部署地域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineRegion 引擎部署地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get 引擎在该地域的副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Replica 引擎在该地域的副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplica() {
        return this.Replica;
    }

    /**
     * Set 引擎在该地域的副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replica 引擎在该地域的副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplica(Long Replica) {
        this.Replica = Replica;
    }

    /**
     * Get 引擎在该地域的规格id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecId 引擎在该地域的规格id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set 引擎在该地域的规格id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecId 引擎在该地域的规格id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get 客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntranetVpcInfos 客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcInfo [] getIntranetVpcInfos() {
        return this.IntranetVpcInfos;
    }

    /**
     * Set 客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntranetVpcInfos 客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntranetVpcInfos(VpcInfo [] IntranetVpcInfos) {
        this.IntranetVpcInfos = IntranetVpcInfos;
    }

    /**
     * Get 控制台内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConsoleIntranetVpcInfos 控制台内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcInfo [] getConsoleIntranetVpcInfos() {
        return this.ConsoleIntranetVpcInfos;
    }

    /**
     * Set 控制台内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConsoleIntranetVpcInfos 控制台内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConsoleIntranetVpcInfos(VpcInfo [] ConsoleIntranetVpcInfos) {
        this.ConsoleIntranetVpcInfos = ConsoleIntranetVpcInfos;
    }

    /**
     * Get 是否开公网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableClientInternet 是否开公网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableClientInternet() {
        return this.EnableClientInternet;
    }

    /**
     * Set 是否开公网
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableClientInternet 是否开公网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableClientInternet(Boolean EnableClientInternet) {
        this.EnableClientInternet = EnableClientInternet;
    }

    /**
     * Get 限流客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimiterIntranetVpcInfos 限流客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcInfo [] getLimiterIntranetVpcInfos() {
        return this.LimiterIntranetVpcInfos;
    }

    /**
     * Set 限流客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimiterIntranetVpcInfos 限流客户端内网的网络信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimiterIntranetVpcInfos(VpcInfo [] LimiterIntranetVpcInfos) {
        this.LimiterIntranetVpcInfos = LimiterIntranetVpcInfos;
    }

    /**
     * Get 是否为主地域，仅在服务治理中心多地域有效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainRegion 是否为主地域，仅在服务治理中心多地域有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMainRegion() {
        return this.MainRegion;
    }

    /**
     * Set 是否为主地域，仅在服务治理中心多地域有效
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainRegion 是否为主地域，仅在服务治理中心多地域有效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainRegion(Boolean MainRegion) {
        this.MainRegion = MainRegion;
    }

    /**
     * Get 该地域所在的EKS集群
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EKSClusterID 该地域所在的EKS集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEKSClusterID() {
        return this.EKSClusterID;
    }

    /**
     * Set 该地域所在的EKS集群
注意：此字段可能返回 null，表示取不到有效值。
     * @param EKSClusterID 该地域所在的EKS集群
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEKSClusterID(String EKSClusterID) {
        this.EKSClusterID = EKSClusterID;
    }

    public DescribeInstanceRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceRegionInfo(DescribeInstanceRegionInfo source) {
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.Replica != null) {
            this.Replica = new Long(source.Replica);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.IntranetVpcInfos != null) {
            this.IntranetVpcInfos = new VpcInfo[source.IntranetVpcInfos.length];
            for (int i = 0; i < source.IntranetVpcInfos.length; i++) {
                this.IntranetVpcInfos[i] = new VpcInfo(source.IntranetVpcInfos[i]);
            }
        }
        if (source.ConsoleIntranetVpcInfos != null) {
            this.ConsoleIntranetVpcInfos = new VpcInfo[source.ConsoleIntranetVpcInfos.length];
            for (int i = 0; i < source.ConsoleIntranetVpcInfos.length; i++) {
                this.ConsoleIntranetVpcInfos[i] = new VpcInfo(source.ConsoleIntranetVpcInfos[i]);
            }
        }
        if (source.EnableClientInternet != null) {
            this.EnableClientInternet = new Boolean(source.EnableClientInternet);
        }
        if (source.LimiterIntranetVpcInfos != null) {
            this.LimiterIntranetVpcInfos = new VpcInfo[source.LimiterIntranetVpcInfos.length];
            for (int i = 0; i < source.LimiterIntranetVpcInfos.length; i++) {
                this.LimiterIntranetVpcInfos[i] = new VpcInfo(source.LimiterIntranetVpcInfos[i]);
            }
        }
        if (source.MainRegion != null) {
            this.MainRegion = new Boolean(source.MainRegion);
        }
        if (source.EKSClusterID != null) {
            this.EKSClusterID = new String(source.EKSClusterID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamArrayObj(map, prefix + "IntranetVpcInfos.", this.IntranetVpcInfos);
        this.setParamArrayObj(map, prefix + "ConsoleIntranetVpcInfos.", this.ConsoleIntranetVpcInfos);
        this.setParamSimple(map, prefix + "EnableClientInternet", this.EnableClientInternet);
        this.setParamArrayObj(map, prefix + "LimiterIntranetVpcInfos.", this.LimiterIntranetVpcInfos);
        this.setParamSimple(map, prefix + "MainRegion", this.MainRegion);
        this.setParamSimple(map, prefix + "EKSClusterID", this.EKSClusterID);

    }
}

