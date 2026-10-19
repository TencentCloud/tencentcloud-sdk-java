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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopWorkflowRunListRequest extends AbstractModel {

    /**
    * <p>应用ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>工作流运行实例ID列表</p>
    */
    @SerializedName("WorkflowRunIdList")
    @Expose
    private String [] WorkflowRunIdList;

    /**
     * Get <p>应用ID</p> 
     * @return AppId <p>应用ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用ID</p>
     * @param AppId <p>应用ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>工作流运行实例ID列表</p> 
     * @return WorkflowRunIdList <p>工作流运行实例ID列表</p>
     */
    public String [] getWorkflowRunIdList() {
        return this.WorkflowRunIdList;
    }

    /**
     * Set <p>工作流运行实例ID列表</p>
     * @param WorkflowRunIdList <p>工作流运行实例ID列表</p>
     */
    public void setWorkflowRunIdList(String [] WorkflowRunIdList) {
        this.WorkflowRunIdList = WorkflowRunIdList;
    }

    public StopWorkflowRunListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopWorkflowRunListRequest(StopWorkflowRunListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkflowRunIdList != null) {
            this.WorkflowRunIdList = new String[source.WorkflowRunIdList.length];
            for (int i = 0; i < source.WorkflowRunIdList.length; i++) {
                this.WorkflowRunIdList[i] = new String(source.WorkflowRunIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArraySimple(map, prefix + "WorkflowRunIdList.", this.WorkflowRunIdList);

    }
}

