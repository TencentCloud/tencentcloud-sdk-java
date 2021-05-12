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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetStatisticsReportResponse extends AbstractModel{

    /**
    * 发信统计报告，按天
    */
    @SerializedName("DailyVolumes")
    @Expose
    private Volume [] DailyVolumes;

    /**
    * 发信统计报告，总览
    */
    @SerializedName("OverallVolume")
    @Expose
    private Volume OverallVolume;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 发信统计报告，按天 
     * @return DailyVolumes 发信统计报告，按天
     */
    public Volume [] getDailyVolumes() {
        return this.DailyVolumes;
    }

    /**
     * Set 发信统计报告，按天
     * @param DailyVolumes 发信统计报告，按天
     */
    public void setDailyVolumes(Volume [] DailyVolumes) {
        this.DailyVolumes = DailyVolumes;
    }

    /**
     * Get 发信统计报告，总览 
     * @return OverallVolume 发信统计报告，总览
     */
    public Volume getOverallVolume() {
        return this.OverallVolume;
    }

    /**
     * Set 发信统计报告，总览
     * @param OverallVolume 发信统计报告，总览
     */
    public void setOverallVolume(Volume OverallVolume) {
        this.OverallVolume = OverallVolume;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetStatisticsReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetStatisticsReportResponse(GetStatisticsReportResponse source) {
        if (source.DailyVolumes != null) {
            this.DailyVolumes = new Volume[source.DailyVolumes.length];
            for (int i = 0; i < source.DailyVolumes.length; i++) {
                this.DailyVolumes[i] = new Volume(source.DailyVolumes[i]);
            }
        }
        if (source.OverallVolume != null) {
            this.OverallVolume = new Volume(source.OverallVolume);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DailyVolumes.", this.DailyVolumes);
        this.setParamObj(map, prefix + "OverallVolume.", this.OverallVolume);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

