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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCallbackRecordsListRequest extends AbstractModel{

    /**
    * 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 流名称，精确匹配。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 页码。
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 每页条数。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 事件类型。
0: "断流",
1: "推流",
100: "录制"
200: "截图回调"。
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 回调结果。
0为成功，其他为失败。
    */
    @SerializedName("ResultCode")
    @Expose
    private Long ResultCode;

    /**
     * Get 起始时间点，格式为yyyy-mm-dd HH:MM:SS。 
     * @return StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     * @param StartTime 起始时间点，格式为yyyy-mm-dd HH:MM:SS。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。 
     * @return EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。
     * @param EndTime 结束时间点，格式为yyyy-mm-dd HH:MM:SS，起始和结束时间跨度不支持超过1天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 流名称，精确匹配。 
     * @return StreamName 流名称，精确匹配。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称，精确匹配。
     * @param StreamName 流名称，精确匹配。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 页码。 
     * @return PageNum 页码。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页码。
     * @param PageNum 页码。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页条数。 
     * @return PageSize 每页条数。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页条数。
     * @param PageSize 每页条数。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 事件类型。
0: "断流",
1: "推流",
100: "录制"
200: "截图回调"。 
     * @return EventType 事件类型。
0: "断流",
1: "推流",
100: "录制"
200: "截图回调"。
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型。
0: "断流",
1: "推流",
100: "录制"
200: "截图回调"。
     * @param EventType 事件类型。
0: "断流",
1: "推流",
100: "录制"
200: "截图回调"。
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 回调结果。
0为成功，其他为失败。 
     * @return ResultCode 回调结果。
0为成功，其他为失败。
     */
    public Long getResultCode() {
        return this.ResultCode;
    }

    /**
     * Set 回调结果。
0为成功，其他为失败。
     * @param ResultCode 回调结果。
0为成功，其他为失败。
     */
    public void setResultCode(Long ResultCode) {
        this.ResultCode = ResultCode;
    }

    public DescribeCallbackRecordsListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCallbackRecordsListRequest(DescribeCallbackRecordsListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.ResultCode != null) {
            this.ResultCode = new Long(source.ResultCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);

    }
}

