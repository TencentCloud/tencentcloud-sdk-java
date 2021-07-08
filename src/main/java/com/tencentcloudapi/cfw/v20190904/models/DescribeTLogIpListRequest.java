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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTLogIpListRequest extends AbstractModel{

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 类型 1 告警 2阻断
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * top数
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 查询条件
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 类型 1 告警 2阻断 
     * @return QueryType 类型 1 告警 2阻断
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * Set 类型 1 告警 2阻断
     * @param QueryType 类型 1 告警 2阻断
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * Get top数 
     * @return Top top数
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set top数
     * @param Top top数
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 查询条件 
     * @return SearchValue 查询条件
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 查询条件
     * @param SearchValue 查询条件
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    public DescribeTLogIpListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTLogIpListRequest(DescribeTLogIpListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QueryType != null) {
            this.QueryType = new String(source.QueryType);
        }
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

