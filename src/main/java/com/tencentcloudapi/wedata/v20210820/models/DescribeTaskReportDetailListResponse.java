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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskReportDetailListResponse extends AbstractModel{

    /**
    * 页码，从1开始
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 每页的记录数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 总页数
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 任务运行指标
    */
    @SerializedName("Items")
    @Expose
    private TaskReportDetail [] Items;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 页码，从1开始 
     * @return PageIndex 页码，从1开始
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页码，从1开始
     * @param PageIndex 页码，从1开始
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 每页的记录数 
     * @return PageSize 每页的记录数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页的记录数
     * @param PageSize 每页的记录数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总记录数 
     * @return TotalCount 总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
     * @param TotalCount 总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 总页数 
     * @return TotalPage 总页数
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数
     * @param TotalPage 总页数
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 任务运行指标 
     * @return Items 任务运行指标
     */
    public TaskReportDetail [] getItems() {
        return this.Items;
    }

    /**
     * Set 任务运行指标
     * @param Items 任务运行指标
     */
    public void setItems(TaskReportDetail [] Items) {
        this.Items = Items;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeTaskReportDetailListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskReportDetailListResponse(DescribeTaskReportDetailListResponse source) {
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalPage != null) {
            this.TotalPage = new Long(source.TotalPage);
        }
        if (source.Items != null) {
            this.Items = new TaskReportDetail[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new TaskReportDetail(source.Items[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

