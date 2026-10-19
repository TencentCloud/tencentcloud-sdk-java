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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayRecordRequest extends AbstractModel {

    /**
    * <p>通道 ID（从查询通道DescribeDeviceChannel接口中获取）</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>起始时间</p>
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * <p>流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））</p>
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * <p>分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））</p>
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * <p>是否内网</p>
    */
    @SerializedName("IsInternal")
    @Expose
    private Boolean IsInternal;

    /**
     * Get <p>通道 ID（从查询通道DescribeDeviceChannel接口中获取）</p> 
     * @return ChannelId <p>通道 ID（从查询通道DescribeDeviceChannel接口中获取）</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID（从查询通道DescribeDeviceChannel接口中获取）</p>
     * @param ChannelId <p>通道 ID（从查询通道DescribeDeviceChannel接口中获取）</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>起始时间</p> 
     * @return Start <p>起始时间</p>
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set <p>起始时间</p>
     * @param Start <p>起始时间</p>
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get <p>结束时间</p> 
     * @return End <p>结束时间</p>
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set <p>结束时间</p>
     * @param End <p>结束时间</p>
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get <p>流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））</p> 
     * @return StreamType <p>流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））</p>
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set <p>流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））</p>
     * @param StreamType <p>流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））</p>
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get <p>分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））</p> 
     * @return Resolution <p>分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））</p>
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set <p>分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））</p>
     * @param Resolution <p>分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））</p>
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get <p>是否内网</p> 
     * @return IsInternal <p>是否内网</p>
     */
    public Boolean getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set <p>是否内网</p>
     * @param IsInternal <p>是否内网</p>
     */
    public void setIsInternal(Boolean IsInternal) {
        this.IsInternal = IsInternal;
    }

    public PlayRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayRecordRequest(PlayRecordRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Boolean(source.IsInternal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);

    }
}

