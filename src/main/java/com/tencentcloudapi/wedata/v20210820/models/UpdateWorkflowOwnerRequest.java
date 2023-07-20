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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateWorkflowOwnerRequest extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流Ids
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * 责任人，多个以';'号分割
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 责任人UserId，多个以';'号分割
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流Ids 
     * @return WorkflowIds 工作流Ids
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set 工作流Ids
     * @param WorkflowIds 工作流Ids
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get 责任人，多个以';'号分割 
     * @return Owner 责任人，多个以';'号分割
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 责任人，多个以';'号分割
     * @param Owner 责任人，多个以';'号分割
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 责任人UserId，多个以';'号分割 
     * @return OwnerId 责任人UserId，多个以';'号分割
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 责任人UserId，多个以';'号分割
     * @param OwnerId 责任人UserId，多个以';'号分割
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public UpdateWorkflowOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateWorkflowOwnerRequest(UpdateWorkflowOwnerRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);

    }
}

