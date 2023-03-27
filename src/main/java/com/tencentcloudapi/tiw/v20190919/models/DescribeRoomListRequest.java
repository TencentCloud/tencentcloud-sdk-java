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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomListRequest extends AbstractModel{

    /**
    * 白板应用的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 查询时间段，Unix时间戳，单位毫秒，第一个值为开始时间戳，第二个值为结束时间
    */
    @SerializedName("TimeRange")
    @Expose
    private Long [] TimeRange;

    /**
    * 额外的查询条件
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 返回最大的数据条数，默认1000
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
     * Get 白板应用的SdkAppId 
     * @return SdkAppId 白板应用的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 白板应用的SdkAppId
     * @param SdkAppId 白板应用的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 查询时间段，Unix时间戳，单位毫秒，第一个值为开始时间戳，第二个值为结束时间 
     * @return TimeRange 查询时间段，Unix时间戳，单位毫秒，第一个值为开始时间戳，第二个值为结束时间
     */
    public Long [] getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set 查询时间段，Unix时间戳，单位毫秒，第一个值为开始时间戳，第二个值为结束时间
     * @param TimeRange 查询时间段，Unix时间戳，单位毫秒，第一个值为开始时间戳，第二个值为结束时间
     */
    public void setTimeRange(Long [] TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get 额外的查询条件 
     * @return Query 额外的查询条件
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 额外的查询条件
     * @param Query 额外的查询条件
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 返回最大的数据条数，默认1000 
     * @return MaxSize 返回最大的数据条数，默认1000
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set 返回最大的数据条数，默认1000
     * @param MaxSize 返回最大的数据条数，默认1000
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    public DescribeRoomListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomListRequest(DescribeRoomListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new Long[source.TimeRange.length];
            for (int i = 0; i < source.TimeRange.length; i++) {
                this.TimeRange[i] = new Long(source.TimeRange[i]);
            }
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.MaxSize != null) {
            this.MaxSize = new Long(source.MaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "TimeRange.", this.TimeRange);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);

    }
}

