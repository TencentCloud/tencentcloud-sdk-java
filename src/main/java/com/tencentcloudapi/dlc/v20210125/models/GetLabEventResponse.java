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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLabEventResponse extends AbstractModel {

    /**
    * <p>是否已经返回所有符合条件的日志，true 表示已全部返回</p>
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * <p>事件列表</p>
    */
    @SerializedName("Events")
    @Expose
    private EventItem [] Events;

    /**
    * <p>事件开始时间</p><p>单位：毫秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>事件结束时间</p><p>单位：毫秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否已经返回所有符合条件的日志，true 表示已全部返回</p> 
     * @return ListOver <p>是否已经返回所有符合条件的日志，true 表示已全部返回</p>
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set <p>是否已经返回所有符合条件的日志，true 表示已全部返回</p>
     * @param ListOver <p>是否已经返回所有符合条件的日志，true 表示已全部返回</p>
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get <p>事件列表</p> 
     * @return Events <p>事件列表</p>
     */
    public EventItem [] getEvents() {
        return this.Events;
    }

    /**
     * Set <p>事件列表</p>
     * @param Events <p>事件列表</p>
     */
    public void setEvents(EventItem [] Events) {
        this.Events = Events;
    }

    /**
     * Get <p>事件开始时间</p><p>单位：毫秒</p> 
     * @return StartTime <p>事件开始时间</p><p>单位：毫秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>事件开始时间</p><p>单位：毫秒</p>
     * @param StartTime <p>事件开始时间</p><p>单位：毫秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>事件结束时间</p><p>单位：毫秒</p> 
     * @return EndTime <p>事件结束时间</p><p>单位：毫秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>事件结束时间</p><p>单位：毫秒</p>
     * @param EndTime <p>事件结束时间</p><p>单位：毫秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
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

    public GetLabEventResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLabEventResponse(GetLabEventResponse source) {
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Events != null) {
            this.Events = new EventItem[source.Events.length];
            for (int i = 0; i < source.Events.length; i++) {
                this.Events[i] = new EventItem(source.Events[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamArrayObj(map, prefix + "Events.", this.Events);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

