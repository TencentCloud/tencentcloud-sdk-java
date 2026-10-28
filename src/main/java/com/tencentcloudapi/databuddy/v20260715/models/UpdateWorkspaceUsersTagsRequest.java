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

public class UpdateWorkspaceUsersTagsRequest extends AbstractModel {

    /**
    * <p>必填，用户UIN列表，单次最多100个</p>
    */
    @SerializedName("UserUins")
    @Expose
    private String [] UserUins;

    /**
    * <p>必填，工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>待更新的标签集合（标签维度及标签值通过 ID 指定），覆盖更新语义：传入后将被覆盖为目标用户的全部直绑标签，不传或传空数组则清空目标用户的所有直绑标签。每个元素中 TagId 必填，Values[].TagValueId 必填；传入的 TagValue、Source、GroupNames 服务端不读取，无需传入。标签维度与标签值可先通过 CreateTags / CreateTagValues 创建，再通过 ListTags 获取 ID（TagId 取 Items[].TagId，TagValueId 取 Items[].TagValues[].TagValueId）。</p>
    */
    @SerializedName("Tags")
    @Expose
    private UserTagInfo [] Tags;

    /**
     * Get <p>必填，用户UIN列表，单次最多100个</p> 
     * @return UserUins <p>必填，用户UIN列表，单次最多100个</p>
     */
    public String [] getUserUins() {
        return this.UserUins;
    }

    /**
     * Set <p>必填，用户UIN列表，单次最多100个</p>
     * @param UserUins <p>必填，用户UIN列表，单次最多100个</p>
     */
    public void setUserUins(String [] UserUins) {
        this.UserUins = UserUins;
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
     * Get <p>待更新的标签集合（标签维度及标签值通过 ID 指定），覆盖更新语义：传入后将被覆盖为目标用户的全部直绑标签，不传或传空数组则清空目标用户的所有直绑标签。每个元素中 TagId 必填，Values[].TagValueId 必填；传入的 TagValue、Source、GroupNames 服务端不读取，无需传入。标签维度与标签值可先通过 CreateTags / CreateTagValues 创建，再通过 ListTags 获取 ID（TagId 取 Items[].TagId，TagValueId 取 Items[].TagValues[].TagValueId）。</p> 
     * @return Tags <p>待更新的标签集合（标签维度及标签值通过 ID 指定），覆盖更新语义：传入后将被覆盖为目标用户的全部直绑标签，不传或传空数组则清空目标用户的所有直绑标签。每个元素中 TagId 必填，Values[].TagValueId 必填；传入的 TagValue、Source、GroupNames 服务端不读取，无需传入。标签维度与标签值可先通过 CreateTags / CreateTagValues 创建，再通过 ListTags 获取 ID（TagId 取 Items[].TagId，TagValueId 取 Items[].TagValues[].TagValueId）。</p>
     */
    public UserTagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>待更新的标签集合（标签维度及标签值通过 ID 指定），覆盖更新语义：传入后将被覆盖为目标用户的全部直绑标签，不传或传空数组则清空目标用户的所有直绑标签。每个元素中 TagId 必填，Values[].TagValueId 必填；传入的 TagValue、Source、GroupNames 服务端不读取，无需传入。标签维度与标签值可先通过 CreateTags / CreateTagValues 创建，再通过 ListTags 获取 ID（TagId 取 Items[].TagId，TagValueId 取 Items[].TagValues[].TagValueId）。</p>
     * @param Tags <p>待更新的标签集合（标签维度及标签值通过 ID 指定），覆盖更新语义：传入后将被覆盖为目标用户的全部直绑标签，不传或传空数组则清空目标用户的所有直绑标签。每个元素中 TagId 必填，Values[].TagValueId 必填；传入的 TagValue、Source、GroupNames 服务端不读取，无需传入。标签维度与标签值可先通过 CreateTags / CreateTagValues 创建，再通过 ListTags 获取 ID（TagId 取 Items[].TagId，TagValueId 取 Items[].TagValues[].TagValueId）。</p>
     */
    public void setTags(UserTagInfo [] Tags) {
        this.Tags = Tags;
    }

    public UpdateWorkspaceUsersTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkspaceUsersTagsRequest(UpdateWorkspaceUsersTagsRequest source) {
        if (source.UserUins != null) {
            this.UserUins = new String[source.UserUins.length];
            for (int i = 0; i < source.UserUins.length; i++) {
                this.UserUins[i] = new String(source.UserUins[i]);
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
        this.setParamArraySimple(map, prefix + "UserUins.", this.UserUins);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

