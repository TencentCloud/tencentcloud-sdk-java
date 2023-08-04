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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayRecordRequest extends AbstractModel{

    /**
    * 通道 ID（从查询通道DescribeDeviceChannel接口中获取）
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 起始时间
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    *  结束时间
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * 流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * 分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get 通道 ID（从查询通道DescribeDeviceChannel接口中获取） 
     * @return ChannelId 通道 ID（从查询通道DescribeDeviceChannel接口中获取）
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID（从查询通道DescribeDeviceChannel接口中获取）
     * @param ChannelId 通道 ID（从查询通道DescribeDeviceChannel接口中获取）
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 起始时间 
     * @return Start 起始时间
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 起始时间
     * @param Start 起始时间
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get  结束时间 
     * @return End  结束时间
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set  结束时间
     * @param End  结束时间
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get 流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发）） 
     * @return StreamType 流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））
     * @param StreamType 流类型（1:主码流；2:子码流（不可以和 Resolution 同时下发））
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发）） 
     * @return Resolution 分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））
     * @param Resolution 分辨率（1:QCIF；2:CIF； 3:4CIF； 4:D1； 5:720P； 6:1080P/I； 自定义的19201080等等（需设备支持）（不可以和 StreamType 同时下发））
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
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

    }
}

