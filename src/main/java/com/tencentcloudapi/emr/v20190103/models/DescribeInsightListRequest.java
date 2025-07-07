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

public class DescribeInsightListRequest extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 获取的洞察结果开始时间，此时间针对对App或者Hive查询的开始时间的过滤
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 获取的洞察结果结束时间，此时间针对对App或者Hive查询的开始时间的过滤
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
    * 查询类型,支持HIVE,SPARK,DLC_SPARK,SPARK_SQL,SCHEDULE,MAPREDUCE,TRINO等类型,默认查询全部
    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
     * Get 获取的洞察结果开始时间，此时间针对对App或者Hive查询的开始时间的过滤 
     * @return StartTime 获取的洞察结果开始时间，此时间针对对App或者Hive查询的开始时间的过滤
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 获取的洞察结果开始时间，此时间针对对App或者Hive查询的开始时间的过滤
     * @param StartTime 获取的洞察结果开始时间，此时间针对对App或者Hive查询的开始时间的过滤
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 获取的洞察结果结束时间，此时间针对对App或者Hive查询的开始时间的过滤 
     * @return EndTime 获取的洞察结果结束时间，此时间针对对App或者Hive查询的开始时间的过滤
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 获取的洞察结果结束时间，此时间针对对App或者Hive查询的开始时间的过滤
     * @param EndTime 获取的洞察结果结束时间，此时间针对对App或者Hive查询的开始时间的过滤
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

    /**
     * Get 查询类型,支持HIVE,SPARK,DLC_SPARK,SPARK_SQL,SCHEDULE,MAPREDUCE,TRINO等类型,默认查询全部 
     * @return Type 查询类型,支持HIVE,SPARK,DLC_SPARK,SPARK_SQL,SCHEDULE,MAPREDUCE,TRINO等类型,默认查询全部
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 查询类型,支持HIVE,SPARK,DLC_SPARK,SPARK_SQL,SCHEDULE,MAPREDUCE,TRINO等类型,默认查询全部
     * @param Type 查询类型,支持HIVE,SPARK,DLC_SPARK,SPARK_SQL,SCHEDULE,MAPREDUCE,TRINO等类型,默认查询全部
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeInsightListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInsightListRequest(DescribeInsightListRequest source) {
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
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

