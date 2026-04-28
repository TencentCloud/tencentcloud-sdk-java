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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Workspace extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>绑定的资源组信息</p>
    */
    @SerializedName("ResourceGroups")
    @Expose
    private ResourceGroupInWorkspace [] ResourceGroups;

    /**
    * <p>当前用户对此空间拥有的权限</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String [] ActionType;

    /**
    * <p>工作空间状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>项目ID</p> 
     * @return TiProjectId <p>项目ID</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param TiProjectId <p>项目ID</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>名称</p> 
     * @return Name <p>名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称</p>
     * @param Name <p>名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>绑定的资源组信息</p> 
     * @return ResourceGroups <p>绑定的资源组信息</p>
     */
    public ResourceGroupInWorkspace [] getResourceGroups() {
        return this.ResourceGroups;
    }

    /**
     * Set <p>绑定的资源组信息</p>
     * @param ResourceGroups <p>绑定的资源组信息</p>
     */
    public void setResourceGroups(ResourceGroupInWorkspace [] ResourceGroups) {
        this.ResourceGroups = ResourceGroups;
    }

    /**
     * Get <p>当前用户对此空间拥有的权限</p> 
     * @return ActionType <p>当前用户对此空间拥有的权限</p>
     */
    public String [] getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>当前用户对此空间拥有的权限</p>
     * @param ActionType <p>当前用户对此空间拥有的权限</p>
     */
    public void setActionType(String [] ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>工作空间状态</p> 
     * @return Status <p>工作空间状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>工作空间状态</p>
     * @param Status <p>工作空间状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Workspace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Workspace(Workspace source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ResourceGroups != null) {
            this.ResourceGroups = new ResourceGroupInWorkspace[source.ResourceGroups.length];
            for (int i = 0; i < source.ResourceGroups.length; i++) {
                this.ResourceGroups[i] = new ResourceGroupInWorkspace(source.ResourceGroups[i]);
            }
        }
        if (source.ActionType != null) {
            this.ActionType = new String[source.ActionType.length];
            for (int i = 0; i < source.ActionType.length; i++) {
                this.ActionType[i] = new String(source.ActionType[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "ResourceGroups.", this.ResourceGroups);
        this.setParamArraySimple(map, prefix + "ActionType.", this.ActionType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

