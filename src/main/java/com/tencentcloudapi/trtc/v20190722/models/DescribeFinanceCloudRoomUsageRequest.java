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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFinanceCloudRoomUsageRequest extends AbstractModel {

    /**
    * <p>与房间对应的 TRTC SdkAppId，必须是金融云应用。</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>查询开始时间，格式为 YYYY-MM-DD HH:MM，精确到分钟级。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，格式为 YYYY-MM-DD HH:MM，单次查询不超过 24 小时。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>与房间对应的 TRTC SdkAppId，必须是金融云应用。</p> 
     * @return SdkAppId <p>与房间对应的 TRTC SdkAppId，必须是金融云应用。</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>与房间对应的 TRTC SdkAppId，必须是金融云应用。</p>
     * @param SdkAppId <p>与房间对应的 TRTC SdkAppId，必须是金融云应用。</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>查询开始时间，格式为 YYYY-MM-DD HH:MM，精确到分钟级。</p> 
     * @return StartTime <p>查询开始时间，格式为 YYYY-MM-DD HH:MM，精确到分钟级。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间，格式为 YYYY-MM-DD HH:MM，精确到分钟级。</p>
     * @param StartTime <p>查询开始时间，格式为 YYYY-MM-DD HH:MM，精确到分钟级。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，格式为 YYYY-MM-DD HH:MM，单次查询不超过 24 小时。</p> 
     * @return EndTime <p>查询结束时间，格式为 YYYY-MM-DD HH:MM，单次查询不超过 24 小时。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，格式为 YYYY-MM-DD HH:MM，单次查询不超过 24 小时。</p>
     * @param EndTime <p>查询结束时间，格式为 YYYY-MM-DD HH:MM，单次查询不超过 24 小时。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeFinanceCloudRoomUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFinanceCloudRoomUsageRequest(DescribeFinanceCloudRoomUsageRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
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
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

