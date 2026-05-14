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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRumStatsLogListV2Request extends AbstractModel {

    /**
    * 开始时间（必填）
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 单次查询返回的原始日志条数，最大值为100（必填）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 结束时间（必填）
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 项目ID（必填）
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
     * Get 开始时间（必填） 
     * @return StartTime 开始时间（必填）
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（必填）
     * @param StartTime 开始时间（必填）
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 单次查询返回的原始日志条数，最大值为100（必填） 
     * @return Limit 单次查询返回的原始日志条数，最大值为100（必填）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次查询返回的原始日志条数，最大值为100（必填）
     * @param Limit 单次查询返回的原始日志条数，最大值为100（必填）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件 
     * @return Filter 过滤条件
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件
     * @param Filter 过滤条件
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 结束时间（必填） 
     * @return EndTime 结束时间（必填）
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（必填）
     * @param EndTime 结束时间（必填）
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 项目ID（必填） 
     * @return ID 项目ID（必填）
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 项目ID（必填）
     * @param ID 项目ID（必填）
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    public DescribeRumStatsLogListV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRumStatsLogListV2Request(DescribeRumStatsLogListV2Request source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

