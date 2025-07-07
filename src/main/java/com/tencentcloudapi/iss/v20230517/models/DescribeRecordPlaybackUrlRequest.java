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

public class DescribeRecordPlaybackUrlRequest extends AbstractModel {

    /**
    * 设备通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 回放开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 回放结束时间，UTC秒数，例如：1662114246，开始和结束时间段最长为一天，且不能跨天
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 是否获取内网地址
    */
    @SerializedName("IsInternal")
    @Expose
    private Boolean IsInternal;

    /**
    * 云录像回放时，是否需要开启时间戳矫正，主要解决时间戳反转，会退等问题导致无法播放
    */
    @SerializedName("CorrectTimestamp")
    @Expose
    private Boolean CorrectTimestamp;

    /**
     * Get 设备通道ID 
     * @return ChannelId 设备通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 设备通道ID
     * @param ChannelId 设备通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 回放开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天 
     * @return StartTime 回放开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 回放开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     * @param StartTime 回放开始时间，UTC秒数，例如：1662114146，开始和结束时间段最长为一天，且不能跨天
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 回放结束时间，UTC秒数，例如：1662114246，开始和结束时间段最长为一天，且不能跨天 
     * @return EndTime 回放结束时间，UTC秒数，例如：1662114246，开始和结束时间段最长为一天，且不能跨天
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 回放结束时间，UTC秒数，例如：1662114246，开始和结束时间段最长为一天，且不能跨天
     * @param EndTime 回放结束时间，UTC秒数，例如：1662114246，开始和结束时间段最长为一天，且不能跨天
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否获取内网地址 
     * @return IsInternal 是否获取内网地址
     */
    public Boolean getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set 是否获取内网地址
     * @param IsInternal 是否获取内网地址
     */
    public void setIsInternal(Boolean IsInternal) {
        this.IsInternal = IsInternal;
    }

    /**
     * Get 云录像回放时，是否需要开启时间戳矫正，主要解决时间戳反转，会退等问题导致无法播放 
     * @return CorrectTimestamp 云录像回放时，是否需要开启时间戳矫正，主要解决时间戳反转，会退等问题导致无法播放
     */
    public Boolean getCorrectTimestamp() {
        return this.CorrectTimestamp;
    }

    /**
     * Set 云录像回放时，是否需要开启时间戳矫正，主要解决时间戳反转，会退等问题导致无法播放
     * @param CorrectTimestamp 云录像回放时，是否需要开启时间戳矫正，主要解决时间戳反转，会退等问题导致无法播放
     */
    public void setCorrectTimestamp(Boolean CorrectTimestamp) {
        this.CorrectTimestamp = CorrectTimestamp;
    }

    public DescribeRecordPlaybackUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordPlaybackUrlRequest(DescribeRecordPlaybackUrlRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Boolean(source.IsInternal);
        }
        if (source.CorrectTimestamp != null) {
            this.CorrectTimestamp = new Boolean(source.CorrectTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);
        this.setParamSimple(map, prefix + "CorrectTimestamp", this.CorrectTimestamp);

    }
}

