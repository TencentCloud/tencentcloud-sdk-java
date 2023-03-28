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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrtcRoomUsageRequest extends AbstractModel{

    /**
    * TRTC的SdkAppId，和房间所对应的SdkAppId相同。
    */
    @SerializedName("SdkAppid")
    @Expose
    private Long SdkAppid;

    /**
    * 查询开始时间，格式为YYYY-MM-DD HH:MM，精确到分钟级。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，格式为YYYY-MM-DD HH:MM，单次查询不超过24h。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get TRTC的SdkAppId，和房间所对应的SdkAppId相同。 
     * @return SdkAppid TRTC的SdkAppId，和房间所对应的SdkAppId相同。
     */
    public Long getSdkAppid() {
        return this.SdkAppid;
    }

    /**
     * Set TRTC的SdkAppId，和房间所对应的SdkAppId相同。
     * @param SdkAppid TRTC的SdkAppId，和房间所对应的SdkAppId相同。
     */
    public void setSdkAppid(Long SdkAppid) {
        this.SdkAppid = SdkAppid;
    }

    /**
     * Get 查询开始时间，格式为YYYY-MM-DD HH:MM，精确到分钟级。 
     * @return StartTime 查询开始时间，格式为YYYY-MM-DD HH:MM，精确到分钟级。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，格式为YYYY-MM-DD HH:MM，精确到分钟级。
     * @param StartTime 查询开始时间，格式为YYYY-MM-DD HH:MM，精确到分钟级。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，格式为YYYY-MM-DD HH:MM，单次查询不超过24h。 
     * @return EndTime 查询结束时间，格式为YYYY-MM-DD HH:MM，单次查询不超过24h。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，格式为YYYY-MM-DD HH:MM，单次查询不超过24h。
     * @param EndTime 查询结束时间，格式为YYYY-MM-DD HH:MM，单次查询不超过24h。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeTrtcRoomUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrtcRoomUsageRequest(DescribeTrtcRoomUsageRequest source) {
        if (source.SdkAppid != null) {
            this.SdkAppid = new Long(source.SdkAppid);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppid", this.SdkAppid);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

