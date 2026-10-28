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

public class UpdateWorkspaceGroupsTagsRequest extends AbstractModel {

    /**
    * <p>必填，用户组ID列表，单次最多100个；可通过 ListWorkspaceGroups 接口获取</p>
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * <p>必填，工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>标签列表，覆盖写用户组的标签；传即覆盖更新，不传或为空则清除全部标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private UserTagInfo [] Tags;

    /**
     * Get <p>必填，用户组ID列表，单次最多100个；可通过 ListWorkspaceGroups 接口获取</p> 
     * @return GroupIds <p>必填，用户组ID列表，单次最多100个；可通过 ListWorkspaceGroups 接口获取</p>
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set <p>必填，用户组ID列表，单次最多100个；可通过 ListWorkspaceGroups 接口获取</p>
     * @param GroupIds <p>必填，用户组ID列表，单次最多100个；可通过 ListWorkspaceGroups 接口获取</p>
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get <p>必填，工作空间ID</p> 
     * @return WorkspaceId <p>必填，工作空间ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>必填，工作空间ID</p>
     * @param WorkspaceId <p>必填，工作空间ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>标签列表，覆盖写用户组的标签；传即覆盖更新，不传或为空则清除全部标签</p> 
     * @return Tags <p>标签列表，覆盖写用户组的标签；传即覆盖更新，不传或为空则清除全部标签</p>
     */
    public UserTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表，覆盖写用户组的标签；传即覆盖更新，不传或为空则清除全部标签</p>
     * @param Tags <p>标签列表，覆盖写用户组的标签；传即覆盖更新，不传或为空则清除全部标签</p>
     */
    public void setTags(UserTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public UpdateWorkspaceGroupsTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkspaceGroupsTagsRequest(UpdateWorkspaceGroupsTagsRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Tags != null) {
            this.Tags = new UserTagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new UserTagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

