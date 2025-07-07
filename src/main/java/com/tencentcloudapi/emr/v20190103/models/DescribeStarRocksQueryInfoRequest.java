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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStarRocksQueryInfoRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 获取查询信息开始时间 (s)
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 获取查询信息结束时间 (s)
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 分页查询时的分页大小，最小1，最大100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页查询时的页号，从1开始
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 获取查询信息开始时间 (s) 
     * @return StartTime 获取查询信息开始时间 (s)
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 获取查询信息开始时间 (s)
     * @param StartTime 获取查询信息开始时间 (s)
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 获取查询信息结束时间 (s) 
     * @return EndTime 获取查询信息结束时间 (s)
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 获取查询信息结束时间 (s)
     * @param EndTime 获取查询信息结束时间 (s)
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页查询时的分页大小，最小1，最大100 
     * @return PageSize 分页查询时的分页大小，最小1，最大100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页查询时的分页大小，最小1，最大100
     * @param PageSize 分页查询时的分页大小，最小1，最大100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页查询时的页号，从1开始 
     * @return Page 分页查询时的页号，从1开始
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 分页查询时的页号，从1开始
     * @param Page 分页查询时的页号，从1开始
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    public DescribeStarRocksQueryInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStarRocksQueryInfoRequest(DescribeStarRocksQueryInfoRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Page", this.Page);

    }
}

