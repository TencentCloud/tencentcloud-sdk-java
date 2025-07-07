/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserProvisioningsTask extends AbstractModel {

    /**
    * 任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 授权的集团账号目标账号的UIN
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 任务类型。StartProvisioning：用户同步，DeleteProvisioning：删除用户同步
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务状态：InProgress: 进行中，Failed: 失败 3:Success: 成功
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 用户同步ID。
    */
    @SerializedName("UserProvisioningId")
    @Expose
    private String UserProvisioningId;

    /**
    *  CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC 用户。 Group：表示该 CAM 用户同步的身份是CIC 用户组。
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
    * 用户或者用户组名称。
    */
    @SerializedName("PrincipalName")
    @Expose
    private String PrincipalName;

    /**
    * 冲突策略。KeepBoth:两者都保留;TakeOver:替换
    */
    @SerializedName("DuplicationStrategy")
    @Expose
    private String DuplicationStrategy;

    /**
    * 删除策略。Delete:删除;Keep:保留
    */
    @SerializedName("DeletionStrategy")
    @Expose
    private String DeletionStrategy;

    /**
     * Get 任务ID。 
     * @return TaskId 任务ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID。
     * @param TaskId 任务ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 授权的集团账号目标账号的UIN 
     * @return TargetUin 授权的集团账号目标账号的UIN
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 授权的集团账号目标账号的UIN
     * @param TargetUin 授权的集团账号目标账号的UIN
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号 
     * @return TargetType 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     * @param TargetType 同步的集团账号目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 任务类型。StartProvisioning：用户同步，DeleteProvisioning：删除用户同步 
     * @return TaskType 任务类型。StartProvisioning：用户同步，DeleteProvisioning：删除用户同步
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。StartProvisioning：用户同步，DeleteProvisioning：删除用户同步
     * @param TaskType 任务类型。StartProvisioning：用户同步，DeleteProvisioning：删除用户同步
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务状态：InProgress: 进行中，Failed: 失败 3:Success: 成功 
     * @return TaskStatus 任务状态：InProgress: 进行中，Failed: 失败 3:Success: 成功
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态：InProgress: 进行中，Failed: 失败 3:Success: 成功
     * @param TaskStatus 任务状态：InProgress: 进行中，Failed: 失败 3:Success: 成功
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 用户同步ID。 
     * @return UserProvisioningId 用户同步ID。
     */
    public String getUserProvisioningId() {
        return this.UserProvisioningId;
    }

    /**
     * Set 用户同步ID。
     * @param UserProvisioningId 用户同步ID。
     */
    public void setUserProvisioningId(String UserProvisioningId) {
        this.UserProvisioningId = UserProvisioningId;
    }

    /**
     * Get  CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。 
     * @return PrincipalId  CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set  CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。
     * @param PrincipalId  CAM 用户同步的身份 ID。取值： 当PrincipalType取值为Group时，该值为CIC 用户组 ID（g-********）。 当PrincipalType取值为User时，该值为CIC 用户 ID（u-********）。
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC 用户。 Group：表示该 CAM 用户同步的身份是CIC 用户组。 
     * @return PrincipalType CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC 用户。 Group：表示该 CAM 用户同步的身份是CIC 用户组。
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC 用户。 Group：表示该 CAM 用户同步的身份是CIC 用户组。
     * @param PrincipalType CAM 用户同步的身份类型。取值： User：表示该 CAM 用户同步的身份是CIC 用户。 Group：表示该 CAM 用户同步的身份是CIC 用户组。
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    /**
     * Get 用户或者用户组名称。 
     * @return PrincipalName 用户或者用户组名称。
     */
    public String getPrincipalName() {
        return this.PrincipalName;
    }

    /**
     * Set 用户或者用户组名称。
     * @param PrincipalName 用户或者用户组名称。
     */
    public void setPrincipalName(String PrincipalName) {
        this.PrincipalName = PrincipalName;
    }

    /**
     * Get 冲突策略。KeepBoth:两者都保留;TakeOver:替换 
     * @return DuplicationStrategy 冲突策略。KeepBoth:两者都保留;TakeOver:替换
     */
    public String getDuplicationStrategy() {
        return this.DuplicationStrategy;
    }

    /**
     * Set 冲突策略。KeepBoth:两者都保留;TakeOver:替换
     * @param DuplicationStrategy 冲突策略。KeepBoth:两者都保留;TakeOver:替换
     */
    public void setDuplicationStrategy(String DuplicationStrategy) {
        this.DuplicationStrategy = DuplicationStrategy;
    }

    /**
     * Get 删除策略。Delete:删除;Keep:保留 
     * @return DeletionStrategy 删除策略。Delete:删除;Keep:保留
     */
    public String getDeletionStrategy() {
        return this.DeletionStrategy;
    }

    /**
     * Set 删除策略。Delete:删除;Keep:保留
     * @param DeletionStrategy 删除策略。Delete:删除;Keep:保留
     */
    public void setDeletionStrategy(String DeletionStrategy) {
        this.DeletionStrategy = DeletionStrategy;
    }

    public UserProvisioningsTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserProvisioningsTask(UserProvisioningsTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.UserProvisioningId != null) {
            this.UserProvisioningId = new String(source.UserProvisioningId);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.PrincipalName != null) {
            this.PrincipalName = new String(source.PrincipalName);
        }
        if (source.DuplicationStrategy != null) {
            this.DuplicationStrategy = new String(source.DuplicationStrategy);
        }
        if (source.DeletionStrategy != null) {
            this.DeletionStrategy = new String(source.DeletionStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "UserProvisioningId", this.UserProvisioningId);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "PrincipalName", this.PrincipalName);
        this.setParamSimple(map, prefix + "DuplicationStrategy", this.DuplicationStrategy);
        this.setParamSimple(map, prefix + "DeletionStrategy", this.DeletionStrategy);

    }
}

