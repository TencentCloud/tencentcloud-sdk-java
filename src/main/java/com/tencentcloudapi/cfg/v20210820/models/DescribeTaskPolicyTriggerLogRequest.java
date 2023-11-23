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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskPolicyTriggerLogRequest extends AbstractModel {

    /**
    * 演练ID
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 页码
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 演练ID 
     * @return TaskId 演练ID
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 演练ID
     * @param TaskId 演练ID
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 页码 
     * @return Page 页码
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码
     * @param Page 页码
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 页数量 
     * @return PageSize 页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页数量
     * @param PageSize 页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeTaskPolicyTriggerLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskPolicyTriggerLogRequest(DescribeTaskPolicyTriggerLogRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

