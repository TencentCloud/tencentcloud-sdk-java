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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMuskPromptRequest extends AbstractModel {

    /**
    * workgroup id
    */
    @SerializedName("WorkgroupId")
    @Expose
    private String WorkgroupId;

    /**
    * workflow id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * prompt 参数
    */
    @SerializedName("PromptParams")
    @Expose
    private String PromptParams;

    /**
     * Get workgroup id 
     * @return WorkgroupId workgroup id
     */
    public String getWorkgroupId() {
        return this.WorkgroupId;
    }

    /**
     * Set workgroup id
     * @param WorkgroupId workgroup id
     */
    public void setWorkgroupId(String WorkgroupId) {
        this.WorkgroupId = WorkgroupId;
    }

    /**
     * Get workflow id 
     * @return WorkflowId workflow id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set workflow id
     * @param WorkflowId workflow id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get prompt 参数 
     * @return PromptParams prompt 参数
     */
    public String getPromptParams() {
        return this.PromptParams;
    }

    /**
     * Set prompt 参数
     * @param PromptParams prompt 参数
     */
    public void setPromptParams(String PromptParams) {
        this.PromptParams = PromptParams;
    }

    public CreateMuskPromptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMuskPromptRequest(CreateMuskPromptRequest source) {
        if (source.WorkgroupId != null) {
            this.WorkgroupId = new String(source.WorkgroupId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.PromptParams != null) {
            this.PromptParams = new String(source.PromptParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkgroupId", this.WorkgroupId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "PromptParams", this.PromptParams);

    }
}

