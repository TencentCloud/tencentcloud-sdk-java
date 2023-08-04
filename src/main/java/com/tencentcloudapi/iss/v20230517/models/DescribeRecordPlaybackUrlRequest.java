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

public class DescribeRecordPlaybackUrlRequest extends AbstractModel{

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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

