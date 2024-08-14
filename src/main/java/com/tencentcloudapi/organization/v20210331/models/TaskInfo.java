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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfo extends AbstractModel {

    /**
    * 任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 权限配置ID。
    */
    @SerializedName("RoleConfigurationId")
    @Expose
    private String RoleConfigurationId;

    /**
    * 权限配置名称。
    */
    @SerializedName("RoleConfigurationName")
    @Expose
    private String RoleConfigurationName;

    /**
    * 授权的目标成员账号的UIN
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * 同步的目标账号的类型，ManagerUin管理账号;MemberUin成员账号
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 用户授权的身份ID,如果是身份类型是CIC用户,则为用户ID; 如果是用户组，则为用户组ID;
    */
    @SerializedName("PrincipalId")
    @Expose
    private String PrincipalId;

    /**
    * 用户授权的身份类型, User代表CIC用户, Group代表CIC用户组
    */
    @SerializedName("PrincipalType")
    @Expose
    private String PrincipalType;

    /**
    * 任务类型。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

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
     * Get 权限配置ID。 
     * @return RoleConfigurationId 权限配置ID。
     */
    public String getRoleConfigurationId() {
        return this.RoleConfigurationId;
    }

    /**
     * Set 权限配置ID。
     * @param RoleConfigurationId 权限配置ID。
     */
    public void setRoleConfigurationId(String RoleConfigurationId) {
        this.RoleConfigurationId = RoleConfigurationId;
    }

    /**
     * Get 权限配置名称。 
     * @return RoleConfigurationName 权限配置名称。
     */
    public String getRoleConfigurationName() {
        return this.RoleConfigurationName;
    }

    /**
     * Set 权限配置名称。
     * @param RoleConfigurationName 权限配置名称。
     */
    public void setRoleConfigurationName(String RoleConfigurationName) {
        this.RoleConfigurationName = RoleConfigurationName;
    }

    /**
     * Get 授权的目标成员账号的UIN 
     * @return TargetUin 授权的目标成员账号的UIN
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 授权的目标成员账号的UIN
     * @param TargetUin 授权的目标成员账号的UIN
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get 同步的目标账号的类型，ManagerUin管理账号;MemberUin成员账号 
     * @return TargetType 同步的目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 同步的目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     * @param TargetType 同步的目标账号的类型，ManagerUin管理账号;MemberUin成员账号
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 用户授权的身份ID,如果是身份类型是CIC用户,则为用户ID; 如果是用户组，则为用户组ID; 
     * @return PrincipalId 用户授权的身份ID,如果是身份类型是CIC用户,则为用户ID; 如果是用户组，则为用户组ID;
     */
    public String getPrincipalId() {
        return this.PrincipalId;
    }

    /**
     * Set 用户授权的身份ID,如果是身份类型是CIC用户,则为用户ID; 如果是用户组，则为用户组ID;
     * @param PrincipalId 用户授权的身份ID,如果是身份类型是CIC用户,则为用户ID; 如果是用户组，则为用户组ID;
     */
    public void setPrincipalId(String PrincipalId) {
        this.PrincipalId = PrincipalId;
    }

    /**
     * Get 用户授权的身份类型, User代表CIC用户, Group代表CIC用户组 
     * @return PrincipalType 用户授权的身份类型, User代表CIC用户, Group代表CIC用户组
     */
    public String getPrincipalType() {
        return this.PrincipalType;
    }

    /**
     * Set 用户授权的身份类型, User代表CIC用户, Group代表CIC用户组
     * @param PrincipalType 用户授权的身份类型, User代表CIC用户, Group代表CIC用户组
     */
    public void setPrincipalType(String PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    /**
     * Get 任务类型。 
     * @return TaskType 任务类型。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。
     * @param TaskType 任务类型。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。 
     * @return Status InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。
     * @param Status InProgress：任务执行中。 Success：任务执行成功。 Failed：任务执行失败。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    public TaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfo(TaskInfo source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RoleConfigurationId != null) {
            this.RoleConfigurationId = new String(source.RoleConfigurationId);
        }
        if (source.RoleConfigurationName != null) {
            this.RoleConfigurationName = new String(source.RoleConfigurationName);
        }
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.PrincipalId != null) {
            this.PrincipalId = new String(source.PrincipalId);
        }
        if (source.PrincipalType != null) {
            this.PrincipalType = new String(source.PrincipalType);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RoleConfigurationId", this.RoleConfigurationId);
        this.setParamSimple(map, prefix + "RoleConfigurationName", this.RoleConfigurationName);
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "PrincipalId", this.PrincipalId);
        this.setParamSimple(map, prefix + "PrincipalType", this.PrincipalType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);

    }
}

