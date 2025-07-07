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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyJobsRequest extends AbstractModel {

    /**
    * 复制明细列表
    */
    @SerializedName("JobItems")
    @Expose
    private CopyJobItem [] JobItems;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
    * 目标工作空间 SerialId
    */
    @SerializedName("TargetWorkspaceId")
    @Expose
    private String TargetWorkspaceId;

    /**
     * Get 复制明细列表 
     * @return JobItems 复制明细列表
     */
    public CopyJobItem [] getJobItems() {
        return this.JobItems;
    }

    /**
     * Set 复制明细列表
     * @param JobItems 复制明细列表
     */
    public void setJobItems(CopyJobItem [] JobItems) {
        this.JobItems = JobItems;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    /**
     * Get 目标工作空间 SerialId 
     * @return TargetWorkspaceId 目标工作空间 SerialId
     */
    public String getTargetWorkspaceId() {
        return this.TargetWorkspaceId;
    }

    /**
     * Set 目标工作空间 SerialId
     * @param TargetWorkspaceId 目标工作空间 SerialId
     */
    public void setTargetWorkspaceId(String TargetWorkspaceId) {
        this.TargetWorkspaceId = TargetWorkspaceId;
    }

    public CopyJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyJobsRequest(CopyJobsRequest source) {
        if (source.JobItems != null) {
            this.JobItems = new CopyJobItem[source.JobItems.length];
            for (int i = 0; i < source.JobItems.length; i++) {
                this.JobItems[i] = new CopyJobItem(source.JobItems[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
        if (source.TargetWorkspaceId != null) {
            this.TargetWorkspaceId = new String(source.TargetWorkspaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "JobItems.", this.JobItems);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);
        this.setParamSimple(map, prefix + "TargetWorkspaceId", this.TargetWorkspaceId);

    }
}

