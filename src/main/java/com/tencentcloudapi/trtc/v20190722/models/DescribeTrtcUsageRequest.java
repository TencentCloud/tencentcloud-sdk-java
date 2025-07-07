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

public class DescribeTrtcUsageRequest extends AbstractModel {

    /**
    * 查询开始时间，格式为YYYY-MM-DD。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，格式为YYYY-MM-DD。
单次查询统计区间最多不能超过31天。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * TRTC的SdkAppId，和房间所对应的SdkAppId相同。如果没有这个参数，返回用户下全部实时音视频应用的汇总。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get 查询开始时间，格式为YYYY-MM-DD。 
     * @return StartTime 查询开始时间，格式为YYYY-MM-DD。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间，格式为YYYY-MM-DD。
     * @param StartTime 查询开始时间，格式为YYYY-MM-DD。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间，格式为YYYY-MM-DD。
单次查询统计区间最多不能超过31天。 
     * @return EndTime 查询结束时间，格式为YYYY-MM-DD。
单次查询统计区间最多不能超过31天。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，格式为YYYY-MM-DD。
单次查询统计区间最多不能超过31天。
     * @param EndTime 查询结束时间，格式为YYYY-MM-DD。
单次查询统计区间最多不能超过31天。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get TRTC的SdkAppId，和房间所对应的SdkAppId相同。如果没有这个参数，返回用户下全部实时音视频应用的汇总。 
     * @return SdkAppId TRTC的SdkAppId，和房间所对应的SdkAppId相同。如果没有这个参数，返回用户下全部实时音视频应用的汇总。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的SdkAppId，和房间所对应的SdkAppId相同。如果没有这个参数，返回用户下全部实时音视频应用的汇总。
     * @param SdkAppId TRTC的SdkAppId，和房间所对应的SdkAppId相同。如果没有这个参数，返回用户下全部实时音视频应用的汇总。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public DescribeTrtcUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrtcUsageRequest(DescribeTrtcUsageRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

