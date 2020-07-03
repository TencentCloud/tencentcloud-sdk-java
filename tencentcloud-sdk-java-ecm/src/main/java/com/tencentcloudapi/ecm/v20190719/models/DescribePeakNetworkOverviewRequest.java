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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePeakNetworkOverviewRequest extends AbstractModel{

    /**
    * 开始时间（xxxx-xx-xx）如2019-08-14，默认为一周之前的日期。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间（xxxx-xx-xx）如2019-08-14，默认为昨天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 过滤条件。
region    String      是否必填：否     （过滤条件）按照region过滤,不支持模糊匹配。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 开始时间（xxxx-xx-xx）如2019-08-14，默认为一周之前的日期。 
     * @return StartTime 开始时间（xxxx-xx-xx）如2019-08-14，默认为一周之前的日期。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（xxxx-xx-xx）如2019-08-14，默认为一周之前的日期。
     * @param StartTime 开始时间（xxxx-xx-xx）如2019-08-14，默认为一周之前的日期。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（xxxx-xx-xx）如2019-08-14，默认为昨天。 
     * @return EndTime 结束时间（xxxx-xx-xx）如2019-08-14，默认为昨天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（xxxx-xx-xx）如2019-08-14，默认为昨天。
     * @param EndTime 结束时间（xxxx-xx-xx）如2019-08-14，默认为昨天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 过滤条件。
region    String      是否必填：否     （过滤条件）按照region过滤,不支持模糊匹配。 
     * @return Filters 过滤条件。
region    String      是否必填：否     （过滤条件）按照region过滤,不支持模糊匹配。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
region    String      是否必填：否     （过滤条件）按照region过滤,不支持模糊匹配。
     * @param Filters 过滤条件。
region    String      是否必填：否     （过滤条件）按照region过滤,不支持模糊匹配。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

