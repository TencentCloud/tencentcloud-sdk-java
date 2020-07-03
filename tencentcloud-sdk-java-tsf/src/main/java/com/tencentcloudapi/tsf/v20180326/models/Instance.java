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

public class Instance extends AbstractModel{

    /**
    * 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 机器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 机器内网地址IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 机器外网地址IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 机器描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceDesc")
    @Expose
    private String InstanceDesc;

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
    * VM的状态 虚机：虚机的状态 容器：Pod所在虚机的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * VM的可使用状态 虚机：虚机是否能够作为资源使用 容器：虚机是否能够作为资源部署POD
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAvailableStatus")
    @Expose
    private String InstanceAvailableStatus;

    /**
    * 服务下的服务实例的状态 虚机：应用是否可用 + Agent状态 容器：Pod状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceInstanceStatus")
    @Expose
    private String ServiceInstanceStatus;

    /**
    * 标识此instance是否已添加在tsf中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CountInTsf")
    @Expose
    private Long CountInTsf;

    /**
    * 机器所属部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 机器所属应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 机器所属应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 机器实例在CVM的创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCreatedTime")
    @Expose
    private String InstanceCreatedTime;

    /**
    * 机器实例在CVM的过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceExpiredTime")
    @Expose
    private String InstanceExpiredTime;

    /**
    * 机器实例在CVM的计费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 机器实例总CPU信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTotalCpu")
    @Expose
    private Float InstanceTotalCpu;

    /**
    * 机器实例总内存信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTotalMem")
    @Expose
    private Float InstanceTotalMem;

    /**
    * 机器实例使用的CPU信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceUsedCpu")
    @Expose
    private Float InstanceUsedCpu;

    /**
    * 机器实例使用的内存信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceUsedMem")
    @Expose
    private Float InstanceUsedMem;

    /**
    * 机器实例Limit CPU信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceLimitCpu")
    @Expose
    private Float InstanceLimitCpu;

    /**
    * 机器实例Limit 内存信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceLimitMem")
    @Expose
    private Float InstanceLimitMem;

    /**
    * 包版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstancePkgVersion")
    @Expose
    private String InstancePkgVersion;

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 机器实例业务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestrictState")
    @Expose
    private String RestrictState;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 实例执行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperationState")
    @Expose
    private Long OperationState;

    /**
    * NamespaceId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * InstanceZoneId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceZoneId")
    @Expose
    private String InstanceZoneId;

    /**
    * InstanceImportMode
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceImportMode")
    @Expose
    private String InstanceImportMode;

    /**
    * ApplicationType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationResourceType")
    @Expose
    private String ApplicationResourceType;

    /**
    * ServiceSidecarStatus
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceSidecarStatus")
    @Expose
    private String ServiceSidecarStatus;

    /**
    * GroupName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * NamespaceName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
     * Get 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 机器实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 机器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 机器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 机器内网地址IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LanIp 机器内网地址IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 机器内网地址IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanIp 机器内网地址IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get 机器外网地址IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIp 机器外网地址IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 机器外网地址IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIp 机器外网地址IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 机器描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceDesc 机器描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceDesc() {
        return this.InstanceDesc;
    }

    /**
     * Set 机器描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceDesc 机器描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceDesc(String InstanceDesc) {
        this.InstanceDesc = InstanceDesc;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * Get VM的状态 虚机：虚机的状态 容器：Pod所在虚机的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus VM的状态 虚机：虚机的状态 容器：Pod所在虚机的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set VM的状态 虚机：虚机的状态 容器：Pod所在虚机的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus VM的状态 虚机：虚机的状态 容器：Pod所在虚机的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get VM的可使用状态 虚机：虚机是否能够作为资源使用 容器：虚机是否能够作为资源部署POD
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceAvailableStatus VM的可使用状态 虚机：虚机是否能够作为资源使用 容器：虚机是否能够作为资源部署POD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceAvailableStatus() {
        return this.InstanceAvailableStatus;
    }

    /**
     * Set VM的可使用状态 虚机：虚机是否能够作为资源使用 容器：虚机是否能够作为资源部署POD
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAvailableStatus VM的可使用状态 虚机：虚机是否能够作为资源使用 容器：虚机是否能够作为资源部署POD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAvailableStatus(String InstanceAvailableStatus) {
        this.InstanceAvailableStatus = InstanceAvailableStatus;
    }

    /**
     * Get 服务下的服务实例的状态 虚机：应用是否可用 + Agent状态 容器：Pod状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceInstanceStatus 服务下的服务实例的状态 虚机：应用是否可用 + Agent状态 容器：Pod状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceInstanceStatus() {
        return this.ServiceInstanceStatus;
    }

    /**
     * Set 服务下的服务实例的状态 虚机：应用是否可用 + Agent状态 容器：Pod状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceInstanceStatus 服务下的服务实例的状态 虚机：应用是否可用 + Agent状态 容器：Pod状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceInstanceStatus(String ServiceInstanceStatus) {
        this.ServiceInstanceStatus = ServiceInstanceStatus;
    }

    /**
     * Get 标识此instance是否已添加在tsf中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CountInTsf 标识此instance是否已添加在tsf中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCountInTsf() {
        return this.CountInTsf;
    }

    /**
     * Set 标识此instance是否已添加在tsf中
注意：此字段可能返回 null，表示取不到有效值。
     * @param CountInTsf 标识此instance是否已添加在tsf中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountInTsf(Long CountInTsf) {
        this.CountInTsf = CountInTsf;
    }

    /**
     * Get 机器所属部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 机器所属部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 机器所属部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 机器所属部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 机器所属应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 机器所属应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 机器所属应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 机器所属应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 机器所属应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 机器所属应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 机器所属应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 机器所属应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 机器实例在CVM的创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCreatedTime 机器实例在CVM的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceCreatedTime() {
        return this.InstanceCreatedTime;
    }

    /**
     * Set 机器实例在CVM的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCreatedTime 机器实例在CVM的创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCreatedTime(String InstanceCreatedTime) {
        this.InstanceCreatedTime = InstanceCreatedTime;
    }

    /**
     * Get 机器实例在CVM的过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceExpiredTime 机器实例在CVM的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceExpiredTime() {
        return this.InstanceExpiredTime;
    }

    /**
     * Set 机器实例在CVM的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceExpiredTime 机器实例在CVM的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceExpiredTime(String InstanceExpiredTime) {
        this.InstanceExpiredTime = InstanceExpiredTime;
    }

    /**
     * Get 机器实例在CVM的计费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargeType 机器实例在CVM的计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 机器实例在CVM的计费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargeType 机器实例在CVM的计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 机器实例总CPU信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTotalCpu 机器实例总CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInstanceTotalCpu() {
        return this.InstanceTotalCpu;
    }

    /**
     * Set 机器实例总CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTotalCpu 机器实例总CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTotalCpu(Float InstanceTotalCpu) {
        this.InstanceTotalCpu = InstanceTotalCpu;
    }

    /**
     * Get 机器实例总内存信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTotalMem 机器实例总内存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInstanceTotalMem() {
        return this.InstanceTotalMem;
    }

    /**
     * Set 机器实例总内存信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTotalMem 机器实例总内存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTotalMem(Float InstanceTotalMem) {
        this.InstanceTotalMem = InstanceTotalMem;
    }

    /**
     * Get 机器实例使用的CPU信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceUsedCpu 机器实例使用的CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInstanceUsedCpu() {
        return this.InstanceUsedCpu;
    }

    /**
     * Set 机器实例使用的CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceUsedCpu 机器实例使用的CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceUsedCpu(Float InstanceUsedCpu) {
        this.InstanceUsedCpu = InstanceUsedCpu;
    }

    /**
     * Get 机器实例使用的内存信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceUsedMem 机器实例使用的内存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInstanceUsedMem() {
        return this.InstanceUsedMem;
    }

    /**
     * Set 机器实例使用的内存信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceUsedMem 机器实例使用的内存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceUsedMem(Float InstanceUsedMem) {
        this.InstanceUsedMem = InstanceUsedMem;
    }

    /**
     * Get 机器实例Limit CPU信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceLimitCpu 机器实例Limit CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInstanceLimitCpu() {
        return this.InstanceLimitCpu;
    }

    /**
     * Set 机器实例Limit CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceLimitCpu 机器实例Limit CPU信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceLimitCpu(Float InstanceLimitCpu) {
        this.InstanceLimitCpu = InstanceLimitCpu;
    }

    /**
     * Get 机器实例Limit 内存信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceLimitMem 机器实例Limit 内存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getInstanceLimitMem() {
        return this.InstanceLimitMem;
    }

    /**
     * Set 机器实例Limit 内存信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceLimitMem 机器实例Limit 内存信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceLimitMem(Float InstanceLimitMem) {
        this.InstanceLimitMem = InstanceLimitMem;
    }

    /**
     * Get 包版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstancePkgVersion 包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstancePkgVersion() {
        return this.InstancePkgVersion;
    }

    /**
     * Set 包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstancePkgVersion 包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstancePkgVersion(String InstancePkgVersion) {
        this.InstancePkgVersion = InstancePkgVersion;
    }

    /**
     * Get 集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 机器实例业务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestrictState 机器实例业务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestrictState() {
        return this.RestrictState;
    }

    /**
     * Set 机器实例业务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestrictState 机器实例业务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestrictState(String RestrictState) {
        this.RestrictState = RestrictState;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 实例执行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperationState 实例执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperationState() {
        return this.OperationState;
    }

    /**
     * Set 实例执行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperationState 实例执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperationState(Long OperationState) {
        this.OperationState = OperationState;
    }

    /**
     * Get NamespaceId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId NamespaceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set NamespaceId
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId NamespaceId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get InstanceZoneId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceZoneId InstanceZoneId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceZoneId() {
        return this.InstanceZoneId;
    }

    /**
     * Set InstanceZoneId
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceZoneId InstanceZoneId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceZoneId(String InstanceZoneId) {
        this.InstanceZoneId = InstanceZoneId;
    }

    /**
     * Get InstanceImportMode
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceImportMode InstanceImportMode
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceImportMode() {
        return this.InstanceImportMode;
    }

    /**
     * Set InstanceImportMode
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceImportMode InstanceImportMode
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceImportMode(String InstanceImportMode) {
        this.InstanceImportMode = InstanceImportMode;
    }

    /**
     * Get ApplicationType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationType ApplicationType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set ApplicationType
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType ApplicationType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationResourceType ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationResourceType() {
        return this.ApplicationResourceType;
    }

    /**
     * Set ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationResourceType ApplicationResourceType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationResourceType(String ApplicationResourceType) {
        this.ApplicationResourceType = ApplicationResourceType;
    }

    /**
     * Get ServiceSidecarStatus
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceSidecarStatus ServiceSidecarStatus
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceSidecarStatus() {
        return this.ServiceSidecarStatus;
    }

    /**
     * Set ServiceSidecarStatus
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceSidecarStatus ServiceSidecarStatus
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceSidecarStatus(String ServiceSidecarStatus) {
        this.ServiceSidecarStatus = ServiceSidecarStatus;
    }

    /**
     * Get GroupName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName GroupName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set GroupName
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName GroupName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get NamespaceName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName NamespaceName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set NamespaceName
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName NamespaceName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "InstanceDesc", this.InstanceDesc);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceAvailableStatus", this.InstanceAvailableStatus);
        this.setParamSimple(map, prefix + "ServiceInstanceStatus", this.ServiceInstanceStatus);
        this.setParamSimple(map, prefix + "CountInTsf", this.CountInTsf);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "InstanceCreatedTime", this.InstanceCreatedTime);
        this.setParamSimple(map, prefix + "InstanceExpiredTime", this.InstanceExpiredTime);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "InstanceTotalCpu", this.InstanceTotalCpu);
        this.setParamSimple(map, prefix + "InstanceTotalMem", this.InstanceTotalMem);
        this.setParamSimple(map, prefix + "InstanceUsedCpu", this.InstanceUsedCpu);
        this.setParamSimple(map, prefix + "InstanceUsedMem", this.InstanceUsedMem);
        this.setParamSimple(map, prefix + "InstanceLimitCpu", this.InstanceLimitCpu);
        this.setParamSimple(map, prefix + "InstanceLimitMem", this.InstanceLimitMem);
        this.setParamSimple(map, prefix + "InstancePkgVersion", this.InstancePkgVersion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "RestrictState", this.RestrictState);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperationState", this.OperationState);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "InstanceZoneId", this.InstanceZoneId);
        this.setParamSimple(map, prefix + "InstanceImportMode", this.InstanceImportMode);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ApplicationResourceType", this.ApplicationResourceType);
        this.setParamSimple(map, prefix + "ServiceSidecarStatus", this.ServiceSidecarStatus);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);

    }
}

