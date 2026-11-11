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

public class GetSessionStatusRequest extends AbstractModel {

    /**
    * <p>工作空间 ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>待查询的会话列表（支持传多个，传一条即单条查询）</p>
    */
    @SerializedName("Items")
    @Expose
    private SessionStatusQueryItem [] Items;

    /**
     * Get <p>工作空间 ID</p> 
     * @return WorkspaceId <p>工作空间 ID</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间 ID</p>
     * @param WorkspaceId <p>工作空间 ID</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>待查询的会话列表（支持传多个，传一条即单条查询）</p> 
     * @return Items <p>待查询的会话列表（支持传多个，传一条即单条查询）</p>
     */
    public SessionStatusQueryItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>待查询的会话列表（支持传多个，传一条即单条查询）</p>
     * @param Items <p>待查询的会话列表（支持传多个，传一条即单条查询）</p>
     */
    public void setItems(SessionStatusQueryItem [] Items) {
        this.Items = Items;
    }

    public GetSessionStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetSessionStatusRequest(GetSessionStatusRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.Items != null) {
            this.Items = new SessionStatusQueryItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SessionStatusQueryItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

