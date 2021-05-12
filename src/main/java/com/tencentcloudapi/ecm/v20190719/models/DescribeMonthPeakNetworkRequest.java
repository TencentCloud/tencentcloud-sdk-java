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

public class DescribeMonthPeakNetworkRequest extends AbstractModel{

    /**
    * 月份时间(xxxx-xx) 如2021-03,默认取当前时间的上一个月份
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 月份时间(xxxx-xx) 如2021-03,默认取当前时间的上一个月份 
     * @return Month 月份时间(xxxx-xx) 如2021-03,默认取当前时间的上一个月份
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set 月份时间(xxxx-xx) 如2021-03,默认取当前时间的上一个月份
     * @param Month 月份时间(xxxx-xx) 如2021-03,默认取当前时间的上一个月份
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeMonthPeakNetworkRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMonthPeakNetworkRequest(DescribeMonthPeakNetworkRequest source) {
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Month", this.Month);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

