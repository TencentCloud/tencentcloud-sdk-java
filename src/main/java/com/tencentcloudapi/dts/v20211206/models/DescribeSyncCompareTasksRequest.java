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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSyncCompareTasksRequest extends AbstractModel {

    /**
    * <p>任务 Id</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>分页设置，表示每页显示多少条任务，默认为 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>校验任务 ID</p>
    */
    @SerializedName("CompareTaskId")
    @Expose
    private String CompareTaskId;

    /**
    * <p>任务状态过滤，可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p>
    */
    @SerializedName("Status")
    @Expose
    private String [] Status;

    /**
     * Get <p>任务 Id</p> 
     * @return JobId <p>任务 Id</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>任务 Id</p>
     * @param JobId <p>任务 Id</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>分页设置，表示每页显示多少条任务，默认为 20</p> 
     * @return Limit <p>分页设置，表示每页显示多少条任务，默认为 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页设置，表示每页显示多少条任务，默认为 20</p>
     * @param Limit <p>分页设置，表示每页显示多少条任务，默认为 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量</p> 
     * @return Offset <p>分页偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量</p>
     * @param Offset <p>分页偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>校验任务 ID</p> 
     * @return CompareTaskId <p>校验任务 ID</p>
     */
    public String getCompareTaskId() {
        return this.CompareTaskId;
    }

    /**
     * Set <p>校验任务 ID</p>
     * @param CompareTaskId <p>校验任务 ID</p>
     */
    public void setCompareTaskId(String CompareTaskId) {
        this.CompareTaskId = CompareTaskId;
    }

    /**
     * Get <p>任务状态过滤，可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p> 
     * @return Status <p>任务状态过滤，可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p>
     */
    public String [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态过滤，可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p>
     * @param Status <p>任务状态过滤，可能的值：created - 创建完成；readyRun - 等待运行；running - 运行中；success - 成功；stopping - 结束中；failed - 失败；canceled - 已终止</p>
     */
    public void setStatus(String [] Status) {
        this.Status = Status;
    }

    public DescribeSyncCompareTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSyncCompareTasksRequest(DescribeSyncCompareTasksRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.CompareTaskId != null) {
            this.CompareTaskId = new String(source.CompareTaskId);
        }
        if (source.Status != null) {
            this.Status = new String[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new String(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "CompareTaskId", this.CompareTaskId);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

