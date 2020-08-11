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

public class VmGroup extends AbstractModel{

    /**
    * 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 部署组状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupStatus")
    @Expose
    private String GroupStatus;

    /**
    * 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 程序包名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 程序包版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

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
    * 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 部署组机器数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 部署组运行中机器数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * 部署组启动参数信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupParameters")
    @Expose
    private String StartupParameters;

    /**
    * 部署组创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 部署组更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 部署组停止机器数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffInstanceCount")
    @Expose
    private Long OffInstanceCount;

    /**
    * 部署组描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupDesc")
    @Expose
    private String GroupDesc;

    /**
    * 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 应用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 部署组资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupResourceType")
    @Expose
    private String GroupResourceType;

    /**
    * 部署组更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private Long UpdatedTime;

    /**
    * 部署应用描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployDesc")
    @Expose
    private String DeployDesc;

    /**
     * Get 部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 部署组状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupStatus 部署组状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set 部署组状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupStatus 部署组状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupStatus(String GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get 程序包ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 程序包名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName 程序包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 程序包名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName 程序包名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 程序包版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageVersion 程序包版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 程序包版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageVersion 程序包版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
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
     * Get 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 部署组机器数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCount 部署组机器数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 部署组机器数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount 部署组机器数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 部署组运行中机器数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunInstanceCount 部署组运行中机器数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set 部署组运行中机器数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunInstanceCount 部署组运行中机器数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get 部署组启动参数信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupParameters 部署组启动参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartupParameters() {
        return this.StartupParameters;
    }

    /**
     * Set 部署组启动参数信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupParameters 部署组启动参数信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupParameters(String StartupParameters) {
        this.StartupParameters = StartupParameters;
    }

    /**
     * Get 部署组创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 部署组创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 部署组创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 部署组创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 部署组更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 部署组更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 部署组更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 部署组更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 部署组停止机器数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffInstanceCount 部署组停止机器数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffInstanceCount() {
        return this.OffInstanceCount;
    }

    /**
     * Set 部署组停止机器数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffInstanceCount 部署组停止机器数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffInstanceCount(Long OffInstanceCount) {
        this.OffInstanceCount = OffInstanceCount;
    }

    /**
     * Get 部署组描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupDesc 部署组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupDesc() {
        return this.GroupDesc;
    }

    /**
     * Set 部署组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupDesc 部署组描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupDesc(String GroupDesc) {
        this.GroupDesc = GroupDesc;
    }

    /**
     * Get 微服务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceType 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceType 微服务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get 应用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 部署组资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupResourceType 部署组资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupResourceType() {
        return this.GroupResourceType;
    }

    /**
     * Set 部署组资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupResourceType 部署组资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupResourceType(String GroupResourceType) {
        this.GroupResourceType = GroupResourceType;
    }

    /**
     * Get 部署组更新时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedTime 部署组更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 部署组更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedTime 部署组更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedTime(Long UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 部署应用描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployDesc 部署应用描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployDesc() {
        return this.DeployDesc;
    }

    /**
     * Set 部署应用描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployDesc 部署应用描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployDesc(String DeployDesc) {
        this.DeployDesc = DeployDesc;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RunInstanceCount", this.RunInstanceCount);
        this.setParamSimple(map, prefix + "StartupParameters", this.StartupParameters);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OffInstanceCount", this.OffInstanceCount);
        this.setParamSimple(map, prefix + "GroupDesc", this.GroupDesc);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "GroupResourceType", this.GroupResourceType);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "DeployDesc", this.DeployDesc);

    }
}

