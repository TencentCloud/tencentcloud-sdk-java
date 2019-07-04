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

public class Cluster  extends AbstractModel{

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 集群所属私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * 集群CIDR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 集群总CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterTotalCpu")
    @Expose
    private Float ClusterTotalCpu;

    /**
    * 集群总内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterTotalMem")
    @Expose
    private Float ClusterTotalMem;

    /**
    * 集群已使用CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterUsedCpu")
    @Expose
    private Float ClusterUsedCpu;

    /**
    * 集群已使用内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterUsedMem")
    @Expose
    private Float ClusterUsedMem;

    /**
    * 集群机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 集群可用的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * 集群正常状态的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NormalInstanceCount")
    @Expose
    private Long NormalInstanceCount;

    /**
    * 删除标记：true：可以删除；false：不可删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 集群所属TSF地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TsfRegionId")
    @Expose
    private String TsfRegionId;

    /**
    * 集群所属TSF地域名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TsfRegionName")
    @Expose
    private String TsfRegionName;

    /**
    * 集群所属TSF可用区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TsfZoneId")
    @Expose
    private String TsfZoneId;

    /**
    * 集群所属TSF可用区名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TsfZoneName")
    @Expose
    private String TsfZoneName;

    /**
    * 集群不可删除的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteFlagReason")
    @Expose
    private String DeleteFlagReason;

    /**
    * 集群最大CPU限制，单位：核
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterLimitCpu")
    @Expose
    private Float ClusterLimitCpu;

    /**
    * 集群最大内存限制，单位：G
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterLimitMem")
    @Expose
    private Float ClusterLimitMem;

    /**
    * 集群可用的服务实例数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunServiceInstanceCount")
    @Expose
    private Long RunServiceInstanceCount;

    /**
     * 获取集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * 设置集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * 获取集群描述
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterDesc 集群描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * 设置集群描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterDesc 集群描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * 获取集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * 设置集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * 获取集群所属私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return VpcId 集群所属私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置集群所属私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 集群所属私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterStatus 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * 设置集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterStatus 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * 获取集群CIDR
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterCIDR 集群CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * 设置集群CIDR
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterCIDR 集群CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * 获取集群总CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterTotalCpu 集群总CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getClusterTotalCpu() {
        return this.ClusterTotalCpu;
    }

    /**
     * 设置集群总CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterTotalCpu 集群总CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterTotalCpu(Float ClusterTotalCpu) {
        this.ClusterTotalCpu = ClusterTotalCpu;
    }

    /**
     * 获取集群总内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterTotalMem 集群总内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getClusterTotalMem() {
        return this.ClusterTotalMem;
    }

    /**
     * 设置集群总内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterTotalMem 集群总内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterTotalMem(Float ClusterTotalMem) {
        this.ClusterTotalMem = ClusterTotalMem;
    }

    /**
     * 获取集群已使用CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterUsedCpu 集群已使用CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getClusterUsedCpu() {
        return this.ClusterUsedCpu;
    }

    /**
     * 设置集群已使用CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterUsedCpu 集群已使用CPU，单位: 核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterUsedCpu(Float ClusterUsedCpu) {
        this.ClusterUsedCpu = ClusterUsedCpu;
    }

    /**
     * 获取集群已使用内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterUsedMem 集群已使用内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getClusterUsedMem() {
        return this.ClusterUsedMem;
    }

    /**
     * 设置集群已使用内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterUsedMem 集群已使用内存，单位: G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterUsedMem(Float ClusterUsedMem) {
        this.ClusterUsedMem = ClusterUsedMem;
    }

    /**
     * 获取集群机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceCount 集群机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * 设置集群机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount 集群机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * 获取集群可用的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return RunInstanceCount 集群可用的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * 设置集群可用的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunInstanceCount 集群可用的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * 获取集群正常状态的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return NormalInstanceCount 集群正常状态的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNormalInstanceCount() {
        return this.NormalInstanceCount;
    }

    /**
     * 设置集群正常状态的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param NormalInstanceCount 集群正常状态的机器实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNormalInstanceCount(Long NormalInstanceCount) {
        this.NormalInstanceCount = NormalInstanceCount;
    }

    /**
     * 获取删除标记：true：可以删除；false：不可删除
注意：此字段可能返回 null，表示取不到有效值。
     * @return DeleteFlag 删除标记：true：可以删除；false：不可删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * 设置删除标记：true：可以删除；false：不可删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteFlag 删除标记：true：可以删除；false：不可删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * 获取创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取集群所属TSF地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return TsfRegionId 集群所属TSF地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTsfRegionId() {
        return this.TsfRegionId;
    }

    /**
     * 设置集群所属TSF地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TsfRegionId 集群所属TSF地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTsfRegionId(String TsfRegionId) {
        this.TsfRegionId = TsfRegionId;
    }

    /**
     * 获取集群所属TSF地域名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return TsfRegionName 集群所属TSF地域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTsfRegionName() {
        return this.TsfRegionName;
    }

    /**
     * 设置集群所属TSF地域名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TsfRegionName 集群所属TSF地域名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTsfRegionName(String TsfRegionName) {
        this.TsfRegionName = TsfRegionName;
    }

    /**
     * 获取集群所属TSF可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return TsfZoneId 集群所属TSF可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTsfZoneId() {
        return this.TsfZoneId;
    }

    /**
     * 设置集群所属TSF可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TsfZoneId 集群所属TSF可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTsfZoneId(String TsfZoneId) {
        this.TsfZoneId = TsfZoneId;
    }

    /**
     * 获取集群所属TSF可用区名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return TsfZoneName 集群所属TSF可用区名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTsfZoneName() {
        return this.TsfZoneName;
    }

    /**
     * 设置集群所属TSF可用区名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TsfZoneName 集群所属TSF可用区名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTsfZoneName(String TsfZoneName) {
        this.TsfZoneName = TsfZoneName;
    }

    /**
     * 获取集群不可删除的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @return DeleteFlagReason 集群不可删除的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeleteFlagReason() {
        return this.DeleteFlagReason;
    }

    /**
     * 设置集群不可删除的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteFlagReason 集群不可删除的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteFlagReason(String DeleteFlagReason) {
        this.DeleteFlagReason = DeleteFlagReason;
    }

    /**
     * 获取集群最大CPU限制，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterLimitCpu 集群最大CPU限制，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getClusterLimitCpu() {
        return this.ClusterLimitCpu;
    }

    /**
     * 设置集群最大CPU限制，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterLimitCpu 集群最大CPU限制，单位：核
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterLimitCpu(Float ClusterLimitCpu) {
        this.ClusterLimitCpu = ClusterLimitCpu;
    }

    /**
     * 获取集群最大内存限制，单位：G
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterLimitMem 集群最大内存限制，单位：G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getClusterLimitMem() {
        return this.ClusterLimitMem;
    }

    /**
     * 设置集群最大内存限制，单位：G
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterLimitMem 集群最大内存限制，单位：G
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterLimitMem(Float ClusterLimitMem) {
        this.ClusterLimitMem = ClusterLimitMem;
    }

    /**
     * 获取集群可用的服务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return RunServiceInstanceCount 集群可用的服务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunServiceInstanceCount() {
        return this.RunServiceInstanceCount;
    }

    /**
     * 设置集群可用的服务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunServiceInstanceCount 集群可用的服务实例数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunServiceInstanceCount(Long RunServiceInstanceCount) {
        this.RunServiceInstanceCount = RunServiceInstanceCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "ClusterTotalCpu", this.ClusterTotalCpu);
        this.setParamSimple(map, prefix + "ClusterTotalMem", this.ClusterTotalMem);
        this.setParamSimple(map, prefix + "ClusterUsedCpu", this.ClusterUsedCpu);
        this.setParamSimple(map, prefix + "ClusterUsedMem", this.ClusterUsedMem);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RunInstanceCount", this.RunInstanceCount);
        this.setParamSimple(map, prefix + "NormalInstanceCount", this.NormalInstanceCount);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TsfRegionId", this.TsfRegionId);
        this.setParamSimple(map, prefix + "TsfRegionName", this.TsfRegionName);
        this.setParamSimple(map, prefix + "TsfZoneId", this.TsfZoneId);
        this.setParamSimple(map, prefix + "TsfZoneName", this.TsfZoneName);
        this.setParamSimple(map, prefix + "DeleteFlagReason", this.DeleteFlagReason);
        this.setParamSimple(map, prefix + "ClusterLimitCpu", this.ClusterLimitCpu);
        this.setParamSimple(map, prefix + "ClusterLimitMem", this.ClusterLimitMem);
        this.setParamSimple(map, prefix + "RunServiceInstanceCount", this.RunServiceInstanceCount);

    }
}

