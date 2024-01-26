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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryWorkflowVersionResponse extends AbstractModel {

    /**
    * 项目编号
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流编号
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 版本信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionInfos")
    @Expose
    private WorkflowVersionInfo [] VersionInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 项目编号 
     * @return ProjectId 项目编号
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目编号
     * @param ProjectId 项目编号
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流编号 
     * @return WorkflowId 工作流编号
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流编号
     * @param WorkflowId 工作流编号
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 版本信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionInfos 版本信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowVersionInfo [] getVersionInfos() {
        return this.VersionInfos;
    }

    /**
     * Set 版本信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionInfos 版本信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionInfos(WorkflowVersionInfo [] VersionInfos) {
        this.VersionInfos = VersionInfos;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public QueryWorkflowVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryWorkflowVersionResponse(QueryWorkflowVersionResponse source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.VersionInfos != null) {
            this.VersionInfos = new WorkflowVersionInfo[source.VersionInfos.length];
            for (int i = 0; i < source.VersionInfos.length; i++) {
                this.VersionInfos[i] = new WorkflowVersionInfo(source.VersionInfos[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamArrayObj(map, prefix + "VersionInfos.", this.VersionInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

