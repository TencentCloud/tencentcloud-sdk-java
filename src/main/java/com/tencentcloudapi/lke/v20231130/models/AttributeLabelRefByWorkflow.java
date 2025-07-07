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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeLabelRefByWorkflow extends AbstractModel {

    /**
    * 标签值id
    */
    @SerializedName("AttributeLabelBizId")
    @Expose
    private String AttributeLabelBizId;

    /**
    * 标签值引用的工作流列表
    */
    @SerializedName("WorkflowList")
    @Expose
    private WorkflowRef [] WorkflowList;

    /**
     * Get 标签值id 
     * @return AttributeLabelBizId 标签值id
     */
    public String getAttributeLabelBizId() {
        return this.AttributeLabelBizId;
    }

    /**
     * Set 标签值id
     * @param AttributeLabelBizId 标签值id
     */
    public void setAttributeLabelBizId(String AttributeLabelBizId) {
        this.AttributeLabelBizId = AttributeLabelBizId;
    }

    /**
     * Get 标签值引用的工作流列表 
     * @return WorkflowList 标签值引用的工作流列表
     */
    public WorkflowRef [] getWorkflowList() {
        return this.WorkflowList;
    }

    /**
     * Set 标签值引用的工作流列表
     * @param WorkflowList 标签值引用的工作流列表
     */
    public void setWorkflowList(WorkflowRef [] WorkflowList) {
        this.WorkflowList = WorkflowList;
    }

    public AttributeLabelRefByWorkflow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributeLabelRefByWorkflow(AttributeLabelRefByWorkflow source) {
        if (source.AttributeLabelBizId != null) {
            this.AttributeLabelBizId = new String(source.AttributeLabelBizId);
        }
        if (source.WorkflowList != null) {
            this.WorkflowList = new WorkflowRef[source.WorkflowList.length];
            for (int i = 0; i < source.WorkflowList.length; i++) {
                this.WorkflowList[i] = new WorkflowRef(source.WorkflowList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttributeLabelBizId", this.AttributeLabelBizId);
        this.setParamArrayObj(map, prefix + "WorkflowList.", this.WorkflowList);

    }
}

