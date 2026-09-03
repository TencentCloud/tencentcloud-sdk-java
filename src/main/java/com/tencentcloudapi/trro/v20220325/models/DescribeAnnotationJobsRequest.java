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

public class DescribeAnnotationJobsRequest extends AbstractModel {

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
    * <p>按任务状态过滤：1 处理中，2 异常，3 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>按输入路径前缀过滤，不传不过滤</p>
    */
    @SerializedName("InputPath")
    @Expose
    private String InputPath;

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
     * Get <p>按任务状态过滤：1 处理中，2 异常，3 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul> 
     * @return Status <p>按任务状态过滤：1 处理中，2 异常，3 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>按任务状态过滤：1 处理中，2 异常，3 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul>
     * @param Status <p>按任务状态过滤：1 处理中，2 异常，3 成功。不传查全部</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>按输入路径前缀过滤，不传不过滤</p> 
     * @return InputPath <p>按输入路径前缀过滤，不传不过滤</p>
     */
    public String getInputPath() {
        return this.InputPath;
    }

    /**
     * Set <p>按输入路径前缀过滤，不传不过滤</p>
     * @param InputPath <p>按输入路径前缀过滤，不传不过滤</p>
     */
    public void setInputPath(String InputPath) {
        this.InputPath = InputPath;
    }

    public DescribeAnnotationJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAnnotationJobsRequest(DescribeAnnotationJobsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InputPath != null) {
            this.InputPath = new String(source.InputPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InputPath", this.InputPath);

    }
}

