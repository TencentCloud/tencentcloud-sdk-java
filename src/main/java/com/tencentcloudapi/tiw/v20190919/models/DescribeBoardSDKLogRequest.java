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

public class DescribeBoardSDKLogRequest extends AbstractModel{

    /**
    * 白板应用的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 需要查询日志的白板房间号
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 需要查询日志的用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 查询时间段，Unix时间戳，单位毫秒，第一个值为开始时间戳，第二个值为结束时间
    */
    @SerializedName("TimeRange")
    @Expose
    private Long [] TimeRange;

    /**
    * 聚合日志条数查询的桶的时间范围，如5m, 1h, 4h等
    */
    @SerializedName("AggregationInterval")
    @Expose
    private String AggregationInterval;

    /**
    * 额外的查询条件
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 是否按时间升序排列
    */
    @SerializedName("Ascending")
    @Expose
    private Boolean Ascending;

    /**
    * 用于递归拉取的上下文Key，在上一次请求中返回
    */
    @SerializedName("Context")
    @Expose
    private String Context;

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
     * Get 需要查询日志的白板房间号 
     * @return RoomId 需要查询日志的白板房间号
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 需要查询日志的白板房间号
     * @param RoomId 需要查询日志的白板房间号
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 需要查询日志的用户ID 
     * @return UserId 需要查询日志的用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 需要查询日志的用户ID
     * @param UserId 需要查询日志的用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
     * Get 聚合日志条数查询的桶的时间范围，如5m, 1h, 4h等 
     * @return AggregationInterval 聚合日志条数查询的桶的时间范围，如5m, 1h, 4h等
     */
    public String getAggregationInterval() {
        return this.AggregationInterval;
    }

    /**
     * Set 聚合日志条数查询的桶的时间范围，如5m, 1h, 4h等
     * @param AggregationInterval 聚合日志条数查询的桶的时间范围，如5m, 1h, 4h等
     */
    public void setAggregationInterval(String AggregationInterval) {
        this.AggregationInterval = AggregationInterval;
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
     * Get 是否按时间升序排列 
     * @return Ascending 是否按时间升序排列
     */
    public Boolean getAscending() {
        return this.Ascending;
    }

    /**
     * Set 是否按时间升序排列
     * @param Ascending 是否按时间升序排列
     */
    public void setAscending(Boolean Ascending) {
        this.Ascending = Ascending;
    }

    /**
     * Get 用于递归拉取的上下文Key，在上一次请求中返回 
     * @return Context 用于递归拉取的上下文Key，在上一次请求中返回
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 用于递归拉取的上下文Key，在上一次请求中返回
     * @param Context 用于递归拉取的上下文Key，在上一次请求中返回
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public DescribeBoardSDKLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBoardSDKLogRequest(DescribeBoardSDKLogRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new Long[source.TimeRange.length];
            for (int i = 0; i < source.TimeRange.length; i++) {
                this.TimeRange[i] = new Long(source.TimeRange[i]);
            }
        }
        if (source.AggregationInterval != null) {
            this.AggregationInterval = new String(source.AggregationInterval);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Ascending != null) {
            this.Ascending = new Boolean(source.Ascending);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArraySimple(map, prefix + "TimeRange.", this.TimeRange);
        this.setParamSimple(map, prefix + "AggregationInterval", this.AggregationInterval);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Ascending", this.Ascending);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

