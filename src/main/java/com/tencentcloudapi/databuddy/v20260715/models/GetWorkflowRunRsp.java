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

public class GetWorkflowRunRsp extends AbstractModel {

    /**
    * 工作流运行信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowRun")
    @Expose
    private WorkflowRun WorkflowRun;

    /**
     * Get 工作流运行信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowRun 工作流运行信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowRun getWorkflowRun() {
        return this.WorkflowRun;
    }

    /**
     * Set 工作流运行信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRun 工作流运行信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRun(WorkflowRun WorkflowRun) {
        this.WorkflowRun = WorkflowRun;
    }

    public GetWorkflowRunRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWorkflowRunRsp(GetWorkflowRunRsp source) {
        if (source.WorkflowRun != null) {
            this.WorkflowRun = new WorkflowRun(source.WorkflowRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "WorkflowRun.", this.WorkflowRun);

    }
}

