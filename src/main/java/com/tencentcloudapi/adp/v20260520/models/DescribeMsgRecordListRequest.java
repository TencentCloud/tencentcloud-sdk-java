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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMsgRecordListRequest extends AbstractModel {

    /**
    * <p>应用 ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>过滤条件列表，支持：ChannelType（渠道类型，0 全部）、FeedbackType（反馈类型，-1 为全部）、QueryType、Query、CategoryId、ReplyMethod、StartTime、EndTime（秒时间戳）、Cursor（游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor）、Direction（方向，next 下一页，prev 上一页）、CallResult（调用结果，默认 0 为全部，1 为成功，2 为失败）、FailReason、Intent</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>页码，从 0 开始；不传时按 0 处理</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>排序条件，只支持按 CreateTime 排序</p>
    */
    @SerializedName("Sort")
    @Expose
    private Sort Sort;

    /**
     * Get <p>应用 ID</p> 
     * @return AppId <p>应用 ID</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID</p>
     * @param AppId <p>应用 ID</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>过滤条件列表，支持：ChannelType（渠道类型，0 全部）、FeedbackType（反馈类型，-1 为全部）、QueryType、Query、CategoryId、ReplyMethod、StartTime、EndTime（秒时间戳）、Cursor（游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor）、Direction（方向，next 下一页，prev 上一页）、CallResult（调用结果，默认 0 为全部，1 为成功，2 为失败）、FailReason、Intent</p> 
     * @return FilterList <p>过滤条件列表，支持：ChannelType（渠道类型，0 全部）、FeedbackType（反馈类型，-1 为全部）、QueryType、Query、CategoryId、ReplyMethod、StartTime、EndTime（秒时间戳）、Cursor（游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor）、Direction（方向，next 下一页，prev 上一页）、CallResult（调用结果，默认 0 为全部，1 为成功，2 为失败）、FailReason、Intent</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>过滤条件列表，支持：ChannelType（渠道类型，0 全部）、FeedbackType（反馈类型，-1 为全部）、QueryType、Query、CategoryId、ReplyMethod、StartTime、EndTime（秒时间戳）、Cursor（游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor）、Direction（方向，next 下一页，prev 上一页）、CallResult（调用结果，默认 0 为全部，1 为成功，2 为失败）、FailReason、Intent</p>
     * @param FilterList <p>过滤条件列表，支持：ChannelType（渠道类型，0 全部）、FeedbackType（反馈类型，-1 为全部）、QueryType、Query、CategoryId、ReplyMethod、StartTime、EndTime（秒时间戳）、Cursor（游标信息，上一页取响应 PrevCursor，下一页取响应 NextCursor）、Direction（方向，next 下一页，prev 上一页）、CallResult（调用结果，默认 0 为全部，1 为成功，2 为失败）、FailReason、Intent</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>页码，从 0 开始；不传时按 0 处理</p> 
     * @return PageNumber <p>页码，从 0 开始；不传时按 0 处理</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从 0 开始；不传时按 0 处理</p>
     * @param PageNumber <p>页码，从 0 开始；不传时按 0 处理</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p> 
     * @return PageSize <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p>
     * @param PageSize <p>每页数量，最大 100；不传或传 0 时按默认分页大小处理</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>排序条件，只支持按 CreateTime 排序</p> 
     * @return Sort <p>排序条件，只支持按 CreateTime 排序</p>
     */
    public Sort getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序条件，只支持按 CreateTime 排序</p>
     * @param Sort <p>排序条件，只支持按 CreateTime 排序</p>
     */
    public void setSort(Sort Sort) {
        this.Sort = Sort;
    }

    public DescribeMsgRecordListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMsgRecordListRequest(DescribeMsgRecordListRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Sort != null) {
            this.Sort = new Sort(source.Sort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "Sort.", this.Sort);

    }
}

