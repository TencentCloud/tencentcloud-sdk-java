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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAvatarEditingLiveResponse extends AbstractModel {

    /**
    * <p>通道ID，通常是待编辑的直播流的源ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>实时编辑会话ID</p>
    */
    @SerializedName("LiveId")
    @Expose
    private String LiveId;

    /**
    * <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li><li>not_exist： 不存在</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>内部模块会话状态</p>
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * <p>输出Mode</p>
    */
    @SerializedName("CallMode")
    @Expose
    private String CallMode;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>开播时刻</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，如果还没结束则该值为0</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>跟踪ID，用于查日志</p>
    */
    @SerializedName("TraceId")
    @Expose
    private String TraceId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>通道ID，通常是待编辑的直播流的源ID</p> 
     * @return ChannelId <p>通道ID，通常是待编辑的直播流的源ID</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道ID，通常是待编辑的直播流的源ID</p>
     * @param ChannelId <p>通道ID，通常是待编辑的直播流的源ID</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>实时编辑会话ID</p> 
     * @return LiveId <p>实时编辑会话ID</p>
     */
    public String getLiveId() {
        return this.LiveId;
    }

    /**
     * Set <p>实时编辑会话ID</p>
     * @param LiveId <p>实时编辑会话ID</p>
     */
    public void setLiveId(String LiveId) {
        this.LiveId = LiveId;
    }

    /**
     * Get <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li><li>not_exist： 不存在</li></ul> 
     * @return Status <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li><li>not_exist： 不存在</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li><li>not_exist： 不存在</li></ul>
     * @param Status <p>实时编辑会话的状态</p><p>枚举值：</p><ul><li>waiting： 等待中</li><li>on_live： 直播中</li><li>ending： 结束中</li><li>ended： 已结束</li><li>prepared： 准备中</li><li>not_exist： 不存在</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>内部模块会话状态</p> 
     * @return Phase <p>内部模块会话状态</p>
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set <p>内部模块会话状态</p>
     * @param Phase <p>内部模块会话状态</p>
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get <p>输出Mode</p> 
     * @return CallMode <p>输出Mode</p>
     */
    public String getCallMode() {
        return this.CallMode;
    }

    /**
     * Set <p>输出Mode</p>
     * @param CallMode <p>输出Mode</p>
     */
    public void setCallMode(String CallMode) {
        this.CallMode = CallMode;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>开播时刻</p> 
     * @return StartTime <p>开播时刻</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开播时刻</p>
     * @param StartTime <p>开播时刻</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，如果还没结束则该值为0</p> 
     * @return EndTime <p>结束时间，如果还没结束则该值为0</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，如果还没结束则该值为0</p>
     * @param EndTime <p>结束时间，如果还没结束则该值为0</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>跟踪ID，用于查日志</p> 
     * @return TraceId <p>跟踪ID，用于查日志</p>
     */
    public String getTraceId() {
        return this.TraceId;
    }

    /**
     * Set <p>跟踪ID，用于查日志</p>
     * @param TraceId <p>跟踪ID，用于查日志</p>
     */
    public void setTraceId(String TraceId) {
        this.TraceId = TraceId;
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

    public DescribeAvatarEditingLiveResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvatarEditingLiveResponse(DescribeAvatarEditingLiveResponse source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.LiveId != null) {
            this.LiveId = new String(source.LiveId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.CallMode != null) {
            this.CallMode = new String(source.CallMode);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TraceId != null) {
            this.TraceId = new String(source.TraceId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "LiveId", this.LiveId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "CallMode", this.CallMode);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TraceId", this.TraceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

