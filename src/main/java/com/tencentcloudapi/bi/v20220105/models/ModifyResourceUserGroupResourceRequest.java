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

public class ModifyResourceUserGroupResourceRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 用户id
    */
    @SerializedName("UserGroupId")
    @Expose
    private Long UserGroupId;

    /**
    * 资源
    */
    @SerializedName("Resource")
    @Expose
    private UserResourceDTO Resource;

    /**
    * 实体类
    */
    @SerializedName("EntityIds")
    @Expose
    private Long [] EntityIds;

    /**
    * 资源类型
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

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
     * Get 用户id 
     * @return UserGroupId 用户id
     */
    public Long getUserGroupId() {
        return this.UserGroupId;
    }

    /**
     * Set 用户id
     * @param UserGroupId 用户id
     */
    public void setUserGroupId(Long UserGroupId) {
        this.UserGroupId = UserGroupId;
    }

    /**
     * Get 资源 
     * @return Resource 资源
     */
    public UserResourceDTO getResource() {
        return this.Resource;
    }

    /**
     * Set 资源
     * @param Resource 资源
     */
    public void setResource(UserResourceDTO Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 实体类 
     * @return EntityIds 实体类
     */
    public Long [] getEntityIds() {
        return this.EntityIds;
    }

    /**
     * Set 实体类
     * @param EntityIds 实体类
     */
    public void setEntityIds(Long [] EntityIds) {
        this.EntityIds = EntityIds;
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

    public ModifyResourceUserGroupResourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourceUserGroupResourceRequest(ModifyResourceUserGroupResourceRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.UserGroupId != null) {
            this.UserGroupId = new Long(source.UserGroupId);
        }
        if (source.Resource != null) {
            this.Resource = new UserResourceDTO(source.Resource);
        }
        if (source.EntityIds != null) {
            this.EntityIds = new Long[source.EntityIds.length];
            for (int i = 0; i < source.EntityIds.length; i++) {
                this.EntityIds[i] = new Long(source.EntityIds[i]);
            }
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UserGroupId", this.UserGroupId);
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArraySimple(map, prefix + "EntityIds.", this.EntityIds);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

