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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAnnotationTasksRequest extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>分页偏移，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，默认 20，最大 100</p><p>取值范围：[10, 100]</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>按文件名前缀过滤，不传不过滤</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>按处理项状态过滤：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>任务 ID</p> 
     * @return JobId <p>任务 ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param JobId <p>任务 ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>分页偏移，默认 0</p> 
     * @return Offset <p>分页偏移，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移，默认 0</p>
     * @param Offset <p>分页偏移，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，默认 20，最大 100</p><p>取值范围：[10, 100]</p> 
     * @return Limit <p>每页数量，默认 20，最大 100</p><p>取值范围：[10, 100]</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，默认 20，最大 100</p><p>取值范围：[10, 100]</p>
     * @param Limit <p>每页数量，默认 20，最大 100</p><p>取值范围：[10, 100]</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>按文件名前缀过滤，不传不过滤</p> 
     * @return FileName <p>按文件名前缀过滤，不传不过滤</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>按文件名前缀过滤，不传不过滤</p>
     * @param FileName <p>按文件名前缀过滤，不传不过滤</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>按处理项状态过滤：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul> 
     * @return Status <p>按处理项状态过滤：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>按处理项状态过滤：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul>
     * @param Status <p>按处理项状态过滤：1 未处理，2 处理中，3 超时，4 异常，5待确认，6 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 未处理</li><li>2： 处理中</li><li>3： 超时</li><li>4： 异常</li><li>5： 待确认</li><li>6： 成功</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeAnnotationTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAnnotationTasksRequest(DescribeAnnotationTasksRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

