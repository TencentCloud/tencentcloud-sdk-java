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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCSIPLicenseBindScheduleRequest extends AbstractModel {

    /**
    * <p>ModifyCSIPLicenseBinds返回的任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>分页大小，默认10</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤条件，支持按 Status 过滤（0-初始化 1-成功 2-失败 3-跳过）</p>
    */
    @SerializedName("Filters")
    @Expose
    private LicenseBindFilter [] Filters;

    /**
     * Get <p>ModifyCSIPLicenseBinds返回的任务ID</p> 
     * @return TaskId <p>ModifyCSIPLicenseBinds返回的任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>ModifyCSIPLicenseBinds返回的任务ID</p>
     * @param TaskId <p>ModifyCSIPLicenseBinds返回的任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>分页大小，默认10</p> 
     * @return Limit <p>分页大小，默认10</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小，默认10</p>
     * @param Limit <p>分页大小，默认10</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移</p> 
     * @return Offset <p>分页偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移</p>
     * @param Offset <p>分页偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤条件，支持按 Status 过滤（0-初始化 1-成功 2-失败 3-跳过）</p> 
     * @return Filters <p>过滤条件，支持按 Status 过滤（0-初始化 1-成功 2-失败 3-跳过）</p>
     */
    public LicenseBindFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，支持按 Status 过滤（0-初始化 1-成功 2-失败 3-跳过）</p>
     * @param Filters <p>过滤条件，支持按 Status 过滤（0-初始化 1-成功 2-失败 3-跳过）</p>
     */
    public void setFilters(LicenseBindFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCSIPLicenseBindScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCSIPLicenseBindScheduleRequest(DescribeCSIPLicenseBindScheduleRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new LicenseBindFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new LicenseBindFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

