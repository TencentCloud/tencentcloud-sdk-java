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

public class DescribeActivityRecordRequest extends AbstractModel{

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
    * 活动id列表
    */
    @SerializedName("ActivityIdList")
    @Expose
    private Long [] ActivityIdList;

    /**
    * 过滤状态码，已废弃
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态码过滤数组，空数组时不过滤
    */
    @SerializedName("Statuses")
    @Expose
    private Long [] Statuses;

    /**
    * 根据是否软删除进行过滤，[0]未删除, [1] 删除，不传不过滤
    */
    @SerializedName("IsDeletedList")
    @Expose
    private Long [] IsDeletedList;

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
     * Get 活动id列表 
     * @return ActivityIdList 活动id列表
     */
    public Long [] getActivityIdList() {
        return this.ActivityIdList;
    }

    /**
     * Set 活动id列表
     * @param ActivityIdList 活动id列表
     */
    public void setActivityIdList(Long [] ActivityIdList) {
        this.ActivityIdList = ActivityIdList;
    }

    /**
     * Get 过滤状态码，已废弃 
     * @return Status 过滤状态码，已废弃
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 过滤状态码，已废弃
     * @param Status 过滤状态码，已废弃
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态码过滤数组，空数组时不过滤 
     * @return Statuses 状态码过滤数组，空数组时不过滤
     */
    public Long [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set 状态码过滤数组，空数组时不过滤
     * @param Statuses 状态码过滤数组，空数组时不过滤
     */
    public void setStatuses(Long [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get 根据是否软删除进行过滤，[0]未删除, [1] 删除，不传不过滤 
     * @return IsDeletedList 根据是否软删除进行过滤，[0]未删除, [1] 删除，不传不过滤
     */
    public Long [] getIsDeletedList() {
        return this.IsDeletedList;
    }

    /**
     * Set 根据是否软删除进行过滤，[0]未删除, [1] 删除，不传不过滤
     * @param IsDeletedList 根据是否软删除进行过滤，[0]未删除, [1] 删除，不传不过滤
     */
    public void setIsDeletedList(Long [] IsDeletedList) {
        this.IsDeletedList = IsDeletedList;
    }

    public DescribeActivityRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeActivityRecordRequest(DescribeActivityRecordRequest source) {
        if (source.ChannelToken != null) {
            this.ChannelToken = new String(source.ChannelToken);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.ActivityIdList != null) {
            this.ActivityIdList = new Long[source.ActivityIdList.length];
            for (int i = 0; i < source.ActivityIdList.length; i++) {
                this.ActivityIdList[i] = new Long(source.ActivityIdList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Statuses != null) {
            this.Statuses = new Long[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new Long(source.Statuses[i]);
            }
        }
        if (source.IsDeletedList != null) {
            this.IsDeletedList = new Long[source.IsDeletedList.length];
            for (int i = 0; i < source.IsDeletedList.length; i++) {
                this.IsDeletedList[i] = new Long(source.IsDeletedList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelToken", this.ChannelToken);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamArraySimple(map, prefix + "ActivityIdList.", this.ActivityIdList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamArraySimple(map, prefix + "IsDeletedList.", this.IsDeletedList);

    }
}

