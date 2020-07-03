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
package com.tencentcloudapi.solar.v20181011.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyActivityChannelRequest extends AbstractModel{

    /**
    * 活动ID
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 来源渠道ID
    */
    @SerializedName("ChannelFrom")
    @Expose
    private String ChannelFrom;

    /**
    * 目的渠道id
    */
    @SerializedName("ChannelTo")
    @Expose
    private String [] ChannelTo;

    /**
     * Get 活动ID 
     * @return ActivityId 活动ID
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动ID
     * @param ActivityId 活动ID
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 来源渠道ID 
     * @return ChannelFrom 来源渠道ID
     */
    public String getChannelFrom() {
        return this.ChannelFrom;
    }

    /**
     * Set 来源渠道ID
     * @param ChannelFrom 来源渠道ID
     */
    public void setChannelFrom(String ChannelFrom) {
        this.ChannelFrom = ChannelFrom;
    }

    /**
     * Get 目的渠道id 
     * @return ChannelTo 目的渠道id
     */
    public String [] getChannelTo() {
        return this.ChannelTo;
    }

    /**
     * Set 目的渠道id
     * @param ChannelTo 目的渠道id
     */
    public void setChannelTo(String [] ChannelTo) {
        this.ChannelTo = ChannelTo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ChannelFrom", this.ChannelFrom);
        this.setParamArraySimple(map, prefix + "ChannelTo.", this.ChannelTo);

    }
}

