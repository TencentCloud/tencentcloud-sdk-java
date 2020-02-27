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

public class ClusterCIDRSettings extends AbstractModel{

    /**
    * 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 是否忽略 ClusterCIDR 冲突错误, 默认不忽略
    */
    @SerializedName("IgnoreClusterCIDRConflict")
    @Expose
    private Boolean IgnoreClusterCIDRConflict;

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
    * 用于分配集群服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * VPC-CNI网络模式下，弹性网卡的子网Id。
    */
    @SerializedName("EniSubnetIds")
    @Expose
    private String [] EniSubnetIds;

    /**
    * VPC-CNI网络模式下，弹性网卡IP的回收时间，取值范围[300,15768000)
    */
    @SerializedName("ClaimExpiredSeconds")
    @Expose
    private Long ClaimExpiredSeconds;

    /**
     * Get 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。 
     * @return ClusterCIDR 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     * @param ClusterCIDR 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get 是否忽略 ClusterCIDR 冲突错误, 默认不忽略 
     * @return IgnoreClusterCIDRConflict 是否忽略 ClusterCIDR 冲突错误, 默认不忽略
     */
    public Boolean getIgnoreClusterCIDRConflict() {
        return this.IgnoreClusterCIDRConflict;
    }

    /**
     * Set 是否忽略 ClusterCIDR 冲突错误, 默认不忽略
     * @param IgnoreClusterCIDRConflict 是否忽略 ClusterCIDR 冲突错误, 默认不忽略
     */
    public void setIgnoreClusterCIDRConflict(Boolean IgnoreClusterCIDRConflict) {
        this.IgnoreClusterCIDRConflict = IgnoreClusterCIDRConflict;
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
     * Get 用于分配集群服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。 
     * @return ServiceCIDR 用于分配集群服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set 用于分配集群服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     * @param ServiceCIDR 用于分配集群服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突。且网段范围必须在内网网段内，例如:10.1.0.0/14, 192.168.0.1/18,172.16.0.0/16。
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    /**
     * Get VPC-CNI网络模式下，弹性网卡的子网Id。 
     * @return EniSubnetIds VPC-CNI网络模式下，弹性网卡的子网Id。
     */
    public String [] getEniSubnetIds() {
        return this.EniSubnetIds;
    }

    /**
     * Set VPC-CNI网络模式下，弹性网卡的子网Id。
     * @param EniSubnetIds VPC-CNI网络模式下，弹性网卡的子网Id。
     */
    public void setEniSubnetIds(String [] EniSubnetIds) {
        this.EniSubnetIds = EniSubnetIds;
    }

    /**
     * Get VPC-CNI网络模式下，弹性网卡IP的回收时间，取值范围[300,15768000) 
     * @return ClaimExpiredSeconds VPC-CNI网络模式下，弹性网卡IP的回收时间，取值范围[300,15768000)
     */
    public Long getClaimExpiredSeconds() {
        return this.ClaimExpiredSeconds;
    }

    /**
     * Set VPC-CNI网络模式下，弹性网卡IP的回收时间，取值范围[300,15768000)
     * @param ClaimExpiredSeconds VPC-CNI网络模式下，弹性网卡IP的回收时间，取值范围[300,15768000)
     */
    public void setClaimExpiredSeconds(Long ClaimExpiredSeconds) {
        this.ClaimExpiredSeconds = ClaimExpiredSeconds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "IgnoreClusterCIDRConflict", this.IgnoreClusterCIDRConflict);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);
        this.setParamSimple(map, prefix + "MaxClusterServiceNum", this.MaxClusterServiceNum);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamArraySimple(map, prefix + "EniSubnetIds.", this.EniSubnetIds);
        this.setParamSimple(map, prefix + "ClaimExpiredSeconds", this.ClaimExpiredSeconds);

    }
}

