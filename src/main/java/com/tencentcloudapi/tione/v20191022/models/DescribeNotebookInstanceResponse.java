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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNotebookInstanceResponse extends AbstractModel{

    /**
    * Notebook实例名称
    */
    @SerializedName("NotebookInstanceName")
    @Expose
    private String NotebookInstanceName;

    /**
    * Notebook算力资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 角色的资源描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleArn")
    @Expose
    private String RoleArn;

    /**
    * 外网访问权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectInternetAccess")
    @Expose
    private String DirectInternetAccess;

    /**
    * Root用户权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RootAccess")
    @Expose
    private String RootAccess;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 数据卷大小(GB)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * 创建失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * Notebook实例创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * Notebook实例最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private String LastModifiedTime;

    /**
    * Notebook实例日志链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogUrl")
    @Expose
    private String LogUrl;

    /**
    * Notebook实例状态

Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotebookInstanceStatus")
    @Expose
    private String NotebookInstanceStatus;

    /**
    * Notebook实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * notebook生命周期脚本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifecycleScriptsName")
    @Expose
    private String LifecycleScriptsName;

    /**
    * 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultCodeRepository")
    @Expose
    private String DefaultCodeRepository;

    /**
    * 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdditionalCodeRepositories")
    @Expose
    private String [] AdditionalCodeRepositories;

    /**
    * 是否开启CLS日志服务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsAccess")
    @Expose
    private String ClsAccess;

    /**
    * 是否预付费实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Prepay")
    @Expose
    private Boolean Prepay;

    /**
    * 实例运行截止时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppingCondition")
    @Expose
    private StoppingCondition StoppingCondition;

    /**
    * Cls配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClsConfig")
    @Expose
    private ClsConfig ClsConfig;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Notebook实例名称 
     * @return NotebookInstanceName Notebook实例名称
     */
    public String getNotebookInstanceName() {
        return this.NotebookInstanceName;
    }

    /**
     * Set Notebook实例名称
     * @param NotebookInstanceName Notebook实例名称
     */
    public void setNotebookInstanceName(String NotebookInstanceName) {
        this.NotebookInstanceName = NotebookInstanceName;
    }

    /**
     * Get Notebook算力资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType Notebook算力资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Notebook算力资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType Notebook算力资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 角色的资源描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleArn 角色的资源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleArn() {
        return this.RoleArn;
    }

    /**
     * Set 角色的资源描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleArn 角色的资源描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleArn(String RoleArn) {
        this.RoleArn = RoleArn;
    }

    /**
     * Get 外网访问权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectInternetAccess 外网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDirectInternetAccess() {
        return this.DirectInternetAccess;
    }

    /**
     * Set 外网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectInternetAccess 外网访问权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectInternetAccess(String DirectInternetAccess) {
        this.DirectInternetAccess = DirectInternetAccess;
    }

    /**
     * Get Root用户权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RootAccess Root用户权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRootAccess() {
        return this.RootAccess;
    }

    /**
     * Set Root用户权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param RootAccess Root用户权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRootAccess(String RootAccess) {
        this.RootAccess = RootAccess;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 数据卷大小(GB)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSizeInGB 数据卷大小(GB)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set 数据卷大小(GB)
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSizeInGB 数据卷大小(GB)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
    }

    /**
     * Get 创建失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureReason 创建失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 创建失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureReason 创建失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get Notebook实例创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTime Notebook实例创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Notebook实例创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTime Notebook实例创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get Notebook实例最近修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedTime Notebook实例最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set Notebook实例最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedTime Notebook实例最近修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedTime(String LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    /**
     * Get Notebook实例日志链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogUrl Notebook实例日志链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogUrl() {
        return this.LogUrl;
    }

    /**
     * Set Notebook实例日志链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogUrl Notebook实例日志链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogUrl(String LogUrl) {
        this.LogUrl = LogUrl;
    }

    /**
     * Get Notebook实例状态

Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotebookInstanceStatus Notebook实例状态

Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotebookInstanceStatus() {
        return this.NotebookInstanceStatus;
    }

    /**
     * Set Notebook实例状态

Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotebookInstanceStatus Notebook实例状态

Pending: 创建中
Inservice: 运行中
Stopping: 停止中
Stopped: 已停止
Failed: 失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotebookInstanceStatus(String NotebookInstanceStatus) {
        this.NotebookInstanceStatus = NotebookInstanceStatus;
    }

    /**
     * Get Notebook实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId Notebook实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Notebook实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId Notebook实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get notebook生命周期脚本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifecycleScriptsName notebook生命周期脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLifecycleScriptsName() {
        return this.LifecycleScriptsName;
    }

    /**
     * Set notebook生命周期脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifecycleScriptsName notebook生命周期脚本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycleScriptsName(String LifecycleScriptsName) {
        this.LifecycleScriptsName = LifecycleScriptsName;
    }

    /**
     * Get 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultCodeRepository 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultCodeRepository() {
        return this.DefaultCodeRepository;
    }

    /**
     * Set 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultCodeRepository 默认存储库名称
可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultCodeRepository(String DefaultCodeRepository) {
        this.DefaultCodeRepository = DefaultCodeRepository;
    }

    /**
     * Get 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdditionalCodeRepositories 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAdditionalCodeRepositories() {
        return this.AdditionalCodeRepositories;
    }

    /**
     * Set 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdditionalCodeRepositories 其他存储库列表
每个元素可以是已创建的存储库名称或者已https://开头的公共git库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdditionalCodeRepositories(String [] AdditionalCodeRepositories) {
        this.AdditionalCodeRepositories = AdditionalCodeRepositories;
    }

    /**
     * Get 是否开启CLS日志服务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsAccess 是否开启CLS日志服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClsAccess() {
        return this.ClsAccess;
    }

    /**
     * Set 是否开启CLS日志服务
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsAccess 是否开启CLS日志服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsAccess(String ClsAccess) {
        this.ClsAccess = ClsAccess;
    }

    /**
     * Get 是否预付费实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Prepay 是否预付费实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPrepay() {
        return this.Prepay;
    }

    /**
     * Set 是否预付费实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param Prepay 是否预付费实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepay(Boolean Prepay) {
        this.Prepay = Prepay;
    }

    /**
     * Get 实例运行截止时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Deadline 实例运行截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 实例运行截止时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Deadline 实例运行截止时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppingCondition 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StoppingCondition getStoppingCondition() {
        return this.StoppingCondition;
    }

    /**
     * Set 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppingCondition 自动停止配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppingCondition(StoppingCondition StoppingCondition) {
        this.StoppingCondition = StoppingCondition;
    }

    /**
     * Get Cls配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClsConfig Cls配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClsConfig getClsConfig() {
        return this.ClsConfig;
    }

    /**
     * Set Cls配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClsConfig Cls配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClsConfig(ClsConfig ClsConfig) {
        this.ClsConfig = ClsConfig;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotebookInstanceName", this.NotebookInstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "RoleArn", this.RoleArn);
        this.setParamSimple(map, prefix + "DirectInternetAccess", this.DirectInternetAccess);
        this.setParamSimple(map, prefix + "RootAccess", this.RootAccess);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);
        this.setParamSimple(map, prefix + "LogUrl", this.LogUrl);
        this.setParamSimple(map, prefix + "NotebookInstanceStatus", this.NotebookInstanceStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LifecycleScriptsName", this.LifecycleScriptsName);
        this.setParamSimple(map, prefix + "DefaultCodeRepository", this.DefaultCodeRepository);
        this.setParamArraySimple(map, prefix + "AdditionalCodeRepositories.", this.AdditionalCodeRepositories);
        this.setParamSimple(map, prefix + "ClsAccess", this.ClsAccess);
        this.setParamSimple(map, prefix + "Prepay", this.Prepay);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamObj(map, prefix + "StoppingCondition.", this.StoppingCondition);
        this.setParamObj(map, prefix + "ClsConfig.", this.ClsConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

