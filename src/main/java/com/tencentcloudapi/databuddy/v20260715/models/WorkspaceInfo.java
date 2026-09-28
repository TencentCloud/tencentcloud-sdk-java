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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkspaceInfo extends AbstractModel {

    /**
    * 工作空间ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 工作空间名称
    */
    @SerializedName("WorkspaceName")
    @Expose
    private String WorkspaceName;

    /**
    * 工作空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 工作空间地域（如 ap-guangzhou）
    */
    @SerializedName("WorkspaceRegion")
    @Expose
    private String WorkspaceRegion;

    /**
    * 工作空间状态：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 失败原因（Status=2 创建失败时有值）
    */
    @SerializedName("ErrorReason")
    @Expose
    private String ErrorReason;

    /**
    * 创建者信息
    */
    @SerializedName("Creator")
    @Expose
    private StandardUserInfo Creator;

    /**
    * 创建时间，毫秒时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间，毫秒时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 当前用户是否拥有该工作空间的访问权限
    */
    @SerializedName("HasAccess")
    @Expose
    private Boolean HasAccess;

    /**
     * Get 工作空间ID 
     * @return WorkspaceId 工作空间ID
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间ID
     * @param WorkspaceId 工作空间ID
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 工作空间名称 
     * @return WorkspaceName 工作空间名称
     */
    public String getWorkspaceName() {
        return this.WorkspaceName;
    }

    /**
     * Set 工作空间名称
     * @param WorkspaceName 工作空间名称
     */
    public void setWorkspaceName(String WorkspaceName) {
        this.WorkspaceName = WorkspaceName;
    }

    /**
     * Get 工作空间描述 
     * @return Description 工作空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 工作空间描述
     * @param Description 工作空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 工作空间地域（如 ap-guangzhou） 
     * @return WorkspaceRegion 工作空间地域（如 ap-guangzhou）
     */
    public String getWorkspaceRegion() {
        return this.WorkspaceRegion;
    }

    /**
     * Set 工作空间地域（如 ap-guangzhou）
     * @param WorkspaceRegion 工作空间地域（如 ap-guangzhou）
     */
    public void setWorkspaceRegion(String WorkspaceRegion) {
        this.WorkspaceRegion = WorkspaceRegion;
    }

    /**
     * Get 工作空间状态：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除 
     * @return Status 工作空间状态：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 工作空间状态：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除
     * @param Status 工作空间状态：0=未指定 1=创建中 2=创建失败 3=正常运行中 4=已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 失败原因（Status=2 创建失败时有值） 
     * @return ErrorReason 失败原因（Status=2 创建失败时有值）
     */
    public String getErrorReason() {
        return this.ErrorReason;
    }

    /**
     * Set 失败原因（Status=2 创建失败时有值）
     * @param ErrorReason 失败原因（Status=2 创建失败时有值）
     */
    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
    }

    /**
     * Get 创建者信息 
     * @return Creator 创建者信息
     */
    public StandardUserInfo getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者信息
     * @param Creator 创建者信息
     */
    public void setCreator(StandardUserInfo Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建时间，毫秒时间戳 
     * @return CreateTime 创建时间，毫秒时间戳
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，毫秒时间戳
     * @param CreateTime 创建时间，毫秒时间戳
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，毫秒时间戳 
     * @return UpdateTime 更新时间，毫秒时间戳
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，毫秒时间戳
     * @param UpdateTime 更新时间，毫秒时间戳
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 当前用户是否拥有该工作空间的访问权限 
     * @return HasAccess 当前用户是否拥有该工作空间的访问权限
     */
    public Boolean getHasAccess() {
        return this.HasAccess;
    }

    /**
     * Set 当前用户是否拥有该工作空间的访问权限
     * @param HasAccess 当前用户是否拥有该工作空间的访问权限
     */
    public void setHasAccess(Boolean HasAccess) {
        this.HasAccess = HasAccess;
    }

    public WorkspaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkspaceInfo(WorkspaceInfo source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkspaceName != null) {
            this.WorkspaceName = new String(source.WorkspaceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.WorkspaceRegion != null) {
            this.WorkspaceRegion = new String(source.WorkspaceRegion);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrorReason != null) {
            this.ErrorReason = new String(source.ErrorReason);
        }
        if (source.Creator != null) {
            this.Creator = new StandardUserInfo(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.HasAccess != null) {
            this.HasAccess = new Boolean(source.HasAccess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkspaceName", this.WorkspaceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "WorkspaceRegion", this.WorkspaceRegion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorReason", this.ErrorReason);
        this.setParamObj(map, prefix + "Creator.", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "HasAccess", this.HasAccess);

    }
}

