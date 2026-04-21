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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResourceUserGroupRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 用户组id集合
    */
    @SerializedName("UserGroupIds")
    @Expose
    private Long [] UserGroupIds;

    /**
    * 操作的资源权限
    */
    @SerializedName("Resource")
    @Expose
    private ResourceListDTO Resource;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 是否查询所有孩子节点
    */
    @SerializedName("QueryChildren")
    @Expose
    private Boolean QueryChildren;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 用户组id集合 
     * @return UserGroupIds 用户组id集合
     */
    public Long [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set 用户组id集合
     * @param UserGroupIds 用户组id集合
     */
    public void setUserGroupIds(Long [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get 操作的资源权限 
     * @return Resource 操作的资源权限
     */
    public ResourceListDTO getResource() {
        return this.Resource;
    }

    /**
     * Set 操作的资源权限
     * @param Resource 操作的资源权限
     */
    public void setResource(ResourceListDTO Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 资源类型 
     * @return ResourceType 资源类型
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型
     * @param ResourceType 资源类型
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 是否查询所有孩子节点 
     * @return QueryChildren 是否查询所有孩子节点
     */
    public Boolean getQueryChildren() {
        return this.QueryChildren;
    }

    /**
     * Set 是否查询所有孩子节点
     * @param QueryChildren 是否查询所有孩子节点
     */
    public void setQueryChildren(Boolean QueryChildren) {
        this.QueryChildren = QueryChildren;
    }

    public ModifyResourceUserGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceUserGroupRequest(ModifyResourceUserGroupRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new Long[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new Long(source.UserGroupIds[i]);
            }
        }
        if (source.Resource != null) {
            this.Resource = new ResourceListDTO(source.Resource);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.QueryChildren != null) {
            this.QueryChildren = new Boolean(source.QueryChildren);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "QueryChildren", this.QueryChildren);

    }
}

