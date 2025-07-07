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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryFollowListRequest extends AbstractModel {

    /**
    * 分页，预期请求的数据量，取值范围 1 ~ 1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询开始时间， 单位秒
    */
    @SerializedName("BeginTime")
    @Expose
    private Long BeginTime;

    /**
    * 查询结束时间， 单位秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
     * Get 分页，预期请求的数据量，取值范围 1 ~ 1000 
     * @return Limit 分页，预期请求的数据量，取值范围 1 ~ 1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页，预期请求的数据量，取值范围 1 ~ 1000
     * @param Limit 分页，预期请求的数据量，取值范围 1 ~ 1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询开始时间， 单位秒 
     * @return BeginTime 查询开始时间， 单位秒
     */
    public Long getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 查询开始时间， 单位秒
     * @param BeginTime 查询开始时间， 单位秒
     */
    public void setBeginTime(Long BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 查询结束时间， 单位秒 
     * @return EndTime 查询结束时间， 单位秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间， 单位秒
     * @param EndTime 查询结束时间， 单位秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填 
     * @return Cursor 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     * @param Cursor 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    public QueryFollowListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryFollowListRequest(QueryFollowListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new Long(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);

    }
}

