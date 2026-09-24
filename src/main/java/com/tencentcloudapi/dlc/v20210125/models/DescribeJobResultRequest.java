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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobResultRequest extends AbstractModel {

    /**
    * <p>作业唯一标识符（ID）。必填。</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>页码，从1开始，默认为1.</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页返回数量，默认为10.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Statement 序号（1-based），多语句作业时指定；缺省为 0，取整作业第一个结果集.</p>
    */
    @SerializedName("StatementIndex")
    @Expose
    private Long StatementIndex;

    /**
     * Get <p>作业唯一标识符（ID）。必填。</p> 
     * @return JobId <p>作业唯一标识符（ID）。必填。</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业唯一标识符（ID）。必填。</p>
     * @param JobId <p>作业唯一标识符（ID）。必填。</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>页码，从1开始，默认为1.</p> 
     * @return Page <p>页码，从1开始，默认为1.</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码，从1开始，默认为1.</p>
     * @param Page <p>页码，从1开始，默认为1.</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页返回数量，默认为10.</p> 
     * @return PageSize <p>每页返回数量，默认为10.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页返回数量，默认为10.</p>
     * @param PageSize <p>每页返回数量，默认为10.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Statement 序号（1-based），多语句作业时指定；缺省为 0，取整作业第一个结果集.</p> 
     * @return StatementIndex <p>Statement 序号（1-based），多语句作业时指定；缺省为 0，取整作业第一个结果集.</p>
     */
    public Long getStatementIndex() {
        return this.StatementIndex;
    }

    /**
     * Set <p>Statement 序号（1-based），多语句作业时指定；缺省为 0，取整作业第一个结果集.</p>
     * @param StatementIndex <p>Statement 序号（1-based），多语句作业时指定；缺省为 0，取整作业第一个结果集.</p>
     */
    public void setStatementIndex(Long StatementIndex) {
        this.StatementIndex = StatementIndex;
    }

    public DescribeJobResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobResultRequest(DescribeJobResultRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.StatementIndex != null) {
            this.StatementIndex = new Long(source.StatementIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "StatementIndex", this.StatementIndex);

    }
}

