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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogRequest extends AbstractModel{

    /**
    * 请求量统计起始时间
    */
    @SerializedName("TimeRangeBegin")
    @Expose
    private String TimeRangeBegin;

    /**
    * 筛选参数：ZoneId：私有域ID；Domain：私有域；OperatorUin：操作者账号ID
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 请求量统计结束时间
    */
    @SerializedName("TimeRangeEnd")
    @Expose
    private String TimeRangeEnd;

    /**
    * 分页偏移量，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页限制数目， 最大100，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 请求量统计起始时间 
     * @return TimeRangeBegin 请求量统计起始时间
     */
    public String getTimeRangeBegin() {
        return this.TimeRangeBegin;
    }

    /**
     * Set 请求量统计起始时间
     * @param TimeRangeBegin 请求量统计起始时间
     */
    public void setTimeRangeBegin(String TimeRangeBegin) {
        this.TimeRangeBegin = TimeRangeBegin;
    }

    /**
     * Get 筛选参数：ZoneId：私有域ID；Domain：私有域；OperatorUin：操作者账号ID 
     * @return Filters 筛选参数：ZoneId：私有域ID；Domain：私有域；OperatorUin：操作者账号ID
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选参数：ZoneId：私有域ID；Domain：私有域；OperatorUin：操作者账号ID
     * @param Filters 筛选参数：ZoneId：私有域ID；Domain：私有域；OperatorUin：操作者账号ID
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 请求量统计结束时间 
     * @return TimeRangeEnd 请求量统计结束时间
     */
    public String getTimeRangeEnd() {
        return this.TimeRangeEnd;
    }

    /**
     * Set 请求量统计结束时间
     * @param TimeRangeEnd 请求量统计结束时间
     */
    public void setTimeRangeEnd(String TimeRangeEnd) {
        this.TimeRangeEnd = TimeRangeEnd;
    }

    /**
     * Get 分页偏移量，从0开始 
     * @return Offset 分页偏移量，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，从0开始
     * @param Offset 分页偏移量，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页限制数目， 最大100，默认20 
     * @return Limit 分页限制数目， 最大100，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页限制数目， 最大100，默认20
     * @param Limit 分页限制数目， 最大100，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAuditLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogRequest(DescribeAuditLogRequest source) {
        if (source.TimeRangeBegin != null) {
            this.TimeRangeBegin = new String(source.TimeRangeBegin);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TimeRangeEnd != null) {
            this.TimeRangeEnd = new String(source.TimeRangeEnd);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRangeBegin", this.TimeRangeBegin);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "TimeRangeEnd", this.TimeRangeEnd);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

