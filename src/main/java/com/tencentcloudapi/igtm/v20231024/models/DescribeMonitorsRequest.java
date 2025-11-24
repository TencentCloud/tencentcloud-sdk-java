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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMonitorsRequest extends AbstractModel {

    /**
    * 分页，偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页，当前分页记录数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询过滤条件：MonitorName：监控器名称；MonitorId：监控器id
    */
    @SerializedName("Filters")
    @Expose
    private ResourceFilter [] Filters;

    /**
    * 是否查探测次数0否1是
    */
    @SerializedName("IsDetectNum")
    @Expose
    private Long IsDetectNum;

    /**
     * Get 分页，偏移值 
     * @return Offset 分页，偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页，偏移值
     * @param Offset 分页，偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页，当前分页记录数 
     * @return Limit 分页，当前分页记录数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页，当前分页记录数
     * @param Limit 分页，当前分页记录数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询过滤条件：MonitorName：监控器名称；MonitorId：监控器id 
     * @return Filters 查询过滤条件：MonitorName：监控器名称；MonitorId：监控器id
     */
    public ResourceFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询过滤条件：MonitorName：监控器名称；MonitorId：监控器id
     * @param Filters 查询过滤条件：MonitorName：监控器名称；MonitorId：监控器id
     */
    public void setFilters(ResourceFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否查探测次数0否1是 
     * @return IsDetectNum 是否查探测次数0否1是
     */
    public Long getIsDetectNum() {
        return this.IsDetectNum;
    }

    /**
     * Set 是否查探测次数0否1是
     * @param IsDetectNum 是否查探测次数0否1是
     */
    public void setIsDetectNum(Long IsDetectNum) {
        this.IsDetectNum = IsDetectNum;
    }

    public DescribeMonitorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonitorsRequest(DescribeMonitorsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new ResourceFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ResourceFilter(source.Filters[i]);
            }
        }
        if (source.IsDetectNum != null) {
            this.IsDetectNum = new Long(source.IsDetectNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IsDetectNum", this.IsDetectNum);

    }
}

