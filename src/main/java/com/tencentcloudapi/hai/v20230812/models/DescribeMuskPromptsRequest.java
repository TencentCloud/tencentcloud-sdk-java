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

public class DescribeMuskPromptsRequest extends AbstractModel {

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
    * offset 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤参数 支持过滤的键值： PromptId，Status
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get offset  
     * @return Offset offset 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set offset 
     * @param Offset offset 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get limit 
     * @return Limit limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set limit
     * @param Limit limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤参数 支持过滤的键值： PromptId，Status 
     * @return Filters 过滤参数 支持过滤的键值： PromptId，Status
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数 支持过滤的键值： PromptId，Status
     * @param Filters 过滤参数 支持过滤的键值： PromptId，Status
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeMuskPromptsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMuskPromptsRequest(DescribeMuskPromptsRequest source) {
        if (source.WorkgroupId != null) {
            this.WorkgroupId = new String(source.WorkgroupId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkgroupId", this.WorkgroupId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

