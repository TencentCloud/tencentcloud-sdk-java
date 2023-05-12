/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryRunsRequest extends AbstractModel{

    /**
    * 关联项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务UUID。
    */
    @SerializedName("RunUuids")
    @Expose
    private String [] RunUuids;

    /**
     * Get 关联项目ID。 
     * @return ProjectId 关联项目ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 关联项目ID。
     * @param ProjectId 关联项目ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务UUID。 
     * @return RunUuids 任务UUID。
     */
    public String [] getRunUuids() {
        return this.RunUuids;
    }

    /**
     * Set 任务UUID。
     * @param RunUuids 任务UUID。
     */
    public void setRunUuids(String [] RunUuids) {
        this.RunUuids = RunUuids;
    }

    public RetryRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryRunsRequest(RetryRunsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RunUuids != null) {
            this.RunUuids = new String[source.RunUuids.length];
            for (int i = 0; i < source.RunUuids.length; i++) {
                this.RunUuids[i] = new String(source.RunUuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "RunUuids.", this.RunUuids);

    }
}

