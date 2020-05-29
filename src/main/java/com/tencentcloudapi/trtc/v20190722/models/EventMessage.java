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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventMessage extends AbstractModel{

    /**
    * 视频流类型：
0：与视频无关的事件；
2：视频为大画面；
3：视频为小画面；
7：视频为旁路画面；
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 事件上报的时间戳，unix时间（1589891188801ms)
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 事件Id：分为sdk的事件和webrtc的事件，详情见：附录/事件 ID 映射表：https://cloud.tencent.com/document/product/647/44916
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 事件的第一个参数，如视频分辨率宽
    */
    @SerializedName("ParamOne")
    @Expose
    private Long ParamOne;

    /**
    * 事件的第二个参数，如视频分辨率高
    */
    @SerializedName("ParamTwo")
    @Expose
    private Long ParamTwo;

    /**
     * Get 视频流类型：
0：与视频无关的事件；
2：视频为大画面；
3：视频为小画面；
7：视频为旁路画面； 
     * @return Type 视频流类型：
0：与视频无关的事件；
2：视频为大画面；
3：视频为小画面；
7：视频为旁路画面；
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 视频流类型：
0：与视频无关的事件；
2：视频为大画面；
3：视频为小画面；
7：视频为旁路画面；
     * @param Type 视频流类型：
0：与视频无关的事件；
2：视频为大画面；
3：视频为小画面；
7：视频为旁路画面；
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 事件上报的时间戳，unix时间（1589891188801ms) 
     * @return Time 事件上报的时间戳，unix时间（1589891188801ms)
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 事件上报的时间戳，unix时间（1589891188801ms)
     * @param Time 事件上报的时间戳，unix时间（1589891188801ms)
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 事件Id：分为sdk的事件和webrtc的事件，详情见：附录/事件 ID 映射表：https://cloud.tencent.com/document/product/647/44916 
     * @return EventId 事件Id：分为sdk的事件和webrtc的事件，详情见：附录/事件 ID 映射表：https://cloud.tencent.com/document/product/647/44916
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 事件Id：分为sdk的事件和webrtc的事件，详情见：附录/事件 ID 映射表：https://cloud.tencent.com/document/product/647/44916
     * @param EventId 事件Id：分为sdk的事件和webrtc的事件，详情见：附录/事件 ID 映射表：https://cloud.tencent.com/document/product/647/44916
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件的第一个参数，如视频分辨率宽 
     * @return ParamOne 事件的第一个参数，如视频分辨率宽
     */
    public Long getParamOne() {
        return this.ParamOne;
    }

    /**
     * Set 事件的第一个参数，如视频分辨率宽
     * @param ParamOne 事件的第一个参数，如视频分辨率宽
     */
    public void setParamOne(Long ParamOne) {
        this.ParamOne = ParamOne;
    }

    /**
     * Get 事件的第二个参数，如视频分辨率高 
     * @return ParamTwo 事件的第二个参数，如视频分辨率高
     */
    public Long getParamTwo() {
        return this.ParamTwo;
    }

    /**
     * Set 事件的第二个参数，如视频分辨率高
     * @param ParamTwo 事件的第二个参数，如视频分辨率高
     */
    public void setParamTwo(Long ParamTwo) {
        this.ParamTwo = ParamTwo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "ParamOne", this.ParamOne);
        this.setParamSimple(map, prefix + "ParamTwo", this.ParamTwo);

    }
}

