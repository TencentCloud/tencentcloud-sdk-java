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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserListItem extends AbstractModel{

    /**
    * 房间内的用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户在查询时间段内最早出现的时间，Unix时间戳，单位毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 用户在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 房间内的用户ID 
     * @return UserId 房间内的用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 房间内的用户ID
     * @param UserId 房间内的用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户在查询时间段内最早出现的时间，Unix时间戳，单位毫秒 
     * @return StartTime 用户在查询时间段内最早出现的时间，Unix时间戳，单位毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 用户在查询时间段内最早出现的时间，Unix时间戳，单位毫秒
     * @param StartTime 用户在查询时间段内最早出现的时间，Unix时间戳，单位毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 用户在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒 
     * @return EndTime 用户在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 用户在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒
     * @param EndTime 用户在查询时间段内最晚出现的时间，Unix时间戳，单位毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public UserListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserListItem(UserListItem source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

