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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceActivityRecordRequest extends AbstractModel{

    /**
    * 活动id
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * 状态码
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 自定义子状态
    */
    @SerializedName("SubStatus")
    @Expose
    private String SubStatus;

    /**
    * 鉴权token
    */
    @SerializedName("ChannelToken")
    @Expose
    private String ChannelToken;

    /**
    * 渠道名，不同渠道对应不同secretKey
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get 活动id 
     * @return ActivityId 活动id
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动id
     * @param ActivityId 活动id
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 状态码 
     * @return Status 状态码
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态码
     * @param Status 状态码
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 自定义子状态 
     * @return SubStatus 自定义子状态
     */
    public String getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 自定义子状态
     * @param SubStatus 自定义子状态
     */
    public void setSubStatus(String SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 鉴权token 
     * @return ChannelToken 鉴权token
     */
    public String getChannelToken() {
        return this.ChannelToken;
    }

    /**
     * Set 鉴权token
     * @param ChannelToken 鉴权token
     */
    public void setChannelToken(String ChannelToken) {
        this.ChannelToken = ChannelToken;
    }

    /**
     * Get 渠道名，不同渠道对应不同secretKey 
     * @return Channel 渠道名，不同渠道对应不同secretKey
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道名，不同渠道对应不同secretKey
     * @param Channel 渠道名，不同渠道对应不同secretKey
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public ReplaceActivityRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceActivityRecordRequest(ReplaceActivityRecordRequest source) {
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new String(source.SubStatus);
        }
        if (source.ChannelToken != null) {
            this.ChannelToken = new String(source.ChannelToken);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamSimple(map, prefix + "ChannelToken", this.ChannelToken);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

