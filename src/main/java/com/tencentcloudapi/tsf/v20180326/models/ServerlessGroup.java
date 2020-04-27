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

public class ServerlessGroup extends AbstractModel{

    /**
    * 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 服务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 程序包名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * 集群id
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
    * 命名空间id
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
    * vpc ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgVersion")
    @Expose
    private String PkgVersion;

    /**
    * 所需实例内存大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * 要求最小实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceRequest")
    @Expose
    private Long InstanceRequest;

    /**
    * 部署组启动参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupParameters")
    @Expose
    private String StartupParameters;

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String [] ApplicationName;

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
     * Get 分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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
     * Get 服务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 服务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 服务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 服务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 程序包ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 程序包名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgName 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgName 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get 集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群id
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
     * Get 命名空间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId 命名空间id
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
     * Get vpc ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId vpc 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set vpc 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId vpc 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 程序包版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgVersion 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgVersion() {
        return this.PkgVersion;
    }

    /**
     * Set 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgVersion 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgVersion(String PkgVersion) {
        this.PkgVersion = PkgVersion;
    }

    /**
     * Get 所需实例内存大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 所需实例内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 所需实例内存大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 所需实例内存大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 要求最小实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceRequest 要求最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceRequest() {
        return this.InstanceRequest;
    }

    /**
     * Set 要求最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceRequest 要求最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceRequest(Long InstanceRequest) {
        this.InstanceRequest = InstanceRequest;
    }

    /**
     * Get 部署组启动参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupParameters 部署组启动参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartupParameters() {
        return this.StartupParameters;
    }

    /**
     * Set 部署组启动参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupParameters 部署组启动参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupParameters(String StartupParameters) {
        this.StartupParameters = StartupParameters;
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
     * Get 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCount 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount 部署组实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String [] ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "PkgVersion", this.PkgVersion);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "InstanceRequest", this.InstanceRequest);
        this.setParamSimple(map, prefix + "StartupParameters", this.StartupParameters);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamArraySimple(map, prefix + "ApplicationName.", this.ApplicationName);

    }
}

