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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordDatesByLiveRequest extends AbstractModel{

    /**
    * 直播频道ID
    */
    @SerializedName("LiveChannelId")
    @Expose
    private String LiveChannelId;

    /**
    * 分页值，本地录制时参数无效
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制值，本地录制时参数无效
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 直播频道ID 
     * @return LiveChannelId 直播频道ID
     */
    public String getLiveChannelId() {
        return this.LiveChannelId;
    }

    /**
     * Set 直播频道ID
     * @param LiveChannelId 直播频道ID
     */
    public void setLiveChannelId(String LiveChannelId) {
        this.LiveChannelId = LiveChannelId;
    }

    /**
     * Get 分页值，本地录制时参数无效 
     * @return Offset 分页值，本地录制时参数无效
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页值，本地录制时参数无效
     * @param Offset 分页值，本地录制时参数无效
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制值，本地录制时参数无效 
     * @return Limit 限制值，本地录制时参数无效
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制值，本地录制时参数无效
     * @param Limit 限制值，本地录制时参数无效
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRecordDatesByLiveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordDatesByLiveRequest(DescribeRecordDatesByLiveRequest source) {
        if (source.LiveChannelId != null) {
            this.LiveChannelId = new String(source.LiveChannelId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveChannelId", this.LiveChannelId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

