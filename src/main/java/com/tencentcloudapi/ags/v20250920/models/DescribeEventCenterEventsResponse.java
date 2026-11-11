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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventCenterEventsResponse extends AbstractModel {

    /**
    * <p>本次查询返回的事件明细或聚合结果列表。无匹配结果时返回空数组。</p>
    */
    @SerializedName("Events")
    @Expose
    private EventItem [] Events;

    /**
    * <p>符合查询条件的结果总数，不受 Offset 和 Limit 影响。Raw 模式为去重后的事件总数，Aggregate 模式为聚合结果总数。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>本次查询实际使用的开始时间，RFC3339 格式，包含该时间点。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>本次查询实际使用的结束时间，RFC3339 格式，不包含该时间点。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>本次查询实际使用的模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式。</li><li>Aggregate： 聚合模式。</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>本次查询返回的事件明细或聚合结果列表。无匹配结果时返回空数组。</p> 
     * @return Events <p>本次查询返回的事件明细或聚合结果列表。无匹配结果时返回空数组。</p>
     */
    public EventItem [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>本次查询返回的事件明细或聚合结果列表。无匹配结果时返回空数组。</p>
     * @param Events <p>本次查询返回的事件明细或聚合结果列表。无匹配结果时返回空数组。</p>
     */
    public void setEvents(EventItem [] Events) {
        this.Events = Events;
    }

    /**
     * Get <p>符合查询条件的结果总数，不受 Offset 和 Limit 影响。Raw 模式为去重后的事件总数，Aggregate 模式为聚合结果总数。</p> 
     * @return TotalCount <p>符合查询条件的结果总数，不受 Offset 和 Limit 影响。Raw 模式为去重后的事件总数，Aggregate 模式为聚合结果总数。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>符合查询条件的结果总数，不受 Offset 和 Limit 影响。Raw 模式为去重后的事件总数，Aggregate 模式为聚合结果总数。</p>
     * @param TotalCount <p>符合查询条件的结果总数，不受 Offset 和 Limit 影响。Raw 模式为去重后的事件总数，Aggregate 模式为聚合结果总数。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>本次查询实际使用的开始时间，RFC3339 格式，包含该时间点。</p> 
     * @return StartTime <p>本次查询实际使用的开始时间，RFC3339 格式，包含该时间点。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>本次查询实际使用的开始时间，RFC3339 格式，包含该时间点。</p>
     * @param StartTime <p>本次查询实际使用的开始时间，RFC3339 格式，包含该时间点。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>本次查询实际使用的结束时间，RFC3339 格式，不包含该时间点。</p> 
     * @return EndTime <p>本次查询实际使用的结束时间，RFC3339 格式，不包含该时间点。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>本次查询实际使用的结束时间，RFC3339 格式，不包含该时间点。</p>
     * @param EndTime <p>本次查询实际使用的结束时间，RFC3339 格式，不包含该时间点。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>本次查询实际使用的模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式。</li><li>Aggregate： 聚合模式。</li></ul> 
     * @return Mode <p>本次查询实际使用的模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式。</li><li>Aggregate： 聚合模式。</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>本次查询实际使用的模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式。</li><li>Aggregate： 聚合模式。</li></ul>
     * @param Mode <p>本次查询实际使用的模式。</p><p>枚举值：</p><ul><li>Raw： 明细模式。</li><li>Aggregate： 聚合模式。</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEventCenterEventsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventCenterEventsResponse(DescribeEventCenterEventsResponse source) {
        if (source.Events != null) {
            this.Events = new EventItem[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new EventItem(source.Events[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

