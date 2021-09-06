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

public class DescribeUserActivityInfoRequest extends AbstractModel{

    /**
    * 活动id
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * 渠道加密token
    */
    @SerializedName("ChannelToken")
    @Expose
    private String ChannelToken;

    /**
    * 渠道来源，每个来源对应不同secretKey
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 团id, 1元钱裂变中活动团id不为空时根据团id来查询记录，为空时查询uin最新记录
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

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
     * Get 渠道加密token 
     * @return ChannelToken 渠道加密token
     */
    public String getChannelToken() {
        return this.ChannelToken;
    }

    /**
     * Set 渠道加密token
     * @param ChannelToken 渠道加密token
     */
    public void setChannelToken(String ChannelToken) {
        this.ChannelToken = ChannelToken;
    }

    /**
     * Get 渠道来源，每个来源对应不同secretKey 
     * @return Channel 渠道来源，每个来源对应不同secretKey
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道来源，每个来源对应不同secretKey
     * @param Channel 渠道来源，每个来源对应不同secretKey
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 团id, 1元钱裂变中活动团id不为空时根据团id来查询记录，为空时查询uin最新记录 
     * @return GroupId 团id, 1元钱裂变中活动团id不为空时根据团id来查询记录，为空时查询uin最新记录
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 团id, 1元钱裂变中活动团id不为空时根据团id来查询记录，为空时查询uin最新记录
     * @param GroupId 团id, 1元钱裂变中活动团id不为空时根据团id来查询记录，为空时查询uin最新记录
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public DescribeUserActivityInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserActivityInfoRequest(DescribeUserActivityInfoRequest source) {
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.ChannelToken != null) {
            this.ChannelToken = new String(source.ChannelToken);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ChannelToken", this.ChannelToken);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

