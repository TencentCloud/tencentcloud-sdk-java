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

public class RemoveWorkspaceGroupsRequest extends AbstractModel {

    /**
    * <p>用户组ID列表，可通过 ListWorkspaceGroups 接口获取</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
     * Get <p>用户组ID列表，可通过 ListWorkspaceGroups 接口获取</p> 
     * @return GroupIds <p>用户组ID列表，可通过 ListWorkspaceGroups 接口获取</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>用户组ID列表，可通过 ListWorkspaceGroups 接口获取</p>
     * @param GroupIds <p>用户组ID列表，可通过 ListWorkspaceGroups 接口获取</p>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>工作空间ID</p> 
     * @return WorkspaceId <p>工作空间ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
     * @param WorkspaceId <p>工作空间ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    public RemoveWorkspaceGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveWorkspaceGroupsRequest(RemoveWorkspaceGroupsRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);

    }
}

