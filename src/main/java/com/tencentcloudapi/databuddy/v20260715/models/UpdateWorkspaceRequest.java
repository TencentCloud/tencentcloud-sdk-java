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

public class UpdateWorkspaceRequest extends AbstractModel {

    /**
    * <p>工作空间ID</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>工作空间名称，max_len=128</p>
    */
    @SerializedName("WorkspaceName")
    @Expose
    private String WorkspaceName;

    /**
    * <p>工作空间描述，max_len=300</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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

    /**
     * Get <p>工作空间名称，max_len=128</p> 
     * @return WorkspaceName <p>工作空间名称，max_len=128</p>
     */
    public String getWorkspaceName() {
        return this.WorkspaceName;
    }

    /**
     * Set <p>工作空间名称，max_len=128</p>
     * @param WorkspaceName <p>工作空间名称，max_len=128</p>
     */
    public void setWorkspaceName(String WorkspaceName) {
        this.WorkspaceName = WorkspaceName;
    }

    /**
     * Get <p>工作空间描述，max_len=300</p> 
     * @return Description <p>工作空间描述，max_len=300</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>工作空间描述，max_len=300</p>
     * @param Description <p>工作空间描述，max_len=300</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateWorkspaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkspaceRequest(UpdateWorkspaceRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkspaceName != null) {
            this.WorkspaceName = new String(source.WorkspaceName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkspaceName", this.WorkspaceName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

