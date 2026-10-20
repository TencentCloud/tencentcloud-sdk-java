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

public class StartComputeRequest extends AbstractModel {

    /**
    * 工作空间 ID
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）。替代已废弃的 ResourceId；过渡期 ComputeResourceId 与 ResourceId 至少传一个，同时传时必须一致
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
    * [已废弃，请使用 ComputeResourceId] 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 工作空间 ID 
     * @return WorkspaceId 工作空间 ID
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间 ID
     * @param WorkspaceId 工作空间 ID
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）。替代已废弃的 ResourceId；过渡期 ComputeResourceId 与 ResourceId 至少传一个，同时传时必须一致 
     * @return ComputeResourceId 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）。替代已废弃的 ResourceId；过渡期 ComputeResourceId 与 ResourceId 至少传一个，同时传时必须一致
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）。替代已废弃的 ResourceId；过渡期 ComputeResourceId 与 ResourceId 至少传一个，同时传时必须一致
     * @param ComputeResourceId 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）。替代已废弃的 ResourceId；过渡期 ComputeResourceId 与 ResourceId 至少传一个，同时传时必须一致
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    /**
     * Get [已废弃，请使用 ComputeResourceId] 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId） 
     * @return ResourceId [已废弃，请使用 ComputeResourceId] 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set [已废弃，请使用 ComputeResourceId] 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）
     * @param ResourceId [已废弃，请使用 ComputeResourceId] 计算资源 ID，可通过 ListComputes 接口获取（返回字段 Items[].BasicInfo.ResourceId）
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public StartComputeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartComputeRequest(StartComputeRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

